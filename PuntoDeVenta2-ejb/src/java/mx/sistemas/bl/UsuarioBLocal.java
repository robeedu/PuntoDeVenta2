/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Local;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Categoria;
import mx.sistemas.modelo.Usuario;

/**
 *
 * @author miguel
 */
@Local
public interface UsuarioBLocal {

    Codigo agregar(Usuario usuario);

    Codigo editar(Usuario usuario);

    Codigo eliminar(Usuario usuario);
    
}
