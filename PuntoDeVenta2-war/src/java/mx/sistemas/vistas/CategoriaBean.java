/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.vistas;

import java.text.SimpleDateFormat;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import mx.sistemas.bl.CategoriaBLLocal;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Categoria;
import mx.sistemas.modelo.Cliente;

/**
 *
 * @author Rober
 */
@Named(value = "categoriaBean")
@Dependent
public class CategoriaBean {

    @EJB
    private CategoriaBLLocal categoriaBL;

    /**
     * Creates a new instance of CategoriaBean
     */
    public CategoriaBean() {
    }
    
    public  String  add(){
       System.out.println("se agrego con exito!!!");
       
       Categoria  p = new Categoria(0, "lacteos");
        Codigo c = categoriaBL.agregar(p);
        
     
        return "index.xhtml";
    }
    
    public String modify(){
        System.out.println("se edito con exito!!!");
        
        Categoria  p = new Categoria(4, "pepe");
        Codigo c = categoriaBL.editar(p);
        
        
        return "index.xhtml";
    }
    public String delete(){
        System.out.println("se elimino con exito!!!");
        
        Categoria  p = new Categoria(4, "pepe");
        Codigo c = categoriaBL.eliminar(p);
        
        
        return "index.xhtml";
    }
    
}
