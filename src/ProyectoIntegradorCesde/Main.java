package ProyectoIntegradorCesde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        2 usuario
            -ADMIN
            -CLIENTE
        */

        //Variables
        String[] nombresadmin = new String[2];
        String[] emailsadmin = new String[2];
        String[] contraseniasadmin = new String[2];
        String[] nombres = new String[3];
        String[] emails = new String[3];
        String[] contrasenias = new String[3];
        String[] nombreProductos = new String[3];
        String[] marcaProductos = new String[3];
        int[] stockProductos = new int[3];
        double[] precioProductos = new double[3];

        Scanner sc = new Scanner(System.in);
        int tipoUsuario = 0, admin = 0, adminClientes = 0, actualizarCliente = 0, adminProductos = 0,
                actualizarProducto = 0, stock = 0;
        double precioProducto = 0;
        String email = "", contrasenia = "", seguir = "", nombre = "", nombreProducto = "", marca = "";
        boolean clientesregistrados = false, correoExistente = true;;
        nombresadmin[0] = "1";
        emailsadmin[0] = "1";
        contraseniasadmin[0] = "1";
        nombresadmin[1] = "Andrea";
        emailsadmin[1] = "andrea@gmail.com";
        contraseniasadmin[1] = "andrea123";
        nombres[1] = "1";
        emails[1] = "1";
        contrasenias[1] = "1";

        System.out.println("Bienvenido a The Richn´t");

        do {
            System.out.println("""
                    ============================
                    |   SELECCIÓN DE USUARIO   |
                    ============================
                    |   1) Admin               |
                    |   2) Cliente             |
                    |   3) Salir deL sistema   |
                    ============================
                    """);
            tipoUsuario = sc.nextInt();
            sc.nextLine();
            switch (tipoUsuario){
                case 1:
                    while (!seguir.equals("n")){
                        System.out.println("Ingrese el correo electrónico:");
                        email = sc.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        contrasenia = sc.nextLine();
                        for (int i = 0; i < emailsadmin.length; i++){
                            if(email.equalsIgnoreCase(emailsadmin[i]) && contrasenia.equals(contraseniasadmin[i])){
                                do {
                                    System.out.println("\nBienvenido de nuevo " + nombresadmin[i]);
                                    System.out.println("""
                                            ==================================
                                            |          MENÚ ADMIN            |
                                            ==================================
                                            |    1) Administrar Clientes     |
                                            |    2) Administrar Productos    |
                                            |    4) Cerrar Sesión            |
                                            ==================================
                                            """);
                                    admin = sc.nextInt();

                                    switch (admin){
                                        case 1:
                                            do {
                                                System.out.println("""
                                                        ================================================
                                                        |             ADMINISTRAR CLIENTES             |
                                                        ================================================
                                                        |    1) Crear nuevo usuario                    |
                                                        |    2) Buscar usuario                         |
                                                        |    3) Mostrar datos de todos los usuarios    |
                                                        |    4) Actualizar usuario                     |
                                                        |    5) Eliminar usuario                       |
                                                        |    6) Atras                                  |
                                                        ================================================
                                                        """);
                                                adminClientes = sc.nextInt();
                                                sc.nextLine();
                                                switch (adminClientes) {
                                                    case 1:
                                                        while (!seguir.equals("n")){
                                                            for (int j = 0; j < emails.length; j++){
                                                                if (emails[j] == null){
                                                                    System.out.println("nombre de usuario:");
                                                                    nombres[j] = sc.nextLine();
                                                                    while (correoExistente) {
                                                                        System.out.println("Correo electrónico:");
                                                                        email = sc.nextLine();
                                                                        for (int k = 0; k < emails.length; k++){
                                                                            if (email.equalsIgnoreCase(emails[k])){
                                                                                correoExistente = true;
                                                                                System.out.println("Señor admin, el correo ya es existente favor ingresar uno diferente");
                                                                                break;
                                                                            }else {
                                                                                correoExistente = false;
                                                                            }
                                                                        }
                                                                        if (!correoExistente){
                                                                            emails[j] = email;
                                                                        }
                                                                    }
                                                                    correoExistente = true;
                                                                    System.out.println("Contraseña");
                                                                    contrasenias[j] = sc.nextLine();
                                                                    break;
                                                                }else{
                                                                    continue;
                                                                }
                                                            }
                                                            System.out.println("Señor admin desea crear un nuevo usuario (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor admin desea crear un nuevo usuario (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                    break;
                                                    case 2:
                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Ingrese el correo del cliente que desea buscar");
                                                            email = sc.nextLine();

                                                            for (int j = 0; j < emails.length; j++) {
                                                                if (email.equalsIgnoreCase(emails[j])) {
                                                                    System.out.println("\nNombre: " + nombres[j] +
                                                                            "\nCorreo Electrónico: " + emails[j] +
                                                                            "\nContraseña: " + contrasenias[j] + "\n");
                                                                    break;
                                                                } else {
                                                                    if (j == (nombres.length - 1)) {
                                                                        System.out.println("El cliente con el correo " + email +
                                                                                " no se encuentra registrado en el sistema\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            System.out.println("Señor usuario desea buscarlo nuevamente o buscar otro cliente (s/n)");
                                                            seguir = sc.nextLine();

                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor usuario desea eliminar a otro cliente (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                    break;
                                                    case 3:
                                                        for (int j = 0; j < nombres.length; j++) {
                                                            if (emails[j] != null) {
                                                                clientesregistrados = true;
                                                                System.out.println("\nNombre: " + nombres[j] +
                                                                        "\nCorreo Electrónico: " + emails[j] +
                                                                        "\nContraseña: " + contrasenias[j]);
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay usuarios registrados.");
                                                        }
                                                        clientesregistrados = false;
                                                    break;
                                                    case 4:
                                                        for (int j = 0; j < emails.length; j++) {
                                                            if (emails[j] != null) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay usuarios registrados.");
                                                            break;
                                                        }
                                                        clientesregistrados = false;
                                                        System.out.println("Ingrese el correo de la persona de que deseea actualizar");
                                                        email = sc.nextLine();

                                                        for (int j = 0; j < emails.length; j++) {
                                                            if (email.equalsIgnoreCase(emails[j])) {
                                                                do {
                                                                    System.out.println("""
                                                                            =============================
                                                                            |    ACTUALIZAR USUARIOS    |
                                                                            =============================
                                                                            |   1) Nombre               |
                                                                            |   2) Correo Electrónico   |
                                                                            |   3) Contraseña           |
                                                                            |   4) Atras                |
                                                                            =============================
                                                                            """);
                                                                    actualizarCliente = sc.nextInt();
                                                                    sc.nextLine();

                                                                    switch (actualizarCliente) {
                                                                        case 1:
                                                                            System.out.println("Señor admin el nombre actual es: " + nombres[j] +
                                                                                    "\nIngrese el nombre a actualizar");
                                                                            nombre = sc.nextLine();
                                                                            nombres[j] = nombre;
                                                                            System.out.println("El nombre fue actualizado correctamente a: " + nombres[j]);
                                                                        break;
                                                                        case 2:
                                                                            System.out.println("Señor admin el correo actual de: " + nombres[j] +
                                                                                    " es: " + emails[j] +
                                                                                    "\nIngrese el correo a actualizar");
                                                                            email = sc.nextLine();
                                                                            emails[j] = email;
                                                                            System.out.println("El correo fue actualizado correctamente a: " + emails[j]);
                                                                        break;
                                                                        case 3:
                                                                            System.out.println("Señor usuario la contraseña actual de: " + nombres[j] +
                                                                                    " es: " + contrasenias[j] +
                                                                                    "\nIngrese la contraseña a actualizar");
                                                                            contrasenia = sc.nextLine();
                                                                            contrasenias[j] = contrasenia;
                                                                            System.out.println("La contraseña fue actualizado correctamente a: " + contrasenias[j]);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Saliendo de actualizar usuarios");
                                                                        break;
                                                                        default:
                                                                            System.out.println("Señor usuario la opcion es invalida vuelva a ingresarla");
                                                                        break;
                                                                    }
                                                                } while (actualizarCliente != 4);
                                                            } else {
                                                                if (j == (nombres.length - 1)) {
                                                                    System.out.println("El cliente con el correo " + email +
                                                                            " no se encuentra registrado en el sistema\n");
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    break;
                                                    case 5:
                                                        for (int j = 0; j < emails.length; j++) {
                                                            if (emails[j] != null) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay clientes registrados.");
                                                            break;
                                                        }
                                                        clientesregistrados = false;
                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Ingrese el correo del cliente que desea eliminar");
                                                            email = sc.nextLine();

                                                            for (int j = 0; j < emails.length; j++) {
                                                                if (email.equalsIgnoreCase(emails[j])) {
                                                                    nombres[j] = null;
                                                                    emails[j] = null;
                                                                    contrasenias[j] = null;
                                                                    System.out.println("El cliente fue eliminado correctamente");
                                                                    break;
                                                                } else {
                                                                    if (j == (nombres.length - 1)) {
                                                                        System.out.println("El cliente con el correo " + email +
                                                                                " no se encuentra registrado en el sistema\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            System.out.println("Señor usuario desea eliminar otro cliente (s/n)");
                                                            seguir = sc.nextLine();

                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor usuario desea eliminar a otro cliente (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                    break;
                                                }
                                            }while (adminClientes != 6);
                                        break;
                                        case 2:
                                            do {
                                                System.out.println("""
                                                        =================================================
                                                        |             ADMINISTRAR PRODUCTOS             |
                                                        =================================================
                                                        |    1) Crear nuevo producto                    |
                                                        |    2) Buscar producto                         |
                                                        |    3) Mostrar datos de todos los productos    |
                                                        |    4) Actualizar producto                     |
                                                        |    5) Eliminar producto                       |
                                                        |    6) Atras                                   |
                                                        =================================================
                                                        """);
                                                adminProductos = sc.nextInt();
                                                switch (adminProductos) {
                                                    case 1:
                                                        while (!seguir.equals("n")){
                                                            for (int j = 0; j < nombreProductos.length; j++){
                                                                if (nombreProductos[j] == null){
                                                                    System.out.println("Nombre del producto:");
                                                                    nombreProductos[j] = sc.nextLine();
                                                                    System.out.println("Marca del producto:");
                                                                    marcaProductos[j] = sc.nextLine();
                                                                    System.out.println("Stock del producto:");
                                                                    stockProductos[j] = sc.nextInt();
                                                                    System.out.println("Precio del producto:");
                                                                    precioProductos[j] = sc.nextDouble();
                                                                    break;
                                                                }else{
                                                                    continue;
                                                                }
                                                            }
                                                            System.out.println("Señor admin desea crear un nuevo producto (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor admin desea crear un nuevo producto (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                        break;
                                                    case 2:
                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Ingrese el nombre del producto que desea buscar");
                                                            nombreProducto = sc.nextLine();

                                                            for (int j = 0; j < nombreProductos.length; j++) {
                                                                if (nombreProducto.equalsIgnoreCase(nombreProductos[j])) {
                                                                    System.out.println("\nNombre del producto: " + nombreProductos[j] +
                                                                            "\nMarca: " + marcaProductos[j] +
                                                                            "\nStock Disponible: " + stockProductos[j] +
                                                                            "\nPrecio Unitario: " + precioProductos[j] + "\n");
                                                                    break;
                                                                } else {
                                                                    if (j == (nombreProductos.length - 1)) {
                                                                        System.out.println("El producto: " + nombreProducto +
                                                                                " no se encuentra registrado en el inventario\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            System.out.println("Señor admin desea buscarlo nuevamente o buscar otro producto (s/n)");
                                                            seguir = sc.nextLine();

                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor admin desea buscarlo nuevamente o buscar otro producto (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                        break;
                                                    case 3:
                                                        for (int j = 0; j < nombreProductos.length; j++) {
                                                            if (nombreProductos[j] != null) {
                                                                clientesregistrados = true;
                                                                System.out.println("\nNombre del producto: " + nombreProductos[j] +
                                                                        "\nMarca: " + marcaProductos[j] +
                                                                        "\nStock Disponible: " + stockProductos[j] +
                                                                        "\nPrecio Unitario: " + precioProductos[j] + "\n");
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay productos registrados en el inventario.");
                                                        }
                                                        clientesregistrados = false;
                                                        break;
                                                    case 4:
                                                        for (int j = 0; j < nombreProductos.length; j++) {
                                                            if (nombreProductos[j] != null) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay productos registrados en el inventario.");
                                                            break;
                                                        }
                                                        clientesregistrados = false;
                                                        System.out.println("Ingrese el nombre del producto que desea actualizar");
                                                        nombreProducto = sc.nextLine();

                                                        for (int j = 0; j < nombreProductos.length; j++) {
                                                            if (nombreProducto.equalsIgnoreCase(nombreProductos[j])) {
                                                                do {
                                                                    System.out.println("""
                                                                            ==============================
                                                                            |    ACTUALIZAR PRODUCTOS    |
                                                                            ==============================
                                                                            |         1) Nombre          |
                                                                            |         2) Marca           |
                                                                            |         3) Stock           |
                                                                            |         4) Precio
                                                                            |         5) Atras           |
                                                                            ==============================
                                                                            """);
                                                                    actualizarProducto = sc.nextInt();
                                                                    sc.nextLine();

                                                                    switch (actualizarProducto) {
                                                                        case 1:
                                                                            System.out.println("Señor admin el nombre del producto actual es: " + nombreProductos[j] +
                                                                                    "\nIngrese el nombre del producto a actualizar");
                                                                            nombreProducto = sc.nextLine();
                                                                            nombreProductos[j] = nombreProducto;
                                                                            System.out.println("El nombre del producto fue actualizado correctamente a: " + nombreProductos[j]);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Señor admin la marca actual de: " + nombreProductos[j] +
                                                                                    " es: " + marcaProductos[j] +
                                                                                    "\nIngrese la marca a actualizar");
                                                                            marca = sc.nextLine();
                                                                            marcaProductos[j] = marca;
                                                                            System.out.println("La marca fue actualizado correctamente a: " + marcaProductos[j]);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Señor admin el stock actual de: " + nombreProductos[j] +
                                                                                    " es: " + stockProductos[j] +
                                                                                    "\nIngrese el stock a actualizar");
                                                                            stock = sc.nextInt();
                                                                            stockProductos[j] = stock;
                                                                            System.out.println("El stock fue actualizado correctamente a: " + stockProductos[j]);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Señor admin el precio actual de: " + nombreProductos[j] +
                                                                                    " es: " + precioProductos[j] +
                                                                                    "\nIngrese el precio a actualizar");
                                                                            precioProducto = sc.nextDouble();
                                                                            precioProductos[j] = precioProducto;
                                                                            System.out.println("El precio fue actualizado correctamente a: " + precioProductos[j]);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Saliendo de actualizar productos");
                                                                            break;
                                                                        default:
                                                                            System.out.println("Señor admin la opcion es invalida vuelva a ingresarla");
                                                                            break;
                                                                    }
                                                                } while (actualizarCliente != 5);
                                                            } else {
                                                                if (j == (nombreProductos.length - 1)) {
                                                                    System.out.println("El producto : " + nombreProducto +
                                                                            " no se encuentra registrado en el Inventario\n");
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        for (int j = 0; j < nombreProductos.length; j++) {
                                                            if (nombreProductos[j] != null) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("No hay productos registrados en el inventario.");
                                                            break;
                                                        }
                                                        clientesregistrados = false;
                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Ingrese el nombre del producto que desea eliminar");
                                                            nombreProducto = sc.nextLine();

                                                            for (int j = 0; j < nombreProductos.length; j++) {
                                                                if (nombreProducto.equalsIgnoreCase(nombreProductos[j])) {
                                                                    nombreProductos[j] = null;
                                                                    marcaProductos[j] = null;
                                                                    stockProductos[j] = 0;
                                                                    precioProductos[j] = 0;
                                                                    System.out.println("El producto fue eliminado correctamente");
                                                                    break;
                                                                } else {
                                                                    if (j == (nombreProductos.length - 1)) {
                                                                        System.out.println("El producto: " + nombreProducto +
                                                                                " no se encuentra registrado en el sistema\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            System.out.println("Señor usuario desea eliminar otro producto (s/n)");
                                                            seguir = sc.nextLine();

                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                                                System.out.println("Señor usuario desea eliminar otro producto (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                        break;
                                                }
                                            }while(adminProductos != 6);
                                        break;
                                        case 3:
                                            System.out.println("Sesión cerrada correctamente");
                                        break;
                                        default:
                                            System.out.println("Opcion invalida, favor ingresela nuevamente");
                                        break;
                                    }
                                }while (admin != 4);
                                seguir = "n";
                                break;
                            }else {
                                if (i == (emailsadmin.length - 1)) {
                                    System.out.println("Email o contraseña incorrecto");
                                    System.out.println("Señor usuario desea intentarlo de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                        System.out.println("Señor usuario desea intentarlo de nuevo (s/n)");
                                        seguir = sc.nextLine();
                                    }
                                }
                            }
                        }
                    }
                    seguir = "s";
                break;
                case 2:
                    while (!seguir.equals("n")) {
                        System.out.println("Ingrese el correo:");
                        email = sc.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        contrasenia = sc.nextLine();
                        for (int j = 0; j < emails.length; j++) {
                            if (email.equalsIgnoreCase(emails[j]) && contrasenia.equals(contrasenias[j])) {

                            } else {
                                if (j == (emails.length - 1)) {
                                    System.out.println("Email o contraseña incorrecto");
                                    System.out.println("Señor usuario desea intentarlo de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("La opción elegida es invalida vuelva a ingresarla");
                                        System.out.println("Señor usuario desea intentarlo de nuevo (s/n)");
                                        seguir = sc.nextLine();
                                    }
                                }
                            }
                        }
                    }
                break;
            }
        } while(tipoUsuario != 3);
    }
}
