
package com.mycompany.sistemareforzamiento.logica;

import java.util.List;


public class Asesor extends Usuario{
    private List<Aula> aulasACargo;
    private List<Consulta> consultas;

    public Asesor(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        super(id_usuario, nombre, email, contrasena, flag);
    }
         
    public void proponerHorario() {
        // Implementar método
    }

    public void gestionarAsistencia() {
        // Implementar método
    }

    public void responderConsulta(Consulta consulta) {
        // Implementar método
    }
}
