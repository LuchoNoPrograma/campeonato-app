package com.uap.campeonatoapp.modelo.entidad;

import java.time.LocalDateTime;
import java.util.List;

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
@Table(name = "equipo")
public class Equipo {
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "equipo")
    private List<DetalleEquipo> listaDetalleEquipo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "equipo")
    private List<Ganador> ganadores;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "equipo")
    private List<Participante> participantes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;

    @Column(length = 55)
    private String nombre;

    @Column(length = 15)
    private String sigla;

    private LocalDateTime fechaHoraInscripcion;

    @Enumerated(EnumType.STRING)
    private Estado estado;
}
