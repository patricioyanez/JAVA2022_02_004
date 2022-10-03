
public class Principal {
    public static void main(String[] args) {
        AlumnoGratuidad ag = new AlumnoGratuidad();
        ag.setRut("1-9");
        ag.setNombre("Luis");
        ag.setCarrera("Informática");
        ag.setHablaEspanol(true);
        
        System.out.println(ag.datos());
        
        ag.valorMatricula();
        ag.valorMatricula(230000);
        ag.valorMatricula(230000,10);
    }
}
