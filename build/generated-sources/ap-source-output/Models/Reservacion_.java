package Models;

import Models.Atencion;
import Models.Cotizacion;
import Models.Registro;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> fecha;
    public static volatile CollectionAttribute<Reservacion, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Reservacion, Atencion> atencionid;
    public static volatile SingularAttribute<Reservacion, Integer> idReservacion;
    public static volatile SingularAttribute<Reservacion, Registro> registroid;

}