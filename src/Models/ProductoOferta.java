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
public class ProductoOferta {
    private Categoria categoria;
    private Empresas empresa;
    private long idProducto;
    private String nombre;
    private long precioNormal;
    private String descripcion;
    private String marca;
    private String modelo;
    private long stock;
    private String imagen;
    private String fechaVencimiento;
    private String temporada;

    @JsonProperty("Categoria")
    public Categoria getCategoria() { return categoria; }
    @JsonProperty("Categoria")
    public void setCategoria(Categoria value) { this.categoria = value; }

    @JsonProperty("Empresa")
    public Empresas getEmpresa() { return empresa; }
    @JsonProperty("Empresa")
    public void setEmpresa(Empresas value) { this.empresa = value; }

    @JsonProperty("IdProducto")
    public long getIDProducto() { return idProducto; }
    @JsonProperty("IdProducto")
    public void setIDProducto(long value) { this.idProducto = value; }

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
}
