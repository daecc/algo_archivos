
package com.mycompany.sistemareforzamiento.logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Asesor extends Usuario{
    private List<Aula> aulasACargo;
    private List<Consulta> consultas;

    public Asesor(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        super(id_usuario, nombre, email, contrasena, flag);
    }

    public Asesor() {
    }
    
         
    public void Subir_salones(int id,String nom, String ho,String di, String li, String Ase){
        Aula al = new Aula();
        al.setId(id);
        al.setNombre(nom);
        al.setHorario(ho);
        al.setDia(di);
        al.setLink(li);
        al.setDocente(Ase);
        try{
            BufferedWriter usu = new BufferedWriter(new FileWriter("archivo\\aula.txt",true));
            
                usu.write(al.getId()+"\t"+al.getNombre()+"\t"+al.getHorario()+"\t"+al.getDia()+"\t"+al.getLink()+"\t"+al.getDocente());
                usu.newLine(); 
            
            usu.close();
        }catch(IOException e){
            System.out.println("Error al escribir el archivo"+ e.getMessage());
        }
        
    }

    public void gestionarAsistencia() {
        // Implementar método
    }

    public void responderConsulta(Consulta consulta) {
        // Implementar método
    }
}
