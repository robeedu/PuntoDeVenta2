/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import java.text.SimpleDateFormat;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import mx.sistemas.bl.ClienteLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Cliente;



/**
 *
 * @author Rober
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean {

    @EJB
    private ClienteLocal clienteBL;

    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }
    public  String  accion(){
       System.out.println("se agrego con exito!!!");
        java.util.Date d = new java.util.Date();
        SimpleDateFormat plantilla = new SimpleDateFormat("dd/MM/yyyy");
        String tiempo = plantilla.format(d);
       
       Cliente  p = new Cliente(0,"Rober ","Deniro","H","benitoCamelo","3325731485","robertoch@gmail.com");
        Codigo c = clienteBL.agregar(p);
        
     
        return "index.xhtml";
    }
    
    public String editarPermiso(){
        System.out.println("se edito con exito!!!");
        
        Cliente p = new Cliente(1,"Lalito","Orozco","H","Javie Mina #48","3325731485","roberch@gmail.com");
        Codigo c = clienteBL.editar(p);
        
        
        return "index.xhtml";
    }
    public String eliminarPermiso(){
        System.out.println("se elimino con exito!!!");
        
        Cliente p = new Cliente(1,"Lalito","Orozco","H","Javie Mina #48","3325731485","roberch@gmail.com");
        Codigo c = clienteBL.eliminar(p);
        
        
        return "index.xhtml";
    }
    
}
