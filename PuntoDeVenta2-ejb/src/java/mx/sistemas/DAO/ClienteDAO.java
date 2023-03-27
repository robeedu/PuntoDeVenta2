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
import mx.sistemas.modelo.Cliente;


/**
 *
 * @author 
 */
public class ClienteDAO implements Serializable{
    
    private EntityManager em ;
    
    public ClienteDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(Cliente cliente){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(cliente); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(Cliente cliente){
        if (cliente.getId()==null) {
            return false;
        }else{
        em.getTransaction().begin();
        em.merge(cliente); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    }
    public boolean eliminar(Cliente cliente){
        em.getTransaction().begin();
        em.remove(em.merge(cliente));
        em.getTransaction().commit();
        return true;
    }
    
    
    public Cliente getPorId(int id){
        Query q = em.createNamedQuery("Cliente.findById");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            
            return (Cliente)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    public Cliente getPorNombre(String nombre){
        return null;
    }
   
    public List<Cliente> getTodo(){
         Query q = em.createNamedQuery("Cliente.findAll");
        return q.getResultList();
    }
}
