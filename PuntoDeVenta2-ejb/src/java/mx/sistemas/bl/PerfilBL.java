/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.PerfilDAO;
import mx.sistemas.DAO.UsuarioDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Perfil;
import mx.sistemas.modelo.Usuario;

/**
 *
 * @author Rober
 */
@Stateless
public class PerfilBL implements PerfilBLLocal {

    @Override
    public Codigo agregar(Perfil perfil) {
        PerfilDAO pdao =new PerfilDAO();
        pdao.crear(perfil);//se guarda el perfil en la BD
        UsuarioDAO usdao = new UsuarioDAO();
        return Codigo.NADA;
    }
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
    public  Perfil Buscar(int id){
        PerfilDAO pd = new PerfilDAO();
        return pd.getPorId(id);
    }

    
}
