package lab3_jamilgarciadavidzavala;

public class Comida extends Productos{
    
    private String tipoC; 
    private String fechaC;

    public Comida() {
        super();
    }

    public Comida(String tipoC, String fechaC, String DescripP, String NombreP, int precio) {
        super(DescripP, NombreP, precio);
        this.tipoC = tipoC;
        this.fechaC = fechaC;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public String getFechaC() {
        return fechaC;
    }

    public void setFechaC(String fechaC) {
        this.fechaC = fechaC;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo: " + tipoC + "\n" 
                + "Fecha de Caducidad: " + fechaC + "\n";
    }
    
    
}
