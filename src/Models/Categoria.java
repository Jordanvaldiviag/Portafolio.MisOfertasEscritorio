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
public class Categoria {
     
    private long idCategoria;
    private String descripcion;

    @JsonProperty("IdCategoria")
    public long getIDCategoria() { return idCategoria; }
    @JsonProperty("IdCategoria")
    public void setIDCategoria(long value) { this.idCategoria = value; }

    @JsonProperty("Descripcion")
    public String getDescripcion() { return descripcion; }
    @JsonProperty("Descripcion")
    public void setDescripcion(String value) { this.descripcion = value; }

    @Override
    public String toString() {
        return descripcion;
    }
    
    
    
}
