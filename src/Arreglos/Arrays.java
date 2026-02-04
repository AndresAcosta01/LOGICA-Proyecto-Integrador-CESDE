package Arreglos;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[3];
        double[] pesos = new double[3];
        double[] estaturas = new double[3];
        double[] imc = new double[3];
        String buscarn = "", nombre = "", opcion = "", menuPrincipal = "", opcionActualizar = "";
        double peso = 0, estatura = 0;
        int i = 0;
        boolean clientesregistrados = false;

        System.out.println("Bienvenido a tu calcuImc\n");
        do {
            System.out.println("""
                    Señor usuario favor elija una opcion para continuar
                                        
                    1) Registrar un nuevo cliente
                    2) Actualizar cliente existente
                    3) Mostrar información de todos los clientes registrados
                    4) Eliminar cliente
                    5) Calcula IMC
                    *) Salir del sistema""");
            menuPrincipal = sc.nextLine();

            switch (menuPrincipal) {
                case "1":
                    if (i == 2) {
                        System.out.println("Se han registrado la cantidad máxima permitida de clientes: " + (i + 1) + " clientes registrados");
                        break;
                    }
                    do {
                        if (i < nombres.length) {
                            System.out.println("Por favor ingrese el nombre");
                            nombres[i] = sc.nextLine();
                            System.out.println("Señor/a " + nombres[i] + " ingrese su peso en kg");
                            pesos[i] = sc.nextDouble();
                            System.out.println("Señor/a " + nombres[i] + " ingrese su estatura en metros ejemplo: 1,90");
                            estaturas[i] = sc.nextDouble();
                            sc.nextLine();
                            imc[i] = pesos[i] / (estaturas[i] * estaturas[i]);
                            if (i < 2) {
                                System.out.println("Señor usuario desea registrar otro usuario (s/n)");
                                opcion = sc.nextLine();
                                i++;
                                if (opcion.equals("s") || opcion.equals("n")) {
                                    continue;
                                } else {
                                    while (!opcion.equals("s") && !opcion.equals("n")) {
                                        System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                        System.out.println("Señor usuario desea registrar otro cliente (s/n)");
                                        opcion = sc.nextLine();
                                    }
                                }
                            } else {
                                System.out.println("Se han registrado la cantidad máxima permitida de clientes: " + (i + 1) + " clientes registrados");
                                opcion = "n";
                            }
                        } else {
                            System.out.println("Se han registrado la cantidad máxima permitida de clientes: " + (i + 1) + " clientes registrados");
                        }
                    } while (!opcion.equals("n"));
                    opcion = "s";
                    break;
                case "2":
                    for (int j = 0; j < nombres.length; j++) {
                        if (nombres[j] != null) {
                            clientesregistrados = true;
                            break;
                        }
                    }

                    if (!clientesregistrados) {
                        System.out.println("No hay usuarios registrados.");
                        break;
                    }
                    System.out.println("Ingrese el nombre de la persona de que deseea buscar");
                    buscarn = sc.nextLine();

                    for (int j = 0; j < nombres.length; j++) {
                        if (buscarn.equalsIgnoreCase(nombres[j])) {
                            System.out.println(nombres[j] + " tiene un peso de " + pesos[j] + " con una estatura de " + estaturas[j] + " y su imc es de " + imc[j]);
                            do {
                                System.out.println("""
                                        
                                        Señor usuario elija la opcion a actualizar: 
                                        
                                        1) Nombre                 
                                        2) Peso
                                        3) Estatura
                                        *) Salir
                                        """);
                                opcionActualizar = sc.nextLine();

                                switch (opcionActualizar) {
                                    case "1":
                                        System.out.println("Señor usuario el nombre actual es: " + nombres[j] +
                                                "\nIngrese el nombre a actualizar");
                                        nombre = sc.nextLine();
                                        nombres[j] = nombre;
                                        System.out.println("El nombre fue actualizado correctamente a: " + nombres[j]);
                                        break;
                                    case "2":
                                        System.out.println("Señor usuario el peso actual del señor: " + nombres[j] +
                                                " es de: " + pesos[j] +
                                                "\nIngrese el peso en kg a actualizar");
                                        peso = sc.nextDouble();
                                        pesos[j] = peso;
                                        System.out.println("El peso fue actualizado correctamente a: " + pesos[j]);
                                        break;
                                    case "3":
                                        System.out.println("Señor usuario la estatura actual del señor: " + nombres[j] +
                                                " es de: " + estaturas[j] +
                                                "\nIngrese la estatura en metros a actualizar ejemplo: 1,90");
                                        estatura = sc.nextDouble();
                                        estaturas[j] = estatura;
                                        System.out.println("El peso fue actualizado correctamente a: " + estaturas[j]);
                                        break;
                                    case "*":
                                        break;
                                    default:
                                        System.out.println("Señor usuario la opcion es invalida vuelva a ingresarla");
                                        break;
                                }
                            } while (!opcionActualizar.equals("*"));
                        } else {
                            if (j == (nombres.length - 1)) {
                                System.out.println("La persona " + buscarn +
                                        " no se encuentra registrado en el sistema\n");
                                break;
                            }
                        }
                    }
                    clientesregistrados = false;
                break;
                case "3":
                    for (int j = 0; j < nombres.length; j++) {
                        if (nombres[j] != null) {
                            clientesregistrados = true;
                            System.out.println("Nombre: " + nombres[j] +
                                    "\nPeso: " + pesos[j] +
                                    "\nEstatura: " + estaturas[j] + "\n");
                        }
                    }
                    if (!clientesregistrados) {
                        System.out.println("No hay usuarios registrados.");
                    }
                    clientesregistrados = false;
                break;
                case "4":
                    for (int j = 0; j < nombres.length; j++) {
                        if (nombres[j] != null) {
                            clientesregistrados = true;
                            break;
                        }
                    }

                    if (!clientesregistrados) {
                        System.out.println("No hay clientes registrados.");
                        break;
                    }
                    clientesregistrados = false;
                    while (!opcion.equals("n")) {
                        System.out.println("Ingrese el nombre de la persona que desea eliminar");
                        buscarn = sc.nextLine();

                        for (int j = 0; j < nombres.length; j++) {
                            if (buscarn.equalsIgnoreCase(nombres[j])) {
                                nombres[j] = null;
                                pesos[j] = 0;
                                estaturas[j] = 0;
                                imc[j] = 0;
                                if (i > 0) {
                                    i--;
                                } else {
                                    continue;
                                }
                                System.out.println("El cliente fue eliminado correctamente");
                                break;
                            } else {
                                if (j == (nombres.length - 1)) {
                                    System.out.println("La persona llamada " + buscarn +
                                            " no se encuentra registrado en el sistema\n");
                                    break;
                                }
                            }
                        }
                        System.out.println("Señor usuario desea eliminar otro cliente (s/n)");
                        opcion = sc.nextLine();

                        while (!opcion.equals("s") && !opcion.equals("n")) {
                            System.out.println("La opción elegida es invalida vuelva a ingresarla");
                            System.out.println("Señor usuario desea eliminar a otro cliente (s/n)");
                            opcion = sc.nextLine();
                        }
                    }
                    opcion = "s";
                    clientesregistrados = false;
                break;
                case "5":
                    for (int j = 0; j < nombres.length; j++) {
                        if (nombres[j] != null) {
                            clientesregistrados = true;
                            break;
                        }
                    }
                    if (!clientesregistrados) {
                        System.out.println("No hay usuarios registrados.");
                        break;
                    }
                    while (!opcion.equals("n")) {
                        System.out.println("Ingrese el nombre de la persona que desea calcular el IMC");
                        buscarn = sc.nextLine();

                        for (int j = 0; j < nombres.length; j++) {
                            if (buscarn.equalsIgnoreCase(nombres[j])) {
                                System.out.println("El IMC de " + nombres[j] + " es: " + imc[j]);
                                if (imc[j] < 18.5) {
                                    System.out.println("Su IMC indica bajo peso. Se recomienda mejorar la alimentación y consultar con un profesional de la salud");
                                } else if (imc[j] < 25) {
                                    System.out.println("Su IMC está dentro del rango normal. ¡Buen trabajo! Mantenga hábitos saludables");
                                } else if (imc[j] < 30) {
                                    System.out.println("Su IMC indica sobrepeso. Se recomienda realizar actividad física y mejorar los hábitos alimenticios");
                                } else if (imc[j] < 35) {
                                    System.out.println("Su IMC indica obesidad grado I. Es recomendable adoptar cambios en el estilo de vida y consultar con un profesional de la salud");
                                } else if (imc[j] < 40) {
                                    System.out.println("Su IMC indica obesidad grado II. Se aconseja seguimiento médico para reducir riesgos a la salud");
                                } else {
                                    System.out.println("Su IMC indica obesidad grado III. Es importante acudir a un profesional de la salud lo antes posible");
                                }
                                break;
                            } else {
                                if (j == (nombres.length - 1)) {
                                    System.out.println("La persona llamada " + buscarn +
                                            " no se encuentra registrado en el sistema\n");
                                    break;
                                }
                            }
                        }
                        System.out.println("Señor usuario desea consultar el IMC de otro usuario (s/n)");
                        opcion = sc.nextLine();
                        if (opcion.equals("s") || opcion.equals("n")) {
                            continue;
                        } else {
                            while (!opcion.equals("s") && !opcion.equals("n")) {
                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                System.out.println("Señor usuario desea consultar el IMC de otro usuario (s/n)");
                                opcion = sc.nextLine();
                            }
                        }
                    }
                    opcion = "s";
                break;
                case "*":
                    System.out.println("Muchas gracias por visitarnos");
                break;
                default:
                    System.out.println("Opcion invalida favor ingresela nuevamente");
                break;
            }
        }while(!menuPrincipal.equals("*"));
    }
}