package com.entidades.gestionmonitores;
// Generated 26-mar-2017 15:10:33 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblEstudiantes generated by hbm2java
 */
public class TblEstudiantes  implements java.io.Serializable {


     private String cedula;
     private String nombre;
     private String apellido;
     private String email;
     private Date fechaNacimiento;
     private String pwd;
     private String telefono;
     private String direccion;

    public TblEstudiantes() {
    }

	
    public TblEstudiantes(String cedula, String nombre, String apellido, String email, Date fechaNacimiento, String pwd) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.pwd = pwd;
    }
    public TblEstudiantes(String cedula, String nombre, String apellido, String email, Date fechaNacimiento, String pwd, String telefono, String direccion) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.email = email;
       this.fechaNacimiento = fechaNacimiento;
       this.pwd = pwd;
       this.telefono = telefono;
       this.direccion = direccion;
    }
   
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getPwd() {
        return this.pwd;
    }
    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}


