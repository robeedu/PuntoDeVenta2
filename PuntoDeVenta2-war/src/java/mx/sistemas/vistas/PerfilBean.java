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
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;

/**
 *
 * @author Rober
 */
@Named(value = "perfilBean")
@RequestScoped
public class PerfilBean {

    @EJB
    private PerfilBLLocal perfilBL;

    /**
     * Creates a new instance of PerfilBean
     */
    public PerfilBean() {
    }
    
public  String  accion(){
       System.out.println("se agrego con exito!!!");
        
        Perfil p = new Perfil(0,"Supervisor");
        Codigo c = perfilBL.agregar(p);
        
        
        return "index.xhtml";
    }
}