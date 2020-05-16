package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Bares extends Locales{
    
    private ArrayList <Comida> B_Comida;

    public Bares() {
        super();
    }

    public Bares(ArrayList<Empleados> B_Empleados, ArrayList<Comida> B_Comida, String nombre, ArrayList<Empleados> empleados, ArrayList<lab3_jamilgarciadavidzavala.Productos> Productos, Empleados Gerente) {
        super(nombre, empleados, Productos, Gerente);
        this.B_Comida = B_Comida;
    }

    public ArrayList<Comida> getB_Comida() {
        return B_Comida;
    }

    public void setB_Comida(ArrayList<Comida> B_Comida) {
        this.B_Comida = B_Comida;
    }

    @Override
    public String toString() {
        return super.toString() + "Bares{" +  ", B_Comida=" + B_Comida + '}';
    }
    
    
}
