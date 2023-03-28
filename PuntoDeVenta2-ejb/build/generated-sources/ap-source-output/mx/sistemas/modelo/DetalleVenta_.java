package mx.sistemas.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T16:13:23")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Integer> totalVenta;
    public static volatile SingularAttribute<DetalleVenta, Venta> ventaid;
    public static volatile SingularAttribute<DetalleVenta, Integer> id;
    public static volatile SingularAttribute<DetalleVenta, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Integer> precioVenta;
    public static volatile SingularAttribute<DetalleVenta, Integer> usuarioid;
    public static volatile SingularAttribute<DetalleVenta, String> nombreProducto;

}