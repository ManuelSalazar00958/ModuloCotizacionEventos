package Models;

import Models.Registro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Perfil.class)
public class Perfil_ { 

    public static volatile SingularAttribute<Perfil, String> perfilUsuario;
    public static volatile SingularAttribute<Perfil, Integer> idPerfil;
    public static volatile CollectionAttribute<Perfil, Registro> registroCollection;

}