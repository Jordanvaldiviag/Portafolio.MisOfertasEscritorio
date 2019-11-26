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
public class EmpresaHelper {
    
    private String nombre;
    private String direccion;
    private long telefono;
    private String comuna;
    private String region;
    private String rut;
    private String actividad;

    public EmpresaHelper(String nombre, String direccion, long telefono, String comuna, String region, String rut, String actividad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.comuna = comuna;
        this.region = region;
        this.rut = rut;
        this.actividad = actividad;
    }
    
    @JsonProperty("Nombre")
    public String getNombre() { return nombre; }
    @JsonProperty("Nombre")
    public void setNombre(String value) { this.nombre = value; }

    @JsonProperty("Direccion")
    public String getDireccion() { return direccion; }
    @JsonProperty("Direccion")
    public void setDireccion(String value) { this.direccion = value; }

    @JsonProperty("Telefono")
    public long getTelefono() { return telefono; }
    @JsonProperty("Telefono")
    public void setTelefono(long value) { this.telefono = value; }

    @JsonProperty("Comuna")
    public String getComuna() { return comuna; }
    @JsonProperty("Comuna")
    public void setComuna(String value) { this.comuna = value; }

    @JsonProperty("Region")
    public String getRegion() { return region; }
    @JsonProperty("Region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("Rut")
    public String getRut() { return rut; }
    @JsonProperty("Rut")
    public void setRut(String value) { this.rut = value; }

    @JsonProperty("Actividad")
    public String getActividad() { return actividad; }
    @JsonProperty("Actividad")
    public void setActividad(String value) { this.actividad = value; }
    
    
}
