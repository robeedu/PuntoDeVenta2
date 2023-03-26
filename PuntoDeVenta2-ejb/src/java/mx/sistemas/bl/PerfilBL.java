/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.PerfilDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;

/**
 *
 * @author Rober
 */
@Stateless
public class PerfilBL implements PerfilBLLocal {

    @Override
    public Codigo agregar(Perfil perfil) {
       if(perfil==null){
            return Codigo.ENTIDAD_NULA;
        }
        PerfilDAO perfilDAO =new PerfilDAO();
//        Permiso tmp = permisoDAO.getPorId(permiso.getIdPermiso());
//        if(tmp!=null){
//            return Codigo.ID_DUPLICADO;
//        }
         perfilDAO.crear(perfil);
        
        return Codigo.NADA;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    

    @Override
    public Codigo eliminar(Perfil perfil) {
        PerfilDAO permisoDAO =new PerfilDAO();
        Perfil tmp = permisoDAO.getPorId(perfil.getId());
        permisoDAO.eliminar(perfil);
        return Codigo.NADA;
    }

    @Override
    public Codigo editar(Perfil perfil) {
        PerfilDAO permisoDAO =new PerfilDAO();
        Perfil tmp = permisoDAO.getPorId(perfil.getId());
        permisoDAO.editar(perfil);
        return Codigo.NADA;
    }

    
}
