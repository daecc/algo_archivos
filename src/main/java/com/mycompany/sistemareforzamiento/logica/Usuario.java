
package com.mycompany.sistemareforzamiento.logica;

import com.mycompany.archivos.igu.PantallaAsesor;
import com.mycompany.archivos.igu.PantallaEstudiante;
import com.mycompany.archivos.manejo_de_archivos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class Usuario{
  
    private int id_usuario;
    private String nombre;
    private String email;
    private String contrasena;
    private boolean flag;
    public static int id_global;
    
    ArrayList<Usuario> us = new ArrayList<>();
    ArrayList<Usuario> usu = new ArrayList<>();
    manejo_de_archivos arch = new manejo_de_archivos();
    
    public Usuario(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.flag = flag;
    }
    public Usuario() {
        
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
   
        
   
    public void iniciarSesion(String nombre,String contraseña) {

        
            arch.traer_archivos(usu);

            PantallaEstudiante pe = new PantallaEstudiante();
            PantallaAsesor pa = new PantallaAsesor();
            for(Usuario lib:usu){
                if(lib.getNombre().equals(nombre)){

                    if(lib.getContrasena().equals(contraseña)){

                        if(lib.isFlag()){
                           pe.setVisible(true);
                           pe.setLocationRelativeTo(null);
                           Usuario.id_global = lib.getId_usuario();
                        }
                        else{

                            pa.setVisible(true);
                            pa.setLocationRelativeTo(null);
                            Usuario.id_global = lib.getId_usuario();
                        }

                    }
                    else{


                    }

                    }
                else{


                }
            }
    }

    public void cerrarSesion() {
        
    }
    public String validarUsuario(String nombre,String contraseña){
            String mensaje = "";    
            arch.traer_archivos(usu);
         
         for(Usuario lib:usu){
            
            if(lib.getNombre().equals(nombre)){
                
                if(lib.getContrasena().equals(contraseña)){
                    mensaje = "Usuario y contraseña correctos. Bienvenidos";
                    
                    return mensaje;
                }
                else{
                    mensaje = "Contraseña incorrecta.";
                    return mensaje;
                }
                    
                }
            else{
                mensaje = "Usuario no encontrado.";
                //return mensaje;
            }
                    
        }
        return mensaje;
         
    }

        
}
