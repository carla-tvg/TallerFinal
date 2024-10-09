package GestionEscuela;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Estudiante estudianteUno= new Estudiante("Maria", 101848,5);
        Estudiante estudianteDos= new Estudiante("Juan ", 101545,4);
        Estudiante estudianteTres= new Estudiante("Roberto", 87154,2);
        Estudiante estudianteCuatro= new Estudiante("Mariana", 87154,1);

        Escuela escuela= new Escuela();
        escuela.agregarEstudiante(estudianteUno);
        escuela.agregarEstudiante(estudianteDos);
        escuela.agregarEstudiante(estudianteTres);
        escuela.agregarEstudiante(estudianteCuatro);



    }
}