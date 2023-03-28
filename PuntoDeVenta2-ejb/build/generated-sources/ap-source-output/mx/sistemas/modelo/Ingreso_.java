package mx.sistemas.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.Producto;
import mx.sistemas.modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T17:18:16")
@StaticMetamodel(Ingreso.class)
public class Ingreso_ { 

    public static volatile SingularAttribute<Ingreso, Date> fecha;
    public static volatile SingularAttribute<Ingreso, Integer> proveedorid;
    public static volatile ListAttribute<Ingreso, Producto> productoList;
    public static volatile SingularAttribute<Ingreso, Integer> id;
    public static volatile SingularAttribute<Ingreso, Usuario> usuarioid;

}