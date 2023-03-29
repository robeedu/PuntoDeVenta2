package mx.sistemas.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.PerfilHasPermisos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-28T18:22:33")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, Integer> id;
    public static volatile SingularAttribute<Permiso, String> nombre;
    public static volatile SingularAttribute<Permiso, String> modulo;
    public static volatile ListAttribute<Permiso, PerfilHasPermisos> perfilHasPermisosList;

}