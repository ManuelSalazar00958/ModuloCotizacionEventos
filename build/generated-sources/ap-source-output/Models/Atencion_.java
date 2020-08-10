package Models;

import Models.Registro;
import Models.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Atencion.class)
public class Atencion_ { 

    public static volatile CollectionAttribute<Atencion, Reservacion> reservacionCollection;
    public static volatile SingularAttribute<Atencion, Integer> idAtencion;
    public static volatile SingularAttribute<Atencion, Registro> registroid;

}