/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.DAO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.Proveedor;

/**
 *
 * @author 
 */
public class ProveedorDAO implements Serializable{
    
    private EntityManager em ;
    
    public  ProveedorDAO (){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(Proveedor provedor){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(provedor); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(Proveedor provedor){
        if (provedor.getId()==null) {
            return false;
        }else{
        em.getTransaction().begin();
        em.merge(provedor); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    }
    public boolean eliminar(Proveedor provedor){
        em.getTransaction().begin();
        em.remove(em.merge(provedor));
        em.getTransaction().commit();
        return true;
    }
    //robe y migue me la pelan
    public Proveedor getPorId(String id){
        Query q = em.createNamedQuery("Proveedor.findById");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            
            return (Proveedor)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    public Proveedor getPorNombre(String nombre){
        return null;
    }
   
    public List<Proveedor> getTodo(){
         Query q = em.createNamedQuery("Proveedor.findAll");
        return q.getResultList();
    }
}
