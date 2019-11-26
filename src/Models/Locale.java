/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Acer
 */
public class Locale {
    private long idLocal;
    private String direccion;
    private String descripcion;

    @JsonProperty("IdLocal")
    public long getIDLocal() { return idLocal; }
    @JsonProperty("IdLocal")
    public void setIDLocal(long value) { this.idLocal = value; }

    @JsonProperty("Direccion")
    public String getDireccion() { return direccion; }
    @JsonProperty("Direccion")
    public void setDireccion(String value) { this.direccion = value; }

    @JsonProperty("Descripcion")
    public String getDescripcion() { return descripcion; }
    @JsonProperty("Descripcion")
    public void setDescripcion(String value) { this.descripcion = value; }
}
