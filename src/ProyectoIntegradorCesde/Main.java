package ProyectoIntegradorCesde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        int u = 10, p = 100, pv = 100, mp = 4, pm = 2;
        Scanner sc = new Scanner(System.in);
        String[] nombresUsuarios = new String[u];
        String[] emailsUsuarios = new String[u];
        String[] contraseniasUsuarios = new String[u];
        String[] rolesUsuarios = new String[u];
        String[] nombreProductos = new String[u];
        String[] coloresProductos = new String[u];
        String[] marcasProductos = new String[u];
        String[] tallasProductos = new String[u];
        String[] nombresCliente = new String[u];
        String[] productosComprados = new String[p];
        String[] categorias = new String[p];
        String[] descripciones = new String[p];
        String[] estados = new String[p];
        String[] fechas = new String[p];
        String[] nombres = new String[pv];
        String[] telefonos = new String[pv];
        String[] correos = new String[pv];
        String[] productos = new String[pv];
        String[] clientes = new String[pv];
        String[] metodosPago = new String[mp];
        String[] promociones = new String[pm];
        String[] carritoProductos = new String[pv];
        String[] direccionUsuarios = new String[u];
        int[] stocksProductos = new int[u];
        int[] codigoProductos = new int[u];
        int[] idsPedido = new int[p];
        int[] cantidades = new int[pv];
        int[] idsProveedores = new int[pv];
        int[] idsVentas = new int[pv];
        int[] codigosPedidos = new int[p];
        int[] carritoCantidades = new int[pv];
        int[] carritoCodigos = new int[pv];
        double[] precioProductos = new double[u];
        double[] totales = new double[pv];
        double[] preciosPedidos = new double[p];
        int tipoUsuario = 0, admin = 0, adminClientes = 0, actualizarCliente = 0, adminProductos = 0,
                actualizarProducto = 0, codigoProducto = 0, stockProducto = 0, cliente = 0, perfilCliente = 0,
                productosCliente = 0, totalCategorias = 0, totalPedidos = 0, contadorId = 1, idCancelar = 0,
                idBuscado = 0, idActualizar = 0, idEliminar = 0, totalProveedores = 0, opcion = 0, buscar = 0,
                borrar = 0, totalVentas = 0, totalMetodos = 0, totalPromos = 0, carritoCliente = 0,
                pos = 0, clientePedidos;
        double precioProducto = 0, totalCarrito = 0;
        String email = "", contrasenia = "", seguir = "", nombre = "", nombreProducto = "", marca = "",
            colorProducto = "", tallaProducto = "", estadoFiltro = "", nombreBuscar = "";
        boolean clientesregistrados = false, correoExistente = true, verificarUsuario = false, maximoUsuario = true,
                hayPedidos = false, encontrado = false, existe = false, borrado = false, eliminado = false,
                carritoProducto = false, clientePedido = false;
        char estadoOpcion = 0, confirmacion = 0, estadoBuscar = 0, opcionPedido = 0, opcionCategoria = 0;
        nombresUsuarios[0] = "Andres";
        emailsUsuarios[0] = "andres@gmail.com";
        contraseniasUsuarios[0] = "123";
        rolesUsuarios[0] = "admin";
        nombresUsuarios[1] = "Daniel";
        emailsUsuarios[1] = "daniel@gmail.com";
        contraseniasUsuarios[1] = "123";
        rolesUsuarios[1] = "admin";
        nombresUsuarios[2] = "Alejandro";
        emailsUsuarios[2] = "alejandro@gmail.com";
        contraseniasUsuarios[2] = "123";
        rolesUsuarios[2] = "admin";
        nombresUsuarios[3] = "Jose";
        emailsUsuarios[3] = "jose@gmail.com";
        contraseniasUsuarios[3] = "123";
        rolesUsuarios[3] = "admin";
        nombresUsuarios[4] = "Alexander";
        emailsUsuarios[4] = "profe@gmail.com";
        contraseniasUsuarios[4] = "123";
        rolesUsuarios[4] = "cliente";

        System.out.println("Bienvenido a The Richn´t");

        do {
            System.out.println("""
                    ============================
                    |   SELECCIÓN DE USUARIO   |
                    ============================
                    |   1) Admin               |
                    |   2) Cliente             |
                    |   0) Salir del sistema   |
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
                                                =================================================
                                                |                  MENÚ ADMIN                   |
                                                =================================================
                                                |    1) Administrar Clientes                    |
                                                |    2) Administrar Productos                   |
                                                |    3) Administrar Pedidos                     |
                                                |    4) Administrar Categorias                  |
                                                |    5) Administrar Proveedores                 |
                                                |    6) Administrar Ventas                      |
                                                |    7) Administrar Metodos de Pago             |
                                                |    8) Administrar Promociones/Descuentos      |
                                                |    0) Cerrar Sesión                           |
                                                =================================================
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
                                                            |    4) Actualizar usuarios                    |
                                                            |    5) Eliminar usuarios                      |
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
                                                                            "\nRol: " + rolesUsuarios[j]);
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("Señor admin, no hay usuarios registrados.");
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
                                                                System.out.println("Señor admin, no hay usuarios registrados.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            System.out.println("Ingrese el correo del usuario que deseea actualizar");
                                                            email = sc.nextLine();

                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (email.equalsIgnoreCase(emailsUsuarios[j])) {
                                                                    do {
                                                                        System.out.println("""
                                                                                ===================================
                                                                                |       ACTUALIZAR USUARIOS       |
                                                                                ===================================
                                                                                |   1) Nombre                     |
                                                                                |   2) Correo Electrónico         |
                                                                                |   3) Contraseña                 |
                                                                                |   4) Actualizar otro usuario    |
                                                                                |   5) Atras                      |
                                                                                ===================================
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
                                                                                System.out.println("Ingrese el correo del usuario que deseea actualizar");
                                                                                email = sc.nextLine();
                                                                                break;
                                                                            case 5:
                                                                                System.out.println("Saliendo del menú actualizar usuarios");
                                                                            break;
                                                                            default:
                                                                                System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                            break;
                                                                        }
                                                                    } while (actualizarCliente != 5);
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
                                                                System.out.println("Señor admin, no hay usuarios registrados.");
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
                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (emailsUsuarios[j] != null) {
                                                                        System.out.println("Señor admin, desea eliminar otro cliente (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                            System.out.println("Señor admin, desea eliminar otro cliente (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                    }
                                                                    if (j == (emailsUsuarios.length - 1)) {
                                                                        System.out.println("Señor admin, no hay usuarios registrados");
                                                                        seguir = "n";
                                                                    }
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
                                                                System.out.println("Señor admin, no hay productos registrados en el inventario.");
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
                                                                System.out.println("Señor admin, no hay productos registrados en el inventario.");
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
                                                                System.out.println("Señor admin, no hay productos registrados en el inventario.");
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
                                                do {
                                                    System.out.println("""
                                                                    ==========================================
                                                                    |           GESTIÓN DE PEDIDOS           |
                                                                    ==========================================
                                                                    |    1) Crear pedido                     |
                                                                    |    2) Ver todos los pedidos            |
                                                                    |    3) Actualizar estado del pedido     |
                                                                    |    4) Cancelar pedido                  |
                                                                    |    5) Buscar pedido por ID             |
                                                                    |    6) Ver pedidos por estado           |
                                                                    |    0) Volver al menú principal         |
                                                                    ==========================================
                                                                    """);
                                                    opcionPedido = sc.next().charAt(0);
                                                    sc.nextLine();

                                                    if (opcionPedido == '1') {
                                                        if (totalPedidos < idsPedido.length) {
                                                            idsPedido[totalPedidos] = contadorId;
                                                            System.out.print("Nombre del cliente: ");
                                                            nombresCliente[totalPedidos] = sc.nextLine();
                                                            System.out.print("Producto: ");
                                                            productosComprados[totalPedidos] = sc.nextLine();
                                                            System.out.print("Cantidad: ");
                                                            cantidades[totalPedidos] = sc.nextInt();
                                                            System.out.print("Total a pagar: ");
                                                            totales[totalPedidos] = sc.nextDouble();
                                                            sc.nextLine();
                                                            System.out.print("Fecha del pedido (DD/MM/AAAA): ");
                                                            fechas[totalPedidos] = sc.nextLine();
                                                            estados[totalPedidos] = "Pendiente";

                                                            System.out.println("\nPedido creado exitosamente con ID: " + contadorId);
                                                            contadorId++;
                                                            totalPedidos++;
                                                        } else {
                                                            System.out.println("No hay espacio para más pedidos");
                                                        }

                                                    } else if (opcionPedido == '2') {
                                                        if (totalPedidos == 0) {
                                                            System.out.println("No hay pedidos registrados");
                                                        } else {
                                                            System.out.println("\n========== LISTADO DE PEDIDOS ==========");
                                                            for (int j = 0; j < totalPedidos; j++) {
                                                                System.out.println("ID Pedido: " + idsPedido[j]);
                                                                System.out.println("Cliente: " + nombresCliente[j]);
                                                                System.out.println("Producto: " + productosComprados[j]);
                                                                System.out.println("Cantidad: " + cantidades[j]);
                                                                System.out.println("Total: $" + totales[j]);
                                                                System.out.println("Fecha: " + fechas[j]);
                                                                System.out.println("Estado: " + estados[j]);
                                                                System.out.println("----------------------------------------");
                                                            }
                                                        }

                                                    } else if (opcionPedido == '3') {
                                                        System.out.print("Ingrese el ID del pedido: ");
                                                        idBuscado = sc.nextInt();
                                                        sc.nextLine();
                                                        encontrado = false;

                                                        for (int j = 0; j < totalPedidos; j++) {
                                                            if (idsPedido[j] == idBuscado) {
                                                                System.out.println("Estado actual: " + estados[j]);
                                                                System.out.println("""
                                                                        ==============================
                                                                        |  SELECCIONAR NUEVO ESTADO  |
                                                                        ==============================
                                                                        |       1) Pendiente         |
                                                                        |       2) Procesando        |
                                                                        |       3) Enviado           |
                                                                        |       4) Entregado         |
                                                                        ==============================
                                                                        """);
                                                                estadoOpcion = sc.next().charAt(0);
                                                                sc.nextLine();

                                                                if (estadoOpcion == '1') {
                                                                    estados[j] = "Pendiente";
                                                                } else if (estadoOpcion == '2') {
                                                                    estados[j] = "Procesando";
                                                                } else if (estadoOpcion == '3') {
                                                                    estados[j] = "Enviado";
                                                                } else if (estadoOpcion == '4') {
                                                                    estados[j] = "Entregado";
                                                                } else {
                                                                    System.out.println("Opción inválida");
                                                                    encontrado = true;
                                                                    break;
                                                                }

                                                                System.out.println("Estado actualizado exitosamente");
                                                                encontrado = true;
                                                                break;
                                                            }
                                                        }

                                                        if (!encontrado) {
                                                            System.out.println("Pedido no encontrado");
                                                        }

                                                    } else if (opcionPedido == '4') {
                                                        System.out.print("Ingrese el ID del pedido a cancelar: ");
                                                        idCancelar = sc.nextInt();
                                                        sc.nextLine();

                                                        for (int j = 0; j < totalPedidos; j++) {
                                                            if (idsPedido[j] == idCancelar) {
                                                                System.out.println("Pedido de " + nombresCliente[j]);
                                                                System.out.print("¿Confirma la cancelación? (s/n): ");
                                                                confirmacion = sc.next().charAt(0);
                                                                sc.nextLine();

                                                                if (confirmacion == 's' || confirmacion == 'S') {
                                                                    for (int k = i; k < totalPedidos - 1; k++) {
                                                                        idsPedido[k] = idsPedido[k + 1];
                                                                        nombresCliente[k] = nombresCliente[k + 1];
                                                                        productosComprados[k] = productosComprados[k + 1];
                                                                        cantidades[k] = cantidades[k + 1];
                                                                        totales[k] = totales[k + 1];
                                                                        estados[k] = estados[k + 1];
                                                                        fechas[k] = fechas[k + 1];
                                                                    }
                                                                    totalPedidos--;
                                                                    System.out.println("Pedido cancelado exitosamente");
                                                                } else {
                                                                    System.out.println("Cancelación abortada");
                                                                }
                                                                encontrado = true;
                                                                break;
                                                            }
                                                        }

                                                        if (!encontrado) {
                                                            System.out.println("Pedido no encontrado");
                                                        }

                                                    } else if (opcionPedido == '5') {
                                                        System.out.print("Ingrese el ID del pedido: ");
                                                        idBuscado = sc.nextInt();
                                                        sc.nextLine();
                                                        encontrado = false;

                                                        for (int j = 0; j < totalPedidos; j++) {
                                                            if (idsPedido[j] == idBuscado) {
                                                                System.out.println("\n========== DETALLE DEL PEDIDO ==========");
                                                                System.out.println("ID Pedido: " + idsPedido[j]);
                                                                System.out.println("Cliente: " + nombresCliente[j]);
                                                                System.out.println("Producto: " + productosComprados[j]);
                                                                System.out.println("Cantidad: " + cantidades[j]);
                                                                System.out.println("Total: $" + totales[j]);
                                                                System.out.println("Fecha: " + fechas[j]);
                                                                System.out.println("Estado: " + estados[j]);
                                                                encontrado = true;
                                                                break;
                                                            }
                                                        }

                                                        if (!encontrado) {
                                                            System.out.println("Pedido no encontrado");
                                                        }

                                                    } else if (opcionPedido == '6') {
                                                        System.out.println("""
                                                                =======================
                                                                |  SELECCIONE ESTADO  |
                                                                =======================
                                                                |    1) Pendiente     |
                                                                |    2) Procesando    |
                                                                |    3) Enviado       |
                                                                |    4) Entregado     |
                                                                =======================
                                                                """);
                                                        estadoBuscar = sc.next().charAt(0);
                                                        sc.nextLine();

                                                        if (estadoBuscar == '1') {
                                                            estadoFiltro = "Pendiente";
                                                        } else if (estadoBuscar == '2') {
                                                            estadoFiltro = "Procesando";
                                                        } else if (estadoBuscar == '3') {
                                                            estadoFiltro = "Enviado";
                                                        } else if (estadoBuscar == '4') {
                                                            estadoFiltro = "Entregado";
                                                        } else {
                                                            System.out.println("Opción inválida");
                                                            estadoFiltro = null;
                                                        }

                                                        if (estadoFiltro != null) {
                                                            System.out.println("\n========== PEDIDOS " + estadoFiltro.toUpperCase() + " ==========");

                                                            for (int j = 0; j < totalPedidos; j++) {
                                                                if (estados[j].equals(estadoFiltro)) {
                                                                    System.out.println("ID: " + idsPedido[j] + " - Cliente: " + nombresCliente[j] + " - Total: $" + totales[j]);
                                                                    hayPedidos = true;
                                                                }
                                                            }

                                                            if (!hayPedidos) {
                                                                System.out.println("No hay pedidos con estado " + estadoFiltro);
                                                            }
                                                        }
                                                        hayPedidos = false;

                                                    } else if (opcionPedido == '0') {
                                                        System.out.println("Volviendo al menú principal...");
                                                    } else {
                                                        System.out.println("Opción inválida");
                                                    }

                                                } while (opcionPedido != '0');
                                                break;
                                            case 4:
                                                do {
                                                    System.out.println("""
                                                            ==================================
                                                            |      GESTIÓN DE CATEGORÍAS      |
                                                            ==================================
                                                            |    1) Crear categoría           |
                                                            |    2) Ver todas las categorías  |
                                                            |    3) Actualizar categoría      |
                                                            |    4) Eliminar categoría        |
                                                            |    5) Buscar categoría          |
                                                            |    0) Volver al menú principal  |
                                                            ==================================
                                                            """);
                                                    System.out.print("Seleccione una opción: ");
                                                    opcionCategoria = sc.next().charAt(0);
                                                    sc.nextLine();

                                                    if (opcionCategoria == '1') {
                                                        if (totalCategorias < categorias.length) {
                                                            System.out.print("Ingrese el nombre de la categoría: ");
                                                            String nombreCategoria = sc.nextLine();
                                                            System.out.print("Ingrese la descripción: ");
                                                            String descripcion = sc.nextLine();

                                                            categorias[totalCategorias] = nombreCategoria;
                                                            descripciones[totalCategorias] = descripcion;
                                                            totalCategorias++;

                                                            System.out.println("Categoría creada exitosamente");
                                                        } else {
                                                            System.out.println("No hay espacio para más categorías");
                                                        }
                                                    } else if (opcionCategoria == '2') {
                                                        if (totalCategorias == 0) {
                                                            System.out.println("No hay categorías registradas");
                                                        } else {
                                                            System.out.println("\n========== LISTADO DE CATEGORÍAS ==========");
                                                            for (int j = 0; j < totalCategorias; j++) {
                                                                System.out.println("ID: " + j);
                                                                System.out.println("Nombre: " + categorias[j]);
                                                                System.out.println("Descripción: " + descripciones[j]);
                                                                System.out.println("-------------------------------------------");
                                                            }
                                                        }

                                                    } else if (opcionCategoria == '3') {
                                                        System.out.print("Ingrese el ID de la categoría a actualizar: ");
                                                        idActualizar = sc.nextInt();
                                                        sc.nextLine();

                                                        if (idActualizar >= 0 && idActualizar < totalCategorias) {
                                                            System.out.println("Categoría actual: " + categorias[idActualizar]);
                                                            System.out.print("Ingrese el nuevo nombre: ");
                                                            String nuevoNombre = sc.nextLine();
                                                            System.out.print("Ingrese la nueva descripción: ");
                                                            String nuevaDescripcion = sc.nextLine();

                                                            categorias[idActualizar] = nuevoNombre;
                                                            descripciones[idActualizar] = nuevaDescripcion;

                                                            System.out.println("Categoría actualizada exitosamente");
                                                        } else {
                                                            System.out.println("ID inválido");
                                                        }

                                                    } else if (opcionCategoria == '4') {
                                                        System.out.print("Ingrese el ID de la categoría a eliminar: ");
                                                        idEliminar = sc.nextInt();
                                                        sc.nextLine();

                                                        if (idEliminar >= 0 && idEliminar < totalCategorias) {
                                                            System.out.println("¿Está seguro de eliminar '" + categorias[idEliminar] + "'? (s/n): ");
                                                            confirmacion = sc.next().charAt(0);
                                                            sc.nextLine();

                                                            if (confirmacion == 's' || confirmacion == 'S') {
                                                                for (int j = idEliminar; j < totalCategorias - 1; j++) {
                                                                    categorias[j] = categorias[j + 1];
                                                                    descripciones[j] = descripciones[j + 1];
                                                                }
                                                                totalCategorias--;
                                                                System.out.println("Categoría eliminada exitosamente");
                                                            } else {
                                                                System.out.println("Eliminación cancelada");
                                                            }
                                                        } else {
                                                            System.out.println("ID inválido");
                                                        }

                                                    } else if (opcionCategoria == '5') {
                                                        System.out.print("Ingrese el nombre de la categoría a buscar: ");
                                                        nombreBuscar = sc.nextLine();
                                                        encontrado = false;

                                                        for (int j = 0; j < totalCategorias; j++) {
                                                            if (categorias[j].equalsIgnoreCase(nombreBuscar)) {
                                                                System.out.println("\nCategoría encontrada:");
                                                                System.out.println("ID: " + j);
                                                                System.out.println("Nombre: " + categorias[j]);
                                                                System.out.println("Descripción: " + descripciones[j]);
                                                                encontrado = true;
                                                                break;
                                                            }
                                                        }

                                                        if (!encontrado) {
                                                            System.out.println("Categoría no encontrada");
                                                        }

                                                    } else if (opcionCategoria == '0') {
                                                        System.out.println("Volviendo al menú principal...");
                                                    } else {
                                                        System.out.println("Opción inválida");
                                                    }

                                                } while (opcionCategoria != '0');
                                                break;
                                            case 5:
                                                do {
                                                    System.out.println("""
                                                            =================================
                                                            |    ADMINISTRAR PROVEEDORES    |
                                                            =================================
                                                            |    1) Crear proveedor         |
                                                            |    2) Mostrar proveedores     |
                                                            |    3) Actualizar proveedor    |
                                                            |    4) Eliminar proveedor      |
                                                            |    0) Volver                  |
                                                            =================================
                                                            """);
                                                    opcion = sc.nextInt();
                                                    sc.nextLine();

                                                    switch (opcion) {

                                                        case 1:
                                                            if (totalProveedores < pv) {

                                                                System.out.print("ID: ");
                                                                idsProveedores[totalProveedores] = sc.nextInt();
                                                                sc.nextLine();

                                                                System.out.print("Nombre: ");
                                                                nombres[totalProveedores] = sc.nextLine();

                                                                System.out.print("Teléfono: ");
                                                                telefonos[totalProveedores] = sc.nextLine();

                                                                System.out.print("Correo: ");
                                                                correos[totalProveedores] = sc.nextLine();

                                                                totalProveedores++;
                                                                System.out.println("Proveedor registrado");

                                                            } else {
                                                                System.out.println("Límite alcanzado");
                                                            }
                                                            break;

                                                        case 2:
                                                            if (totalProveedores == 0) {
                                                                System.out.println("No hay proveedores");
                                                            } else {
                                                                for (int j = 0; j < totalProveedores; j++) {
                                                                    System.out.println(
                                                                            "ID: " + idsProveedores[j] +
                                                                                    " | Nombre: " + nombres[j] +
                                                                                    " | Teléfono: " + telefonos[j] +
                                                                                    " | Correo: " + correos[j]
                                                                    );
                                                                }
                                                            }
                                                            break;

                                                        case 3:
                                                            System.out.print("Ingrese ID: ");
                                                            buscar = sc.nextInt();
                                                            sc.nextLine();

                                                            for (int j = 0; j < totalProveedores; j++) {
                                                                if (idsProveedores[j] == buscar) {

                                                                    System.out.print("Nuevo nombre: ");
                                                                    nombres[j] = sc.nextLine();

                                                                    System.out.print("Nuevo teléfono: ");
                                                                    telefonos[j] = sc.nextLine();

                                                                    System.out.print("Nuevo correo: ");
                                                                    correos[j] = sc.nextLine();

                                                                    System.out.println("Proveedor actualizado");
                                                                    existe = true;
                                                                    break;
                                                                }
                                                            }

                                                            if (!existe) {
                                                                System.out.println("Proveedor no encontrado");
                                                            }
                                                            break;

                                                        case 4:
                                                            System.out.print("Ingrese ID: ");
                                                            borrar = sc.nextInt();

                                                            for (int j = 0; j < totalProveedores; j++) {
                                                                if (idsProveedores[j] == borrar) {

                                                                    for (int k = i; k < totalProveedores - 1; k++) {
                                                                        idsProveedores[k] = idsProveedores[k + 1];
                                                                        nombres[k] = nombres[k + 1];
                                                                        telefonos[k] = telefonos[k + 1];
                                                                        correos[k] = correos[k + 1];
                                                                    }

                                                                    totalProveedores--;
                                                                    borrado = true;
                                                                    System.out.println("Proveedor eliminado");
                                                                    break;
                                                                }
                                                            }

                                                            if (!borrado) {
                                                                System.out.println("Proveedor no encontrado");
                                                            }
                                                            break;

                                                        case 0:
                                                            System.out.println("Saliendo...");
                                                            break;

                                                        default:
                                                            System.out.println("Opción inválida");
                                                    }

                                                } while (opcion != 0);
                                                break;
                                            case 6:
                                                do {
                                                    System.out.println("""
                                                            ==================================
                                                            |        ADMINISTRAR VENTAS      |
                                                            ==================================
                                                            |    1) Registrar venta         |
                                                            |    2) Ver ventas              |
                                                            |    3) Actualizar venta        |
                                                            |    4) Eliminar venta          |
                                                            |    0) Salir                   |
                                                            ==================================
                                                            """);
                                                    System.out.print("Seleccione una opción: ");

                                                    opcion = sc.nextInt();
                                                    sc.nextLine();

                                                    switch (opcion) {

                                                        case 1:
                                                            if (totalVentas < pv) {

                                                                System.out.print("ID de la venta: ");
                                                                idsVentas[totalVentas] = sc.nextInt();
                                                                sc.nextLine();

                                                                System.out.print("Producto: ");
                                                                productos[totalVentas] = sc.nextLine();

                                                                System.out.print("Cliente: ");
                                                                clientes[totalVentas] = sc.nextLine();

                                                                System.out.print("Cantidad: ");
                                                                cantidades[totalVentas] = sc.nextInt();

                                                                System.out.print("Total a pagar: ");
                                                                totales[totalVentas] = sc.nextDouble();
                                                                sc.nextLine();

                                                                totalVentas++;
                                                                System.out.println("Venta registrada correctamente");

                                                            } else {
                                                                System.out.println("No se pueden registrar más ventas");
                                                            }
                                                            break;

                                                        case 2:
                                                            if (totalVentas == 0) {
                                                                System.out.println("No hay ventas registradas");
                                                            } else {
                                                                for (int j = 0; j < totalVentas; j++) {
                                                                    System.out.println(
                                                                            "ID: " + idsVentas[i] +
                                                                                    " | Producto: " + productos[i] +
                                                                                    " | Cliente: " + clientes[i] +
                                                                                    " | Cantidad: " + cantidades[i] +
                                                                                    " | Total: " + totales[i]
                                                                    );
                                                                }
                                                            }
                                                            break;

                                                        case 3:
                                                            System.out.print("Ingrese el ID de la venta: ");
                                                            buscar = sc.nextInt();
                                                            sc.nextLine();

                                                            encontrado = false;

                                                            for (int j = 0; j < totalVentas; j++) {
                                                                if (idsVentas[i] == buscar) {

                                                                    System.out.print("Nuevo producto: ");
                                                                    productos[i] = sc.nextLine();

                                                                    System.out.print("Nuevo cliente: ");
                                                                    clientes[i] = sc.nextLine();

                                                                    System.out.print("Nueva cantidad: ");
                                                                    cantidades[i] = sc.nextInt();

                                                                    System.out.print("Nuevo total: ");
                                                                    totales[i] = sc.nextDouble();
                                                                    sc.nextLine();

                                                                    encontrado = true;
                                                                    System.out.println("Venta actualizada");
                                                                    break;
                                                                }
                                                            }

                                                            if (!encontrado) {
                                                                System.out.println("No se encontró la venta");
                                                            }
                                                            break;

                                                        case 4:
                                                            System.out.print("Ingrese el ID de la venta: ");
                                                            borrar = sc.nextInt();

                                                            for (int j = 0; j < totalVentas; j++) {
                                                                if (idsVentas[j] == borrar) {

                                                                    for (int k = j; k < totalVentas - 1; k++) {
                                                                        idsVentas[k] = idsVentas[k + 1];
                                                                        productos[k] = productos[k + 1];
                                                                        clientes[k] = clientes[k + 1];
                                                                        cantidades[k] = cantidades[k + 1];
                                                                        totales[k] = totales[k + 1];
                                                                    }

                                                                    totalVentas--;
                                                                    eliminado = true;
                                                                    System.out.println("Venta eliminada");
                                                                    break;
                                                                }
                                                            }

                                                            if (!eliminado) {
                                                                System.out.println("No se encontró la venta");
                                                            }
                                                            break;

                                                        case 0:
                                                            System.out.println("Saliendo del sistema...");
                                                            break;

                                                        default:
                                                            System.out.println("Opción no válida");
                                                    }

                                                } while (opcion != 0);
                                                break;
                                            case 7:
                                                do {
                                                    System.out.println("""
                                                            ======================================
                                                            |      MÉTODOS DE PAGO CLIENTE       |
                                                            ======================================
                                                            |    1) Agregar Método de Pago       |
                                                            |    2) Ver Métodos de Pago          |
                                                            |    3) Actualizar Método de Pago    |
                                                            |    4) Eliminar Método de Pago      |
                                                            |    5) Salir                        |
                                                            ======================================
                                                            """);
                                                    opcion = sc.nextInt();
                                                    sc.nextLine();

                                                    if (opcion == 1) {
                                                        if (totalMetodos < metodosPago.length) {
                                                            System.out.print("Ingrese metodo de pago: ");
                                                            metodosPago[totalMetodos] = sc.nextLine();
                                                            totalMetodos++;
                                                        }
                                                    }

                                                    else if (opcion == 2) {
                                                        for (int j = 0; j < totalMetodos; j++) {
                                                            System.out.println((j + 1) + ". " + metodosPago[j]);
                                                        }
                                                    }

                                                    else if (opcion == 3) {
                                                        System.out.print("Numero del metodo a actualizar: ");
                                                        pos = sc.nextInt() - 1;
                                                        sc.nextLine();

                                                        if (pos >= 0 && pos < totalMetodos) {
                                                            System.out.print("Nuevo metodo: ");
                                                            metodosPago[pos] = sc.nextLine();
                                                        }
                                                    }

                                                    else if (opcion == 4) {
                                                        System.out.print("Numero del metodo a eliminar: ");
                                                        pos = sc.nextInt() - 1;

                                                        if (pos >= 0 && pos < totalMetodos) {
                                                            for (int j = pos; j < totalMetodos - 1; j++) {
                                                                metodosPago[j] = metodosPago[j + 1];
                                                            }
                                                            totalMetodos--;
                                                        }
                                                    }

                                                } while (opcion != 5);
                                                break;
                                            case 8:
                                                do {
                                                    System.out.println("""
                                                            ================================
                                                            |   PROMOCIONES / DESCUENTOS   |
                                                            ================================
                                                            |    1) Agregar promoción      |
                                                            |    2) Ver promociones        |
                                                            |    3) Eliminar promoción     |
                                                            |    4) Salir                  |
                                                            ================================
                                                            """);

                                                    opcion = sc.nextInt();
                                                    sc.nextLine();

                                                    if (opcion == 1) {
                                                        if (totalPromos < promociones.length) {
                                                            System.out.print("Ingrese promocion: ");
                                                            promociones[totalPromos] = sc.nextLine();
                                                            totalPromos++;
                                                        }
                                                    }

                                                    else if (opcion == 2) {
                                                        for (int j = 0; j < totalPromos; j++) {
                                                            System.out.println((j + 1) + ". " + promociones[j]);
                                                        }
                                                    }

                                                    else if (opcion == 3) {
                                                        System.out.print("Numero de la promocion a actualizar: ");
                                                        pos = sc.nextInt() - 1;
                                                        sc.nextLine();

                                                        if (pos >= 0 && pos < totalPromos) {
                                                            System.out.print("Nueva promocion: ");
                                                            promociones[pos] = sc.nextLine();
                                                        }
                                                    }

                                                    else if (opcion == 4) {
                                                        System.out.print("Numero de la promocion a eliminar: ");
                                                        pos = sc.nextInt() - 1;

                                                        if (pos >= 0 && pos < totalPromos) {
                                                            for (int j = pos; j < totalPromos - 1; j++) {
                                                                promociones[j] = promociones[j + 1];
                                                            }
                                                            totalPromos--;
                                                        }
                                                    }

                                                } while (opcion != 5);
                                                break;
                                            case 0:
                                                System.out.println("Sesión cerrada correctamente");
                                            break;
                                            default:
                                                System.out.println("Opcion invalida, favor ingresela nuevamente");
                                            break;
                                        }
                                    }while (admin != 0);
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
                        System.out.println("Ingrese correo:");
                        email = sc.nextLine();
                        System.out.println("Ingrese contraseña:");
                        contrasenia = sc.nextLine();
                        for (int i = 0; i < emailsUsuarios.length; i++) {
                            if (email.equalsIgnoreCase(emailsUsuarios[i]) && contrasenia.equals(contraseniasUsuarios[i])) {
                                do {
                                    System.out.println("\nBienvenido " + nombresUsuarios[i]);
                                    System.out.println("""
                                                ===================================
                                                |          MENÚ CLIENTE           |
                                                ===================================
                                                |    1) Ver perfil                |
                                                |    2) Ver productos             |
                                                |    3) Ver carrito               |
                                                |    4) Ver pedidos               |
                                                |    0) Cerrar Sesión             |
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
                                                |    1) Ver datos del perfil         |
                                                |    2) Cambiar nombre               |
                                                |    3) Cambiar correo               |
                                                |    4) Agregar dirección            |
                                                |    5) Cambiar contraseña           |
                                                |    6) Atras                        |
                                                ======================================
                                                """);
                                                perfilCliente = sc.nextInt();
                                                sc.nextLine();
                                                switch (perfilCliente) {
                                                    case 1:
                                                        System.out.println("\nNombre: " + nombresUsuarios[i] +
                                                                "\nCorreo: " + emailsUsuarios[i] +
                                                                "\nDirección de residencia: " + direccionUsuarios[i]);
                                                        break;
                                                    case 2:
                                                        System.out.println("\nSeñor usuario, su nombre actual es: " + nombresUsuarios[i] +
                                                                "\nIngrese el nombre a actualizar");
                                                        nombre = sc.nextLine();
                                                        nombresUsuarios[i] = nombre;
                                                        System.out.println("El nombre fue actualizado correctamente");
                                                        break;
                                                    case 3:
                                                        System.out.println("\nSeñor " + nombresUsuarios[i] + " su correo actual es: " + emailsUsuarios[i] +
                                                                "\nIngrese el correo a actualizar");
                                                        email = sc.nextLine();
                                                        emailsUsuarios[i] = email;
                                                        System.out.println("El correo fue actualizado correctamente");
                                                        break;
                                                    case 4:
                                                        if (direccionUsuarios[i] == null){
                                                            System.out.println("Señor " + nombresUsuarios[i] + " actualmente no registra una dirección en el sistema" +
                                                                    "\nDesea añadir una dirección para el envío de sus productos (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("Señor " + nombresUsuarios[i] + " la opcion es invalida, vuelva a ingresarla" +
                                                                        "\nActualmente no registra una dirección en el sistema" +
                                                                        "\nDesea añadir una dirección para el envío de sus productos (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                            if (!seguir.equals("n")){
                                                                System.out.println("Ingrese la dirección a registrar: ");
                                                                direccionUsuarios[i] = sc.nextLine();
                                                                System.out.println("La dirección fue registrada correctamente");
                                                            }
                                                        }else {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " la dirección actual es :" +
                                                                    "\nIngrese la dirección a actualizar");
                                                            direccionUsuarios[i] = sc.nextLine();
                                                            System.out.println("La dirección fue agregada correctamente");
                                                        }
                                                        break;
                                                    case 5:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " ingrese la nueva contraseña a actualizar:");
                                                        contrasenia = sc.nextLine();
                                                        contraseniasUsuarios[i] = contrasenia;
                                                        System.out.println("La contraseña fue actualizada correctamente");
                                                        break;
                                                    case 6:
                                                        break;
                                                    default:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                }
                                            }while (perfilCliente != 6);
                                            break;
                                        case 2:
                                            do {
                                                System.out.println("""
                                                ======================================
                                                |             PRODUCTOS              |
                                                ======================================
                                                |    1) Ver Productos                |
                                                |    2) Buscar producto              |
                                                |    3) Comprar producto             |
                                                |    4) Atras                        |
                                                ======================================
                                                """);
                                                productosCliente = sc.nextInt();
                                                sc.nextLine();
                                                switch (productosCliente) {
                                                    case 1:
                                                        for (int j = 0; j < codigoProductos.length; j++) {
                                                            if (codigoProductos[j] != 0) {
                                                                clientesregistrados = true;
                                                                System.out.println("\nCodigo: " + codigoProductos[j] +
                                                                        "\nNombre: " + nombreProductos[j] +
                                                                        "\nMarca: " + marcasProductos[j] +
                                                                        "\nColor: " + coloresProductos[j] +
                                                                        "\nTalla: " + tallasProductos[j] +
                                                                        "\nStock: " + stocksProductos[j] +
                                                                        "\nPrecio: " + precioProductos[j]);
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " no hay productos disponibles");
                                                        }
                                                        clientesregistrados = false;
                                                        break;
                                                    case 2:
                                                        for (int j = 0; j < codigoProductos.length; j++) {
                                                            if (codigoProductos[j] != 0) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " no hay productos disponibles");
                                                            break;
                                                        }
                                                        clientesregistrados = false;

                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " ingrese el codigo del producto que desea buscar:");
                                                            codigoProducto = sc.nextInt();
                                                            sc.nextLine();
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProducto == codigoProductos[j]) {
                                                                    clientesregistrados = true;
                                                                    System.out.println("\nCodigo: " + codigoProductos[j] +
                                                                            "\nNombre: " + nombreProductos[j] +
                                                                            "\nMarca: " + marcasProductos[j] +
                                                                            "\nColor: " + coloresProductos[j] +
                                                                            "\nTalla: " + tallasProductos[j] +
                                                                            "\nStock: " + stocksProductos[j] +
                                                                            "\nPrecio: " + precioProductos[j]);
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("Producto no encontrado");
                                                            }
                                                            clientesregistrados = false;

                                                            System.out.println("Señor " + nombresUsuarios[i] + " desea buscar otro producto (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                                System.out.println("desea buscar otro producto (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                        break;
                                                    case 3:
                                                        for (int j = 0; j < codigoProductos.length; j++) {
                                                            if (codigoProductos[j] != 0) {
                                                                clientesregistrados = true;
                                                                break;
                                                            }
                                                        }
                                                        if (!clientesregistrados) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " no hay productos disponibles");
                                                            break;
                                                        }
                                                        clientesregistrados = false;
                                                        while (!seguir.equals("n")) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " ingrese el codigo del producto que desea comprar:");
                                                            codigoProducto = sc.nextInt();
                                                            sc.nextLine();
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProducto == codigoProductos[j]) {
                                                                    encontrado = true;
                                                                    System.out.println("\nCodigo: " + codigoProductos[j] +
                                                                            "\nNombre: " + nombreProductos[j] +
                                                                            "\nMarca: " + marcasProductos[j] +
                                                                            "\nColor: " + coloresProductos[j] +
                                                                            "\nTalla: " + tallasProductos[j] +
                                                                            "\nStock: " + stocksProductos[j] +
                                                                            "\nPrecio: " + precioProductos[j]);
                                                                    if (stocksProductos[j] > 0) {
                                                                        System.out.println("Señor " + nombresUsuarios[i] + " que cantidad del producto desea comprar:");
                                                                        stockProducto = sc.nextInt();
                                                                        sc.nextLine();
                                                                        if (stockProducto <= stocksProductos[j] && stockProducto > 0) {
                                                                            for (int k = 0; k < carritoProductos.length; k++) {
                                                                                if (carritoProductos[k] == null) {
                                                                                    carritoProductos[k] = nombreProductos[j];
                                                                                    carritoCodigos[k] = codigoProductos[j];
                                                                                    carritoCantidades[k] = stockProducto;
                                                                                    stocksProductos[j] = stocksProductos[j] - stockProducto;
                                                                                    System.out.println("Señor " + nombresUsuarios[i] + " el producto fue agregado al carrito correctamente");
                                                                                    break;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            System.out.println("Señor " + nombresUsuarios[i] + " la cantidad a comprar es invalida" +
                                                                                    "Asegurese de que la cantidad a comprar sea mayor a 0 y menor o igual al stock disponible");
                                                                        }
                                                                    } else {
                                                                        System.out.println("Señor " + nombresUsuarios[i] + " para el producto que sedea comprar no se encuentra por el momento stock disponible");
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            if (!encontrado) {
                                                                System.out.println("Señor " + nombresUsuarios[i] + " el codigo del producto ingresado no se encuentra registrado en el inventario");
                                                            }
                                                            encontrado = false;
                                                            System.out.println("Desea comprar otro producto (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                                System.out.println("Desea comprar otro producto (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                        }
                                                        seguir = "s";
                                                        break;
                                                    case 4:
                                                        break;
                                                    default:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                }
                                            }while (productosCliente != 4);
                                            break;
                                        case 3:
                                            do {
                                                for (int j = 0; j < carritoProductos.length; j++) {
                                                    if (carritoProductos[j] != null) {
                                                        carritoProducto = true;
                                                        break;
                                                    }
                                                }
                                                if (!carritoProducto) {
                                                    System.out.println("Señor " + nombresUsuarios[i] + " el carrito está vacío");
                                                    break;
                                                }
                                                System.out.println("""
                                                ==========================================
                                                |                CARRITO                 |
                                                ==========================================
                                                |    1) Ver carrito                      |
                                                |    2) Remover producto del carrito     |
                                                |    3) Vaciar carrito                   |
                                                |    4) Confirmar compra                 |
                                                |    5) Atras                            |
                                                ==========================================
                                                """);
                                                carritoCliente = sc.nextInt();
                                                sc.nextLine();
                                                switch (carritoCliente) {
                                                    case 1:
                                                        for (int j = 0; j < carritoProductos.length; j++) {
                                                            if (carritoProductos[j] != null) {
                                                                System.out.println("\nNombre del producto: " + carritoProductos[j] +
                                                                        "\nCodigo: " + carritoCodigos[j] +
                                                                        "\nCantidad: " + carritoCantidades[j]);
                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                    if (carritoCodigos[j] == codigoProductos[k]) {
                                                                        System.out.println("Precio unitario: " + precioProductos[k] + "\nSubtotal: " + (precioProductos[k] * carritoCantidades[j]));
                                                                        totalCarrito += precioProductos[k] * carritoCantidades[j];
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        System.out.println("\nSeñor " + nombresUsuarios[i] + " el total a pagar del carrito es: " + totalCarrito);
                                                        totalCarrito = 0;
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese el codigo del producto que desea remover del carrito:");
                                                        codigoProducto = sc.nextInt();
                                                        sc.nextLine();
                                                        for (int j = 0; j < carritoProductos.length; j++) {
                                                            if (carritoCodigos[j] == codigoProducto) {
                                                                encontrado = true;
                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                    if (carritoCodigos[j] == codigoProductos[k]) {
                                                                        stocksProductos[k] += carritoCantidades[j];
                                                                        break;
                                                                    }
                                                                }
                                                                carritoProductos[j] = null;
                                                                carritoCodigos[j] = 0;
                                                                carritoCantidades[j] = 0;
                                                                System.out.println("Señor " + nombresUsuarios[i] + " el producto fue removido del carrito correctamente");
                                                                break;
                                                            }
                                                        }
                                                        if (!encontrado) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " el codigo del producto no se encuentra en el carrito");
                                                        }
                                                        encontrado = false;
                                                        break;
                                                    case 3:
                                                        for (int j = 0; j < carritoProductos.length; j++) {
                                                            if (carritoProductos[j] != null) {
                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                    if (carritoCodigos[j] == codigoProductos[k]) {
                                                                        stocksProductos[k] += carritoCantidades[j];
                                                                        break;
                                                                    }
                                                                }
                                                                carritoProductos[j] = null;
                                                                carritoCodigos[j] = 0;
                                                                carritoCantidades[j] = 0;
                                                            }
                                                        }
                                                        System.out.println("Carrito vaciado correctamente");
                                                        break;
                                                    case 4:
                                                        for (int j = 0; j < carritoProductos.length; j++) {
                                                            if (carritoProductos[j] != null) {
                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                    if (carritoCodigos[j] == codigoProductos[k]) {
                                                                        totalCarrito += precioProductos[k] * carritoCantidades[j];
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (totalCarrito > 0) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " el total a pagar es: " + totalCarrito);
                                                            System.out.println("Desea confirmar la compra (s/n)");
                                                            seguir = sc.nextLine();
                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                                System.out.println("Desea confirmar la compra (s/n)");
                                                                seguir = sc.nextLine();
                                                            }
                                                            if (seguir.equals("s")) {
                                                                for (int j = 0; j < carritoProductos.length; j++) {
                                                                    if (carritoProductos[j] != null) {
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idsPedido[k] == 0) {
                                                                                idsPedido[k] = contadorId;
                                                                                productosComprados[k] = carritoProductos[j];
                                                                                codigosPedidos[k] = carritoCodigos[j];
                                                                                cantidades[k] = carritoCantidades[j];
                                                                                estados[k] = "Pendiente";
                                                                                contadorId++;
                                                                                break;
                                                                            }
                                                                        }
                                                                        carritoProductos[j] = null;
                                                                        carritoCodigos[j] = 0;
                                                                        carritoCantidades[j] = 0;
                                                                    }
                                                                }
                                                                System.out.println("Señor " + nombresUsuarios[i] + " la compra fue realizada correctamente");
                                                                seguir = "s";
                                                            } else {
                                                                seguir = "s";
                                                            }
                                                        } else {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " el carrito está vacío");
                                                        }
                                                        break;
                                                    case 5:
                                                        break;
                                                    default:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                }
                                            }while (carritoCliente != 5);
                                            break;
                                        case 4:
                                            do {
                                                for (int j = 0; j < idsPedido.length; j++) {
                                                    if (idsPedido[j] != 0) {
                                                        clientePedido = true;
                                                        break;
                                                    }
                                                }
                                                if (!clientePedido) {
                                                    System.out.println("Señor " + nombresUsuarios[i] + " no hay pedidos registrados");
                                                    break;
                                                }
                                                System.out.println("""
                                                        =============================
                                                        |          PEDIDOS          |
                                                        =============================
                                                        |    1) Ver pedidos         |
                                                        |    2) Buscar pedido       |
                                                        |    3) Cancelar pedido     |
                                                        |    4) Atras               |
                                                        =============================
                                                        """);
                                                clientePedidos = sc.nextInt();
                                                sc.nextLine();
                                                switch (clientePedidos) {
                                                    case 1:
                                                        for (int j = 0; j < idsPedido.length; j++) {
                                                            if (idsPedido[j] != 0) {
                                                                System.out.println("\nID del Pedido: " + idsPedido[j] +
                                                                        "\nNombre del producto: " + productosComprados[j] +
                                                                        "\nCantidad: " + cantidades[j] +
                                                                        "\nEstado: " + estados[j]);
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " ingrese ID del pedido que desea buscar:");
                                                        codigoProducto = sc.nextInt();
                                                        sc.nextLine();
                                                        for (int j = 0; j < idsPedido.length; j++) {
                                                            if (codigoProducto == idsPedido[j]) {
                                                                encontrado = true;
                                                                System.out.println("\nID del Pedido: " + idsPedido[j] +
                                                                        "\nProducto: " + productosComprados[j] +
                                                                        "\nCantidad: " + cantidades[j] +
                                                                        "\nEstado: " + estados[j]);
                                                                break;
                                                            }
                                                        }
                                                        if (!encontrado) {
                                                            System.out.println("Señor " + nombresUsuarios[i] + " el ID del pedido no se encuentra registrado en el sistema");
                                                        }
                                                        encontrado = false;
                                                        break;
                                                    case 3:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " ingrese el ID del pedido a cancelar:");
                                                        idCancelar = sc.nextInt();
                                                        sc.nextLine();
                                                        for (int j = 0; j < idsPedido.length; j++) {
                                                            if (idCancelar == idsPedido[j] && estados[j].equals("Pendiente")) {
                                                                encontrado = true;
                                                                System.out.println("Señor " + nombresUsuarios[i] + " confirma la cancelación del pedido (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                                    System.out.println("Confirma la cancelación del pedido (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                                if (!seguir.equals("n")) {
                                                                    for (int k = 0; k < codigoProductos.length; k++) {
                                                                        if (codigosPedidos[j] == codigoProductos[k]) {
                                                                            stocksProductos[k] += cantidades[j];
                                                                            break;
                                                                        }
                                                                    }
                                                                    idsPedido[j] = 0;
                                                                    productosComprados[j] = null;
                                                                    cantidades[j] = 0;
                                                                    estados[j] = null;
                                                                    codigosPedidos[j] = 0;
                                                                    System.out.println("Señor " + nombresUsuarios[i] + " el pedido fue cancelado correctamente");
                                                                } else {
                                                                    System.out.println("Señor " + nombresUsuarios[i] + " la cancelación no fue aprobada");
                                                                }
                                                                break;
                                                            } else {
                                                                if (j == (idsPedido.length - 1) && !encontrado) {
                                                                    System.out.println("Señor " + nombresUsuarios[i] + " el pedido no se encuentra registrado en el sistema");
                                                                }
                                                            }
                                                        }
                                                        encontrado = false;
                                                        break;
                                                    case 4:
                                                        break;
                                                    default:
                                                        System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                                }
                                            }while (clientePedidos != 4);
                                            break;
                                        case 0:
                                            System.out.println("Sesión cerrada correctamente");
                                            break;
                                        default:
                                            System.out.println("Señor " + nombresUsuarios[i] + " la opción es inválida, vuelva a ingresarla");
                                    }
                                }while (cliente != 0);
                                seguir = "n";
                                break;
                            } else {
                                if (i == (emailsUsuarios.length - 1)) {
                                    System.out.println("Credenciales incorrectas");
                                    System.out.println("Intentar de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("Opción inválida");
                                        System.out.println("Intentar de nuevo (s/n)");
                                        seguir = sc.nextLine();
                                    }
                                }
                            }
                        }
                    }
                    seguir = "s";
                    break;
                case 0:
                    System.out.println("Muchas gracias por visitarnos, vuelva pronto");
                    break;
                default:
                    System.out.println("Señor usuario la opcion es invalida, vuelva a ingresarla");
                    break;
            }
        } while(tipoUsuario != 0);
    }
}
