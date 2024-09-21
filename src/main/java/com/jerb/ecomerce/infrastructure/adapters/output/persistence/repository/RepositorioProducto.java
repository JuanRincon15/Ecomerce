package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;

import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProducto extends JpaRepository<EntidadProducto,Long> {

}
