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
import javax.enterprise.context.RequestScoped;
import mx.sistemas.bl.PerfilBLLocal;
import mx.sistemas.bl.UsuarioBLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Cliente;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.Usuario;

/**
 *
 * @author Rober
 */
@Named(value = "perfilBean")
@RequestScoped
public class PerfilBean {

    @EJB
    private UsuarioBLocal usuarioBL;

    @EJB
    private PerfilBLLocal perfilBL;

    /**
     * Creates a new instance of PerfilBean
     */
    public PerfilBean() {
    }
    
public  String  accion(){
       System.out.println("se agrego con exito!!!");
        
        Perfil p = new Perfil(0,"Jose");
        List<Usuario> lista = new ArrayList<>();//la lista esta vacia
        Date fecha = new Date();
        Usuario usu = new Usuario(0, "Ramon", "Juarez", "M",fecha  , "Cobalto", "3317569322", "perritocachondo@gmail.com", "Belizario", "123456");
        
        //aun no termino
        usu.setPerfilid(perfilBL.Buscar(23));
        
        lista.add(usu);
        p.setUsuarioList(lista);
        //usuarioBL.agregar(usu);
        perfilBL.agregar(p);
        
        //Codigo c = perfilBL.agregar(p);
        return "index.xhtml";
    }
public String editarPermiso(){
        System.out.println("se edito con exito!!!");
        Perfil p = new Perfil(2, "Manager");
        Codigo c=perfilBL.editar(p);
        return "index.xhtml";
    }
public String eliminarPermiso(){
        System.out.println("se elimino con exito!!!");
        Perfil p = new Perfil(2, "Supervisor");
       Codigo c=perfilBL.eliminar(p);
   
        return "index.xhtml";
    }
}