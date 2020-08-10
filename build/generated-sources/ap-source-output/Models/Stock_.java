package Models;

import Models.Portafolio;
import Models.Producto;
import Models.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile SingularAttribute<Stock, Integer> idStock;
    public static volatile SingularAttribute<Stock, Boolean> disponibilidad;
    public static volatile SingularAttribute<Stock, Tipoproducto> tipoproductoid;
    public static volatile CollectionAttribute<Stock, Portafolio> portafolioCollection;
    public static volatile SingularAttribute<Stock, Producto> productosid;

}