
package producto;

/**
 *
 * @author Sophi
 */
public class Producto {
    String nombre;
    String proveedor;
    int cantidad;
    double precio;
    
    public Producto(String nombre, String proveedor, int cantidad, double precio){
        this.nombre=nombre;
        this.proveedor=proveedor;
        this.cantidad=cantidad;
        this.precio=precio;        
    }
    
    // setters
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setProveedor(String proveedor){
        this.proveedor=proveedor;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    // getters
    public String getNombre(){
        return nombre;
    }
    public String getProveedor(){
        return proveedor;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    

    
    public static void main(String[] args) {
     
    }
    
}
