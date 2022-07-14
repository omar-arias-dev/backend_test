package dev.backend_test.test.directorio.web;

import dev.backend_test.test.directorio.model.Persona;
import dev.backend_test.test.directorio.service.Directorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directorio")
public class DirectorioRestService {

    @Autowired
    private Directorio directorio;

    @GetMapping("/find-by-identificacion/{identificacion}")
    public ResponseEntity<Persona> findPersonaByIdentificacion(@PathVariable("identificacion") Long identificacion) {
        return new ResponseEntity<>(directorio.findPersonaByIdentificacion(identificacion), HttpStatus.OK);
    }

    @GetMapping("/personas")
    public ResponseEntity<List<Persona>> findPersonas() {
        return new ResponseEntity<>(directorio.findPersonas(), HttpStatus.OK);
    }

    @DeleteMapping("/delete-by-identificacion/{identificacion}")
    public void deletePersonaByIdentificacion(@PathVariable("identificacion") Long identificacion) {
        directorio.deletePersonaByIdentificacion(identificacion);
    }

    @PostMapping("/store-persona")
    public Persona storePersona(@RequestBody Persona persona) {
        return directorio.storePersona(persona);
    }
}
