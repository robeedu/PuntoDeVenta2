package mx.sistemas.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.Categoria;
import mx.sistemas.modelo.Ingreso;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-30T09:31:16")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, String> codigo;
    public static volatile SingularAttribute<Producto, Integer> stackFinal;
    public static volatile SingularAttribute<Producto, Integer> stackInicial;
    public static volatile SingularAttribute<Producto, Long> precioCompra;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Long> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Ingreso> ingresoid;
    public static volatile SingularAttribute<Producto, Categoria> categoriaid;

}