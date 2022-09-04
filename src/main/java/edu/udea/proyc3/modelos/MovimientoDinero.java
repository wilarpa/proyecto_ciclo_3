package edu.UdeA.proyc3.modelos;

import javax.persistence.*;

@Entity //para relacionar la clase a crear con una base de datos (anotaciones)
@Table
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Empleado usuario;

    public MovimientoDinero() {
    }

    public MovimientoDinero(int id, long monto, String concepto, Empleado usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }


}
