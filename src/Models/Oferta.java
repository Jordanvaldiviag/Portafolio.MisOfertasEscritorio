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
    private Object[] opinionOfertas;
    private Usuario usuario;
    private Object[] valoraciones;
    private long idOferta;
    private String descripcion;
    private long compraMin;
    private long compraMax;
    private String fechaDisponibilidad;
    private long valor;
    private long porcentajeDescuento;
    private Producto producto;

    @JsonProperty("OpinionOfertas")
    public Object[] getOpinionOfertas() { return opinionOfertas; }
    @JsonProperty("OpinionOfertas")
    public void setOpinionOfertas(Object[] value) { this.opinionOfertas = value; }

    @JsonProperty("Usuario")
    public Usuario getUsuario() { return usuario; }
    @JsonProperty("Usuario")
    public void setUsuario(Usuario value) { this.usuario = value; }

    @JsonProperty("Valoraciones")
    public Object[] getValoraciones() { return valoraciones; }
    @JsonProperty("Valoraciones")
    public void setValoraciones(Object[] value) { this.valoraciones = value; }

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
    public Producto getProducto() { return producto; }
    @JsonProperty("Producto")
    public void setProducto(Producto value) { this.producto = value; }
}
