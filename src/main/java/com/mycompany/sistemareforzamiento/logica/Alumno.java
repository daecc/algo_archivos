
package com.mycompany.sistemareforzamiento.logica;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;





public class Alumno extends Usuario {
  
    private List<Aula> aulasInscritas;
    private List<Nota> notas;

    public Alumno(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        super(id_usuario, nombre, email, contrasena, flag);
    }

    public Alumno() {
    }

    
    
    public void ingresar_inscripcion(int id_aula){
       
        try{
            BufferedWriter usu = new BufferedWriter(new FileWriter("archivo\\intermedio.txt",true));
            
                usu.write(Usuario.id_global+"\t"+id_aula);
                usu.newLine(); 
        
            usu.close();
        }catch(IOException e){
            System.out.println("Error al escribir el archivo"+ e.getMessage());
        }
        
    }

    public void realizarConsulta_Curso(Consulta consulta) {
        // Implementar método
    }

    public void ConsultaPreInscripcion() {
        // Implementar método
    }
}
