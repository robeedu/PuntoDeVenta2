/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.ClienteDAO;
import mx.sistemas.DAO.PerfilDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.Cliente;
import mx.sistemas.modelo.Perfil;

/**
 *
 * @author Rober
 */
@Stateless
public class ClienteBL implements ClienteLocal {

    @Override
    public Codigo agregar(Cliente cliente) {
        if (cliente == null) {
            return Codigo.ENTIDAD_NULA;
        }
        ClienteDAO clientedao = new ClienteDAO();
//        Permiso tmp = permisoDAO.getPorId(permiso.getIdPermiso());
//        if(tmp!=null){
//            return Codigo.ID_DUPLICADO;
//        }
        clientedao.crear(cliente);

        return Codigo.NADA;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Codigo editar(Cliente cliente) {
        ClienteDAO clientedao = new ClienteDAO();
        Cliente m = clientedao.getPorId(cliente.getId());
        clientedao.editar(cliente);
        return Codigo.NADA;
    }

    @Override
    public Codigo eliminar(Cliente cliente) {
        ClienteDAO clientedao = new ClienteDAO();
        Cliente tmp = clientedao.getPorId(cliente.getId());
        boolean eliminar = clientedao.eliminar(cliente);
       
        return Codigo.NADA;
    }

}
