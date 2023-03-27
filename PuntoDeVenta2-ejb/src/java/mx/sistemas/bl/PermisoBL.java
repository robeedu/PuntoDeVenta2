/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.PermisoDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Permiso;
/**
 *
 * @author miguel
 */
@Stateless
public class PermisoBL implements PermisoBLLocal {

    @Override
    public Codigo agregar(Permiso permiso) {
        if (permiso == null) {
            return Codigo.ENTIDAD_NULA;
        }
            
            PermisoDAO permisoDAO = new PermisoDAO();
//            Permiso tmp = permisoDAO.getPorId(permiso.getIdPermiso());
//            
//            if (tmp != null) {
//               return Codigo.ID_DUPLICATE;
//            }
            permisoDAO.crear(permiso);
            System.out.println("si llega");
            return Codigo.NADA;
    }

    @Override
    public Codigo editar(Permiso permiso) {
        PermisoDAO permisoDAO = new PermisoDAO();
        permisoDAO.editar(permiso);

        return Codigo.NADA;
    }

    @Override
    public Codigo eliminar(Permiso permiso) {
        PermisoDAO permisoDAO = new PermisoDAO();
        permisoDAO.eliminar(permiso);

        return Codigo.NADA;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
