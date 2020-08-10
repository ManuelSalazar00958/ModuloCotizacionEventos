package Models;

import Models.Eventos;
import Models.Servicios;
import Models.Stock;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Portafolio.class)
public class Portafolio_ { 

    public static volatile SingularAttribute<Portafolio, Integer> idPortafolio;
    public static volatile SingularAttribute<Portafolio, Servicios> servicosid;
    public static volatile SingularAttribute<Portafolio, Stock> stockid;
    public static volatile CollectionAttribute<Portafolio, Eventos> eventosCollection;

}