package mx.sistemas.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.sistemas.modelo.PerfilHasPermisos;
import mx.sistemas.modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-04-03T20:21:08")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile ListAttribute<Perfil, Usuario> usuarioList;
    public static volatile SingularAttribute<Perfil, Integer> id;
    public static volatile SingularAttribute<Perfil, String> nombre;
    public static volatile ListAttribute<Perfil, PerfilHasPermisos> perfilHasPermisosList;

}