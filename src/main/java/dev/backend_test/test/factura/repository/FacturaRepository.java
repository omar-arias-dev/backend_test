package dev.backend_test.test.factura.repository;

import dev.backend_test.test.factura.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    @Query(value = "select * from facturas f where f.id_cliente =:idCliente", nativeQuery = true)
    List<Factura> findByIdCliente(Integer idCliente);
}
