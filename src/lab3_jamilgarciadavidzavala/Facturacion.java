package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Facturacion {
    
    private Locales local; 
    private String cliente; 
    private int precio; 
    private String desc; 

    public Facturacion() {
    }

    public Facturacion(Locales local, String cliente, int precio, String desc) {
        this.local = local;
        this.cliente = cliente;
        this.precio = precio;
        this.desc = desc;
    }

    public Locales getLocal() {
        return local;
    }

    public void setLocal(Locales local) {
        this.local = local;
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Facturacion: \n" + ""
                + "local: " + local + "\n"+"Cliente: " + cliente  + "\n"
                + "Precio: " + precio+ "\n"
                + "Descuneto: " + desc + "\n";
    }
    
    
    
    
}
