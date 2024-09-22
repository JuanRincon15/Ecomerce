package com.jerb.ecomerce.infrastructure.adapters.output.persistence;

import com.jerb.ecomerce.application.ports.output.OrdenPuertoPersistencia;
import com.jerb.ecomerce.domain.Orden;
import com.jerb.ecomerce.domain.OrdenProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrden;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrdenProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadUsuario;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.mapper.OrdenPersistenceMapper;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioOrdeProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioOrden;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioProducto;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository.RepositorioUsuario;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AdaptadorOrdenPersistencia implements OrdenPuertoPersistencia {
    private final OrdenPersistenceMapper persistenceMapper;
    private final RepositorioOrden repoorden;
    private final RepositorioOrdeProducto repoOP;
    private final RepositorioProducto repoprod;
    private final RepositorioUsuario repousr;

    public AdaptadorOrdenPersistencia(OrdenPersistenceMapper persistenceMapper, RepositorioOrden repoorden, RepositorioOrdeProducto repoOP, RepositorioProducto repoprod, RepositorioUsuario repousr) {
        this.persistenceMapper = persistenceMapper;
        this.repoorden = repoorden;
        this.repoOP = repoOP;
        this.repoprod = repoprod;
        this.repousr = repousr;
    }

    @Override
    public Orden crearOrdenbd(List<OrdenProducto> productos,Orden orden) {

        //validar cantidad de producto
        //calcular producto de la orden
        System.out.println("Orden: "+orden.getIdOrden());
        System.out.println("Cliente: "+orden.getIdClienteOrden());
        System.out.println("lista de orden:");
        Double costo = 0.0;
        for(OrdenProducto prod:productos){
            costo = costo + (repoprod.valorProducto(prod.getIdProducto())*prod.getCantProducto());
        }
        orden.setValorOrden(costo);
        System.out.println("Costo de orden: "+orden.getValorOrden());
        EntidadOrden ordenGuardar = persistenceMapper.ordenAordenbd(orden);
        ordenGuardar.setCliente(repousr.findByidCliente(orden.getIdClienteOrden()).orElse(new EntidadUsuario()));
        System.out.println("cliente obj:"+ordenGuardar.getCliente().getIdCliente());
        EntidadOrden guardada = repoorden.save(ordenGuardar);
        for (OrdenProducto prod : productos) {
            EntidadOrdenProducto entidadOrdenProducto = persistenceMapper.toEntidadop(prod);
            entidadOrdenProducto.setOrden(guardada);
            entidadOrdenProducto.setProducto(repoprod.findByidProducto(prod.getIdProducto()).orElse(new EntidadProducto()));

            repoOP.save(entidadOrdenProducto);
        }
        Orden respuestaorden = new Orden();
        respuestaorden.setIdOrden(ordenGuardar.getIdOrden());
        respuestaorden.setValorOrden(ordenGuardar.getValorOrden());
        return respuestaorden;

    }
}
