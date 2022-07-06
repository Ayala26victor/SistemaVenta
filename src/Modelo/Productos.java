
package Modelo;


public class Productos {
    private int id;
    private int id_proveedor;
    private String codigo;
    private String nombre;
    private String stock;
    private Double precio;
    
    public Productos(){
        
    }

    public Productos(int id, int id_proveedor, String codigo, String nombre, String stock, Double precio) {
        this.id = id;
        this.id_proveedor = id_proveedor;
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    int getProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setProveedor(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setProveedorPro(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public Object getProveedorPro() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    

   
}
