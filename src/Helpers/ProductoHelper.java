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
public class ProductoHelper {

    private String nombre;
    private long precioNormal;
    private String descripcion;
    private String marca;
    private String modelo;
    private long stock;
    private String imagen;
    private String fechaVencimiento;
    private String temporada;
    private long idEmpresa;
    private long idCategoria;
    
    
    public ProductoHelper(String nombre, long precioNormal, String descripcion, String marca, String modelo, long stock, String imagen, String fechaVencimiento, String temporada, long idEmpresa, long idCategoria) {
        this.nombre = nombre;
        this.precioNormal = precioNormal;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.stock = stock;
        this.imagen = imagen;
        this.fechaVencimiento = fechaVencimiento;
        this.temporada = temporada;
        this.idEmpresa = idEmpresa;
        this.idCategoria = idCategoria;
    }
    
    
    @JsonProperty("Nombre")
    public String getNombre() { return nombre; }
    @JsonProperty("Nombre")
    public void setNombre(String value) { this.nombre = value; }

    @JsonProperty("PrecioNormal")
    public long getPrecioNormal() { return precioNormal; }
    @JsonProperty("PrecioNormal")
    public void setPrecioNormal(long value) { this.precioNormal = value; }

    @JsonProperty("Descripcion")
    public String getDescripcion() { return descripcion; }
    @JsonProperty("Descripcion")
    public void setDescripcion(String value) { this.descripcion = value; }

    @JsonProperty("Marca")
    public String getMarca() { return marca; }
    @JsonProperty("Marca")
    public void setMarca(String value) { this.marca = value; }

    @JsonProperty("Modelo")
    public String getModelo() { return modelo; }
    @JsonProperty("Modelo")
    public void setModelo(String value) { this.modelo = value; }

    @JsonProperty("Stock")
    public long getStock() { return stock; }
    @JsonProperty("Stock")
    public void setStock(long value) { this.stock = value; }

    @JsonProperty("Imagen")
    public String getImagen() { return imagen; }
    @JsonProperty("Imagen")
    public void setImagen(String value) { this.imagen = value; }

    @JsonProperty("FechaVencimiento")
    public String getFechaVencimiento() { return fechaVencimiento; }
    @JsonProperty("FechaVencimiento")
    public void setFechaVencimiento(String value) { this.fechaVencimiento = value; }

    @JsonProperty("Temporada")
    public String getTemporada() { return temporada; }
    @JsonProperty("Temporada")
    public void setTemporada(String value) { this.temporada = value; }

    @JsonProperty("IdEmpresa")
    public long getIDEmpresa() { return idEmpresa; }
    @JsonProperty("IdEmpresa")
    public void setIDEmpresa(long value) { this.idEmpresa = value; }

    @JsonProperty("IdCategoria")
    public long getIDCategoria() { return idCategoria; }
    @JsonProperty("IdCategoria")
    public void setIDCategoria(long value) { this.idCategoria = value; }
    
    
    
    
}
