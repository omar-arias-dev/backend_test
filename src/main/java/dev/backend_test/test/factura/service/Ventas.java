package dev.backend_test.test.factura.service;

import dev.backend_test.test.factura.model.Factura;
import dev.backend_test.test.factura.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ventas implements IFacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> findFacturasByPersona(Long idCliente) {
        return facturaRepository.findByIdCliente(idCliente);
    }

    @Override
    public Factura storeFactura(Factura factura) {
        System.out.println(factura.toString());
        return facturaRepository.storeFactura(factura.getFecha(), factura.getMonto(), factura.getIdCliente().getId());
    }
}
