package edu.udea.proyecto_ciclo_3.modelos;

<<<<<<< HEAD:src/main/java/edu/udea/Solutions/modelos/Empleado.java
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
@Entity
public class Empleado {

    @Id
    private long id;

    @Column(unique = true)
    private String correo;

    @ManyToOne
    private Empresa empresa;

    private Date updateAt;
    private Date createdAt;
    private enum rol{
    }

    public Empleado(long id, String correo, Empresa empresa, Date updateAt, Date createdAt) {
        this.id = id;
=======
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
>>>>>>> Develop_Anderson:src/main/java/edu/udea/proyecto_ciclo_3/modelos/Empleado.java
        this.correo = correo;
        this.empresa = empresa;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

<<<<<<< HEAD:src/main/java/edu/udea/Solutions/modelos/Empleado.java
    public long getId() {
        return id;
=======

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
>>>>>>> Develop_Anderson:src/main/java/edu/udea/proyecto_ciclo_3/modelos/Empleado.java
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

<<<<<<< HEAD:src/main/java/edu/udea/Solutions/modelos/Empleado.java
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getUpdateAt() {
        return updateAt;
=======
    public String getRol() {
        return rol;
>>>>>>> Develop_Anderson:src/main/java/edu/udea/proyecto_ciclo_3/modelos/Empleado.java
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

}
