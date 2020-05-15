package lab3_jamilgarciadavidzavala;

public class Productos {
    
    private String DescripP; 
    private String NombreP;  
    private int precio; 

    public Productos() {
    }

    public Productos(String DescripP, String NombreP, int precio) {
        this.DescripP = DescripP;
        this.NombreP = NombreP;
        this.precio = precio;
    }

    public String getDescripP() {
        return DescripP;
    }

    public void setDescripP(String DescripP) {
        this.DescripP = DescripP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Productos{" + "DescripP=" + DescripP + ", NombreP=" + NombreP + ", precio=" + precio + '}';
    }
    
    
}
