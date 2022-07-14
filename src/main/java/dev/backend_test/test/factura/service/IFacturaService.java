package dev.backend_test.test.factura.service;

import dev.backend_test.test.factura.model.Factura;

import java.util.List;

public interface IFacturaService {

    List<Factura> findFacturasByPersona(Integer idCliente);

    Factura storeFactura(Factura factura);
}
