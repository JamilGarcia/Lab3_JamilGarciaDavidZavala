package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;

public class Clientes extends Personas{
    
    private int dinero; 
    private ArrayList <Productos> carrito; 

    public Clientes() {
        super(); 
    }

    public Clientes(int dinero, ArrayList<Productos> carrito, int ID, String User, String pass, String Correo, String Nombre, String fechaN) {
        super(ID, User, pass, Correo, Nombre, fechaN);
        this.dinero = dinero;
        this.carrito = carrito;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Productos> carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return super.toString()+ "dinero: " + dinero + "\n" 
                + "Carrito=" + carrito;
    }
    
    
    
}
