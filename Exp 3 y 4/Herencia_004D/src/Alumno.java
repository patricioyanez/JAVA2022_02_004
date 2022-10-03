
public class Alumno extends Persona {
    private String carrera;
    public Alumno(int edad) { // ejemplo constr. con parametro
        System.out.println("Soy Alumno");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
