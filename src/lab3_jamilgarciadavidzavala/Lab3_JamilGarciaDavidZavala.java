package lab3_jamilgarciadavidzavala;

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
                    + "\n 2. Personas"//empleados y clientes
                    + "\n 3. Productos"//ropa juguetes comida
                    + "\n 0. Salir"
                    + "\n Elija una opción");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    char sn2 = 's';
                    while (sn2 == 's') {
                        System.out.println("1. Tiendas" + "\n2. Qui0scos" + "\n3. Bares" + "\n0. Salir" + "\nElija una opción: ");
                        int opp = read.nextInt();
                        switch (opp) {
                            case 1: {
                                System.out.println("1. Añadir" + "\n2. Modificar" + "\n 3. Eliminar" + "\n 4. Listar" + "\nElija una opción: ");
                                int opp2 = read.nextInt();
                                switch (opp2) {
                                    case 1: {
                                        System.out.println("Nombre:");
                                        String Name = read.next();
                                        read.next();
                                        char ssnn = 's';
                                        while (ssnn == 's' || ssnn == 'S') {
                                            //listas
                                            //elegis
                                            System.out.println("Añadir otro empleado[S/N]");
                                            ssnn = read.next().charAt(0);
                                        }
                                        System.out.println("Productos");
                                        ssnn = 's';
                                        while (ssnn == 's' || ssnn == 'S') {
                                            //crea empleado
                                            System.out.println("Crear otro producto[S/N]");
                                            ssnn = read.next().charAt(0);
                                        }
                                        //listale empleados de tienda
                                        System.out.println("Elija el Gerente: ");
                                        int Manager = read.nextInt();
                                    }
                                    case 2: {
                                        //Listar tiendas
                                        System.out.println("Elija tienda a modificar ");
                                        int ModStore = read.nextInt();
                                        System.out.println("1.Nombre \n2.Empleado \n3. Producto \n4. Gerete \n Opción:");
                                        int Modsw = read.nextInt();
                                        switch (Modsw) {
                                            case 1: {
                                                System.out.println("Nuevo Nombre: ");
                                                String NName = read.next();
                                                read.next();
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("1. Contratar \n 2. Despedir");
                                                int oopp = read.nextInt();
                                                switch (oopp) {
                                                    case 1: {
                                                        //listar empleados generales
                                                        System.out.println("Elija empleado a contratar: ");
                                                        int Hired = read.nextInt();
                                                        break;
                                                    }
                                                    case 2: {
                                                        //listar empleados tienda
                                                        System.out.println("Elija empleado a despedir: ");
                                                        int fired = read.nextInt();
                                                    }
                                                    default:
                                                        break;
                                                }
                                            }
                                            case 3: {
                                                System.out.println("1. Añadir \n 2. eliminar");
                                                int oopp = read.nextInt();
                                                switch (oopp) {
                                                    case 1: {
                                                        //listar empleados generales
                                                        System.out.println("Elija empleado a contratar: ");
                                                        int Hired = read.nextInt();
                                                        break;
                                                    }
                                                    case 2: {
                                                        //listar empleados tienda
                                                        System.out.println("Elija empleado a despedir: ");
                                                        int fired = read.nextInt();
                                                    }
                                                    default:
                                                        break;
                                                }
                                            }
                                            case 4: {
                                                //listar empleados
                                                System.out.println("Elija un nuevo Gerente");
                                                int NMan = read.nextInt();
                                                break;
                                            }
                                            default:
                                                break;
                                        }
                                    }
                                    case 3: {
                                        //listar tiendas
                                        System.out.println("Elija tienda a Eliminar: ");
                                        int DelStor = read.nextInt();
                                        System.out.println("Desea eliminar la tienda?[S/N]");
                                        char ssnn = read.next().charAt(0);
                                        if (ssnn == 's') {

                                        }

                                        break;
                                    }

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
                    break;
                }
                case 0: {
                    System.out.println("Desea salir [Y/N]: ");
                    char sal = read.next().charAt(0);
                    if (sal == 'y' || sal == 'Y' || sal == 'n' || sal == 'N') {
                        sn = 'n';
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

}
