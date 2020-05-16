package lab3_jamilgarciadavidzavala;

public class Empleados extends Personas{
    
    private String Hora; 
    private int ProductosV; 

    public Empleados() {
        super();
    }

    public Empleados(String Hora, int ProductosV, int ID, String User, String pass, String Correo, String Nombre, String fechaN) {
        super(ID, User, pass, Correo, Nombre, fechaN);
        this.Hora = Hora;
        this.ProductosV = ProductosV;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getProductosV() {
        return ProductosV;
    }

    public void setProductosV(int ProductosV) {
        this.ProductosV = ProductosV;
    }

    @Override
    public String toString() {
        return super.toString() + "Hora: " + Hora + "\n"
                + "Productos: " + ProductosV + "\n";
    }
    
    
}
