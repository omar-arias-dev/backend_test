package dev.backend_test.test.factura.web;

import dev.backend_test.test.factura.model.Factura;
import dev.backend_test.test.factura.service.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")

public class FacturaRestService {

    @Autowired
    private Ventas ventas;

    @GetMapping("/find-facturas-by-persona/{idCliente}")
    public ResponseEntity<List<Factura>> findFacturasByPersona(@PathVariable("idCliente") Integer idCliente) {
        return new ResponseEntity<>(ventas.findFacturasByPersona(idCliente), HttpStatus.OK);
    }

    @PostMapping("/store-factura")
    public ResponseEntity<Factura> storeFactura(@RequestBody Factura factura) {
        return new ResponseEntity<>(ventas.storeFactura(factura), HttpStatus.ACCEPTED);
    }
}
