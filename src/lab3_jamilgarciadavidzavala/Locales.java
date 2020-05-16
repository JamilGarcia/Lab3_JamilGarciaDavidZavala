package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Locales {
    
    private String nombre; 
    private ArrayList <Empleados> empleados; 
    private ArrayList <Productos> Productos; 
    private Empleados Gerente; 

    public Locales() {
    }

    public Locales(String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> Productos, Empleados Gerente) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.Productos = Productos;
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Productos> Productos) {
        this.Productos = Productos;
    }

    public Empleados getGerente() {
        return Gerente;
    }

    public void setGerente(Empleados Gerente) {
        this.Gerente = Gerente;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre+ "\n"
                + "Empleados: " + empleados + "\n"
                + "Productos: " + Productos + "\n"
                + "Gerente: " + Gerente;
    }

    
}
