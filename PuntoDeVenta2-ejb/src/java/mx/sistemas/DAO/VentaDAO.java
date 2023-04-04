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
import mx.sistemas.modelo.Venta;

/**
 *
 * @author 
 */
public class VentaDAO implements Serializable{
    
    private EntityManager em ;
    
    public VentaDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(Venta venta){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(venta); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(Venta venta){
        if (venta.getId()==null) {
            return false;
        }else{
        em.getTransaction().begin();
        em.merge(venta); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    }
    public boolean eliminar(Venta venta){
        em.getTransaction().begin();
        em.remove(em.merge(venta));
        em.getTransaction().commit();
        return true;
    }
    public Venta getPorId(int id){
        Query q = em.createNamedQuery("Venta.findById");
        q.setParameter("idVenta", id);
        if(!q.getResultList().isEmpty()){
            
            return (Venta)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    public Venta getPorNombre(String nombre){
        return null;
    }
   
    public List<Venta> getTodo(){
         Query q = em.createNamedQuery("Venta.findAll");
        return q.getResultList();
    }
}
