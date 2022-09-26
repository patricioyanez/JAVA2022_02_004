import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equalsIgnoreCase(rut))
                return true;
        }
        return false;
    }
}
