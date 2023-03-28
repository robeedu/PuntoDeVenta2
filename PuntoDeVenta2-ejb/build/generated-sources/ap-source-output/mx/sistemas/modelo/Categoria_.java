package mx.sistemas.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T16:53:39")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile ListAttribute<Categoria, Producto> productoList;
    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile SingularAttribute<Categoria, String> decripcion;
    public static volatile SingularAttribute<Categoria, String> nombre;

}