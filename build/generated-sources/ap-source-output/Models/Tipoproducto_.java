package Models;

import Models.Stock;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-09T17:26:03")
@StaticMetamodel(Tipoproducto.class)
public class Tipoproducto_ { 

    public static volatile SingularAttribute<Tipoproducto, String> tipodeProducto;
    public static volatile SingularAttribute<Tipoproducto, Integer> idTproducto;
    public static volatile CollectionAttribute<Tipoproducto, Stock> stockCollection;

}