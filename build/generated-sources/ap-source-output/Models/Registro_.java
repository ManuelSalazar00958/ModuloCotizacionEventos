package Models;

import Models.Atencion;
import Models.Perfil;
import Models.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile CollectionAttribute<Registro, Reservacion> reservacionCollection;
    public static volatile CollectionAttribute<Registro, Atencion> atencionCollection;
    public static volatile SingularAttribute<Registro, String> apellido;
    public static volatile SingularAttribute<Registro, String> correo;
    public static volatile SingularAttribute<Registro, Perfil> perfilId;
    public static volatile SingularAttribute<Registro, String> identificacion;
    public static volatile SingularAttribute<Registro, String> telefono;
    public static volatile SingularAttribute<Registro, String> nombre;
    public static volatile SingularAttribute<Registro, Integer> idRegistro;
    public static volatile SingularAttribute<Registro, String> contraseña;

}