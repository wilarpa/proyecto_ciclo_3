package edu.udea.proyecto_ciclo_3.modelos;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity //para relacionar la clase a crear con una base de datos (anotaciones)
@Table(name="Empresa") // relaciona la entidad con la tabla en BD

public class Empresa {
    @Id // identifica la clave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//define el Id como autoincrementado
    private int id;

    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;

    public Empresa(){;
    }

    public Empresa(String nombre, String direccion, String telefono, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
        //no se genera constructor de Id pues ya se mencionó (construyó) anteriomente como autoincrementado.
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
