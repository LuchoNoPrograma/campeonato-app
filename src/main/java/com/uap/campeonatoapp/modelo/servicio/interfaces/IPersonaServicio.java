package com.uap.campeonatoapp.modelo.servicio.interfaces;


import java.util.List;

import com.uap.campeonatoapp.modelo.entidad.Persona;

public interface IPersonaServicio {
    Persona guardar(Persona persona);

    List<Persona> listarPersonas();

    Persona buscarPersonaPorIdPersona(Long idPersona);

    Persona buscarPersonaPorDni(String dni);
}
