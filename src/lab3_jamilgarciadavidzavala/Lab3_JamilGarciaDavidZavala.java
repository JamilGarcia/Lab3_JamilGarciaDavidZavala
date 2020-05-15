package lab3_jamilgarciadavidzavala;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JamilGarciaDavidZavala {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        char sn = 's';
        String User = "Sudo", Pass = "123";
        while (sn == 's') {
            System.out.println("Menú"
                    + "\n Bienvenido a MLSM "
                    + "\n 1. Locales"
                    + "\n 2. Personas"
                    + "\n 3. Productos"
                    + "\n 0. Salir"
                    + "\n Elija una opción");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    char sn2 = 's';
                    while (sn2 == 's') {
                        //metodo listar (ArrList "tla")
                        /*
                        [0] loc este
                        [0] loc este
                        [0] loc este
                        [0] loc este
                        */
                        System.out.println("1. Tiendas" + "\n2. Qui0scos" + "\n3. Bares" + "\n0. Salir" + "\nElija una opción: ");
                        int opp = read.nextInt();
                        switch (opp) {
                            case 1: {
                                System.out.println("1. Añadir" + "\n2. Modificar" + "\n 3. Eliminar" + "\n 4. Listar"+ "\nElija una opción: ");
                                int opp2 = read.nextInt();
                                switch (opp2){
                                    case 1:{
                                        System.out.println("Nombre:");
                                        String Name = read.next();
                                        read.next();
                                        char ssnn='s';
                                        while (ssnn=='s'||ssnn == 'S') {                                            
                                            //crea empleado
                                            System.out.println("Crear otro empleado[S/N]");
                                            ssnn = read.next().charAt(0);
                                        }
                                        System.out.println("Productos");
                                        ssnn='s';
                                        while (ssnn=='s'||ssnn == 'S') {                                            
                                            //crea empleado
                                            System.out.println("Crear otro producto[S/N]");
                                            ssnn = read.next().charAt(0);
                                        }
                                        //listale empleados de tienda
                                        System.out.println("Elija el Gerente: ");
                                        int Manager = read.nextInt();
                                    }
                                    case 2:{
                                    }
                                    case 3:
                                        
                                    case 0:
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 3: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 0: {
                                sn2 = 'n';
                                break;
                            }
                            default: {
                                System.out.println("Opción Inválida:");
                                break;
                            }
                        }
                        break;
                    }
                }
                case 2: {
                    char sn2 = 's';
                    while (sn2 == 's') {
                        System.out.println("1. Empleados" + "\n2. Clientes" + "\n0. Salir" + "\nElija una opción: ");
                        int opp = read.nextInt();
                        switch (opp) {
                            case 1: {
                                System.out.println("1. Añadir" + "\n2. Ventas" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 2: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 0: {
                                sn2 = 'n';
                                break;
                            }
                            default: {
                                System.out.println("Opción Inválida:");
                                break;
                            }
                        }
                        break;
                    }
                }
                case 3: {
                    char sn2 = 's';
                    while (sn2 == 's') {
                        System.out.println("1. Tiendas" + "\n2. Quiscos" + "\n3. Bares" + "\n0. Salir" + "\nElija una opción: ");
                        int opp = read.nextInt();
                        switch (opp) {
                            case 1: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 2: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 3: {
                                System.out.println("1. Añadir" + "\n2. Cambiar Nombre" + "\n 3. Eliminar" + "\nElija una opción: ");
                                break;
                            }
                            case 0: {
                                sn2 = 'n';
                                break;
                            }
                            default: {
                                System.out.println("Opción Inválida:");
                                break;
                            }
                        }
                        break;
                    }
                }
                case 0: {
                    System.out.println("Desea salir [Y/N]: ");
                    char sal = read.next().charAt(0);
                    if (sal == 'y' || sal == 'Y' || sal == 'n' || sal == 'N') {
                        sn='n';
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
    }
    
    public static void ImprimirArrayList (ArrayList a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println("---------------------------------------");
            System.out.println(i + ". " + a.get(i).toString());
        }
        
    }
    

}
