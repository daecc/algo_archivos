
package com.mycompany.archivos;
import com.mycompany.sistemareforzamiento.logica.Alumno;
import com.mycompany.sistemareforzamiento.logica.Asesor;
import com.mycompany.sistemareforzamiento.logica.Aula;
import com.mycompany.sistemareforzamiento.logica.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class manejo_de_archivos {
    ArrayList<Usuario> us = new ArrayList<>();
    ArrayList<Usuario> usu = new ArrayList<>();
    
    
    
    File archivo = new File("archivo\\archivo.txt");
   
    
    
    
    public void crear(){
     
        try {
            // Intentar crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
           
        }
    }
    
    
    public void escribir(){
        
        try {
            PrintWriter escritor = new PrintWriter("archivo\\archivo.txt");
            escritor.println("Hola mundo");
            escritor.close();
            System.out.println("texto escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
           
        }
        
        
        
    }
    
    
    public void eleminar(){
        archivo.delete();
        System.out.println("Se elimino el archivo");
    }
    
    
    
    public void añadir_alumno(){
        ArrayList<Alumno> listalumno = new ArrayList<>();
        listalumno.add(new Alumno(1,"David","@gmail","123",true));
        listalumno.add(new Alumno(2,"Yazid","@gmail","123",true));
        listalumno.add(new Alumno(3,"Giovanni","@gmail","123",true));
        listalumno.add(new Alumno(4,"Guillermo","@gmail","123",true));
        
        
        for(Usuario ob:listalumno){
            System.out.println(ob.getNombre());
        }
        
        guardar_alumno(listalumno);
    }
    
    public void añadir_asesor(){
        ArrayList<Asesor> listasesor = new ArrayList<>();
        listasesor.add(new Asesor(1,"Admin","@gmail","123",false));
        listasesor.add(new Asesor(2,"Admin2","@gmail","123",false));
        
        for(Usuario ob:listasesor){
            System.out.println(ob.getNombre());
        }
        
        guardar_asesor(listasesor);
    }
    
    
    
    
    public void guardar_alumno(ArrayList<Alumno> list){
        try{
            BufferedWriter usu = new BufferedWriter(new FileWriter("archivo\\alumno.txt",true));
            for(Usuario ob:list){
                usu.write(String.valueOf(ob.getId_usuario())+"\t"+ob.getNombre()+"\t"+ob.getEmail()+"\t"+ob.getContrasena()+"\t"+String.valueOf(ob.isFlag()));
                usu.newLine(); 
            }
            usu.close();
        }catch(IOException e){
            System.out.println("Error al escribir el archivo"+ e.getMessage());
        }
    }
    
    
    public void guardar_asesor(ArrayList<Asesor> list){
        try{
            BufferedWriter usu = new BufferedWriter(new FileWriter("archivo\\asesor.txt",true));
            for(Usuario ob:list){
                usu.write(String.valueOf(ob.getId_usuario())+"\t"+ob.getNombre()+"\t"+ob.getEmail()+"\t"+ob.getContrasena()+"\t"+ob.isFlag());
                usu.newLine(); 
            }
            usu.close();
        }catch(IOException e){
            System.out.println("Error al escribir el archivo"+ e.getMessage());
        }
    }
    
    
  /*  public void leer(){
        traer_archivos(usu);
        
        for(Usuario lib:usu){
            System.out.println(lib.getNombre());
        }
        
    }
*/    
    public void traer_archivos(ArrayList<Usuario> list){
        try{
            BufferedReader lector1 = new BufferedReader(new FileReader("archivo\\alumno.txt"));
            BufferedReader lector2 = new BufferedReader(new FileReader("archivo\\asesor.txt"));
            String linea ="";
            while((linea=lector1.readLine())!=null){
                String[] bloques = linea.split("\t");
                if(bloques.length == 5){
                int id = Integer.parseInt(bloques[0]);
                String nombre = bloques[1];
                String email = bloques[2];
                String contraseña = bloques[3];
                boolean flag = Boolean.parseBoolean(bloques[4]);
                list.add(new Usuario(id,nombre,email,contraseña,flag));
                }
            }
            
            while((linea=lector2.readLine())!=null){
                String[] bloques = linea.split("\t");
                if(bloques.length == 5){
                int id = Integer.parseInt(bloques[0]);
                String nombre = bloques[1];
                String email = bloques[2];
                String contraseña = bloques[3];
                boolean flag = Boolean.parseBoolean(bloques[4]);
                list.add(new Usuario(id,nombre,email,contraseña,flag));
                }
            }
       
            lector1.close();
            lector2.close();
        }catch(IOException e){
            System.out.println("Error al leer al archivo ");
        }
    }
    
    public void traer_archivosaulas(ArrayList<Aula> list){
        try{
            BufferedReader lector = new BufferedReader(new FileReader("archivo\\aula.txt"));
            String linea ="";
            while((linea=lector.readLine())!=null){
                String[] bloques = linea.split("\t");
                if(bloques.length == 6){
                int id = Integer.parseInt(bloques[0]);
                String nombre = bloques[1];
                String horario = bloques[2];
                String dia = bloques[3];
                String link = bloques[4];
                String asesor = bloques[5];
                list.add(new Aula(id,nombre,horario,dia,link,asesor));
                }
                
            }
            lector.close();
        }catch(IOException e){
            System.out.println("Error al leer al archivo ");
        }
    }
    
    public void crear_archivo_intermedio(){
        try {
            PrintWriter escritor = new PrintWriter("archivo\\intermedio.txt");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
        }
        
        
    }
    
    
   
    
    }
    

