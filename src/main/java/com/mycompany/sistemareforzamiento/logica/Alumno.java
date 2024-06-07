
package com.mycompany.sistemareforzamiento.logica;

import java.util.List;





public class Alumno extends Usuario {
  
    private List<Aula> aulasInscritas;
    private List<Nota> notas;

    public Alumno(int id_usuario, String nombre, String email, String contrasena, boolean flag) {
        super(id_usuario, nombre, email, contrasena, flag);
    }

    

    

   
    
    

    

    public void inscribirseAula(Aula aula) {
        // Implementar método
    }

    public void realizarConsulta_Curso(Consulta consulta) {
        // Implementar método
    }

    public void ConsultaPreInscripcion() {
        // Implementar método
    }
}
