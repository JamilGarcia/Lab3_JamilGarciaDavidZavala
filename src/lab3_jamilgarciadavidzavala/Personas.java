package lab3_jamilgarciadavidzavala;

public class Personas {
    
    private int ID; 
    private String User; 
    private String pass; 
    private String Correo; 
    private String Nombre; 
    private String fechaN;

    public Personas() {
        super();
    }

    
    public Personas(int ID, String User, String pass, String Correo, String Nombre, String fechaN) {
        this.ID = ID;
        this.User = User;
        this.pass = pass;
        this.Correo = Correo;
        this.Nombre = Nombre;
        this.fechaN = fechaN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Personas{" + "ID=" + ID + ", User=" + User + ", pass=" + pass + ", Correo=" + Correo + ", Nombre=" + Nombre + ", fechaN=" + fechaN + '}';
    }
    
    
    
}
