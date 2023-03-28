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
import mx.sistemas.modelo.Categoria;

/**
 *
 * @author miguel
 */
public class CategoriaDAO implements Serializable{

private EntityManager em;

public CategoriaDAO(){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PuntodeVenta-ejbPU");
    em= emf.createEntityManager();
    //rhoal robe
    //hola mmigus
    //aguanta
    //ahora si
    //orsles
}
//robe y migue me la siguen pelando y feo pero feoo primo
//robe  me la seguira pelando bien gacho
public boolean crear(Categoria categoria){
    em.getTransaction().begin();
    em.persist(categoria);
    em.getTransaction().commit();
    return true;
}

public boolean editar(Categoria categoria){
    if (categoria.getId()==null) {
        return false;
    }else{
        System.out.println("Se actualizo");
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
        return true;
    }
}
public boolean eliminar(Categoria categoria){
    em.getTransaction().begin();
    em.remove(em.merge(categoria));
    em.getTransaction().commit();
    return true;
}

public Categoria getPorId(int id){
    Query q= em.createNamedQuery("Categoria.findById");
    q.setParameter("id", id);
    if (q.getResultList()!=null) {
        return (Categoria)q.getResultList().get(0);
    }else{
        return null;
    }
}

public Categoria getPorNombre(String nombre){
    Query q= em.createNamedQuery("Categoria.findByNombre");
    q.setParameter("nombre", nombre);
    if (q.getResultList()!=null) {
        return (Categoria)q.getResultList().get(0);
    }else{
        return null;
        
    }
}
    
}
