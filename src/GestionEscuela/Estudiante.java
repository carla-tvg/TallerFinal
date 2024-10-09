package GestionEscuela;

public class Estudiante {
    String nombre;
    int ID;
    double Calificaciones;

public  Estudiante(){


}
    public Estudiante(String nombre, int ID, double calificaciones) {
        this.nombre = nombre;
        this.ID = ID;
        Calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getCalificaciones() {
        return Calificaciones;
    }

    public void setCalificaciones(double calificaciones) {
        Calificaciones = calificaciones;
    }

    @Override
    public String toString(){
    return "Nombre " + this.nombre +"Id" +this.ID +"Calificaciones " +this.Calificaciones;

    }

}
