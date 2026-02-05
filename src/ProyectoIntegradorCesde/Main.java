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
        String[] nombresUsuarios = new String[3];
        String[] emailsUsuarios = new String[3];
        String[] contraseniasUsuarios = new String[3];
        String[] rolesUsuarios = new String[3];
        String[] nombreProductos = new String[3];
        String[] coloresProductos = new String[3];
        String[] marcasProductos = new String[3];
        String[] tallasProductos = new String[3];
        int[] stocksProductos = new int[3];
        int[] codigoProductos = new int[3];
        double[] precioProductos = new double[3];

        Scanner sc = new Scanner(System.in);
        int tipoUsuario = 0, admin = 0, adminClientes = 0, actualizarCliente = 0, adminProductos = 0,
                actualizarProducto = 0, codigoProducto = 0, stockProducto = 0, cliente = 0, perfilCliente = 0,
                productosCliente = 0;
        double precioProducto = 0;
        String email = "", contrasenia = "", seguir = "", nombre = "", nombreProducto = "", marca = "",
            colorProducto = "", tallaProducto = "";
        boolean clientesregistrados = false, correoExistente = true, verificarUsuario = false, maximoUsuario = true;
        nombresUsuarios[0] = "1";
        emailsUsuarios[0] = "1";
        contraseniasUsuarios[0] = "1";
        rolesUsuarios[0] = "admin";
        nombresUsuarios[1] = "2";
        emailsUsuarios[1] = "2";
        contraseniasUsuarios[1] = "2";
        rolesUsuarios[1] = "cliente";
        nombresUsuarios[2] = "3";
        emailsUsuarios[2] = "3";
        contraseniasUsuarios[2] = "3";
        rolesUsuarios[2] = "cliente";

        System.out.println("Bienvenido a The Richn´t");

        do {
            System.out.println("""
                    ============================
                    |   SELECCIÓN DE USUARIO   |
                    ============================
                    |   1) Admin               |
                    |   2) Cliente             |
                    |   3) Salir del sistema   |
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
                        for (int i = 0; i < emailsUsuarios.length; i++){
                            if (email.equalsIgnoreCase(emailsUsuarios[i]) && contrasenia.equals(contraseniasUsuarios[i])){
                                if (rolesUsuarios[i].equals("admin")){
                                    verificarUsuario = true;
                                    do {
                                        System.out.println("\nBienvenido de nuevo " + nombresUsuarios[i]);
                                        System.out.println("""
                                                ==================================
                                                |          MENÚ ADMIN            |
                                                ==================================
                                                |    1) Administrar Clientes     |
                                                |    2) Administrar Productos    |
                                                |    3) Cerrar Sesión            |
                                                ==================================
                                                """);
                                        admin = sc.nextInt();

                                        switch (admin){
                                            case 1:
                                                do {
                                                    System.out.println("""
                                                            ================================================
                                                            |             ADMINISTRAR USUARIOS             |
                                                            ================================================
                                                            |    1) Crear nuevo usuario                    |
                                                            |    2) Buscar usuario                         |
                                                            |    3) Mostrar datos de todos los usuarios    |
                                                            |    4) Actualizar usuarios                     |
                                                            |    5) Eliminar usuarios                       |
                                                            |    6) Atras                                  |
                                                            ================================================
                                                            """);
                                                    adminClientes = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminClientes) {
                                                        case 1:
                                                                for (int j = 0; j < emailsUsuarios.length; j++){
                                                                    if (emailsUsuarios[j] == null){
                                                                        seguir = "s";
                                                                        break;
                                                                    }else {
                                                                        seguir = "n";
                                                                    }
                                                                }
                                                                if (seguir.equals("n")) {
                                                                    System.out.println("Se han registrado el maximo de usuarios");
                                                                }
                                                            while (!seguir.equals("n")){
                                                                for (int j = 0; j < emailsUsuarios.length; j++){
                                                                    if (emailsUsuarios[j] == null){
                                                                        System.out.println("Nombre de usuario:");
                                                                        nombresUsuarios[j] = sc.nextLine();
                                                                        while (correoExistente) {
                                                                            System.out.println("Correo electrónico:");
                                                                            email = sc.nextLine();
                                                                            for (int k = 0; k < emailsUsuarios.length; k++){
                                                                                if (email.equalsIgnoreCase(emailsUsuarios[k])){
                                                                                    correoExistente = true;
                                                                                    System.out.println("Señor admin, el correo ya es existente favor ingresar uno diferente");
                                                                                    break;
                                                                                }else {
                                                                                    correoExistente = false;
                                                                                }
                                                                            }
                                                                            if (!correoExistente){
                                                                                emailsUsuarios[j] = email;
                                                                            }
                                                                        }
                                                                        correoExistente = true;
                                                                        System.out.println("Contraseña");
                                                                        contraseniasUsuarios[j] = sc.nextLine();
                                                                        System.out.println("Rol del usuario (admin/cliente)");
                                                                        rolesUsuarios[j] = sc.nextLine();
                                                                        while (!rolesUsuarios[j].equals("admin") && !rolesUsuarios[j].equals("cliente")) {
                                                                            System.out.println("Rol incorrecto asegurese de escuibir la palabra completa en minuscula");
                                                                            System.out.println("Rol del usuario (admin/cliente)");
                                                                            rolesUsuarios[j] = sc.nextLine();
                                                                        }
                                                                        System.out.println("El usuario fue creado correctamente");
                                                                        break;
                                                                    }else{
                                                                        continue;
                                                                    }
                                                                }
                                                                for (int j = 0; j < emailsUsuarios.length; j++){
                                                                    if (emailsUsuarios[j] == null){
                                                                        System.out.println("Señor admin, desea crear un nuevo usuario (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                            System.out.println("Señor admin, desea crear un nuevo usuario (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if(maximoUsuario){
                                                                    System.out.println("Se han registrado el máximo de usuarios");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                        break;
                                                        case 2:
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el correo del usuario que desea buscar");
                                                                email = sc.nextLine();

                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (email.equalsIgnoreCase(emailsUsuarios[j])) {
                                                                        System.out.println("\nNombre: " + nombresUsuarios[j] +
                                                                                "\nCorreo Electrónico: " + emailsUsuarios[j] +
                                                                                "\nContraseña: " + contraseniasUsuarios[j] +
                                                                                "\nRol: " + rolesUsuarios[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (emailsUsuarios.length - 1)) {
                                                                            System.out.println("El usuario con el correo " + email +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Señor admin, desea buscar otro usuario (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Señor admin, desea buscar otro usuario (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                        break;
                                                        case 3:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] != null) {
                                                                    clientesregistrados = true;
                                                                    System.out.println("\nNombre: " + nombresUsuarios[j] +
                                                                            "\nCorreo Electrónico: " + emailsUsuarios[j] +
                                                                            "\nContraseña: " + contraseniasUsuarios[j] +
                                                                            "\nRol: " + rolesUsuarios[j] + "\n");
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay usuarios registrados.");
                                                            }
                                                            clientesregistrados = false;
                                                        break;
                                                        case 4:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] != null) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay usuarios registrados.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            System.out.println("Ingrese el correo del usuario que deseea actualizar");
                                                            email = sc.nextLine();

                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (email.equalsIgnoreCase(emailsUsuarios[j])) {
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
                                                                                System.out.println("Señor admin, el nombre actual es: " + nombresUsuarios[j] +
                                                                                        "\nIngrese el nombre a actualizar");
                                                                                nombre = sc.nextLine();
                                                                                nombresUsuarios[j] = nombre;
                                                                                System.out.println("El nombre fue actualizado correctamente a: " + nombresUsuarios[j]);
                                                                            break;
                                                                            case 2:
                                                                                System.out.println("Señor admin, el correo actual de: " + nombresUsuarios[j] +
                                                                                        " es: " + emailsUsuarios[j] +
                                                                                        "\nIngrese el correo a actualizar");
                                                                                email = sc.nextLine();
                                                                                emailsUsuarios[j] = email;
                                                                                System.out.println("El correo fue actualizado correctamente a: " + emailsUsuarios[j]);
                                                                            break;
                                                                            case 3:
                                                                                System.out.println("Señor admin, la contraseña actual de: " + nombresUsuarios[j] +
                                                                                        " es: " + contraseniasUsuarios[j] +
                                                                                        "\nIngrese la contraseña a actualizar");
                                                                                contrasenia = sc.nextLine();
                                                                                contraseniasUsuarios[j] = contrasenia;
                                                                                System.out.println("La contraseña fue actualizado correctamente a: " + contraseniasUsuarios[j]);
                                                                                break;
                                                                            case 4:
                                                                                System.out.println("Saliendo del menú actualizar usuarios");
                                                                            break;
                                                                            default:
                                                                                System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                            break;
                                                                        }
                                                                    } while (actualizarCliente != 4);
                                                                } else {
                                                                    if (j == (emailsUsuarios.length - 1)) {
                                                                        System.out.println("El usuario con el correo " + email +
                                                                                " no se encuentra registrado en el sistema\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        break;
                                                        case 5:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] != null) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay usuarios registrados.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el correo del usuario que desea eliminar");
                                                                email = sc.nextLine();

                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (email.equalsIgnoreCase(emailsUsuarios[j])) {
                                                                        nombresUsuarios[j] = null;
                                                                        emailsUsuarios[j] = null;
                                                                        contraseniasUsuarios[j] = null;
                                                                        System.out.println("El usuario fue eliminado correctamente");
                                                                        break;
                                                                    } else {
                                                                        if (j == (emailsUsuarios.length - 1)) {
                                                                            System.out.println("El usuario con el correo " + email +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Señor admin, desea eliminar otro cliente (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Señor admin, desea eliminar otro cliente (s/n)");
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
                                                                for (int j = 0; j < codigoProductos.length; j++){
                                                                    if (nombreProductos[j] == null){
                                                                        System.out.println("Codigo del producto");
                                                                        codigoProductos[j] = sc.nextInt();
                                                                        System.out.println("Nombre del producto:");
                                                                        nombreProductos[j] = sc.nextLine();
                                                                        System.out.println("Marca del producto:");
                                                                        marcasProductos[j] = sc.nextLine();
                                                                        System.out.println("Color del producto");
                                                                        coloresProductos[j] = sc.nextLine();
                                                                        System.out.println("Talla del producto");
                                                                        tallasProductos[j] =sc.nextLine();
                                                                        System.out.println("Stock del producto:");
                                                                        stocksProductos[j] = sc.nextInt();
                                                                        System.out.println("Precio del producto:");
                                                                        precioProductos[j] = sc.nextDouble();
                                                                        break;
                                                                    }else{
                                                                        continue;
                                                                    }
                                                                }
                                                                System.out.println("Señor admin, desea crear un nuevo producto (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Señor admin, desea crear un nuevo producto (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el codigo del producto que desea buscar");
                                                                codigoProducto = sc.nextInt();

                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProducto == codigoProductos[j]) {
                                                                        System.out.println("\nCodigo del producto: " + codigoProductos[j] +
                                                                                "\nNombre del producto: " + nombreProductos[j] +
                                                                                "\nMarca: " + marcasProductos[j] +
                                                                                "\nColor del producto: " + coloresProductos[j] +
                                                                                "\nTalla del producto: " + tallasProductos[j] +
                                                                                "\nStock Disponible: " + stocksProductos[j] +
                                                                                "\nPrecio Unitario: " + precioProductos[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (codigoProductos.length - 1)) {
                                                                            System.out.println("El codigo del producto: " + nombreProducto +
                                                                                    " no se encuentra registrado en el inventario\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Señor admin, desea buscar otro producto (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Señor admin, desea buscar otro producto (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    System.out.println("\nCodigo del producto: " + codigoProductos[j] +
                                                                            "\nNombre del producto: " + nombreProductos[j] +
                                                                            "\nMarca: " + marcasProductos[j] +
                                                                            "\nColor: " + coloresProductos[j] +
                                                                            "\nTalla: " + tallasProductos[j] +
                                                                            "\nStock Disponible: " + stocksProductos[j] +
                                                                            "\nPrecio Unitario: " + precioProductos[j] + "\n");
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay productos registrados en el inventario.");
                                                            }
                                                            clientesregistrados = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay productos registrados en el inventario.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            System.out.println("Ingrese el codigo del producto que desea actualizar");
                                                            codigoProducto = sc.nextInt();

                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProducto == codigoProductos[j]) {
                                                                    do {
                                                                        System.out.println("""
                                                                                ==============================
                                                                                |    ACTUALIZAR PRODUCTOS    |
                                                                                ==============================
                                                                                |         1) Codigo          |
                                                                                |         2) Nombre          |
                                                                                |         3) Marca           |
                                                                                |         4) Color           |
                                                                                |         5) Talla           |
                                                                                |         6) Stock           |
                                                                                |         7) Precio          |
                                                                                |         8) Atras           |
                                                                                ==============================
                                                                                """);
                                                                        actualizarProducto = sc.nextInt();
                                                                        sc.nextLine();

                                                                        switch (actualizarProducto) {
                                                                            case 1:
                                                                                System.out.println("Señor admin, el codigo del producto actual es: " + codigoProductos[j] +
                                                                                        "\nIngrese el codigo del producto a actualizar");
                                                                                codigoProducto = sc.nextInt();
                                                                                codigoProductos[j] = codigoProducto;
                                                                                System.out.println("El codigo del producto fue actualizado correctamente a: " + nombreProductos[j]);
                                                                                break;
                                                                            case 2:
                                                                                System.out.println("Señor admin, el nombre actual del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + nombreProductos[j] +
                                                                                        "\nIngrese el nombre del producto a actualizar");
                                                                                nombreProducto = sc.nextLine();
                                                                                nombreProductos[j] = nombreProducto;
                                                                                System.out.println("El nombre del producto fue actualizado correctamente a: " + nombreProductos[j]);
                                                                                break;
                                                                            case 3:
                                                                                System.out.println("Señor admin, la marca actual del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + marcasProductos[j] +
                                                                                        "\nIngrese la marca a actualizar");
                                                                                marca = sc.nextLine();
                                                                                marcasProductos[j] = marca;
                                                                                System.out.println("La marca fue actualizado correctamente a: " + marcasProductos[j]);
                                                                                break;
                                                                            case 4:
                                                                                System.out.println("Señor admin, el color actual del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + coloresProductos[j] +
                                                                                        "\nIngrese el color a actualizar");
                                                                                colorProducto = sc.nextLine();
                                                                                coloresProductos[j] = colorProducto;
                                                                                System.out.println("El color fue actualizado correctamente a: " + coloresProductos[j]);
                                                                                break;
                                                                            case 5:
                                                                                System.out.println("Señor admin, la talla actual del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + tallasProductos[j] +
                                                                                        "\nIngrese la marca a actualizar");
                                                                                tallaProducto = sc.nextLine();
                                                                                tallasProductos[j] = tallaProducto;
                                                                                System.out.println("La talla fue actualizado correctamente a: " + tallasProductos[j]);
                                                                                break;
                                                                            case 6:
                                                                                System.out.println("Señor admin, el actual stock disponible del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + stocksProductos[j] +
                                                                                        "\nIngrese el stock a actualizar");
                                                                                stockProducto = sc.nextInt();
                                                                                stocksProductos[j] = stockProducto;
                                                                                System.out.println("El stock disponible fue actualizado correctamente a: " + stocksProductos[j]);
                                                                                break;
                                                                            case 7:
                                                                                System.out.println("Señor admin, el precio actual del producto con el codigo: " + codigoProductos[j] +
                                                                                        " es: " + precioProductos[j] +
                                                                                        "\nIngrese el stock a actualizar");
                                                                                precioProducto = sc.nextInt();
                                                                                precioProductos[j] = precioProducto;
                                                                                System.out.println("El precio fue actualizado correctamente a: " + precioProductos[j]);
                                                                                break;
                                                                            case 8:
                                                                                System.out.println("Saliendo del menú actualizar productos");
                                                                                break;
                                                                            default:
                                                                                System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                                break;
                                                                        }
                                                                    } while (actualizarCliente != 8);
                                                                } else {
                                                                    if (j == (codigoProductos.length - 1)) {
                                                                        System.out.println("El codigo del producto : " + codigoProducto +
                                                                                " no se encuentra registrado en el Inventario\n");
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] != 0) {
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
                                                                System.out.println("Ingrese el codigo del producto que desea eliminar");
                                                                codigoProducto = sc.nextInt();

                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProducto == codigoProductos[j]) {
                                                                        codigoProductos[j] = 0;
                                                                        nombreProductos[j] = null;
                                                                        marcasProductos[j] = null;
                                                                        coloresProductos[j] = null;
                                                                        tallasProductos[j] = null;
                                                                        stocksProductos[j] = 0;
                                                                        precioProductos[j] = 0;
                                                                        System.out.println("El producto fue eliminado correctamente");
                                                                        break;
                                                                    } else {
                                                                        if (j == (codigoProductos.length - 1)) {
                                                                            System.out.println("El producto con el codigo: " + nombreProducto +
                                                                                    " no se encuentra registrado en el inventario\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Señor admin, desea eliminar otro producto (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Señor admin, desea eliminar otro producto (s/n)");
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
                                    }while (admin != 3);
                                }
                                if (!verificarUsuario){
                                    System.out.println("El usuario ingresado no tiene permisos de administrador");
                                }
                                verificarUsuario = false;
                                seguir = "n";
                                break;
                            }else {
                                if (i == (emailsUsuarios.length - 1)) {
                                    System.out.println("Email o contraseña incorrecto");
                                    System.out.println("Señor admin, desea intentarlo de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                        System.out.println("Señor admin, desea intentarlo de nuevo (s/n)");
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
                        for (int i = 0; i < emailsUsuarios.length; i++) {
                            if (email.equalsIgnoreCase(emailsUsuarios[i]) && contrasenia.equals(contraseniasUsuarios[i])) {
                                do {
                                    System.out.println("\nBienvenido de nuevo " + nombresUsuarios[i]);
                                    System.out.println("""
                                                ===================================
                                                |          MENÚ CLIENTE           |
                                                ===================================
                                                |    1) Ver perfil                |
                                                |    2) Ver productos             |
                                                |    3) Ver Carrito de compras    |
                                                |    4) Ver pedidos               |
                                                |    5) Cerrar Sesión             |
                                                ===================================
                                                """);
                                    cliente = sc.nextInt();
                                    sc.nextLine();
                                    switch (cliente){
                                        case 1:
                                            do {
                                                System.out.println("""
                                                ======================================
                                                |               PERFIL               |
                                                ======================================
                                                |    1) Cambiar nombre               |
                                                |    2) Cambiar correo               |
                                                |    3) Cambiar/Agregar dirección    |
                                                |    4) Cambiar contraseña           |
                                                |    5) Cerrar Sesión                |
                                                ======================================
                                                """);
                                                perfilCliente = sc.nextInt();
                                                sc.nextLine();
                                            }while (perfilCliente != 5);
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("""
                                                ======================================
                                                |             PRODUCTOS              |
                                                ======================================
                                                |    1) Ver Productos                |
                                                |    2) Añadir al carrito            |
                                                |    3)                              |
                                                |    4) Cambiar contraseña           |
                                                |    5) Cerrar Sesión                |
                                                ======================================
                                                """);
                                                productosCliente = sc.nextInt();
                                                sc.nextLine();
                                            }while (productosCliente != 5);
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            System.out.println("Sesión cerrada correctamente");
                                            break;
                                        default:
                                            System.out.println("Opción inválida");
                                            break;
                                    }
                                }while (cliente != 5);
                                seguir = "n";
                                break;
                            } else {
                                if (i == (emailsUsuarios.length - 1)) {
                                    System.out.println("Email o contraseña incorrecto");
                                    System.out.println("Señor usuario, desea intentarlo de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                        System.out.println("Señor usuario, desea intentarlo de nuevo (s/n)");
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
