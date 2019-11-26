/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author Acer
 */
public class OfertaHelper {
    String descripcion;
    int compraMinima;
    int compraMaxima;
    String fechaDisponibilidad;
    int valor;
    int porcentajeDescuento;
    int idUsuario;
    int idProducto;

    public OfertaHelper(String descripcion, int compraMinima, int compraMaxima, String fechaDisponibilidad, int valor, int porcentajeDescuento, int idUsuario, int idProducto) {
        this.descripcion = descripcion;
        this.compraMinima = compraMinima;
        this.compraMaxima = compraMaxima;
        this.fechaDisponibilidad = fechaDisponibilidad;
        this.valor = valor;
        this.porcentajeDescuento = porcentajeDescuento;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCompraMinima() {
        return compraMinima;
    }

    public void setCompraMinima(int compraMinima) {
        this.compraMinima = compraMinima;
    }

    public int getCompraMaxima() {
        return compraMaxima;
    }

    public void setCompraMaxima(int compraMaxima) {
        this.compraMaxima = compraMaxima;
    }

    public String getFechaDisponibilidad() {
        return fechaDisponibilidad;
    }

    public void setFechaDisponibilidad(String fechaDisponibilidad) {
        this.fechaDisponibilidad = fechaDisponibilidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
            
}
