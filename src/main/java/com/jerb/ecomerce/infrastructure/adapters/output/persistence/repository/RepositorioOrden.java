package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;

import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioOrden extends JpaRepository<EntidadOrden,Long> {
}
