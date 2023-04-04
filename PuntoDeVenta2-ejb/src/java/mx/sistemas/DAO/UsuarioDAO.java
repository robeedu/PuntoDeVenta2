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
import mx.sistemas.modelo.Usuario;


/**
 *
 * @author 
 */
public class UsuarioDAO implements Serializable{
    
    private EntityManager em ;
    
    public UsuarioDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(Usuario usuario){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(usuario); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(Usuario usuario){
        if (usuario.getId()==null) {
            return false;
        }else{
        em.getTransaction().begin();
        em.merge(usuario); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    }
    public boolean eliminar(Usuario usuario){
        em.getTransaction().begin();
        em.remove(em.merge(usuario));
        em.getTransaction().commit();
        return true;
    }
    
    
    public Usuario getPorId(int id){
        Query q = em.createNamedQuery("Usuario.findById");
        q.setParameter("id", id);
        if(!q.getResultList().isEmpty()){
            
            return (Usuario)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    public Usuario getPorNombre(String nombre){
        return null;
    }
   
    public List<Usuario> getTodo(){
        //hola rober
         Query q = em.createNamedQuery("Usuario.findAll");
        return q.getResultList();
    }
}
