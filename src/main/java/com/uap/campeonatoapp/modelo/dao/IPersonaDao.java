package com.uap.campeonatoapp.modelo.dao;

import com.uap.campeonatoapp.modelo.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

    @Query(nativeQuery = true, value = """
        select * from "persona" where "dni" = ?1
        """)
    Optional<Persona> buscarPorDni(String dni);
}