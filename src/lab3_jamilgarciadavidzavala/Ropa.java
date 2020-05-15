package lab3_jamilgarciadavidzavala;

public class Ropa extends Productos{
    
    private String tipo; 
    private String talla; 

    public Ropa() {
        super(); 
    }

    public Ropa(String tipo, String talla, String DescripP, String NombreP, int precio) {
        super(DescripP, NombreP, precio);
        this.tipo = tipo;
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() + "Ropa{" + "tipo=" + tipo + ", talla=" + talla + '}';
    }
    
    
}
