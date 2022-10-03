
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
    // sobre escritura
    @Override
    public String datos()
    {
        return super.datos() +
                "\nCarrera      : " + super.getCarrera() +
                "\nEstá activo  : " + (activa ? "Si": "No");
    }
    // sobre carga
    public void valorMatricula()
    {
        if(activa)
            System.out.println("Costo 0");            
        else
            System.out.println("Debe pagar la matricula");
    }
    public void valorMatricula(int valor)
    {
        System.out.println("El valor es: " + valor);            
    }
    public void valorMatricula(int valor, int descuento)
    {
        float total = valor - (valor * descuento / 100);
        System.out.println("El valor es: " + (int)total);            
    }
    
    
    
}
