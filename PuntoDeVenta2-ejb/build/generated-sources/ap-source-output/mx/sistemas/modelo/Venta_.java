package mx.sistemas.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.Cliente;
import mx.sistemas.modelo.DetalleVenta;
import mx.sistemas.modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T18:22:33")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, String> total;
    public static volatile SingularAttribute<Venta, Cliente> clienteid;
    public static volatile ListAttribute<Venta, DetalleVenta> detalleVentaList;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile SingularAttribute<Venta, Usuario> usuarioid;

}