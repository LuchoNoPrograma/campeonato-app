package com.uap.campeonatoapp.modelo.servicio.impls;

import java.util.List;

import com.uap.campeonatoapp.modelo.dao.IPersonaDao;
import com.uap.campeonatoapp.modelo.servicio.interfaces.IPersonaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.uap.campeonatoapp.modelo.entidad.Persona;

@Service
@RequiredArgsConstructor
public class PersonaServicioImpl implements IPersonaServicio {
    private final IPersonaDao personaDao;

    @Override
    public Persona guardar(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAll();
    }

    @Override
    public Persona buscarPersonaPorIdPersona(Long idPersona) {
        return personaDao.findById(idPersona).orElse(null);
    }

    @Override
    public Persona buscarPersonaPorDni(String dni) {
        return personaDao.buscarPorDni(dni).orElse(null);
    }
}
