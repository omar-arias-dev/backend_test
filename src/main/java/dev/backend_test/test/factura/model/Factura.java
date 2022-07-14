package dev.backend_test.test.factura.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.backend_test.test.directorio.model.Persona;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "facturas")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date fecha;

    private Integer monto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Persona idCliente;

    public Factura() {
    }

    public Factura(int id, Date fecha, Integer monto, Persona idCliente) {
        super();
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.idCliente = idCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
}
