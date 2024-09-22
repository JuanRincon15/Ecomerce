package com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity;

import com.jerb.ecomerce.domain.Cliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Ordenes")
public class EntidadOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    private EntidadUsuario cliente;
    @Column(name = "id_orden",unique = true)
    private String idOrden;
    private Double valorOrden;

}
