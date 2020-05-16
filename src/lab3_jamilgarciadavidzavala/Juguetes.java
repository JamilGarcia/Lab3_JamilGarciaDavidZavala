package lab3_jamilgarciadavidzavala;

public class Juguetes extends Productos{
    
    private String DescripJ; 

    public Juguetes() {
    }

    public Juguetes(String DescripJ, String DescripP, String NombreP, int precio) {
        super(DescripP, NombreP, precio);
        this.DescripJ = DescripJ;
    }

    public String getDescripJ() {
        return DescripJ;
    }

    public void setDescripJ(String DescripJ) {
        this.DescripJ = DescripJ;
    }

    @Override
    public String toString() {
        return super.toString() + "Descripcion: " + DescripJ + "\n";
    }

    
}
