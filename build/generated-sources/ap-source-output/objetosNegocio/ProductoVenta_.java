package objetosNegocio;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import objetosNegocio.Producto;
import objetosNegocio.Venta;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T21:46:02")
@StaticMetamodel(ProductoVenta.class)
public class ProductoVenta_ { 

    public static volatile SingularAttribute<ProductoVenta, Venta> venta;
    public static volatile SingularAttribute<ProductoVenta, Float> precio;
    public static volatile SingularAttribute<ProductoVenta, Integer> id;
    public static volatile SingularAttribute<ProductoVenta, Producto> producto;
    public static volatile SingularAttribute<ProductoVenta, Integer> cantidad;
    public static volatile SingularAttribute<ProductoVenta, Float> montoTotal;

}