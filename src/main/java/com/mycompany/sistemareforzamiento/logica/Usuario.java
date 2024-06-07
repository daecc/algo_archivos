
package com.mycompany.sistemareforzamiento.logica;

import java.util.ArrayList;




public class Usuario{
  
    private int id_usuario;
    private String nombre;
    private String email;
    private String contrasena;
    private boolean flag;
    public static int id_global;
    public Usuario(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void mostrar_usuario(){
        System.out.println("Id: "+id_usuario);
        System.out.println("nombre: "+nombre);
        System.out.println("email: "+email);
        System.out.println("contraseña: "+contrasena);
    }
   
        
   
    public void iniciarSesion() {
        // Implementar método
    }

    public void cerrarSesion() {
        
    }


        
}
