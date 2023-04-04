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
import mx.sistemas.modelo.PerfilHasPermisos;

/**
 *
 * @author 
 */
public class PerfilhasPermisosDAO implements Serializable{
    
    private EntityManager em ;
    
    public PerfilhasPermisosDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(PerfilHasPermisos pp){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(pp); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(PerfilHasPermisos pp){
        em.getTransaction().begin();
        em.merge(pp); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    
    public boolean eliminar(PerfilHasPermisos pp){
        em.getTransaction().begin();
        em.remove(em.merge(pp));
        em.getTransaction().commit();
        return true;
    }
    
    
   public PerfilHasPermisos getPorId(int id){
        Query q = em.createNamedQuery("PerfilHasPermisos.findById");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            
            return (PerfilHasPermisos)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    
   
    public List<PerfilHasPermisos> getTodo(){
         Query q = em.createNamedQuery("PerfilHasPermisos.findAll");
        return q.getResultList();
    }

    

    
}
