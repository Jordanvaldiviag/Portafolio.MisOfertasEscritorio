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
public class Oferta {
   private long idOferta;
    private String descripcion;
    private long compraMin;
    private long compraMax;
    private String fechaDisponibilidad;
    private long valor;
    private long porcentajeDescuento;
    private ProductoElement producto;
    private long idUsuario;

    @JsonProperty("IdOferta")
    public long getIDOferta() { return idOferta; }
    @JsonProperty("IdOferta")
    public void setIDOferta(long value) { this.idOferta = value; }

    @JsonProperty("Descripcion")
    public String getDescripcion() { return descripcion; }
    @JsonProperty("Descripcion")
    public void setDescripcion(String value) { this.descripcion = value; }

    @JsonProperty("CompraMin")
    public long getCompraMin() { return compraMin; }
    @JsonProperty("CompraMin")
    public void setCompraMin(long value) { this.compraMin = value; }

    @JsonProperty("CompraMax")
    public long getCompraMax() { return compraMax; }
    @JsonProperty("CompraMax")
    public void setCompraMax(long value) { this.compraMax = value; }

    @JsonProperty("FechaDisponibilidad")
    public String getFechaDisponibilidad() { return fechaDisponibilidad; }
    @JsonProperty("FechaDisponibilidad")
    public void setFechaDisponibilidad(String value) { this.fechaDisponibilidad = value; }

    @JsonProperty("Valor")
    public long getValor() { return valor; }
    @JsonProperty("Valor")
    public void setValor(long value) { this.valor = value; }

    @JsonProperty("PorcentajeDescuento")
    public long getPorcentajeDescuento() { return porcentajeDescuento; }
    @JsonProperty("PorcentajeDescuento")
    public void setPorcentajeDescuento(long value) { this.porcentajeDescuento = value; }

    @JsonProperty("Producto")
    public ProductoElement getProducto() { return producto; }
    @JsonProperty("Producto")
    public void setProducto(ProductoElement value) { this.producto = value; }

    @JsonProperty("IdUsuario")
    public long getIDUsuario() { return idUsuario; }
    @JsonProperty("IdUsuario")
    public void setIDUsuario(long value) { this.idUsuario = value; }
}
