/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Local;
import mx.sistemas.error.Codigo;

/**
 *
 * @author Pablo
 */
@Local
public interface Detalle_ventaBLLocal {

    Codigo agregar(Detalle_ventaBL detalle_venta);
    
}
