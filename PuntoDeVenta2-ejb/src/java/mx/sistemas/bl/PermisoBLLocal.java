/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Local;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Permiso;

/**
 *
 * @author miguel
 */
@Local
public interface PermisoBLLocal {
    
    Codigo agregar(Permiso permiso);

    Codigo editar(Permiso permiso);

    Codigo eliminar(Permiso permiso);
    
}
