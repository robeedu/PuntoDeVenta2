/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import mx.sistemas.bl.PerfilBLLocal;
import mx.sistemas.bl.UsuarioBLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.Usuario;

/**
 *
 * @author Pablo
 */
@Named(value = "usuarioBean")
@Dependent
public class UsuarioBean {

    @EJB
    private UsuarioBLocal usuarioBL;
    
    private PerfilBLLocal perfilBL;

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }
    public  String  accion(){
       System.out.println("se agrego con exito!!!");
        Date fecha = new Date();
        Usuario p = new Usuario(0, "Jose Lop", "Cobalto", "M", fecha, "Carpintero", "1111111111", "Pescador@mail.com", "FEO1234", "Delantero01");
        Codigo c = usuarioBL.agregar(p);
        
        
        return "index.xhtml";
    }
    
}
