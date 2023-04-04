/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import mx.sistemas.bl.PerfilBLLocal;
import mx.sistemas.bl.ProveedorLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Cliente;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.Proveedor;

/**
 *
 * @author Rober
 */
@Named(value = "proveedorBean")
@RequestScoped
public class ProveedorBean {

    @EJB
    private ProveedorLocal proveedorBl;

    /**
     * Creates a new instance of PerfilBean
     */
    public ProveedorBean() {
    }
    
public  String  accion(){
       System.out.println("se agrego con exito!!!");
        
        Proveedor p = new Proveedor("007","Miguel Velasco","Benitocamelo","3325731485","miguechupapija@gmail.com");
        Codigo c = proveedorBl.agregar(p);
        return "index.xhtml";
    }
public String editarPermiso(){
        System.out.println("se edito con exito!!!");
        Proveedor p = new Proveedor("003","Furcio","Caramelo","3325731485","miguechupapija@gmail.com");
        Codigo c = proveedorBl.editar(p);
        return "index.xhtml";
    }
public String eliminarPermiso(){
        System.out.println("se elimino con exito!!!");
        Proveedor p = new Proveedor("002","Robe me la pela","Benitocamelo","3325731485","miguechupapija@gmail.com");
        Codigo c = proveedorBl.eliminar(p);
        return "index.xhtml";
    }
}