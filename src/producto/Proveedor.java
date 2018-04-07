/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

/**
 *
 * @author Sophi
 */
public class Proveedor {
    String nombre;
    int contacto;
    
    public Proveedor(String nombre, int contacto){
        this.nombre=nombre;
        this.contacto=contacto;
    }
    
    // setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setContacto(int contacto){
        this.contacto=contacto;
    }
    
    // getters
    public String getNombre(){
        return nombre;
    }
    public int getContacto(){
        return contacto;
    }
}
