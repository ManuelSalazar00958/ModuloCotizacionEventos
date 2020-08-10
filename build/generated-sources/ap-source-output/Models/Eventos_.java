package Models;

import Models.Cotizacion;
import Models.Lugar;
import Models.Portafolio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, Integer> idEventos;
    public static volatile SingularAttribute<Eventos, String> descripcion;
    public static volatile CollectionAttribute<Eventos, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Eventos, String> tipoEvento;
    public static volatile SingularAttribute<Eventos, Portafolio> portafolioid;
    public static volatile SingularAttribute<Eventos, Lugar> lugarid;

}