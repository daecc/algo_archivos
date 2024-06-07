
package com.mycompany.sistemareforzamiento.logica;


public class Aula {
  
    private int id_aula;
    private String nombre;
    private String horario;
    private String dia;
    private String link;
    private String asesor;
    

    public Aula() {
    }

    public Aula(int id_aula, String nombre, String horario, String dia, String link, String asesor) {
        this.id_aula = id_aula;
        this.nombre = nombre;
        this.horario = horario;
        this.dia = dia;
        this.link = link;
        this.asesor = asesor;
    }

    public int getId() {
        return id_aula;
    }

    public void setId(int id_aula) {
        this.id_aula = id_aula;
    }
  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDocente() {
        return asesor;
    }

    public void setDocente(String docente) {
        this.asesor = docente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    

    
}
