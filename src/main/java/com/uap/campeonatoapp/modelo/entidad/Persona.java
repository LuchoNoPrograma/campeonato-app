package com.uap.campeonatoapp.modelo.entidad;


import java.time.LocalDate;

import com.uap.campeonatoapp.modelo.enums.Estado;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "persona")
public class Persona {
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @Column(length = 30)
    private String nombre;

    @Column(length = 55)
    private String apellidos;

    @Column(length = 30)
    private String dni;

    private LocalDate fechaNacimiento;

    @Column(length = 15)
    private String telefono;

    @Enumerated(EnumType.STRING)
    private Estado estado;
}
