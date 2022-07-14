package dev.backend_test.test.factura.repository;

import dev.backend_test.test.factura.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    @Query(value = "select * from facturas f where f.id_cliente =:idCliente", nativeQuery = true)
    List<Factura> findByIdCliente(@Param("idCliente") Long idCliente);

    @Query(value = "insert into facturas (fecha, monto, id_cliente) values (:fecha, :monto, :idCliente)", nativeQuery = true)
    Factura storeFactura(
            @Param("fecha")LocalDate fecha,
            @Param("monto") Integer monto,
            @Param("idCliente") Long idCliente
            );
}
