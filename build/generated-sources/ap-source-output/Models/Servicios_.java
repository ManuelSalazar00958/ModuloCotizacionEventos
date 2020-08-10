package Models;

import Models.Portafolio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, String> descripcion;
    public static volatile SingularAttribute<Servicios, String> programaFormacion;
    public static volatile SingularAttribute<Servicios, Integer> ficha;
    public static volatile CollectionAttribute<Servicios, Portafolio> portafolioCollection;
    public static volatile SingularAttribute<Servicios, String> nombre;
    public static volatile SingularAttribute<Servicios, Integer> idServicios;

}