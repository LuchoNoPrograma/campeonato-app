package com.uap.campeonatoapp.modelo.entidad;

import com.uap.campeonatoapp.modelo.enums.Estado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "participante")
public class Participante {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoParticipante;

    private LocalDateTime fechaRegistro;

    @Enumerated(EnumType.STRING)
    private Estado estado;
}
