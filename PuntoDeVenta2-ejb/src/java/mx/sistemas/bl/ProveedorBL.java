/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.ProveedorDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Proveedor;

/**
 *
 * @author Rober
 */
@Stateless
public class ProveedorBL implements ProveedorLocal {

    @Override
    public Codigo agregar(Proveedor provedor) {
        if (provedor == null) {
            return Codigo.ENTIDAD_NULA;
        }
        ProveedorDAO proveedorDAO= new ProveedorDAO ();
//        Permiso tmp = permisoDAO.getPorId(permiso.getIdPermiso());
//        if(tmp!=null){
//            return Codigo.ID_DUPLICADO;
//        }
        proveedorDAO.crear(provedor);

        return Codigo.NADA;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Codigo editar(Proveedor provedor) {
        ProveedorDAO  proveedorDAO = new ProveedorDAO ();
        Proveedor m = proveedorDAO.getPorId(provedor.getId());
        proveedorDAO.eliminar(provedor);
        return Codigo.NADA;
    }

    @Override
    public Codigo eliminar(Proveedor provedor) {
        ProveedorDAO proveedorDAO = new ProveedorDAO();
        Proveedor tmp = proveedorDAO.getPorId(provedor.getId());
        proveedorDAO.editar(provedor);
        return Codigo.NADA;
    }

  

}
