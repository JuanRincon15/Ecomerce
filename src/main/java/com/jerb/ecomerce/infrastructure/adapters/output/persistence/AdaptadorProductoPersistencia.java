package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.ProductoPuertoPersistencia;
import com.jerb.ecomerce.domain.Inventario;
import com.jerb.ecomerce.domain.Producto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper.ProductoPersistenceMapper;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioInventario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioProducto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AdaptadorProductoPersistencia implements ProductoPuertoPersistencia {
    private final RepositorioProducto repoproducto;
    private final RepositorioInventario repoinventario;
    private final ProductoPersistenceMapper mapperProducto;

    public AdaptadorProductoPersistencia(RepositorioProducto repoproducto, RepositorioInventario repoinventario, ProductoPersistenceMapper mapperProducto) {
        this.repoproducto = repoproducto;
        this.repoinventario = repoinventario;
        this.mapperProducto = mapperProducto;
    }

    @Override
    public Producto crearProductobd(Producto producto,int cantidad) {
        Inventario inv = new Inventario(producto.getIdProducto(),cantidad);
        repoinventario.save(mapperProducto.inventarioAInventariobd(inv));
        return mapperProducto.productobdAProducto(repoproducto.save(mapperProducto.productoAProductobd(producto)));
    }

    @Override
    public Producto consultarProductoPorId(String idProducto) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultarProductoPorNombre(String nombreProducto) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultaProductoPorPrecio(String criterio, Double precio) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultaProductoPorCategoria(String categoria) {
        return null;
    }

    @Override
    public ArrayList<Producto> consultarProductos() {
        return null;
    }

    @Override
    public Producto actualizarProductobd(String idProducto) {
        return null;
    }

    @Override
    public Boolean eliminarProductobd(String idProducto) {
        return null;
    }
}
