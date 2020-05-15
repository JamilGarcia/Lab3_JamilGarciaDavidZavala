package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Quiosco extends Locales {
    
    private String Q_Nombre; 
    private ArrayList <Ropa> Q_Ropa; 
    private ArrayList <Juguetes> Q_Juguetes; 
    private ArrayList <Comida> Q_Comida; 

    public Quiosco() {
        super(); 
    }

    public Quiosco(String Q_Nombre, ArrayList<Ropa> Q_Ropa, ArrayList<Juguetes> Q_Juguetes, ArrayList<Comida> Q_Comida, String nombre, ArrayList<Empleados> empleados, ArrayList<lab3_jamilgarciadavidzavala.Productos> Productos, Empleados Gerente) {
        super(nombre, empleados, Productos, Gerente);
        this.Q_Nombre = Q_Nombre;
        this.Q_Ropa = Q_Ropa;
        this.Q_Juguetes = Q_Juguetes;
        this.Q_Comida = Q_Comida;
    }

    public String getQ_Nombre() {
        return Q_Nombre;
    }

    public void setQ_Nombre(String Q_Nombre) {
        this.Q_Nombre = Q_Nombre;
    }

    public ArrayList<Ropa> getQ_Ropa() {
        return Q_Ropa;
    }

    public void setQ_Ropa(ArrayList<Ropa> Q_Ropa) {
        this.Q_Ropa = Q_Ropa;
    }

    public ArrayList<Juguetes> getQ_Juguetes() {
        return Q_Juguetes;
    }

    public void setQ_Juguetes(ArrayList<Juguetes> Q_Juguetes) {
        this.Q_Juguetes = Q_Juguetes;
    }

    public ArrayList<Comida> getQ_Comida() {
        return Q_Comida;
    }

    public void setQ_Comida(ArrayList<Comida> Q_Comida) {
        this.Q_Comida = Q_Comida;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Quiosco{" + "Q_Nombre=" + Q_Nombre + ", Q_Ropa=" + Q_Ropa + ", Q_Juguetes=" + Q_Juguetes + ", Q_Comida=" + Q_Comida + '}';
    }
    
    
}
