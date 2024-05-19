package com.uap.campeonatoapp;

import com.uap.campeonatoapp.modelo.dao.IPersonaDao;
import com.uap.campeonatoapp.modelo.entidad.Persona;
import com.uap.campeonatoapp.modelo.enums.Estado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import jakarta.persistence.TypedQuery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class CampeonatoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampeonatoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(EntityManager em) {
        return args -> {
            /*personaDao.save(Persona.builder()
                .nombre("Alex")
                .apellidos("Perez")
                .dni("12345678")
                .fechaNacimiento(LocalDate.of(1998, 1, 12))
                .telefono("+5733129244")
                .estado(Estado.ACTIVO)
                .build()
            );*/

            /*String sql = """
                select * from "persona"
                """;

            Query query = em.createNativeQuery(sql);
            List<Object[]> tables = query.getResultList();

            System.out.println("Tables in the database:");
            for (Object[] table : tables) {
                System.out.print(table[0].toString());
                System.out.println(table[1].toString());
            }*/
        };
    }
}
