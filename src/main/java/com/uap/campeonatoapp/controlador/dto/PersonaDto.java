package com.uap.campeonatoapp.controlador.dto;

import com.uap.campeonatoapp.modelo.enums.Estado;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.uap.campeonatoapp.modelo.entidad.Persona}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class PersonaDto implements Serializable {
    private Long idPersona;
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;
    private String telefono;
    private Estado estado;
}