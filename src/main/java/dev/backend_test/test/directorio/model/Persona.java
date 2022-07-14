package dev.backend_test.test.directorio.model;

import dev.backend_test.test.factura.model.Factura;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "personas")
public class Persona {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    private Integer identificacion;

    @OneToMany(mappedBy = "idCliente")
    private List<Factura> facturas;

    public Persona() {
    }

    public Persona(Long id) {
        super();
        this.id = id;
    }

    public Persona(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public Persona(Long id, String nombre, String apellidoPaterno, String apellidoMaterno, Integer identificacion, List<Factura> facturas) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.identificacion = identificacion;
        this.facturas = facturas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
