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
public class Login {
    String usuario;
    String contraseña;
    
    public Login(String usuario, String contraseña){
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    
    //setters
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    
    // getters
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
}
