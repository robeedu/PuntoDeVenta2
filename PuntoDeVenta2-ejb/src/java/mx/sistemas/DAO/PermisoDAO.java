/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.DAO;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.sistemas.modelo.Permiso;

/**
 *
 * @author miguel
 */
public class PermisoDAO implements Serializable{
    
    private EntityManager em;
    
    public PermisoDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");
        em=emf.createEntityManager();
    }
    
    public boolean crear(Permiso permiso){
        //Crea 0 para todo esya bien 1 id mal, 2 para nombre esta mal
        //Faltan validaciones
        em.getTransaction().begin();
        em.persist(permiso);//persist es para guardar
        em.getTransaction().commit();
        return true;        
    }
    
     public boolean Buscar(Permiso permiso){
        //Crea 0 para todo esya bien 1 id mal, 2 para nombre esta mal
        //Faltan validaciones
        em.getTransaction().begin();
        em.equals(permiso);
        em.getTransaction().commit();
        return true;        
    }
    
    public boolean editar(Permiso permiso){
        if (permiso.getId()==null) {
          return false;  
        }else{
            System.out.println("Se actualizo");
            em.getTransaction().begin();
            em.merge(permiso);//Actualizar
            em.getTransaction().commit();
            return true;
        }
    }
    
    public boolean eliminar(Permiso permiso){
        em.getTransaction().begin();
        em.remove(em.merge(permiso));
        em.getTransaction().commit();
        return true;
    }
    
    public Permiso getPorId(int id){
        Query q= em.createNamedQuery("Permiso.findById");
        q.setParameter("id", id);
        if (q.getResultList()!=null) {
            return (Permiso)q.getResultList().get(0);
        }else{
            return null;
        }
    }
    
    public Permiso getPorNombre(String nombre){
        Query q= em.createNamedQuery("Permiso.findByNombre");
        q.setParameter("nombre", nombre);
        if (q.getResultList()!=null) {
            return (Permiso)q.getResultList().get(0);
        }else{
            return null;
        }
    }
    
    public Permiso getPorModulo(String modulo){
        Query q= em.createNamedQuery("Permiso.findByModulo");
        q.setParameter("modulo", modulo);
        if (q.getResultList()!=null) {
            return (Permiso)q.getResultList().get(0);
        }else{
            return null;
        }
    }
    
}
