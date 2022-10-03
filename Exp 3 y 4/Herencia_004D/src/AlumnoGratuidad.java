
public class AlumnoGratuidad extends Alumno {
    private boolean activa;
    public AlumnoGratuidad() {
        super(10);
        System.out.println("Soy alumno con gratuidad");
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    @Override
    public String datos()
    {
        return super.datos() +
                "\nCarrera      : " + super.getCarrera() +
                "\nEstá activo  : " + (activa ? "Si": "No");
    }
}
