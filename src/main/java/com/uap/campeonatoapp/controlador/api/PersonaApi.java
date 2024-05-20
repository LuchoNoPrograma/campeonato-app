package com.uap.campeonatoapp.controlador.api;

import com.uap.campeonatoapp.controlador.dto.PersonaDto;
import com.uap.campeonatoapp.modelo.entidad.Persona;
import com.uap.campeonatoapp.modelo.servicio.interfaces.IPersonaServicio;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/persona")
@CrossOrigin
public class PersonaApi {
    private final IPersonaServicio personaServicio;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<PersonaDto>> listarPersonas() {
        List<PersonaDto> listaPersonaDto = personaServicio.listarPersonas().stream().map(this::entidadADto).toList();
        return ResponseEntity.status(HttpStatus.OK).body(listaPersonaDto);
    }

    @GetMapping("/{idPersona}")
    public ResponseEntity<PersonaDto> buscarPersonaPorIdPersona(@PathVariable Long idPersona) {
        Persona persona = personaServicio.buscarPersonaPorIdPersona(idPersona);
        return ResponseEntity.status(HttpStatus.OK).body(this.entidadADto(persona));
    }

    @GetMapping("/dni/{dni}")
    public ResponseEntity<PersonaDto> buscarPersonaPorDni(@PathVariable String dni) {
        Persona persona = personaServicio.buscarPersonaPorDni(dni);
        return ResponseEntity.status(HttpStatus.OK).body(this.entidadADto(persona));
    }

    @PostMapping
    public ResponseEntity<PersonaDto> guardarPersona(@RequestBody PersonaDto personaDto) {
        Persona persona = this.dtoAEntidad(personaDto);
        Persona personaGuardada = personaServicio.guardar(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(this.entidadADto(personaGuardada));
    }


    private PersonaDto entidadADto(Persona persona) {
        return modelMapper.map(persona, PersonaDto.class);
    }

    private Persona dtoAEntidad(PersonaDto personaDto) {
        return modelMapper.map(personaDto, Persona.class);
    }
}