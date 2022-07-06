
package Modelo;

public class Detalle {
    private int id;
    private int id_pro;
    private int id_ventas;
    private double precio;
    private int cantidad;
    
    public Detalle(){
        
    }

    public Detalle(int id, int id_pro, int id_ventas, double precio, int cantidad) {
        this.id = id;
        this.id_pro = id_pro;
        this.id_ventas = id_ventas;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
