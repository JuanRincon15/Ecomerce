package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;

import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrdenProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioOrdeProducto extends JpaRepository<EntidadOrdenProducto,Long> {

}
