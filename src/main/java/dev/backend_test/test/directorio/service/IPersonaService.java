package dev.backend_test.test.directorio.service;

import dev.backend_test.test.directorio.model.Persona;

import java.util.List;

public interface IPersonaService {

    Persona findPersonaByIdentificacion(Integer identificacion);

    List<Persona> findPersonas();

    void deletePersonaByIdentificacion(Integer identificacion);

    Persona storePersona(Persona persona);
}
