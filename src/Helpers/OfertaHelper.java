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
public class OfertaHelper {
    private String descripcion;
    private long compraMin;
    private long compraMax;
    private String fechaDisponibilidad;
    private long valor;
    private long porcentajeDescuento;
    private long idProducto;
    private long idUsuario;

    public OfertaHelper(String descripcion, long compraMin, long compraMax, String fechaDisponibilidad, long valor, long porcentajeDescuento, long idProducto, long idUsuario) {
        this.descripcion = descripcion;
        this.compraMin = compraMin;
        this.compraMax = compraMax;
        this.fechaDisponibilidad = fechaDisponibilidad;
        this.valor = valor;
        this.porcentajeDescuento = porcentajeDescuento;
        this.idProducto = idProducto;
        this.idUsuario = idUsuario;
    }
    
    

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

    @JsonProperty("IdProducto")
    public long getIDProducto() { return idProducto; }
    @JsonProperty("IdProducto")
    public void setIDProducto(long value) { this.idProducto = value; }

    @JsonProperty("IdUsuario")
    public long getIDUsuario() { return idUsuario; }
    @JsonProperty("IdUsuario")
    public void setIDUsuario(long value) { this.idUsuario = value; }
}
