/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.CategoriaDAO;
import mx.sistemas.DAO.PerfilDAO;
import mx.sistemas.DAO.UsuarioDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Categoria;
import mx.sistemas.modelo.Usuario;


/**
 *
 * @author miguel
 */
@Stateless
public class UsuarioBL implements UsuarioBLocal  {

    @Override
    public Codigo agregar(Usuario usuario) {
            UsuarioDAO ud = new UsuarioDAO();
            ud.crear(usuario);
            PerfilDAO p = new PerfilDAO();
            
            return Codigo.ENTIDAD_NULA;
           
        
    }
    
    @Override
    public Codigo editar(Usuario usuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.editar(usuario);
        return Codigo.NADA;
    }

    @Override
    public Codigo eliminar(Usuario usuario) {
         UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.eliminar(usuario);
        return Codigo.NADA;
    }
    
    
}
