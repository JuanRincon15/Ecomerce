package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;

import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioInventario extends JpaRepository<EntidadInventario,Long> {
}
