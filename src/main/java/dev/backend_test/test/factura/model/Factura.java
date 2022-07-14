package dev.backend_test.test.factura.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.backend_test.test.directorio.model.Persona;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private Integer monto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Persona idCliente;

    public Factura() {
    }

    public Factura(Long id, LocalDate fecha, Integer monto, Persona idCliente) {
        super();
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.idCliente = idCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Persona getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Persona idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", idCliente=" + idCliente +
                '}';
    }
}
