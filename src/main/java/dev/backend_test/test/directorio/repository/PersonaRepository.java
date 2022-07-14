package dev.backend_test.test.directorio.repository;

import dev.backend_test.test.directorio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    @Query(value = "DELETE FROM personas p where p.identificacion=:identificacion", nativeQuery = true)
    void deleteByIdentificacion(@Param("identificacion") Integer identificacion);

    Optional<Persona> findByIdentificacion(Integer identificacion);
}
