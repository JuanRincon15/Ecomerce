package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;

import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface RepositorioProducto extends JpaRepository<EntidadProducto,Long> {
    @Query("SELECT e.valor FROM EntidadProducto e WHERE e.idProducto = :idProducto")
    Double valorProducto(@Param("idProducto") String id);
    Optional<EntidadProducto> findByidProducto(String idProducto);

}
