package dev.backend_test.test.directorio.service;

import dev.backend_test.test.directorio.model.Persona;
import dev.backend_test.test.directorio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Directorio implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona findPersonaByIdentificacion(Integer identificacion) {
        Optional<Persona> persona = personaRepository.findByIdentificacion(identificacion);
        return persona.orElse(null);
    }

    @Override
    public List<Persona> findPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void deletePersonaByIdentificacion(Integer identificacion) {
        personaRepository.deleteByIdentificacion(identificacion);
    }

    @Override
    public Persona storePersona(Persona persona) {
        return personaRepository.save(persona);
    }
}
