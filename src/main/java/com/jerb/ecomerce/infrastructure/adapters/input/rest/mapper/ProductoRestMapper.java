package com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper;

import com.jerb.ecomerce.domain.Inventario;
import com.jerb.ecomerce.domain.Producto;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.ProductoCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.ProductoRespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoRestMapper {
    @Mapping(source = "nombre", target = "nombre")
    Producto toProducto(ProductoCreacionSolicitud producto);
    @Mapping(source = "idProducto", target = "idProducto")
    ProductoRespuesta toProductoRespuesta(Producto producto);
    @Mapping(source = "cantProducto", target = "cantProducto")
    Inventario toInventario(ProductoCreacionSolicitud producto);
}
