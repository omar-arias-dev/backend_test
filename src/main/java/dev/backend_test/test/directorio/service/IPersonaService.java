package dev.backend_test.test.directorio.service;

import dev.backend_test.test.directorio.model.Persona;

import java.util.List;

public interface IPersonaService {

    Persona findPersonaByIdentificacion(Long identificacion);

    List<Persona> findPersonas();

    void deletePersonaByIdentificacion(Long identificacion);

    Persona storePersona(Persona persona);
}
