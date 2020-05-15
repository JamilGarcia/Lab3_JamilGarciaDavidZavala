package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Bares extends Locales{
    
    private ArrayList <Empleados> B_Empleados;
    private ArrayList <Comida> B_Comida;

    public Bares() {
    }

    public Bares(ArrayList<Empleados> B_Empleados, ArrayList<Comida> B_Comida, String nombre, ArrayList<Empleados> empleados, ArrayList<lab3_jamilgarciadavidzavala.Productos> Productos, Empleados Gerente) {
        super(nombre, empleados, Productos, Gerente);
        this.B_Empleados = B_Empleados;
        this.B_Comida = B_Comida;
    }

    public ArrayList<Empleados> getB_Empleados() {
        return B_Empleados;
    }

    public void setB_Empleados(ArrayList<Empleados> B_Empleados) {
        this.B_Empleados = B_Empleados;
    }

    public ArrayList<Comida> getB_Comida() {
        return B_Comida;
    }

    public void setB_Comida(ArrayList<Comida> B_Comida) {
        this.B_Comida = B_Comida;
    }

    @Override
    public String toString() {
        return super.toString() + "Bares{" + "B_Empleados=" + B_Empleados + ", B_Comida=" + B_Comida + '}';
    }
    
    
}
