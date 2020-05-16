package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JamilGarciaDavidZavala {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Empleados> Emp = new ArrayList();
    static ArrayList<Clientes> Cli = new ArrayList();
    static ArrayList<Tiendas> Tie = new ArrayList();
    static ArrayList<Quiosco> Qui = new ArrayList();
    static ArrayList<Bares> Bar = new ArrayList();
    static ArrayList<Ropa> Rop = new ArrayList();
    static ArrayList<Juguetes> Jug = new ArrayList();
    static ArrayList<Comida> Com = new ArrayList();
    static ArrayList<Personas> Per = new ArrayList();
    static ArrayList<Facturacion> Semi = new ArrayList();
    static int numCli;

    public static void main(String[] args) {
        System.out.println("User: SUDO // Pass: SUDO");
        System.out.println("Desea: \n"
                + "1. login \n"
                + "2. signin \n"
                + "0. salir \n");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                boolean log = Login();
                if (log == false) {
                    VistaCliente();
                } else {
                    char sn = 's';
                    String User = "Sudo", Pass = "123";
                    while (sn == 's') {
                        System.out.println("Menú"
                                + "\n Bienvenido a MLSM "
                                + "\n 1. Locales"
                                + "\n 2. Personas"//empleados y clientes
                                + "\n 3. Productos"//ropa juguetes comida
                                + "\n 0. Salir"
                                + "\n Elija una opción");
                        int op = read.nextInt();
                        switch (op) {
                            case 1: {//Locales
                                char sn2 = 's';
                                while (sn2 == 's') {
                                    System.out.println("1. Tiendas" + "\n2. Qui0scos" + "\n3. Bares" + "\n0. Salir" + "\nElija una opción: ");
                                    int opp = read.nextInt();
                                    switch (opp) {
                                        case 1: {//Tiendas
                                            System.out.println("1. Añadir" + "\n2. Modificar" + "\n 3. Eliminar" + "\n 4. Listar" + "\nElija una opción: ");
                                            int opp2 = read.nextInt();
                                            switch (opp2) {
                                                case 1: {//Añadir Tienda
                                                    System.out.println("Nombre:");
                                                    String Name = read.next();
                                                    read.next();
                                                    char ssnn = 's';
                                                    ArrayList<Empleados> tempE = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Emp);
                                                        System.out.println("Ingrese el empleado a contrar: ");
                                                        int empC = read.nextInt();
                                                        tempE.add(Emp.get(empC));
                                                        Emp.remove(empC);

                                                        System.out.println("Añadir otro empleado[S/N]");
                                                        ssnn = read.next().charAt(0);
                                                    }
                                                    System.out.println("Productos");
                                                    ssnn = 's';
                                                    ArrayList<Productos> tempP = new ArrayList();
                                                    ArrayList<Ropa> tempR = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Rop);
                                                        System.out.println("Ingrese la ropa a vender: ");
                                                        int rop = read.nextInt();
                                                        tempR.add(Rop.get(rop));
                                                        tempP.add(Rop.get(rop));
                                                        Rop.remove(rop);

                                                        System.out.println("Añadir otro producto[S/N]");
                                                        ssnn = read.next().charAt(0);
                                                    }

                                                    ArrayList<Juguetes> tempJ = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Jug);
                                                        System.out.println("Ingrese el juguete a vender: ");
                                                        int jug = read.nextInt();
                                                        tempJ.add(Jug.get(jug));
                                                        tempP.add(Jug.get(jug));
                                                        Jug.remove(jug);

                                                        System.out.println("Añadir otro producto[S/N]");
                                                        ssnn = read.next().charAt(0);
                                                    }

                                                    ImprimirArrayList(Emp);
                                                    System.out.println("Elija el Gerente: ");
                                                    int Manager = read.nextInt();
                                                    Empleados tempM = Emp.get(Manager);
                                                    Emp.remove(Manager);
                                                    Tie.add(new Tiendas(tempR, tempJ, Name, tempE, tempP, tempM));
                                                }
                                                case 2: {//Modificar Tienda
                                                    ImprimirArrayList(Tie);
                                                    System.out.println("Elija la Tienda a modificar:");
                                                    int numt = read.nextInt();
                                                    System.out.println("1.Nombre \n2.Empleado \n3. Producto \n4. Gerente \n Opción:");
                                                    int Modsw = read.nextInt();
                                                    switch (Modsw) {
                                                        case 1: {//Modificar nombre de la tienda
                                                            System.out.println("Nuevo Nombre: ");
                                                            String NName = read.next();
                                                            read.next();
                                                            Tie.get(numt).setNombre(NName);
                                                            break;
                                                        }
                                                        case 2: {//Modificar empleados de la tienda
                                                            System.out.println("1. Contratar \n 2. Despedir");
                                                            int oopp = read.nextInt();
                                                            switch (oopp) {
                                                                case 1: { //Contratar
                                                                    ImprimirArrayList(Emp);
                                                                    System.out.println("Elija empleado a contratar: ");
                                                                    int Hired = read.nextInt();
                                                                    //Tie.get(numt).setEmpleados(Emp.add(e));
                                                                    System.out.println("Disponible Próximamente");
                                                                    break;
                                                                }
                                                                case 2: { //Despedir
                                                                    ImprimirArrayList(Tie.get(numt).getEmpleados());
                                                                    System.out.println("Elija empleado a despedir: ");
                                                                    int fired = read.nextInt();
                                                                    Tie.get(numt).getEmpleados().remove(fired);
                                                                }
                                                                default:
                                                                    System.out.println("Error! Ingrese un valor valido!!");
                                                                    break;
                                                            }
                                                        }
                                                        case 3: {//Modificar productos de la tienda
                                                            System.out.println("1. Ropa \n 2. Juguetes");
                                                            int type = read.nextInt();
                                                            switch (type) {
                                                                case 1: { //Ropa
                                                                    System.out.println("1. Añadir \n 2. eliminar");
                                                                    int oopp = read.nextInt();
                                                                    switch (oopp) {
                                                                        case 1: {
                                                                            ImprimirArrayList(Rop);
                                                                            System.out.println("Elija producto a Añadir: ");
                                                                            int add = read.nextInt();
                                                                            Tie.get(numt).setT_Ropa(Rop);
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            ImprimirArrayList(Tie.get(numt).getT_Ropa());
                                                                            System.out.println("Elija producto a Eliminar: ");
                                                                            int del = read.nextInt();
                                                                            Tie.get(numt).getT_Ropa().remove(del);
                                                                        }
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                case 2: { //juguetes
                                                                    System.out.println("1. Añadir \n 2. eliminar");
                                                                    int oopp = read.nextInt();
                                                                    switch (oopp) {
                                                                        case 1: {
                                                                            ImprimirArrayList(Jug);
                                                                            System.out.println("Elija producto a Añadir: ");
                                                                            int add = read.nextInt();
                                                                            Tie.get(Modsw).setT_Juguetes(Jug);
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            ImprimirArrayList(Tie.get(numt).getT_Juguetes());
                                                                            System.out.println("Elija producto a Eliminar: ");
                                                                            int del = read.nextInt();
                                                                            Tie.get(Modsw).getT_Juguetes().remove(del);
                                                                        }
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        }
                                                        case 4: {//Modificar gerente de la tienda
                                                            Tie.get(numt).getEmpleados();
                                                            System.out.println("Elija un nuevo Gerente");
                                                            int NMan = read.nextInt();
                                                            Tie.get(numt).setGerente(Emp.get(NMan));
                                                            break;
                                                        }
                                                        default:
                                                            break;
                                                    }
                                                }
                                                case 3: {//Eliminar Tienda
                                                    //listar tiendas
                                                    System.out.println("Elija tienda a Eliminar: ");
                                                    int DelStor = read.nextInt();
                                                    System.out.println("Desea eliminar la tienda?[S/N]");
                                                    char ssnn = read.next().charAt(0);
                                                    if (ssnn == 's' || ssnn == 'S') {

                                                    }
                                                    break;
                                                }
                                                case 0: {//Salir de tienda
                                                    sn2 = 'n';
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        case 2: {//Quiosco
                                            System.out.println("1. Añadir" + "\n2. Modificar" + "\n 3. Eliminar" + "\n 4. Listar" + "\nElija una opción: ");
                                            int opp2 = read.nextInt();
                                            switch (opp2) {
                                                case 1: {//Añadir Quiosco
                                                    ImprimirArrayList(Tie);
                                                    System.out.println("Elija una tienda: ");
                                                    int name = read.nextInt();
                                                    String Nombre = Tie.get(name).getNombre();
                                                    char ssnn = 's';
                                                    ArrayList<Empleados> tempE = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Emp);
                                                        System.out.println("Ingrese el empleado a contrar: ");
                                                        int empC = read.nextInt();
                                                        tempE.add(Emp.get(empC));
                                                        Emp.remove(empC);
                                                        System.out.println("Añadir otro empleado[S/N]");
                                                        ssnn = read.next().charAt(0);
                                                    }
                                                    System.out.println("Productos");
                                                    ssnn = 's';
                                                    ArrayList<Productos> tempP = new ArrayList();
                                                    ArrayList<Ropa> tempR = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Rop);
                                                        System.out.println("Ingrese la ropa a vender: ");
                                                        int rop = read.nextInt();
                                                        tempR.add(Rop.get(rop));
                                                        tempP.add(Rop.get(rop));
                                                        Rop.remove(rop);

                                                        System.out.println("Añadir otro producto[S/N]");
                                                        ssnn = read.next().charAt(0);
                                                    }

                                                    ArrayList<Juguetes> tempJ = new ArrayList();
                                                    while (ssnn == 's' || ssnn == 'S') {
                                                        ImprimirArrayList(Jug);
                                                        System.out.println("Ingrese el juguete a vender: ");
                                                        int jug = read.nextInt();
                                                        tempJ.add(Jug.get(jug));
                                                        tempP.add(Jug.get(jug));
                                                        Jug.remove(jug);
                                                        ImprimirArrayList(Emp);
                                                        System.out.println("Elija el Gerente: ");
                                                        int Manager = read.nextInt();
                                                        Empleados tempM = Emp.get(Manager);
                                                        Emp.remove(Manager);
                                                        Qui.add(new Quiosco(Nombre, tempR, tempJ, Nombre, tempE, tempP, tempM));
                                                    }
                                                }
                                                case 2: {//Modificar Quisco
                                                    ImprimirArrayList(Qui);
                                                    System.out.println("Elija Quiosco a modificar ");
                                                    int ModStore = read.nextInt();
                                                    System.out.println("1.Nombre \n2.Empleado \n3. Producto \n4. Gerente \n Opción:");
                                                    int Modsw = read.nextInt();
                                                    switch (Modsw) {
                                                        case 1: {//Modificar nombre del Quiosco
                                                            ImprimirArrayList(Tie);
                                                            System.out.println("Elija una tienda: ");
                                                            int name = read.nextInt();
                                                            String Nombre = Tie.get(name).getNombre();
                                                            Qui.get(ModStore).setNombre(Nombre);
                                                            ArrayList<Empleados> tempE = new ArrayList();
                                                            break;
                                                        }
                                                        case 2: {//Modificar empleados de la tienda
                                                            System.out.println("1. Contratar \n 2. Despedir");
                                                            int oopp = read.nextInt();
                                                            switch (oopp) {
                                                                case 1: { //Contratar
                                                                    ImprimirArrayList(Emp);
                                                                    System.out.println("Elija empleado a contratar: ");
                                                                    int Hired = read.nextInt();
                                                                    System.out.println("Disponible Proximamente");
                                                                    break;
                                                                }
                                                                case 2: { //Despedir
                                                                    ImprimirArrayList(Qui.get(ModStore).getEmpleados());
                                                                    System.out.println("Elija empleado a despedir: ");
                                                                    int fired = read.nextInt();
                                                                    System.out.println("Disponible proximamente");
                                                                }

                                                                ImprimirArrayList(Emp);
                                                                System.out.println("Elija el Gerente: ");
                                                                int Manager = read.nextInt();
                                                                Empleados tempM = Emp.get(Manager);
                                                                Emp.remove(Manager);
                                                                //Qui.add(new Quiosco(Nombre, tempR, tempJ, Nombre, tempE, tempP, tempM));
                                                            }
                                                        }
                                                        case 3: {//Modificar productos de la tienda
                                                            System.out.println("1. Ropa \n 2. Juguetes");
                                                            int type = read.nextInt();
                                                            switch (type) {
                                                                case 1: { //Ropa
                                                                    System.out.println("1. Añadir \n 2. eliminar");
                                                                    int oopp = read.nextInt();
                                                                    switch (oopp) {
                                                                        case 1: {
                                                                            ImprimirArrayList(Rop);
                                                                            System.out.println("Elija producto a Añadir: ");
                                                                            int add = read.nextInt();
                                                                            System.out.println("Disponible Proximamente");
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            ImprimirArrayList(Qui.get(ModStore).getQ_Ropa());
                                                                            System.out.println("Elija producto a Eliminar: ");
                                                                            int del = read.nextInt();
                                                                            System.out.println("Disponible Proximamente");
                                                                        }
                                                                        default:
                                                                            break;
                                                                    }
                                                                }
                                                                case 2: { //juguetes
                                                                    System.out.println("1. Añadir \n 2. eliminar");
                                                                    int oopp = read.nextInt();
                                                                    switch (oopp) {
                                                                        case 1: {
                                                                            ImprimirArrayList(Jug);
                                                                            System.out.println("Elija producto a Añadir: ");
                                                                            int add = read.nextInt();
                                                                            System.out.println("Disponible Proximamente");
                                                                            break;
                                                                        }
                                                                        case 2: {
                                                                            ImprimirArrayList(Qui.get(ModStore).getQ_Juguetes());
                                                                            System.out.println("Elija producto a Eliminar: ");
                                                                            int del = read.nextInt();
                                                                            System.out.println("Disponible Proximamente");
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                case 4: {//Modificar gerente de la tienda
                                                                    //listar empleados
                                                                    System.out.println("Elija un nuevo Gerente");
                                                                    int NMan = read.nextInt();
                                                                    break;
                                                                }
                                                                default:
                                                                    System.out.println("Error! Ingrese un valor valido!!");
                                                                    break;
                                                            }
                                                        }
                                                        case 4: {//Eliminar Tienda
                                                            //listar tiendas
                                                            System.out.println("Elija tienda a Eliminar: ");
                                                            int DelStor = read.nextInt();
                                                            System.out.println("Desea eliminar la tienda?[S/N]");
                                                            char ssnn = read.next().charAt(0);
                                                            if (ssnn == 's' || ssnn == 'S') {

                                                            }
                                                            break;
                                                        }
                                                        case 0: {//Salir de tienda
                                                            sn2 = 'n';
                                                            break;
                                                        }
                                                    }
                                                    break;

                                                }
                                                case 3: { // Bares
                                                    System.out.println("1. Añadir" + "\n2. Modificar" + "\n 3. Eliminar" + "\n 4. Listar" + "\nElija una opción: ");
                                                    int opb = read.nextInt();
                                                    switch (opb) {
                                                        case 1: //Añadir Bar
                                                            System.out.println("Nombre:");
                                                            String Name = read.next();
                                                            read.next();
                                                            char ssnn = 's';
                                                            ArrayList<Productos> tempP = new ArrayList();
                                                            ArrayList<Comida> tempC = new ArrayList();
                                                            while (ssnn == 's' || ssnn == 'S') {
                                                                ImprimirArrayList(Com);
                                                                System.out.println("Ingrese la comida disponible: ");
                                                                int empC = read.nextInt();
                                                                tempC.add(Com.get(empC));
                                                                tempP.add(Com.get(empC));
                                                                Com.remove(empC);

                                                                System.out.println("Añadir otra comida[S/N]");
                                                                ssnn = read.next().charAt(0);
                                                            }
                                                            ssnn = 's';
                                                            ArrayList<Empleados> tempE = new ArrayList();
                                                            while (ssnn == 's' || ssnn == 'S') {
                                                                ImprimirArrayList(Emp);
                                                                System.out.println("Ingrese el empleado a contrar: ");
                                                                int empC = read.nextInt();
                                                                tempE.add(Emp.get(empC));
                                                                Emp.remove(empC);

                                                                System.out.println("Añadir otro empleado[S/N]");
                                                                ssnn = read.next().charAt(0);
                                                            }
                                                            ImprimirArrayList(Emp);
                                                            System.out.println("Elija el Gerente: ");
                                                            int Manager = read.nextInt();
                                                            Empleados tempM = Emp.get(Manager);
                                                            Emp.remove(Manager);
                                                            Bar.add(new Bares(tempE, tempC, Name, tempE, tempP, tempM));
                                                            break;
                                                        case 2: //Modificar Bar
                                                            ImprimirArrayList(Bar);
                                                            System.out.println("Elija bar a Modificar: ");
                                                            int numB = read.nextInt();
                                                            System.out.println("1.Nombre \n2. Empleados \n3. Comida \n4. Gerente \n0. Salir");
                                                            int oopp = read.nextInt();
                                                            switch (oopp) {
                                                                case 1: {//Modificar Nombre Bar
                                                                    System.out.println("Nuevo nombre:");
                                                                    String Nombre = read.next();
                                                                    read.next();
                                                                    Bar.get(numB).setNombre(Nombre);
                                                                    break;
                                                                }
                                                                case 2: {//Modificar Empleados Bar
                                                                    System.out.println("1. Contratar \n 2. Despedir");
                                                                    int oo2pp = read.nextInt();
                                                                    switch (oo2pp) {
                                                                        case 1: {
                                                                            ImprimirArrayList(Emp);
                                                                            System.out.println("Elija empleado a contratar: ");
                                                                            int Hired = read.nextInt();
                                                                            System.out.println("Disponible proximamente");
                                                                            break;
                                                                        }
                                                                        case 2: { //Eliminar
                                                                            Bar.get(numB).getEmpleados();
                                                                            System.out.println("Elija empleado a despedir: ");
                                                                            int fired = read.nextInt();
                                                                            System.out.println("Disponible proximamente");
                                                                        }
                                                                        default:
                                                                            System.out.println("Error! Ingrese un valor valido!!");
                                                                            break;
                                                                    }
                                                                    break;
                                                                }
                                                                case 0: {
                                                                    break;
                                                                }
                                                                default: {
                                                                    System.out.println("Opción inválida");
                                                                    break;
                                                                }
                                                            }
                                                        case 3: //Eliminar Bar

                                                            break;
                                                        case 4: //Listar Bares

                                                            break;
                                                        default:
                                                            System.out.println("Error! Ingrese el valor valido!!");
                                                    }
                                                    break;
                                                }
                                                case 0: {//Salida
                                                    sn2 = 'n';
                                                    break;
                                                }
                                                default: {
                                                    System.out.println("Opción Inválida:");
                                                    break;
                                                }

                                                case 4: {//Eliminar Tienda
                                                    //listar tiendas
                                                    System.out.println("Elija tienda a Eliminar: ");
                                                    int DelStor = read.nextInt();
                                                    System.out.println("Desea eliminar la tienda?[S/N]");
                                                    char ssnn = read.next().charAt(0);
                                                    if (ssnn == 's' || ssnn == 'S') {
                                                        System.out.println("Disponible Proximamente");
                                                    }
                                                    break;
                                                }

                                                case 5: {//Productos
                                                    sn2 = 's';
                                                    while (sn2 == 's') {
                                                        System.out.println("1. Tiendas" + "\n2. Quiscos" + "\n3. Bares" + "\n0. Salir" + "\nElija una opción: ");
                                                        opp = read.nextInt();
                                                        switch (opp) {
                                                            case 1: {
                                                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                                                break;
                                                            }
                                                            case 2: //Modificar Bar
                                                                ImprimirArrayList(Bar);
                                                                System.out.println("Elija bar a Modificar: ");
                                                                int numB = read.nextInt();
                                                                System.out.println("1.Nombre \n2. Empleados \n3. Comida \n4. Gerente \n0. Salir");
                                                                int oopp = read.nextInt();
                                                                switch (oopp) {
                                                                    case 1: {//Modificar Nombre Bar
                                                                        System.out.println("Nuevo nombre:");
                                                                        String Nombre = read.next();
                                                                        read.next();
                                                                        Bar.get(numB).setNombre(Nombre);
                                                                        break;
                                                                    }
                                                                    case 2: {//Modificar Empleados Bar
                                                                        System.out.println("1. Contratar \n 2. Despedir");
                                                                        int oo2pp = read.nextInt();
                                                                        switch (oo2pp) {
                                                                            case 1: {
                                                                                ImprimirArrayList(Emp);
                                                                                System.out.println("Elija empleado a contratar: ");
                                                                                int Hired = read.nextInt();
                                                                                System.out.println("Disponible proximamente");
                                                                                break;
                                                                            }
                                                                            case 2: { //Eliminar
                                                                                Bar.get(numB).getEmpleados();
                                                                                System.out.println("Elija empleado a despedir: ");
                                                                                int fired = read.nextInt();
                                                                                System.out.println("Disponible proximamente");
                                                                            }
                                                                            default:
                                                                                System.out.println("Error! Ingrese un valor valido!!");
                                                                                break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 0: {
                                                                        break;
                                                                    }
                                                                    default: {
                                                                        System.out.println("Opción inválida");
                                                                        break;
                                                                    }
                                                                }
                                                            case 3: //Eliminar Bar
                                                                ImprimirArrayList(Bar);
                                                                System.out.println("Elija bar a eliminar: ");
                                                                int delbar = read.nextInt();
                                                                System.out.println("Disponible Proximamente");
                                                                break;
                                                            case 4: //Listar Bares
                                                                ImprimirArrayList(Bar);
                                                                break;
                                                            default:
                                                                System.out.println("Error! Ingrese el valor valido!!");
                                                        }
                                                        break;
                                                    }
                                                }

                                                default: {
                                                    System.out.println("Opción invalida."
                                                            + "\n Por favor revise la opciónn ingresada.");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            case 2: {//Personas
                System.out.println("Disponible Proximamente");
                break;
            }
            case 3: {//Productos
                System.out.println("Disponible Proximamente");
                break;
            }
            case 0: {//Salida
                System.out.println("Desea salir [Y/N]: ");
                char sal = read.next().charAt(0);
                if (sal == 'y' || sal == 'Y' || sal == 'n' || sal == 'N') {
                   // sn = 'n';
                }
                break;
            }
            default: {
                System.out.println("Opción invalida."
                        + "\n Por favor revise la opciónn ingresada.");
                break;
            }
        }
    }

    public static void ImprimirArrayList(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println("---------------------------------------");
            System.out.println(i + ". " + a.get(i).toString());
        }

    }

    public static boolean Login() {
        boolean flag = false;
        while (flag == false) {
            System.out.println("Ingrese el username: ");
            String user = read.next();
            if (user.equals("SUDO")) {
                System.out.println("Ingrese la contraseña: ");
                String pass = read.next();
                if (pass.equals("SUDO")) {
                    System.out.println("Admin Conectado...");
                    return true;
                }
            }
            for (int i = 0; i < Per.size(); i++) {
                if (user.equals(Per.get(i).getUser())) {
                    System.out.println("Ingrese la contraseña: ");
                    String pass = read.next();
                    if (pass.equals(Per.get(i).getPass())) {
                        flag = true;
                        numCli = i;
                    }
                }
            }
        }
        return false;
    }

    public static void SigIn() {
        System.out.println("Ingresse su ID: ");
        int ID = read.nextInt();
        boolean rev = false;
        while (rev == false) {
            for (int i = 0; i < Per.size(); i++) {
                if (ID == Per.get(i).getID()) {
                    System.out.println("ID ya en uso, ingrese otro: ");
                    ID = read.nextInt();
                    i = 0;
                } else {
                    rev = true;
                }
            }
        }
        System.out.println("Ingrese su UserName: ");
        String User = read.next();
        System.out.println("Ingrese su contraseña: ");
        String pass = read.next();
        System.out.println("Ingrese su correo: ");
        String correo = read.next();
        System.out.println("Ingrese su nombre completo: ");
        String nombre = read.nextLine();
        nombre = read.nextLine();
        System.out.println("Ingrese su fecha de nacimiento [dd/mm/yyyy]: ");
        String fechaN = read.next();
        System.out.println("Ingrese la cantidad de dinero que tiene: ");
        int dinero = read.nextInt();
        ArrayList<Productos> carrito = new ArrayList();

        Per.add(new Clientes(dinero, carrito, ID, User, pass, correo, nombre, fechaN));
        Cli.add(new Clientes(dinero, carrito, ID, User, pass, correo, nombre, fechaN));
    }

    public static void VistaCliente() {
        char resp = 's';
        while (resp == 's') {
            System.out.println(""
                    + "----------------------------------------\n"
                    + "Donde desea ir?\n"
                    + "1. Tienda\n"
                    + "2. Quiosco\n"
                    + "3. Bar\n"
                    + "0. Salir\n"
                    + "Ingrese su opcion: \n"
                    + "----------------------------------------\n");
            int opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cargando tienda...");
                    ImprimirArrayList(Tie);
                    System.out.println("Ingrese el numero de tienda que desea ir: ");
                    int opti = read.nextInt();
                    System.out.println("Desea comprar: \n"
                            + "1. Ropa\n"
                            + "2. Juguetes\n");
                    int opCo = read.nextInt();
                    switch (opCo) {
                        case 1:
                            ImprimirArrayList(Tie.get(opti).getT_Ropa());
                            System.out.println("Ingrese el producto que desea comprar: ");
                            int OpCom = read.nextInt();
                            if (Cli.get(numCli).getDinero() >= Tie.get(opti).getT_Ropa().get(OpCom).getPrecio()) {
                                int tempdi = Cli.get(numCli).getDinero() - Tie.get(opti).getT_Ropa().get(OpCom).getPrecio();
                                Cli.get(numCli).setDinero(tempdi);
                                Semi.add(new Facturacion(Tie.get(opti), Cli.get(numCli).toString(), Tie.get(opti).getT_Ropa().get(OpCom).getPrecio(), "No"));
                            } else {
                                System.out.println("No hay suficiente dinero...");
                            }
                            break;
                        case 2:
                            System.out.println("Proximamente disponible...");
                            break;
                        default:
                            System.out.println("Ingrese un valor valido!!!");
                    }
                    break;
                case 2:
                    System.out.println("Cargando tienda...");
                    ImprimirArrayList(Tie);
                    System.out.println("Ingrese el numero de tienda que desea ir: ");
                    opti = read.nextInt();
                    System.out.println("Desea comprar: \n"
                            + "1. Ropa\n"
                            + "2. Juguetes\n");
                    opCo = read.nextInt();
                    switch (opCo) {
                        case 1:
                            ImprimirArrayList(Tie.get(opti).getT_Ropa());
                            System.out.println("Ingrese el producto que desea comprar: ");
                            int OpCom = read.nextInt();
                            if (Cli.get(numCli).getDinero() >= Tie.get(opti).getT_Ropa().get(OpCom).getPrecio()) {
                                int tempdi = Cli.get(numCli).getDinero() - Tie.get(opti).getT_Ropa().get(OpCom).getPrecio();
                                Cli.get(numCli).setDinero(tempdi);
                                Semi.add(new Facturacion(Tie.get(opti), Cli.get(numCli).toString(), Tie.get(opti).getT_Ropa().get(OpCom).getPrecio(), "No"));
                            } else {
                                System.out.println("No hay suficiente dinero...");
                            }
                            break;
                        case 2:
                            System.out.println("Proximamente disponible...");
                            break;
                        default:
                            System.out.println("Ingrese un valor valido!!!");
                    }

                    break;
                case 3:
                    System.out.println("Cargando tienda...");
                    ImprimirArrayList(Bar);
                    System.out.println("Ingrese el numero de Bar que desea ir: ");
                    opti = read.nextInt();
                    ImprimirArrayList(Bar.get(opti).getProductos());
                    System.out.println("Ingrese el producto que desea comprar: ");
                    int opCom = read.nextInt();
                    if (Cli.get(numCli).getDinero() >= Bar.get(opti).getProductos().get(opCom).getPrecio()) {
                        int tempdi = Cli.get(numCli).getDinero() - Bar.get(opti).getProductos().get(opCom).getPrecio();
                        Cli.get(numCli).setDinero(tempdi);
                        Semi.add(new Facturacion(Bar.get(opti), Cli.get(numCli).toString(), Bar.get(opti).getProductos().get(opCom).getPrecio(), "No"));
                    } else {
                        System.out.println("No hay suficiente dinero...");
                    }
                    break;
                case 0:
                    System.out.println("Gracias, que tenga buen dia <3");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese un valor valido!!!!");
            }
        }

    }
}
