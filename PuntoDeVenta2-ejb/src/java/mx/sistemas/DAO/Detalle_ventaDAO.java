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
import mx.sistemas.bl.Detalle_ventaBL;
import mx.sistemas.modelo.DetalleVenta;
import mx.sistemas.modelo.Perfil;

/**
 *
 * @author 
 */
public class Detalle_ventaDAO implements Serializable{
    
    private EntityManager em ;
    
    public Detalle_ventaDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntoDeVenta2-ejbPU");//este nombre se saco del archivo llamado persistence.xml
        em=emf.createEntityManager();
    }
    
    public boolean crear(Detalle_ventaDAO detalle_ventaDAO){
        //Faltan Validaciones.
        em.getTransaction().begin();
        em.persist(detalle_ventaDAO); //Guardar
        em.getTransaction().commit();
    return true;
    }
    public boolean editar(Detalle_ventaDAO detalle_ventaDAO){
        if (detalle_ventaDAO.getPorId(0)==null) {
            return false;
        }else{
        em.getTransaction().begin();
        em.merge(detalle_ventaDAO); //Actualiza
        em.getTransaction().commit();
        return true;
        
        }
    }
    public boolean eliminar(Detalle_ventaDAO detalle_ventaDAO){
        em.getTransaction().begin();
        em.remove(em.merge(detalle_ventaDAO));
        em.getTransaction().commit();
        return true;
    }
    public Detalle_ventaDAO getPorId(int id){
        Query q = em.createNamedQuery("DetalleVenta.findAll.findById");
        q.setParameter("idDetalleVenta", id);
        if(!q.getResultList().isEmpty()){
            
            return (Detalle_ventaDAO)q.getResultList().get(0);//lista de resultados obtiene el primero
        
        }
        return null;
    }
    public Detalle_ventaDAO getPorNombre(String nombre){
        return null;
    }
   
    public List<Detalle_ventaDAO> getTodo(){
         Query q = em.createNamedQuery("DetalleVenta.findAll");
        return q.getResultList();
    }

    public void crear(DetalleVenta v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
