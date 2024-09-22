package com.jerb.ecomerce.infrastructure.adapters.input.rest.mapper;

import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.request.OrdenCreacionSolicitud;
import com.jerb.ecomerce.infrastructure.adapters.input.rest.model.response.OrdenRespuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrdenRestMapper {
    @Mapping(source = "idOrden", target = "idOrden")
    OrdenRespuesta ordenAresorden(Orden orden);
}
