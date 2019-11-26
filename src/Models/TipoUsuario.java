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
public class TipoUsuario {
    private long idTipoUsuario;
    private String descripcion;

    @JsonProperty("IdTipoUsuario")
    public long getIDTipoUsuario() { return idTipoUsuario; }
    @JsonProperty("IdTipoUsuario")
    public void setIDTipoUsuario(long value) { this.idTipoUsuario = value; }

    @JsonProperty("Descripcion")
    public String getDescripcion() { return descripcion; }
    @JsonProperty("Descripcion")
    public void setDescripcion(String value) { this.descripcion = value; }
}
