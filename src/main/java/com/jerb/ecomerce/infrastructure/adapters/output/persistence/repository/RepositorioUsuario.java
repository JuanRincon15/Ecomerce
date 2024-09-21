package com.jerb.ecomerce.infrastructure.adapters.output.persistence.repository;
import com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity.EntidadUsuario;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositorioUsuario extends JpaRepository<EntidadUsuario,Long>{
    Optional<EntidadUsuario> findBycorreo(String correo);

}
