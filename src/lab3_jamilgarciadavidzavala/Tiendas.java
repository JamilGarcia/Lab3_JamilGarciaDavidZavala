package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Tiendas extends Locales {
    
    private ArrayList <Ropa> T_Ropa; 
    private ArrayList <Juguetes> T_Juguetes;

    public Tiendas() {
        super();
    }

    public Tiendas(ArrayList<Ropa> T_Ropa, ArrayList<Juguetes> T_Juguetes, String nombre, ArrayList<Empleados> empleados, ArrayList<lab3_jamilgarciadavidzavala.Productos> Productos, Empleados Gerente) {
        super(nombre, empleados, Productos, Gerente);
        this.T_Ropa = T_Ropa;
        this.T_Juguetes = T_Juguetes;
    }

    public ArrayList<Ropa> getT_Ropa() {
        return T_Ropa;
    }

    public void setT_Ropa(ArrayList<Ropa> T_Ropa) {
        this.T_Ropa = T_Ropa;
    }

    public ArrayList<Juguetes> getT_Juguetes() {
        return T_Juguetes;
    }

    public void setT_Juguetes(ArrayList<Juguetes> T_Juguetes) {
        this.T_Juguetes = T_Juguetes;
    }

    @Override
    public String toString() {
        return super.toString() + "T_Ropa: " + T_Ropa + "\n"
                + "Juguetes: " + T_Juguetes + "\n";
    }
    
    
}
