package com.jerb.ecomerce.infrastructure.adapters.output.persistence.entity;

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
@Table(name = "OrdenesxProducto")
public class EntidadOrdenProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_orden", referencedColumnName = "id_orden")
    private EntidadOrden orden;
    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id_producto")
    private EntidadProducto producto;
    private int cantProducto;
}
