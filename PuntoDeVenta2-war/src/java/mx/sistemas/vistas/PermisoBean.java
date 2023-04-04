/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import mx.sistemas.bl.PermisoBLLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Permiso;
import mx.sistemas.modelo.Proveedor;

/**
 *
 * @author Rober
 */
@Named(value = "permisoBean")
@RequestScoped
public class PermisoBean {

    @EJB
    private PermisoBLLocal permisoBL;

    /**
     * Creates a new instance of Permiso
     */
    public PermisoBean() {
    }
    public  String  accion(){
       System.out.println("se agrego con exito!!!");
        
        Permiso p = new Permiso(0,"Robe me la pela","Benitocamelo");
        Codigo c = permisoBL.agregar(p);
        
        
        return "index.xhtml";
    }
    
}
