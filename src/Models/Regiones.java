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
public class Regiones {
    private String region;
    private String[] comunas;

    @JsonProperty("region")
    public String getRegion() { return region; }
    @JsonProperty("region")
    public void setRegion(String value) { this.region = value; }

    @JsonProperty("comunas")
    public String[] getComunas() { return comunas; }
    @JsonProperty("comunas")
    public void setComunas(String[] value) { this.comunas = value; }

    @Override
    public String toString() {
        return region;
    }
    
    
}
