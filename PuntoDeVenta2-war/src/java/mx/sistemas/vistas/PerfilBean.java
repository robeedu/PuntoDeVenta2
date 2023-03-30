/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import mx.sistemas.bl.PerfilBLLocal;
import mx.sistemas.bl.PermisoBLLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.PerfilHasPermisos;

/**
 *
 * @author Rober
 */
@Named(value = "perfilBean")
@RequestScoped
public class PerfilBean {

    @EJB
    private PermisoBLLocal permisoBL;

    @EJB
    private PerfilBLLocal perfilBL;

    /**
     * Creates a new instance of PerfilBean
     */
    public PerfilBean() {
    }
    
public  String  accion(){
       System.out.println("se agrego con exito!!!");
        
        Perfil p = new Perfil(0,"Robe me la pela");
        List <PerfilHasPermisos> lista = new ArrayList<>();
        
        PerfilHasPermisos php = new PerfilHasPermisos(0);
        php.setPerfilid(p);
        
         php.setPermisoid(permisoBL.Buscar(1));
        lista.add(php);
        p.setPerfilHasPermisosList(lista);
        
        PerfilHasPermisos php2 = new PerfilHasPermisos(0);
        php2.setPerfilid(p); 
        php2.setPermisoid(permisoBL.Buscar(2));
        lista.add(php2);
        p.setPerfilHasPermisosList(lista);
        
     
        
        Codigo c = perfilBL.agregar(p);
        
        
        return "index.xhtml";
    }
}