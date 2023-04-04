/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sistemas.bl;

import javax.ejb.Stateless;
import mx.sistemas.DAO.Detalle_ventaDAO;
import mx.sistemas.DAO.VentaDAO;
import mx.sistemas.error.Codigo;
import mx.sistemas.modelo.DetalleVenta;
import mx.sistemas.modelo.Venta;

/**
 *
 * @author Pablo
 */
@Stateless
public class VentaBL implements VentaBLLocal {

    @Override
    public Codigo agregar(Venta venta) {
          VentaDAO vd = new VentaDAO();
        vd.crear(venta);//se guarda en la BD
        Detalle_ventaDAO dvd = new Detalle_ventaDAO();
         for (DetalleVenta v : venta.getDetalleVentaList()) {
           dvd.crear(v);
        }
        return Codigo.NADA;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
