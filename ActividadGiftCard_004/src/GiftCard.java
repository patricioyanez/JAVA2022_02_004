import java.util.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date fecha;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 1000000000000000L;
        this.clave = 0;
        this.monto = 0;
        this.fecha = new Date();//null;
        this.trabajador = new Trabajador();// null;
    }
    public GiftCard(long codigo, int clave, int monto, Date fecha, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.fecha = fecha;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public long generarCodigo(long codigo)
    {
        return this.codigo = codigo + 1;
    }

    public String datos() {
        return "*** Datos de la GiftCard\n" + 
                "Codigo         : " + codigo + "\n" + 
                "Clave          : " + clave + "\n" + 
                "Monto          : " + monto + "\n" + 
                "Fecha          : " + fecha + "\n" + 
                "Rut            : " + trabajador.getRut() + "-" + trabajador.getDv()+"\n" + 
                "Nombre         : " + trabajador.getNombre()
                ;
    }
    
}
