/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.CategoriaDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Categoria;

/**
 *
 * @author miguel
 */
@Stateless
public class CategoriaBL implements CategoriaBLLocal {

    @Override
    public Codigo agregar(Categoria categoria) {
        if (categoria == null) {
            return Codigo.ENTIDAD_NULA;
        }
        
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        
        categoriaDAO.crear(categoria);
        System.out.println("Sillega");
        return Codigo.NADA;
    }
    
    @Override
    public Codigo editar(Categoria categoria) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.editar(categoria);
        return Codigo.NADA;
    }

    @Override
    public Codigo eliminar(Categoria categoria) {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.eliminar(categoria);
        return Codigo.NADA;
    }
    
    
}
