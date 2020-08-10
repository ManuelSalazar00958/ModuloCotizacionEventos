package Models;

import Models.Eventos;
import Models.Reservacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Reservacion> reservaid;
    public static volatile SingularAttribute<Cotizacion, Eventos> eventosid;
    public static volatile SingularAttribute<Cotizacion, Integer> idCotizacion;
    public static volatile SingularAttribute<Cotizacion, Date> fechalimite;

}