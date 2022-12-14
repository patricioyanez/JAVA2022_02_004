
public class Principal {
    public static void main(String[] args) {
        Puesto supervisor = new Puesto(1000, "supervisor");
        Puesto cajero = new Puesto(1000, "cajero");
        
        Empleado e1 = new Empleado("1-9", "Ana", "F", 1, 24, cajero);
        Empleado e2 = new Empleado("2-7", "Luis", "M", 5, 30, cajero);
        Empleado e3 = new Empleado("3-5", "Alex", "M", 5, 50, supervisor);
        
        Empresa mall = new Empresa();
        mall.agregar(e1);
        mall.agregar(e2);
        mall.agregar(e3);
        
        mall.listar();
        
        if(mall.buscarEmpleado("2-7"))
            System.out.println("El empleado existe");
        else
            System.out.println("Empleado no existe");
        
        if(mall.buscarEmpleado("10-8")){
            System.out.println("El empleado existe");
        } else {
            System.out.println("Empleado no existe");
        }
        
        if (mall.eliminar("1-9")) {
            System.out.println("Rut eliminado");
        } else {
            System.out.println("Rut no eliminado");
        }
        
        mall.listar();
    }
}
