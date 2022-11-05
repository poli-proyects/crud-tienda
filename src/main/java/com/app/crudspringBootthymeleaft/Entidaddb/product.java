package com.app.crudspringBootthymeleaft.Entidaddb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class product {
    @Id
    private  int codigoProducto;
    @Column(name="producto",nullable = false, length = 50)
    private String producto ;
    @Column(name="precio",nullable = false)
    private Double precio;
    @Column(name="cantidad",nullable = false)
    private  int cantidad ;

    public product() {
    }

    public product(int codigoProducto, String producto, Double precio, int cantidad) {
        this.codigoProducto = codigoProducto;
        this.producto = producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "product{" +
                "codigoProducto=" + codigoProducto +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
