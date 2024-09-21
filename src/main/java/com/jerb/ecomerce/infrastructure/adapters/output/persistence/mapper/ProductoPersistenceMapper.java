package com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper;

import com.jerb.ecomerce.domain.Inventario;
import com.jerb.ecomerce.domain.Producto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadInventario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoPersistenceMapper {
    @Mapping(source = "nombre", target = "nombre")
    EntidadProducto productoAProductobd(Producto producto);
    @Mapping(source = "nombre", target = "nombre")
    Producto productobdAProducto(EntidadProducto producto);
    @Mapping(source = "idProducto", target = "idProducto")
    EntidadInventario inventarioAInventariobd(Inventario inventario);

}
