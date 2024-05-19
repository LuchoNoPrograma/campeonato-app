package com.uap.campeonatoapp.modelo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Estado {
    ACTIVO("Activo", "Aplica cuando la entidad esta disponible en la base de datos para consultar"),
    ELIMINADO("Eliminado", "Aplica cuando la entidad esta eliminado de manera logica, pero no en la base de datos");

    private final String nombreFormal;
    private final String descripcion;
}
