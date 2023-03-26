/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Local;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;

/**
 *
 * @author Rober
 */
@Local
public interface PerfilBLLocal {

    Codigo agregar(Perfil perfil);

    Codigo editar(Perfil perfil);

    Codigo eliminar(Perfil perfil);

   
    
}
