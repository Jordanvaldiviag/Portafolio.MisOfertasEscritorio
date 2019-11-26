/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Acer
 */
public class UsuarioHelper {
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private long telefono;
    private String comuna;
    private String fechaNacimiento;
    private boolean suscrito;
    private long puntos;
    private long idTipoUsuario;
    private long idEmpresa;

    public UsuarioHelper(String rut, String nombre, String apellido, String correo, String password, long telefono, String comuna, String fechaNacimiento, boolean suscrito, long puntos, long idTipoUsuario, long idEmpresa) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.comuna = comuna;
        this.fechaNacimiento = fechaNacimiento;
        this.suscrito = suscrito;
        this.puntos = puntos;
        this.idTipoUsuario = idTipoUsuario;
        this.idEmpresa = idEmpresa;
    }

    @JsonProperty("Rut")
    public String getRut() { return rut; }
    @JsonProperty("Rut")
    public void setRut(String value) { this.rut = value; }

    @JsonProperty("Nombre")
    public String getNombre() { return nombre; }
    @JsonProperty("Nombre")
    public void setNombre(String value) { this.nombre = value; }

    @JsonProperty("Apellido")
    public String getApellido() { return apellido; }
    @JsonProperty("Apellido")
    public void setApellido(String value) { this.apellido = value; }

    @JsonProperty("Correo")
    public String getCorreo() { return correo; }
    @JsonProperty("Correo")
    public void setCorreo(String value) { this.correo = value; }

    @JsonProperty("Password")
    public String getPassword() { return password; }
    @JsonProperty("Password")
    public void setPassword(String value) { this.password = value; }

    @JsonProperty("Telefono")
    public long getTelefono() { return telefono; }
    @JsonProperty("Telefono")
    public void setTelefono(long value) { this.telefono = value; }

    @JsonProperty("Comuna")
    public String getComuna() { return comuna; }
    @JsonProperty("Comuna")
    public void setComuna(String value) { this.comuna = value; }

    @JsonProperty("FechaNacimiento")
    public String getFechaNacimiento() { return fechaNacimiento; }
    @JsonProperty("FechaNacimiento")
    public void setFechaNacimiento(String value) { this.fechaNacimiento = value; }

    @JsonProperty("Suscrito")
    public boolean getSuscrito() { return suscrito; }
    @JsonProperty("Suscrito")
    public void setSuscrito(boolean value) { this.suscrito = value; }

    @JsonProperty("Puntos")
    public long getPuntos() { return puntos; }
    @JsonProperty("Puntos")
    public void setPuntos(long value) { this.puntos = value; }

    @JsonProperty("IdTipoUsuario")
    public long getIDTipoUsuario() { return idTipoUsuario; }
    @JsonProperty("IdTipoUsuario")
    public void setIDTipoUsuario(long value) { this.idTipoUsuario = value; }

    @JsonProperty("IdEmpresa")
    public long getIDEmpresa() { return idEmpresa; }
    @JsonProperty("IdEmpresa")
    public void setIDEmpresa(long value) { this.idEmpresa = value; }

}
