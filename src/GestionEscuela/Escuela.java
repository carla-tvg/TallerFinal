package GestionEscuela;

import java.util.HashSet;
import java.util.Set;

public class Escuela {
    protected Set<Estudiante> listaEstudiante;

    public Escuela() {
        listaEstudiante = new HashSet<>();
    }

    public Set<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(Set<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    public void  agregarEstudiante(Estudiante nuevoEstudiante){

        if (listaEstudiante.isEmpty()) {
            listaEstudiante.add(nuevoEstudiante);
        } else {
            for(Estudiante estudiante : listaEstudiante){

                if(!(estudiante.getID() == nuevoEstudiante.getID())){
                    Estudiante guardar= nuevoEstudiante;

                    listaEstudiante.add(guardar);
                    System.out.println("Creado con éxito");
                }else{


                    System.out.println("Ya esta creado");
                }
                System.out.println(estudiante);
            }
        }
    }
}
