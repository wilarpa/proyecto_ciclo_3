package edu.udea.proyecto_ciclo_3.modelos;

import javax.persistence.*;

@Entity
@Table (name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String correo;


    @ManyToOne
    @JoinColumn(name = "empresa_id") //establezco la relación de muchos (empleados ) a uno (Empresa)
    private Empresa empresa;
    private String rol;

    public Empleado() {
    } // el constructor vacío para pruebas

    public Empleado(int id, String nombre, String correo, Empresa empresa, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
