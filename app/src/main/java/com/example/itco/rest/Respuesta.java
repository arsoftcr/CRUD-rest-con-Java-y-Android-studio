package com.example.itco.rest;

public class Respuesta {
    private  String Codigo;
    private  String Descripcion;
    private  double Precio;
    private  double Cantidad;
    private  String Categoria;
    private  double Costo;
    private  String Impuesto;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double costo) {
        Costo = costo;
    }

    public String getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(String impuesto) {
        Impuesto = impuesto;
    }
}
