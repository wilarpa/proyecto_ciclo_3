package edu.udea.Solutions.modelos;

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
        this.correo = correo;
        this.empresa = empresa;
        this.updateAt = updateAt;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getUpdateAt() {
        return updateAt;
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
}
