/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.PerfilDAO;
import mx.sistemas.DAO.PerfilhasPermisosDAO;
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
      PerfilDAO pd = new PerfilDAO();
      pd.crear(perfil);//Se Guarda el rol en la base de datos
      PerfilhasPermisosDAO ppd = new PerfilhasPermisosDAO();
       /* for (PerfilHasPermisos pp:perfil.getPerfilHasPermisosList()) {
             ppd.crear(pp);
        }
*/
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
    
    public Perfil Buscar(int id) {
        PerfilDAO permisoDAO =new PerfilDAO();
        
        return permisoDAO.getPorId(id);
    }

    
}
