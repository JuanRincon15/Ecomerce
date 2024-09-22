package com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper;

import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrden;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrdenProducto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrdenPersistenceMapper {
    @Mapping(source = "idClienteOrden", target = "cliente.idCliente")
    EntidadOrden ordenAordenbd(Orden orden);
    @Mapping(source = "idOrden", target = "orden.idOrden")
    EntidadOrdenProducto toEntidadop(OrdenProducto orden);
    @Mapping(source = "idOrden", target = "idOrden")
    Orden ordenbdAorden(EntidadOrden orden);
}
