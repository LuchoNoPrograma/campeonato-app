package com.uap.campeonatoapp.modelo.entidad;

import com.uap.campeonatoapp.modelo.enums.Estado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detalle_equipo")
public class DetalleEquipo {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalleEquipo;

    private Estado estado;
}
