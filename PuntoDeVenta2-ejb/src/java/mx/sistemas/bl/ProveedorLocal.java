/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Local;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Cliente;
import mx.sistemas.modelo.Proveedor;


/**
 *
 * @author Rober
 */
@Local
public interface ProveedorLocal {

    Codigo agregar(Proveedor provedor);

    Codigo editar(Proveedor provedor);

    Codigo eliminar(Proveedor provedor);

   
    
}
