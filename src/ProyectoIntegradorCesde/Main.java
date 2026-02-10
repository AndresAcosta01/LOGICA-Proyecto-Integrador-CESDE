package ProyectoIntegradorCesde;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        int n = 100;
        Scanner sc = new Scanner(System.in);
        String[] nombresUsuarios = new String[n];
        String[] emailsUsuarios = new String[n];
        String[] contraseniasUsuarios = new String[n];
        String[] rolesUsuarios = new String[n];
        String[] nombreProductos = new String[n];
        String[] coloresProductos = new String[n];
        String[] marcasProductos = new String[n];
        String[] tallasProductos = new String[n];
        String[] emailProveedores = new String[n];
        String[] direccionProveedores = new String[n];
        String[] nombreCategorias = new String[n];
        String[] descripcionCategorias = new String[n];
        String[] estadoPedidos = new String[n];
        String[] fechaPedidos = new String[n];
        String[] nombreProveedores = new String[n];
        String[] direccionUsuarios = new String[n];
        String[] emailsPedidos = new String[n];
        String[] motivosDevoluciones = new String[n];
        String[] estadoDevoluciones = new String[n];
        String[] nombreMetodosPagos = new String[n];
        String[] tipoMetodosPagos = new String[n];
        String[] nombrePromociones = new String[n];
        String[] descripcionPromociones = new String[n];
        String[] fechaInicioPromociones = new String[n];
        String[] fechaFinPromociones = new String[n];
        String[] estadoPromociones = new String[n];
        int[] idPromocionesPedidos = new int[n];
        int[] idProductos = new int[n];
        int[] idsMetodosPedidos = new int[n];
        int[] proveedorProductos = new int[n];
        int[] categoriaPromociones = new int[n];
        int[] categoriaProductos = new int[n];
        int[] stocksProductos = new int[n];
        int[] codigoProductos = new int[n];
        int[] idsPedido = new int[n];
        int[] idPromociones = new int[n];
        int[] idPedidoDevolucion = new int[n];
        int[] idProveedores = new int[n];
        int[] idMetodosPagos = new int[n];
        long[] telefonoProveedores = new long[n];
        int[] idDevoluciones = new int[n];
        int[] idCategorias = new int[n];
        long[] celularUsuarios = new long[n];
        int[] cantidadPedidos = new int[n];
        long[] numeroCuentas = new long[n];
        double[] precioProductos = new double[n];
        double[] totalPedidos = new double[n];
        double[] porcentajePromociones = new double[n];
        int tipoUsuario = 0, admin = 0, adminClientes = 0, actualizarCliente = 0, adminProductos = 0,
                actualizarProducto = 0, codigoProducto = 0, stockProducto = 0, idPedido = 0, stockDisponible = 0,
                cantidadPedido = 0, adminPedido = 0, diferenciaCantidades = 0, cantidadAnterior = 0, opcionEstado = 0, adminCategoria = 0,
                idCategoria = 0, actualizarCategoria = 0, adminProveedor = 0, idProveedor = 0, actualizarProveedor = 0,
                adminDevolucion = 0, idDevolucion = 0, actualizarDevolucion = 0, adminMetodoPagos = 0, adminPromocionesDescuentos = 0,
                idMetodoPago = 0, actualizarMetodoPago = 0, idPromocion = 0, actualizarPromocion = 0;
        long numeroCuenta = 0, celularUsuario = 0, telefonoProveedor = 0;
        double precioProducto = 0, precioUnitario = 0, totalPedido = 0, porcentajePromocion = 0, descuento = 0;
        String email = "", contrasenia = "", seguir = "", nombre = "", nombreProducto = "", marca = "", colorProducto = "",
                tallaProducto = "", direccionUsuario = "", rolUsuario = "", fechaPedido = "", estadoPedido = "", nombreUsuario = "",
                nombreCategoria = "", descripcionCategoria = "", nombreProveedor = "", emailProveedor = "", direccionProveedor = "",
                motivoDevolucion = "", estadoDevolucion = "", nombreMetodoPago = "", tipoMetodoPago = "", nombrePromocion = "",
                descripcionPromocion = "", fechaInicioPromocion = "", fechaFinPromocion = "", estadoPromocion = "";
        boolean clientesregistrados = false, correoExistente = true, verificarUsuario = false, maximoUsuario = true, maximoProducto = false,
                productoExistente = false, pedidoRegistrado = false, categoriaRegistrada = false, proveedorRegistrado = false,
                devolucionRegistrada = false, metodoPagoRegistrado = false, promocionRegistrada = false, productoRegistrado = false;

        nombresUsuarios[0] = "1";
        emailsUsuarios[0] = "1";
        contraseniasUsuarios[0] = "1";
        rolesUsuarios[0] = "admin";
        direccionUsuarios[0] = "Calle 1 #10-20";
        celularUsuarios[0] = 3001234567L;

        nombresUsuarios[1] = "Daniel";
        emailsUsuarios[1] = "daniel@gmail.com";
        contraseniasUsuarios[1] = "123";
        rolesUsuarios[1] = "admin";
        direccionUsuarios[1] = "Carrera 50 #25-30";
        celularUsuarios[1] = 3012345678L;

        nombresUsuarios[2] = "Alejandro";
        emailsUsuarios[2] = "alejandro@gmail.com";
        contraseniasUsuarios[2] = "123";
        rolesUsuarios[2] = "admin";
        direccionUsuarios[2] = "Avenida 80 #45-60";
        celularUsuarios[2] = 3023456789L;

        nombresUsuarios[3] = "Jose";
        emailsUsuarios[3] = "jose@gmail.com";
        contraseniasUsuarios[3] = "123";
        rolesUsuarios[3] = "admin";
        direccionUsuarios[3] = "Calle 100 #15-25";
        celularUsuarios[3] = 3034567890L;

        nombresUsuarios[4] = "Alexander";
        emailsUsuarios[4] = "profe@gmail.com";
        contraseniasUsuarios[4] = "123";
        rolesUsuarios[4] = "cliente";
        direccionUsuarios[4] = "Transversal 20 #30-40";
        celularUsuarios[4] = 3045678901L;

        idCategorias[0] = 1;
        nombreCategorias[0] = "Camisas";
        descripcionCategorias[0] = "Camisas casuales y formales para toda ocasión";

        idCategorias[1] = 2;
        nombreCategorias[1] = "Pantalones";
        descripcionCategorias[1] = "Pantalones de mezclilla, formales y deportivos";

        idCategorias[2] = 3;
        nombreCategorias[2] = "Chaquetas";
        descripcionCategorias[2] = "Chaquetas para clima frío y lluvia";

        idCategorias[3] = 4;
        nombreCategorias[3] = "Zapatos";
        descripcionCategorias[3] = "Calzado deportivo, casual y formal";

        idProveedores[0] = 1;
        nombreProveedores[0] = "Textiles del Norte";
        emailProveedores[0] = "ventas@textilesnorte.com";
        telefonoProveedores[0] = 6012345678L;
        direccionProveedores[0] = "Zona Industrial Norte, Bodega 15";

        idProveedores[1] = 2;
        nombreProveedores[1] = "Importadora Fashion";
        emailProveedores[1] = "contacto@fashionimport.com";
        telefonoProveedores[1] = 6023456789L;
        direccionProveedores[1] = "Centro Comercial Mayorista, Local 230";

        idProveedores[2] = 3;
        nombreProveedores[2] = "Distribuidora Moda Express";
        emailProveedores[2] = "info@modaexpress.com";
        telefonoProveedores[2] = 6034567890L;
        direccionProveedores[2] = "Avenida 68 #45-90, Bodega 8";

        idProveedores[3] = 4;
        nombreProveedores[3] = "Confecciones Premium";
        emailProveedores[3] = "ventas@confeccionespremium.com";
        telefonoProveedores[3] = 6045678901L;
        direccionProveedores[3] = "Parque Industrial Sur, Manzana C";

        codigoProductos[0] = 1;
        nombreProductos[0] = "Camisa Nike Deportiva";
        marcasProductos[0] = "Nike";
        coloresProductos[0] = "Azul";
        tallasProductos[0] = "M";
        stocksProductos[0] = 50;
        precioProductos[0] = 89900;
        categoriaProductos[0] = 1;  // Categoría: Camisas
        proveedorProductos[0] = 1;  // Proveedor: Textiles del Norte

        codigoProductos[1] = 2;
        nombreProductos[1] = "Jeans Levi's Clásico";
        marcasProductos[1] = "Levi's";
        coloresProductos[1] = "Negro";
        tallasProductos[1] = "32";
        stocksProductos[1] = 30;
        precioProductos[1] = 159900;
        categoriaProductos[1] = 2;  // Categoría: Pantalones
        proveedorProductos[1] = 2;  // Proveedor: Importadora Fashion

        codigoProductos[2] = 3;
        nombreProductos[2] = "Chaqueta Adidas Impermeable";
        marcasProductos[2] = "Adidas";
        coloresProductos[2] = "Rojo";
        tallasProductos[2] = "L";
        stocksProductos[2] = 25;
        precioProductos[2] = 249900;
        categoriaProductos[2] = 3;  // Categoría: Chaquetas
        proveedorProductos[2] = 3;  // Proveedor: Distribuidora Moda Express

        codigoProductos[3] = 4;
        nombreProductos[3] = "Tenis Puma Running";
        marcasProductos[3] = "Puma";
        coloresProductos[3] = "Blanco";
        tallasProductos[3] = "42";
        stocksProductos[3] = 40;
        precioProductos[3] = 199900;
        categoriaProductos[3] = 4;  // Categoría: Zapatos
        proveedorProductos[3] = 4;  // Proveedor: Confecciones Premium

        idMetodosPagos[0] = 1;
        nombreMetodosPagos[0] = "Bancolombia";
        tipoMetodosPagos[0] = "ahorro";
        numeroCuentas[0] = 123456789012L;

        idMetodosPagos[1] = 2;
        nombreMetodosPagos[1] = "Davivienda";
        tipoMetodosPagos[1] = "corriente";
        numeroCuentas[1] = 234567890123L;

        idMetodosPagos[2] = 3;
        nombreMetodosPagos[2] = "Nequi";
        tipoMetodosPagos[2] = "ahorro";
        numeroCuentas[2] = 345678901234L;

        idMetodosPagos[3] = 4;
        nombreMetodosPagos[3] = "Daviplata";
        tipoMetodosPagos[3] = "ahorro";
        numeroCuentas[3] = 456789012345L;

        idPromociones[0] = 1;
        nombrePromociones[0] = "Descuento Camisas Verano";
        descripcionPromociones[0] = "20% de descuento en todas las camisas";
        porcentajePromociones[0] = 20.0;
        fechaInicioPromociones[0] = "01/01/2025";
        fechaFinPromociones[0] = "31/03/2025";
        estadoPromociones[0] = "activa";
        categoriaPromociones[0] = 1;  // Categoría: Camisas

        idPromociones[1] = 2;
        nombrePromociones[1] = "Black Friday Pantalones";
        descripcionPromociones[1] = "30% de descuento en pantalones seleccionados";
        porcentajePromociones[1] = 30.0;
        fechaInicioPromociones[1] = "15/11/2024";
        fechaFinPromociones[1] = "30/11/2024";
        estadoPromociones[1] = "inactiva";
        categoriaPromociones[1] = 2;  // Categoría: Pantalones

        idPromociones[2] = 3;
        nombrePromociones[2] = "Promoción Invierno";
        descripcionPromociones[2] = "25% de descuento en chaquetas";
        porcentajePromociones[2] = 25.0;
        fechaInicioPromociones[2] = "01/12/2024";
        fechaFinPromociones[2] = "28/02/2025";
        estadoPromociones[2] = "activa";
        categoriaPromociones[2] = 3;

        idPromociones[3] = 4;
        nombrePromociones[3] = "Calzado Deportivo";
        descripcionPromociones[3] = "15% de descuento en tenis y zapatos deportivos";
        porcentajePromociones[3] = 15.0;
        fechaInicioPromociones[3] = "01/02/2025";
        fechaFinPromociones[3] = "31/05/2025";
        estadoPromociones[3] = "activa";
        categoriaPromociones[3] = 4;  // Categoría: Zapatos

        idsPedido[0] = 1;
        emailsPedidos[0] = "profe@gmail.com";
        idProductos[0] = 1001;
        cantidadPedidos[0] = 2;
        idsMetodosPedidos[0] = 1;
        totalPedidos[0] = 179800;  // 89900 * 2
        fechaPedidos[0] = "05/01/2025";
        estadoPedidos[0] = "entregado";
        idPromocionesPedidos[0] = 0;  // Sin promoción

        idsPedido[1] = 2;
        emailsPedidos[1] = "profe@gmail.com";
        idProductos[1] = 1002;
        cantidadPedidos[1] = 1;
        idsMetodosPedidos[1] = 2;
        totalPedidos[1] = 159900;
        fechaPedidos[1] = "10/01/2025";
        estadoPedidos[1] = "procesado";
        idPromocionesPedidos[1] = 0;  // Sin promoción

        idsPedido[2] = 3;
        emailsPedidos[2] = "profe@gmail.com";
        idProductos[2] = 1003;
        cantidadPedidos[2] = 1;
        idsMetodosPedidos[2] = 3;
        totalPedidos[2] = 187425;  // 249900 * 0.75 (con 25% descuento)
        fechaPedidos[2] = "15/01/2025";
        estadoPedidos[2] = "enviado";
        idPromocionesPedidos[2] = 3;  // Promoción Invierno aplicada

        idsPedido[3] = 4;
        emailsPedidos[3] = "profe@gmail.com";
        idProductos[3] = 1004;
        cantidadPedidos[3] = 1;
        idsMetodosPedidos[3] = 4;
        totalPedidos[3] = 169915;  // 199900 * 0.85 (con 15% descuento)
        fechaPedidos[3] = "20/01/2025";
        estadoPedidos[3] = "pendiente";
        idPromocionesPedidos[3] = 4;  // Calzado Deportivo aplicado

        idDevoluciones[0] = 1;
        idPedidoDevolucion[0] = 1;
        motivosDevoluciones[0] = "Producto llegó con defecto de fábrica";
        estadoDevoluciones[0] = "aprobada";

        idDevoluciones[1] = 2;
        idPedidoDevolucion[1] = 2;
        motivosDevoluciones[1] = "Talla incorrecta, necesito cambio";
        estadoDevoluciones[1] = "pendiente";

        idDevoluciones[2] = 3;
        idPedidoDevolucion[2] = 3;
        motivosDevoluciones[2] = "No cumple con las expectativas";
        estadoDevoluciones[2] = "rechazada";

        idDevoluciones[3] = 4;
        idPedidoDevolucion[3] = 4;
        motivosDevoluciones[3] = "Color diferente al mostrado en la imagen";
        estadoDevoluciones[3] = "pendiente";

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
            switch (tipoUsuario) {
                case 1:
                    while (!seguir.equals("n")) {
                        System.out.println("Ingrese el correo electrónico:");
                        email = sc.nextLine();
                        System.out.println("Ingrese la contraseña:");
                        contrasenia = sc.nextLine();
                        for (int i = 0; i < emailsUsuarios.length; i++) {
                            if (email.equalsIgnoreCase(emailsUsuarios[i]) && contrasenia.equals(contraseniasUsuarios[i])) {
                                if (rolesUsuarios[i].equals("admin")) {
                                    verificarUsuario = true;
                                    do {
                                        System.out.println("\nBienvenido de nuevo " + nombresUsuarios[i]);
                                        System.out.println("""
                                                ================================================
                                                |                  MENÚ ADMIN                  |
                                                ================================================
                                                |    1) Administrar Clientes                   |
                                                |    2) Administrar Productos                  |
                                                |    3) Administrar Pedidos                    |
                                                |    4) Administrar Categorias                 |
                                                |    5) Administrar Proveedores                |
                                                |    6) Administrar Devoluciones               |
                                                |    7) Administrar Metodos de Pago            |
                                                |    8) Administrar Promociones/Descuentos     |
                                                |    0) Cerrar Sesión                          |
                                                ================================================
                                                """);
                                        admin = sc.nextInt();
                                        switch (admin) {
                                            case 1:
                                                do {
                                                    System.out.println("""
                                                            ================================================
                                                            |             ADMINISTRAR USUARIOS             |
                                                            ================================================
                                                            |    1) Crear nuevo usuario                    |
                                                            |    2) Buscar usuario por correo              |
                                                            |    3) Mostrar usuarios por rol               |
                                                            |    4) Mostrar datos de todos los usuarios    |
                                                            |    5) Actualizar usuarios                    |
                                                            |    6) Eliminar usuarios                      |
                                                            |    0) Atras                                  |
                                                            ================================================
                                                            """);
                                                    adminClientes = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminClientes) {
                                                        case 1:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] == null) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de usuarios");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (emailsUsuarios[j] == null) {
                                                                        seguir = "s";
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Nombre de usuario:");
                                                                            nombreUsuario = sc.nextLine();
                                                                            if (nombreUsuario.isBlank()) {
                                                                                System.out.println("El nombre no puede estar vacia" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    nombresUsuarios[j] = null;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                nombresUsuarios[j] = nombreUsuario;
                                                                                seguir = "n";
                                                                            }
                                                                        }

                                                                        if (nombresUsuarios[j] != null) {
                                                                            correoExistente = true;
                                                                            while (correoExistente) {
                                                                                System.out.println("Correo electrónico:");
                                                                                email = sc.nextLine();
                                                                                if (email.isBlank()) {
                                                                                    System.out.println("El correo no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("n")) {
                                                                                        correoExistente = true;
                                                                                    } else {
                                                                                        nombresUsuarios[j] = null;
                                                                                        correoExistente = false;
                                                                                    }
                                                                                } else {
                                                                                    correoExistente = false;
                                                                                    for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                                        if (email.equalsIgnoreCase(emailsUsuarios[k])) {
                                                                                            correoExistente = true;
                                                                                            System.out.println("El correo ya es existente favor ingresar uno diferente\nDesea ingresarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                            if (!seguir.equals("s")) {
                                                                                                nombresUsuarios[j] = null;
                                                                                                correoExistente = false;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!correoExistente) {
                                                                                        emailsUsuarios[j] = email;
                                                                                    }
                                                                                }
                                                                            }
                                                                            correoExistente = true;
                                                                        }
                                                                        seguir = "s";
                                                                        if (emailsUsuarios[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Contraseña:");
                                                                                contraseniasUsuarios[j] = sc.nextLine();
                                                                                if (contraseniasUsuarios[j].isBlank()) {
                                                                                    System.out.println("La contraseña no puede estar vacia\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        nombresUsuarios[j] = null;
                                                                                        emailsUsuarios[j] = null;
                                                                                        contraseniasUsuarios[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        if (contraseniasUsuarios[j] != null) {
                                                                            System.out.println("Desea registrar una dirección al usuario (s/n)");
                                                                            seguir = sc.nextLine();
                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                System.out.println("Desea registrar una dirección al usuario (s/n)");
                                                                                seguir = sc.nextLine();
                                                                            }
                                                                            if (!seguir.equals("n")) {
                                                                                while (!seguir.equals("n")) {
                                                                                    System.out.println("Ingrese la dirección:");
                                                                                    direccionUsuarios[j] = sc.nextLine();
                                                                                    if (direccionUsuarios[j].isBlank()) {
                                                                                        System.out.println("La dirección no puede estar vacia" +
                                                                                                "\nDesea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            nombresUsuarios[j] = null;
                                                                                            emailsUsuarios[j] = null;
                                                                                            contraseniasUsuarios[j] = null;
                                                                                            direccionUsuarios[j] = null;
                                                                                        }
                                                                                    } else {
                                                                                        seguir = "n";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (contraseniasUsuarios[j] != null) {
                                                                            System.out.println("Desea registrar un teléfono al usuario (s/n)");
                                                                            seguir = sc.nextLine();
                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                System.out.println("Desea registrar un teléfono al usuario (s/n)");
                                                                                seguir = sc.nextLine();
                                                                            }
                                                                            if (!seguir.equals("n")) {
                                                                                while (!seguir.equals("n")) {
                                                                                    System.out.println("Ingrese el teléfono:");
                                                                                    celularUsuarios[j] = sc.nextLong();
                                                                                    sc.nextLine();
                                                                                    if (celularUsuarios[j] == 0) {
                                                                                        System.out.println("El celular no puede ser 0" +
                                                                                                "\nDesea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            nombresUsuarios[j] = null;
                                                                                            emailsUsuarios[j] = null;
                                                                                            contraseniasUsuarios[j] = null;
                                                                                            direccionUsuarios[j] = null;
                                                                                            celularUsuarios[j] = 0;
                                                                                        }
                                                                                    } else {
                                                                                        seguir = "n";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }

                                                                        seguir = "s";
                                                                        if (contraseniasUsuarios[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Rol del usuario (admin/cliente):");
                                                                                rolesUsuarios[j] = sc.nextLine();
                                                                                if (rolesUsuarios[j].isBlank()) {
                                                                                    System.out.println("El rol no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        nombresUsuarios[j] = null;
                                                                                        emailsUsuarios[j] = null;
                                                                                        contraseniasUsuarios[j] = null;
                                                                                        direccionUsuarios[j] = null;
                                                                                        rolesUsuarios[j] = null;
                                                                                        celularUsuarios[j] = 0;
                                                                                    }
                                                                                } else if (!rolesUsuarios[j].equals("admin") && !rolesUsuarios[j].equals("cliente")) {
                                                                                    System.out.println("Rol invalido: Asegurese de escribir la palabra completa en minuscula" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (seguir.equals("n")) {
                                                                                        nombresUsuarios[j] = null;
                                                                                        emailsUsuarios[j] = null;
                                                                                        contraseniasUsuarios[j] = null;
                                                                                        direccionUsuarios[j] = null;
                                                                                        rolesUsuarios[j] = null;
                                                                                        celularUsuarios[j] = 0;
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }

                                                                        if (rolesUsuarios[j] != null) {
                                                                            System.out.println("El usuario fue creado correctamente");
                                                                        }
                                                                        break;
                                                                    }
                                                                }

                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (emailsUsuarios[j] == null) {
                                                                        System.out.println("Desea crear un nuevo usuario (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear un nuevo usuario (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
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
                                                                                "\nDirección: " + direccionUsuarios[j] +
                                                                                "\nCelular: " + celularUsuarios[j] +
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
                                                                System.out.println("Desea buscar otro usuario (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro usuario (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] != null) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay usuarios registrados en el sistema");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("""
                                                                        ==============================
                                                                        |    SELECCIONE EL ROL       |
                                                                        ==============================
                                                                        |        1) Admin            |
                                                                        |        2) Cliente          |
                                                                        ==============================
                                                                        """);
                                                                opcionEstado = sc.nextInt();
                                                                sc.nextLine();
                                                                switch (opcionEstado) {
                                                                    case 1:
                                                                        rolUsuario = "admin";
                                                                        break;
                                                                    case 2:
                                                                        rolUsuario = "cliente";
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                        continue;
                                                                }
                                                                System.out.println("""
                                                                        =========================================
                                                                                        USUARIOS
                                                                        =========================================
                                                                        """);
                                                                for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                    if (emailsUsuarios[j] != null && rolesUsuarios[j].equalsIgnoreCase(rolUsuario)) {
                                                                        clientesregistrados = true;
                                                                        System.out.println("\nNombre: " + nombresUsuarios[j] +
                                                                                "\nCorreo Electrónico: " + emailsUsuarios[j] +
                                                                                "\nContraseña: " + contraseniasUsuarios[j] +
                                                                                "\nDirección: " + direccionUsuarios[j] +
                                                                                "\nCelular: " + celularUsuarios[j] +
                                                                                "\nRol: " + rolesUsuarios[j]);
                                                                        System.out.println("-------------------------------------------");
                                                                    }
                                                                }
                                                                if (!clientesregistrados) {
                                                                    System.out.println("\nNo hay usuarios registrados con el rol: " + rolUsuario);
                                                                }
                                                                System.out.println("===========================================\n");
                                                                clientesregistrados = false;

                                                                System.out.println("Desea ver usuarios de otro rol (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea ver usuarios de otro rol (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < emailsUsuarios.length; j++) {
                                                                if (emailsUsuarios[j] != null) {
                                                                    clientesregistrados = true;
                                                                    System.out.println("\nNombre: " + nombresUsuarios[j] +
                                                                            "\nCorreo Electrónico: " + emailsUsuarios[j] +
                                                                            "\nContraseña: " + contraseniasUsuarios[j] +
                                                                            "\nDirección: " + direccionUsuarios[j] +
                                                                            "\nCelular: " + celularUsuarios[j] +
                                                                            "\nRol: " + rolesUsuarios[j] + "\n");
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("Señor admin, no hay usuarios registrados.");
                                                            }
                                                            clientesregistrados = false;
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
                                                                System.out.println("Ingrese el correo del usuario que deseea actualizar");
                                                                email = sc.nextLine();
                                                                if (email.isBlank()) {
                                                                    System.out.println("El correo no puede estar vacia" +
                                                                            "\nDesea intentarlo de nuevo (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                } else {
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
                                                                                        |   4) Direccion                  |
                                                                                        |   5) Celular                    |
                                                                                        |   6) Rol                        |
                                                                                        |   7) Actualizar otro usuario    |
                                                                                        |   0) Atras                      |
                                                                                        ===================================
                                                                                        """);
                                                                                actualizarCliente = sc.nextInt();
                                                                                sc.nextLine();

                                                                                switch (actualizarCliente) {
                                                                                    case 1:
                                                                                        while (!seguir.equals("n")) {
                                                                                            System.out.println("El nombre actual del usuario es: " + nombresUsuarios[j] +
                                                                                                    "\nIngrese el nuevo nombre:");
                                                                                            nombre = sc.nextLine();
                                                                                            if (nombre.isBlank()) {
                                                                                                System.out.println("El nombre no puede estar vacio" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                nombresUsuarios[j] = nombre;
                                                                                                System.out.println("Actualizacion exitosa");
                                                                                                seguir = "n";
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 2:
                                                                                        while (!seguir.equals("n")) {
                                                                                            System.out.println("El correo actual del usuario: " + nombresUsuarios[j] +
                                                                                                    " es: " + emailsUsuarios[j] +
                                                                                                    "\nIngrese el nuevo correo electronico:");
                                                                                            email = sc.nextLine();
                                                                                            if (email.isBlank()) {
                                                                                                System.out.println("El correo no puede estar vacio" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                                                    if (email.equalsIgnoreCase(emailsUsuarios[k])) {
                                                                                                        clientesregistrados = true;
                                                                                                        System.out.println("Actualizacion fallida: El correo electronico ingresado ya se encuentra registrado" +
                                                                                                                "\nDesea seguir con la actualizacion del correo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                            System.out.println("Desea seguir con la actualizacion (s/n)");
                                                                                                            seguir = sc.nextLine();
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (!clientesregistrados) {
                                                                                                    emailsUsuarios[j] = email;
                                                                                                    System.out.println("Actualizacion exitosa\n");
                                                                                                    seguir = "n";
                                                                                                }
                                                                                                clientesregistrados = false;
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 3:
                                                                                        while (!seguir.equals("n")) {
                                                                                            System.out.println("La contraseña actual del usuario: " + nombresUsuarios[j] +
                                                                                                    " es: " + contraseniasUsuarios[j] +
                                                                                                    "\nIngrese la nueva contraseña:");
                                                                                            contrasenia = sc.nextLine();
                                                                                            if (contrasenia.isBlank()) {
                                                                                                System.out.println("La contrasena no puede estar vacio" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                contraseniasUsuarios[j] = contrasenia;
                                                                                                System.out.println("Actualizacion exitosa");
                                                                                                seguir = "n";
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 4:
                                                                                        if (direccionUsuarios[j] == null || direccionUsuarios[j].isBlank()) {
                                                                                            System.out.println("El usuario no tiene ninguna direccion registrada" +
                                                                                                    "\nDesea registrarla (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea registrar una nueva direccion al usuario (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                            if (!seguir.equals("n")) {
                                                                                                while (!seguir.equals("n")) {
                                                                                                    System.out.println("Ingrese la direccion a registrar:");
                                                                                                    direccionUsuario = sc.nextLine();
                                                                                                    if (direccionUsuario.isBlank()) {
                                                                                                        System.out.println("La direccion no puede estar vacia" +
                                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                            seguir = sc.nextLine();
                                                                                                        }
                                                                                                    } else {
                                                                                                        direccionUsuarios[j] = direccionUsuario;
                                                                                                        System.out.println("Actualizacion exitosa");
                                                                                                        seguir = "n";
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            while (!seguir.equals("n")) {
                                                                                                System.out.println("La direccion actual del usuario " + nombresUsuarios[j] +
                                                                                                        " es: " + direccionUsuarios[j] +
                                                                                                        "\nIngrese la nueva direccion:");
                                                                                                direccionUsuario = sc.nextLine();
                                                                                                if (direccionUsuario.isBlank()) {
                                                                                                    System.out.println("La direccion no puede estar vacia" +
                                                                                                            "\nDesea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                    }
                                                                                                } else {
                                                                                                    direccionUsuarios[j] = direccionUsuario;
                                                                                                    System.out.println("Actualizacion exitosa");
                                                                                                    seguir = "n";
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 5:
                                                                                        if (celularUsuarios[j] == 0) {
                                                                                            System.out.println("El usuario no tiene ningún celular registrado" +
                                                                                                    "\nDesea registrarlo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea registrar un nuevo celular al usuario (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                            if (!seguir.equals("n")) {
                                                                                                while (!seguir.equals("n")) {
                                                                                                    System.out.println("Ingrese el celular a registrar:");
                                                                                                    celularUsuario = sc.nextLong();
                                                                                                    sc.nextLine();
                                                                                                    if (celularUsuario == 0) {
                                                                                                        System.out.println("El celular no puede estar vacio" +
                                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                            seguir = sc.nextLine();
                                                                                                        }
                                                                                                    } else {
                                                                                                        celularUsuarios[j] = celularUsuario;
                                                                                                        System.out.println("Actualizacion exitosa");
                                                                                                        seguir = "n";
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            while (!seguir.equals("n")) {
                                                                                                System.out.println("El celular actual del usuario " + nombresUsuarios[j] +
                                                                                                        " es: " + celularUsuarios[j] +
                                                                                                        "\nIngrese el nuevo celular:");
                                                                                                celularUsuario = sc.nextLong();
                                                                                                sc.nextLine();
                                                                                                if (celularUsuario == 0) {
                                                                                                    System.out.println("El celular no puede ser cero" +
                                                                                                            "\nDesea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                    }
                                                                                                } else {
                                                                                                    celularUsuarios[j] = celularUsuario;
                                                                                                    System.out.println("Actualizacion exitosa");
                                                                                                    seguir = "n";
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 6:
                                                                                        while (!seguir.equals("n")) {
                                                                                            System.out.println("El rol actual del usuario " + nombresUsuarios[j] +
                                                                                                    " es: " + rolesUsuarios[j] +
                                                                                                    "\nIngrese el nuevo rol (admin/cliente):");
                                                                                            rolUsuario = sc.nextLine();
                                                                                            if (rolUsuario.isBlank()) {
                                                                                                System.out.println("El rol no puede estar vacio" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else if (!rolUsuario.equals("admin") && !rolUsuario.equals("cliente")) {
                                                                                                System.out.println("Rol invalido: Asegurese de escribir la palabra completa en minuscula" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                rolesUsuarios[j] = rolUsuario;
                                                                                                System.out.println("Actualizacion exitosa");
                                                                                                seguir = "n";
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 7:
                                                                                        for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                                            if (emailsUsuarios[k] != null) {
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
                                                                                            System.out.println("Ingrese el correo del usuario que deseea actualizar");
                                                                                            email = sc.nextLine();
                                                                                            if (email.isBlank()) {
                                                                                                System.out.println("El correo no puede estar vacia" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                                                    if (email.equalsIgnoreCase(emailsUsuarios[k])) {
                                                                                                        clientesregistrados = true;
                                                                                                        j = k;
                                                                                                        seguir = "n";
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (!clientesregistrados) {
                                                                                                    System.out.println("El correo " + email + " no se encuentra registrado en el sistema" +
                                                                                                            "\nDesea buscar de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                    }
                                                                                                }
                                                                                                clientesregistrados = false;
                                                                                            }
                                                                                        }
                                                                                        seguir = "s";
                                                                                        break;
                                                                                    case 0:
                                                                                        System.out.println("Saliendo del menú actualizar usuarios");
                                                                                        seguir = "n";
                                                                                        break;
                                                                                    default:
                                                                                        System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                                        break;
                                                                                }
                                                                            } while (actualizarCliente != 0);
                                                                            clientesregistrados = true;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!clientesregistrados) {
                                                                        System.out.println("El usuario con el correo " + email +
                                                                                " no se encuentra registrado en el sistema" +
                                                                                "\nDesea buscar de nuevo (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                            System.out.println("Desea buscar de nuevo (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                    }
                                                                    clientesregistrados = false;
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 6:
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
                                                                        rolesUsuarios[j] = null;
                                                                        direccionUsuarios[j] = null;
                                                                        celularUsuarios[j] = 0;
                                                                        System.out.println("Eliminacion Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (emailsUsuarios.length - 1)) {
                                                                            System.out.println("El correo " + email +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otro cliente (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otro cliente (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar usuarios");
                                                            break;
                                                        default:
                                                            System.out.println("Opcion invalida, ingresela nuevamente");
                                                            break;
                                                    }
                                                } while (adminClientes != 0);
                                                break;
                                            case 2:
                                                do {
                                                    System.out.println("""
                                                            ====================================================
                                                            |             ADMINISTRAR PRODUCTOS                |
                                                            ====================================================
                                                            |    1) Crear nuevo producto                       |
                                                            |    2) Buscar producto                            |
                                                            |    3) Mostrar productos por categoría            |
                                                            |    4) Mostrar datos de todos los productos       |
                                                            |    5) Actualizar producto                        |
                                                            |    6) Eliminar producto                          |
                                                            |    0) Atras                                      |
                                                            ====================================================
                                                            """);
                                                    adminProductos = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminProductos) {
                                                        case 1:
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de productos");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProductos[j] == 0) {
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Codigo del producto:");
                                                                            codigoProductos[j] = sc.nextInt();
                                                                            sc.nextLine();
                                                                            if (codigoProductos[j] == 0) {
                                                                                System.out.println("El codigo no puede ser 0" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    codigoProductos[j] = 0;
                                                                                    System.out.println("Se ha cancelado el proceso de registro");
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                                    if (k != j && codigoProductos[j] == codigoProductos[k]) {
                                                                                        productoExistente = true;
                                                                                        System.out.println("El codigo " + codigoProductos[j] + " ya esta registrado en el sistema" +
                                                                                                "\nDesea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            codigoProductos[j] = 0;
                                                                                            System.out.println("Se ha cancelado el proceso de registro");
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (!productoExistente) {
                                                                                    seguir = "n";
                                                                                }
                                                                                productoExistente = false;
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (codigoProductos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Nombre del producto:");
                                                                                nombreProductos[j] = sc.nextLine();
                                                                                if (nombreProductos[j].isBlank()) {
                                                                                    System.out.println("El nombre no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (nombreProductos[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Marca del producto:");
                                                                                marcasProductos[j] = sc.nextLine();
                                                                                if (marcasProductos[j].isBlank()) {
                                                                                    System.out.println("La marca no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (marcasProductos[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Color del producto:");
                                                                                coloresProductos[j] = sc.nextLine();
                                                                                if (coloresProductos[j].isBlank()) {
                                                                                    System.out.println("El color no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (coloresProductos[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Talla del producto:");
                                                                                tallasProductos[j] = sc.nextLine();
                                                                                if (tallasProductos[j].isBlank()) {
                                                                                    System.out.println("La talla no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        tallasProductos[j] = null;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (tallasProductos[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Stock del producto:");
                                                                                stocksProductos[j] = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (stocksProductos[j] == 0) {
                                                                                    System.out.println("El stock no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        tallasProductos[j] = null;
                                                                                        stocksProductos[j] = 0;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (stocksProductos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Precio del producto:");
                                                                                precioProductos[j] = sc.nextDouble();
                                                                                sc.nextLine();
                                                                                if (precioProductos[j] == 0) {
                                                                                    System.out.println("El precio no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        tallasProductos[j] = null;
                                                                                        stocksProductos[j] = 0;
                                                                                        precioProductos[j] = 0;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (precioProductos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("ID de la categoría del producto:");
                                                                                idCategoria = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (idCategoria == 0) {
                                                                                    System.out.println("El ID de categoría no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        tallasProductos[j] = null;
                                                                                        stocksProductos[j] = 0;
                                                                                        precioProductos[j] = 0;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                                        if (idCategoria == idCategorias[k]) {
                                                                                            categoriaRegistrada = true;
                                                                                            categoriaProductos[j] = idCategoria;
                                                                                            seguir = "n";
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!categoriaRegistrada) {
                                                                                        System.out.println("La categoría con ID " + idCategoria + " no se encuentra registrada" +
                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            codigoProductos[j] = 0;
                                                                                            nombreProductos[j] = null;
                                                                                            marcasProductos[j] = null;
                                                                                            coloresProductos[j] = null;
                                                                                            tallasProductos[j] = null;
                                                                                            stocksProductos[j] = 0;
                                                                                            precioProductos[j] = 0;
                                                                                            System.out.println("Se ha cancelado el proceso de registro");
                                                                                        }
                                                                                    }
                                                                                    categoriaRegistrada = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (categoriaProductos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("ID del proveedor del producto:");
                                                                                idProveedor = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (idProveedor == 0) {
                                                                                    System.out.println("El ID del proveedor no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        codigoProductos[j] = 0;
                                                                                        nombreProductos[j] = null;
                                                                                        marcasProductos[j] = null;
                                                                                        coloresProductos[j] = null;
                                                                                        tallasProductos[j] = null;
                                                                                        stocksProductos[j] = 0;
                                                                                        precioProductos[j] = 0;
                                                                                        categoriaProductos[j] = 0;
                                                                                        System.out.println("Se ha cancelado el proceso de registro");
                                                                                    }
                                                                                } else {
                                                                                    for (int k = 0; k < idProveedores.length; k++) {
                                                                                        if (idProveedor == idProveedores[k]) {
                                                                                            proveedorRegistrado = true;
                                                                                            proveedorProductos[j] = idProveedor;
                                                                                            seguir = "n";
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!proveedorRegistrado) {
                                                                                        System.out.println("El proveedor con ID " + idProveedor + " no se encuentra registrado" +
                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            codigoProductos[j] = 0;
                                                                                            nombreProductos[j] = null;
                                                                                            marcasProductos[j] = null;
                                                                                            coloresProductos[j] = null;
                                                                                            tallasProductos[j] = null;
                                                                                            stocksProductos[j] = 0;
                                                                                            precioProductos[j] = 0;
                                                                                            categoriaProductos[j] = 0;
                                                                                            System.out.println("Se ha cancelado el proceso de registro");
                                                                                        }
                                                                                    }
                                                                                    proveedorRegistrado = false;
                                                                                }
                                                                            }
                                                                        }

                                                                        if (proveedorProductos[j] != 0) {
                                                                            System.out.println("Registro Exitoso");
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProductos[j] == 0) {
                                                                        System.out.println("Desea crear un nuevo producto (s/n)");
                                                                        seguir = sc.nextLine();

                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear un nuevo producto (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoProducto) {
                                                                    System.out.println("Se han registrado el máximo de productos");
                                                                    seguir = "n";
                                                                }
                                                                maximoProducto = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el codigo del producto que desea buscar");
                                                                codigoProducto = sc.nextInt();
                                                                sc.nextLine();

                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProducto == codigoProductos[j]) {
                                                                        for (int k = 0; k < idCategorias.length; k++) {
                                                                            if (categoriaProductos[j] == idCategorias[k]) {
                                                                                nombreCategoria = nombreCategorias[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idProveedores.length; k++) {
                                                                            if (proveedorProductos[j] == idProveedores[k]) {
                                                                                nombreProveedor = nombreProveedores[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        System.out.println("\nCodigo del producto: " + codigoProductos[j] +
                                                                                "\nNombre del producto: " + nombreProductos[j] +
                                                                                "\nMarca: " + marcasProductos[j] +
                                                                                "\nColor del producto: " + coloresProductos[j] +
                                                                                "\nTalla del producto: " + tallasProductos[j] +
                                                                                "\nStock Disponible: " + stocksProductos[j] +
                                                                                "\nPrecio Unitario: " + precioProductos[j] +
                                                                                "\nCategoría: " + nombreCategoria +
                                                                                "\nProveedor: " + nombreProveedor + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (codigoProductos.length - 1)) {
                                                                            System.out.println("El codigo " + codigoProducto +
                                                                                    " no se encuentra registrado en el inventario\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otro producto (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro producto (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!categoriaRegistrada) {
                                                                System.out.println("No hay categorías registradas en el sistema.");
                                                                break;
                                                            }
                                                            categoriaRegistrada = false;
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] != 0) {
                                                                    productoExistente = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!productoExistente) {
                                                                System.out.println("No hay productos registrados en el inventario.");
                                                                break;
                                                            }
                                                            productoExistente = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("""
                                                                        ======================================
                                                                                CATEGORÍAS DISPONIBLES       
                                                                        ======================================
                                                                        """);
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategorias[j] != 0) {
                                                                        System.out.println("ID: " + idCategorias[j] + " - " + nombreCategorias[j]);
                                                                    }
                                                                }
                                                                System.out.println("""
                                                                        ======================================");
                                                                        Ingrese el ID de la categoría:
                                                                        """);
                                                                idCategoria = sc.nextInt();
                                                                sc.nextLine();
                                                                if (idCategoria == 0) {
                                                                    System.out.println("El ID de categoría no puede ser 0" +
                                                                            "\nDesea intentarlo de nuevo (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                    if (seguir.equals("n")) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    for (int j = 0; j < idCategorias.length; j++) {
                                                                        if (idCategoria == idCategorias[j]) {
                                                                            categoriaRegistrada = true;
                                                                            nombreCategoria = nombreCategorias[j];
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!categoriaRegistrada) {
                                                                        System.out.println("La categoría con ID " + idCategoria + " no se encuentra registrada" +
                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                    } else {
                                                                        System.out.println("""
                                                                                ===========================================
                                                                                                PRODUCTOS 
                                                                                ===========================================
                                                                                """);
                                                                        for (int j = 0; j < codigoProductos.length; j++) {
                                                                            if (codigoProductos[j] != 0 && categoriaProductos[j] == idCategoria) {
                                                                                productoRegistrado = true;
                                                                                for (int k = 0; k < idCategorias.length; k++) {
                                                                                    if (categoriaProductos[j] == idCategorias[k]) {
                                                                                        nombreCategoria = nombreCategorias[k];
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                for (int k = 0; k < idProveedores.length; k++) {
                                                                                    if (proveedorProductos[j] == idProveedores[k]) {
                                                                                        nombreProveedor = nombreProveedores[k];
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                System.out.println("\nCodigo del producto: " + codigoProductos[j] +
                                                                                        "\nNombre del producto: " + nombreProductos[j] +
                                                                                        "\nMarca: " + marcasProductos[j] +
                                                                                        "\nColor: " + coloresProductos[j] +
                                                                                        "\nTalla: " + tallasProductos[j] +
                                                                                        "\nStock Disponible: " + stocksProductos[j] +
                                                                                        "\nPrecio Unitario: $" + precioProductos[j] +
                                                                                        "\nCategoría: " + nombreCategoria +
                                                                                        "\nProveedor: " + nombreProveedor);
                                                                                System.out.println("-------------------------------------------");
                                                                            }
                                                                        }

                                                                        if (!productoRegistrado) {
                                                                            System.out.println("\nNo hay productos registrados en esta categoría.");
                                                                        }
                                                                        System.out.println("===========================================\n");

                                                                        productoRegistrado = false;
                                                                        System.out.println("Desea ver productos de otra categoría (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea ver productos de otra categoría (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                    }
                                                                    categoriaRegistrada = false;
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < codigoProductos.length; j++) {
                                                                if (codigoProductos[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                        if (categoriaProductos[j] == idCategorias[k]) {
                                                                            nombreCategoria = nombreCategorias[k];
                                                                            break;
                                                                        }
                                                                    }
                                                                    for (int k = 0; k < idProveedores.length; k++) {
                                                                        if (proveedorProductos[j] == idProveedores[k]) {
                                                                            nombreProveedor = nombreProveedores[k];
                                                                            break;
                                                                        }
                                                                    }
                                                                    System.out.println("\nCodigo del producto: " + codigoProductos[j] +
                                                                            "\nNombre del producto: " + nombreProductos[j] +
                                                                            "\nMarca: " + marcasProductos[j] +
                                                                            "\nColor: " + coloresProductos[j] +
                                                                            "\nTalla: " + tallasProductos[j] +
                                                                            "\nStock Disponible: " + stocksProductos[j] +
                                                                            "\nPrecio Unitario: " + precioProductos[j] +
                                                                            "\nCategoría: " + nombreCategoria +
                                                                            "\nProveedor: " + nombreProveedor + "\n");
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay productos registrados en el inventario.");
                                                            }
                                                            clientesregistrados = false;
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
                                                                System.out.println("Ingrese el codigo del producto que desea actualizar");
                                                                codigoProducto = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProducto == codigoProductos[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    =======================================
                                                                                    |       ACTUALIZAR PRODUCTOS          |
                                                                                    =======================================
                                                                                    |         1) Codigo                   |
                                                                                    |         2) Nombre                   |
                                                                                    |         3) Marca                    |
                                                                                    |         4) Color                    |
                                                                                    |         5) Talla                    |
                                                                                    |         6) Stock                    |
                                                                                    |         7) Precio                   |
                                                                                    |         8) Categoría                |
                                                                                    |         9) Proveedor                |
                                                                                    |        10) Actualizar otro producto |
                                                                                    |         0) Atras                    |
                                                                                    =======================================
                                                                                    """);
                                                                            actualizarProducto = sc.nextInt();
                                                                            sc.nextLine();

                                                                            switch (actualizarProducto) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, el codigo del producto actual es: " + codigoProductos[j] +
                                                                                                "\nIngrese el codigo del producto a actualizar:");
                                                                                        codigoProducto = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (codigoProducto == 0) {
                                                                                            System.out.println("El codigo no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < codigoProductos.length; k++) {
                                                                                                if (k != j && codigoProducto == codigoProductos[k]) {
                                                                                                    productoExistente = true;
                                                                                                    System.out.println("El codigo " + codigoProducto + " ya esta registrado en otro producto" +
                                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                                        seguir = sc.nextLine();
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!productoExistente) {
                                                                                                codigoProductos[j] = codigoProducto;
                                                                                                System.out.println("Actualizacion exitosa");
                                                                                                seguir = "n";
                                                                                            }
                                                                                            productoExistente = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, el nombre actual del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + nombreProductos[j] +
                                                                                                "\nIngrese el nombre del producto a actualizar:");
                                                                                        nombreProducto = sc.nextLine();
                                                                                        if (nombreProducto.isBlank()) {
                                                                                            System.out.println("El nombre no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            nombreProductos[j] = nombreProducto;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, la marca actual del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + marcasProductos[j] +
                                                                                                "\nIngrese la marca a actualizar:");
                                                                                        marca = sc.nextLine();
                                                                                        if (marca.isBlank()) {
                                                                                            System.out.println("La marca no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            marcasProductos[j] = marca;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 4:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, el color actual del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + coloresProductos[j] +
                                                                                                "\nIngrese el color a actualizar:");
                                                                                        colorProducto = sc.nextLine();
                                                                                        if (colorProducto.isBlank()) {
                                                                                            System.out.println("El color no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            coloresProductos[j] = colorProducto;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 5:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, la talla actual del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + tallasProductos[j] +
                                                                                                "\nIngrese la talla a actualizar:");
                                                                                        tallaProducto = sc.nextLine();
                                                                                        if (tallaProducto.isBlank()) {
                                                                                            System.out.println("La talla no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            tallasProductos[j] = tallaProducto;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 6:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, el actual stock disponible del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + stocksProductos[j] +
                                                                                                "\nIngrese el stock a actualizar:");
                                                                                        stockProducto = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (stockProducto == 0) {
                                                                                            System.out.println("El stock no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            stocksProductos[j] = stockProducto;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 7:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Señor admin, el precio actual del producto con el codigo: " + codigoProductos[j] +
                                                                                                " es: " + precioProductos[j] +
                                                                                                "\nIngrese el precio a actualizar:");
                                                                                        precioProducto = sc.nextDouble();
                                                                                        sc.nextLine();
                                                                                        if (precioProducto == 0) {
                                                                                            System.out.println("El precio no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            precioProductos[j] = precioProducto;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 8:
                                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                                        if (categoriaProductos[j] == idCategorias[k]) {
                                                                                            nombreCategoria = nombreCategorias[k];
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La categoría actual es: " + nombreCategoria +
                                                                                                "\nIngrese el nuevo ID de categoría:");
                                                                                        idCategoria = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idCategoria == 0) {
                                                                                            System.out.println("El ID de categoría no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idCategorias.length; k++) {
                                                                                                if (idCategoria == idCategorias[k]) {
                                                                                                    categoriaRegistrada = true;
                                                                                                    categoriaProductos[j] = idCategoria;
                                                                                                    System.out.println("Actualizacion exitosa");
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!categoriaRegistrada) {
                                                                                                System.out.println("La categoría con ID " + idCategoria + " no se encuentra registrada" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            categoriaRegistrada = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 9:
                                                                                    for (int k = 0; k < idProveedores.length; k++) {
                                                                                        if (proveedorProductos[j] == idProveedores[k]) {
                                                                                            nombreProveedor = nombreProveedores[k];
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El proveedor actual es: " + nombreProveedor +
                                                                                                "\nIngrese el nuevo ID de proveedor:");
                                                                                        idProveedor = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idProveedor == 0) {
                                                                                            System.out.println("El ID del proveedor no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idProveedores.length; k++) {
                                                                                                if (idProveedor == idProveedores[k]) {
                                                                                                    proveedorRegistrado = true;
                                                                                                    proveedorProductos[j] = idProveedor;
                                                                                                    System.out.println("Actualizacion exitosa");
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!proveedorRegistrado) {
                                                                                                System.out.println("El proveedor con ID " + idProveedor + " no se encuentra registrado" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            proveedorRegistrado = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 10:
                                                                                    for (int k = 0; k < codigoProductos.length; k++) {
                                                                                        if (codigoProductos[k] != 0) {
                                                                                            productoExistente = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!productoExistente) {
                                                                                        System.out.println("No hay productos registrados en el inventario.");
                                                                                        break;
                                                                                    }
                                                                                    productoExistente = false;
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el codigo del producto que desea actualizar:");
                                                                                        codigoProducto = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (codigoProducto == 0) {
                                                                                            System.out.println("El codigo no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < codigoProductos.length; k++) {
                                                                                                if (codigoProducto == codigoProductos[k]) {
                                                                                                    productoExistente = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!productoExistente) {
                                                                                                System.out.println("El producto con codigo " + codigoProducto + " no se encuentra registrado" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            productoExistente = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar productos");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarProducto != 0);
                                                                        clientesregistrados = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (codigoProductos.length - 1)) {
                                                                            System.out.println("El codigo del producto : " + codigoProducto +
                                                                                    " no se encuentra registrado en el Inventario\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (!clientesregistrados) {
                                                                    System.out.println("Desea actualizar otro producto (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea actualizar otro producto (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                clientesregistrados = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 6:
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
                                                                sc.nextLine();

                                                                for (int j = 0; j < codigoProductos.length; j++) {
                                                                    if (codigoProducto == codigoProductos[j]) {
                                                                        codigoProductos[j] = 0;
                                                                        nombreProductos[j] = null;
                                                                        marcasProductos[j] = null;
                                                                        coloresProductos[j] = null;
                                                                        tallasProductos[j] = null;
                                                                        stocksProductos[j] = 0;
                                                                        precioProductos[j] = 0;
                                                                        categoriaProductos[j] = 0;
                                                                        proveedorProductos[j] = 0;
                                                                        System.out.println("El producto fue eliminado correctamente");
                                                                        break;
                                                                    } else {
                                                                        if (j == (codigoProductos.length - 1)) {
                                                                            System.out.println("El producto con el codigo: " + codigoProducto +
                                                                                    " no se encuentra registrado en el inventario\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otro producto (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea eliminar otro producto (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar productos");
                                                            break;
                                                        default:
                                                            System.out.println("Opcion invalida, ingresela nuevamente");
                                                            break;
                                                    }
                                                } while (adminProductos != 0);
                                                break;
                                            case 3:
                                                do {
                                                    System.out.println("""
                                                            =====================================
                                                            |        GESTIÓN DE PEDIDOS         |
                                                            =====================================
                                                            |    1) Crear nuevo pedido          |
                                                            |    2) Buscar pedido por ID        |
                                                            |    3) Ver todos los pedidos       |
                                                            |    4) Ver pedidos por estado      |
                                                            |    5) Actualizar pedido           |
                                                            |    6) Cancelar pedido             |
                                                            |    0) Volver al menú anterior     |
                                                            =====================================
                                                            """);
                                                    adminPedido = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminPedido) {
                                                        case 1:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de pedidos");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idsPedido[j] == 0) {
                                                                        idPedido = j + 1;
                                                                        idsPedido[j] = idPedido;
                                                                        seguir = "s";
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Correo del cliente:");
                                                                            email = sc.nextLine();
                                                                            if (email.isBlank()) {
                                                                                System.out.println("El correo no puede estar vacio" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idsPedido[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                                    if (email.equalsIgnoreCase(emailsUsuarios[k])) {
                                                                                        correoExistente = true;
                                                                                        emailsPedidos[j] = email;
                                                                                        seguir = "n";
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (!correoExistente) {
                                                                                    System.out.println("El correo " + email + " no se encuentra registrado en el sistema" +
                                                                                            "\nDesea intentarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idsPedido[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Codigo del producto:");
                                                                                codigoProducto = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (codigoProducto == 0) {
                                                                                    System.out.println("El codigo no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    for (int k = 0; k < codigoProductos.length; k++) {
                                                                                        if (codigoProducto == codigoProductos[k]) {
                                                                                            productoExistente = true;
                                                                                            idProductos[j] = codigoProducto;
                                                                                            precioUnitario = precioProductos[k];
                                                                                            stockDisponible = stocksProductos[k];
                                                                                            seguir = "n";
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!productoExistente) {
                                                                                        System.out.println("El codigo del producto " + codigoProducto + " no se encuentra registrado en el sistema" +
                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            idsPedido[j] = 0;
                                                                                            idProductos[j] = 0;
                                                                                            emailsPedidos[j] = null;

                                                                                        }
                                                                                    }
                                                                                    productoExistente = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idProductos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Cantidad:");
                                                                                cantidadPedido = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (cantidadPedido == 0) {
                                                                                    System.out.println("La cantidad no puede ser 0" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        idProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                    }
                                                                                } else if (cantidadPedido > stockDisponible) {
                                                                                    System.out.println("La cantidad ingresada es mayor al stock disponible " +
                                                                                            "\nStock disponible del producto: " + stockDisponible +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        idProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    cantidadPedidos[j] = cantidadPedido;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (cantidadPedidos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Ingrese el ID del método de pago:");
                                                                                idMetodoPago = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (idMetodoPago == 0) {
                                                                                    System.out.println("El ID del método de pago no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (seguir.equals("n")) {
                                                                                        idsPedido[j] = 0;
                                                                                        idProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    metodoPagoRegistrado = false;
                                                                                    for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                                        if (idMetodoPago == idMetodosPagos[k]) {
                                                                                            metodoPagoRegistrado = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!metodoPagoRegistrado) {
                                                                                        System.out.println("El método de pago con ID " + idMetodoPago + " no está registrado" +
                                                                                                "\nDesea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                                            System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (seguir.equals("n")) {
                                                                                            idsPedido[j] = 0;
                                                                                            idProductos[j] = 0;
                                                                                            cantidadPedidos[j] = 0;
                                                                                            emailsPedidos[j] = null;
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        idsMetodosPedidos[j] = idMetodoPago;
                                                                                        seguir = "n";
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idsMetodosPedidos[j] != 0) {
                                                                            totalPedidos[j] = cantidadPedidos[j] * precioUnitario;
                                                                            System.out.println("Total a pagar: $" + totalPedidos[j]);
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Fecha del pedido (DD/MM/AAAA):");
                                                                                fechaPedido = sc.nextLine();
                                                                                if (fechaPedido.isBlank()) {
                                                                                    System.out.println("La fecha no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        idProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        idsMetodosPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;

                                                                                    }
                                                                                } else {
                                                                                    fechaPedidos[j] = fechaPedido;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idPromociones.length; k++) {
                                                                            if (idPromociones[k] != 0) {
                                                                                if (estadoPromociones[k].equals("activa")) {
                                                                                    if (fechaPedido.compareTo(fechaInicioPromociones[k]) >= 0 &&
                                                                                            fechaPedido.compareTo(fechaFinPromociones[k]) <= 0) {
                                                                                        if (categoriaPromociones[k] == categoriaProductos[j]) {
                                                                                            descuento = totalPedidos[j] * (porcentajePromociones[k] / 100.0);
                                                                                            totalPedidos[j] -= descuento;
                                                                                            System.out.println("Promoción aplicada: -" + porcentajePromociones[k] + "%" +
                                                                                                    "\nNuevo total: $" + totalPedidos[j]);
                                                                                            idPromocionesPedidos[j] = idPromociones[k];
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (!fechaPedidos[j].isBlank()) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Estado del pedido (pendiente/procesado/enviado/entregado):");
                                                                                estadoPedido = sc.nextLine();
                                                                                if (estadoPedido.isBlank()) {
                                                                                    System.out.println("El estadoPedidos no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        codigoProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        totalPedidos[j] = 0;
                                                                                        idsMetodosPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                        fechaPedidos[j] = null;
                                                                                    }
                                                                                } else if (!estadoPedido.equals("pendiente") && !estadoPedido.equals("procesado") && !estadoPedido.equals("enviado") && !estadoPedido.equals("entregado")) {
                                                                                    System.out.println("Estado invalido: Asegurese de escribir exactamente: pendiente, procesado, enviado o entregado" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idsPedido[j] = 0;
                                                                                        codigoProductos[j] = 0;
                                                                                        cantidadPedidos[j] = 0;
                                                                                        totalPedidos[j] = 0;
                                                                                        idsMetodosPedidos[j] = 0;
                                                                                        emailsPedidos[j] = null;
                                                                                        fechaPedidos[j] = null;
                                                                                        estadoPedidos[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    estadoPedidos[j] = estadoPedido;
                                                                                    for (int k = 0; k < codigoProductos.length; k++) {
                                                                                        if (codigoProducto == codigoProductos[k]) {
                                                                                            stocksProductos[k] -= cantidadPedidos[j];
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    System.out.println("\nCreacion Exitosa con ID: " + idsPedido[j]);
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idsPedido[j] == 0) {
                                                                        System.out.println("Desea crear un nuevo pedido (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear un nuevo pedido (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
                                                                    System.out.println("Se han registrado el máximo de pedidos");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay pedidos registrados.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del pedido que desea buscar");
                                                                idPedido = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idPedido == idsPedido[j]) {
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idPedido == idProductos[k]) {
                                                                                nombreProducto = nombreProductos[j];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                            if (idsMetodosPedidos[j] == idMetodosPagos[k]) {
                                                                                nombreMetodoPago = nombreMetodosPagos[k];
                                                                                tipoMetodoPago = tipoMetodosPagos[k];
                                                                                numeroCuenta = numeroCuentas[k];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                            if (emailsUsuarios[k] != null && emailsUsuarios[k].equalsIgnoreCase(emailsPedidos[j])) {
                                                                                nombreUsuario = nombresUsuarios[k];
                                                                                email = emailsUsuarios[k];
                                                                                celularUsuario = celularUsuarios[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idPromociones.length; k++) {
                                                                            if (idPromocionesPedidos[j] == idPromociones[k]) {
                                                                                porcentajePromocion = porcentajePromociones[k];
                                                                            }
                                                                        }
                                                                        System.out.println("\nID del Pedido: " + idsPedido[j] +
                                                                                "\nNombre del cliente: " + nombreUsuario +
                                                                                "\nCorreo del cliente: " + email +
                                                                                "\nCelular del cliente: " + celularUsuario +
                                                                                "\nNombre del producto: " + nombreProducto +
                                                                                "\nCantidad: " + cantidadPedidos[j] +
                                                                                "\nDescuento aplicado: " + porcentajePromocion + "%" +
                                                                                "\nMetodo de pago: " + nombreMetodoPago +
                                                                                "\nTipo de cuenta: " + tipoMetodoPago +
                                                                                "\nNumero de cuenta a pagar: " + numeroCuenta +
                                                                                "\nTotal a pagar: $" + totalPedidos[j] +
                                                                                "\nFecha del pedido: " + fechaPedidos[j] +
                                                                                "\nEstado del pedido: " + estadoPedidos[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idsPedido.length - 1)) {
                                                                            System.out.println("El pedido con ID: " + idPedido +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otro pedido (s/n)");
                                                                seguir = sc.nextLine();

                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro pedido (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    if (idPedido == idsPedido[j]) {
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idPedido == idProductos[k]) {
                                                                                nombreProducto = nombreProductos[j];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                            if (idsMetodosPedidos[j] == idMetodosPagos[k]) {
                                                                                nombreMetodoPago = nombreMetodosPagos[k];
                                                                                tipoMetodoPago = tipoMetodosPagos[k];
                                                                                numeroCuenta = numeroCuentas[k];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                            if (emailsUsuarios[k] != null && emailsUsuarios[k].equalsIgnoreCase(emailsPedidos[j])) {
                                                                                nombreUsuario = nombresUsuarios[k];
                                                                                email = emailsUsuarios[k];
                                                                                celularUsuario = celularUsuarios[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idPromociones.length; k++) {
                                                                            if (idPromocionesPedidos[j] == idPromociones[k]) {
                                                                                porcentajePromocion = porcentajePromociones[k];
                                                                            }
                                                                        }
                                                                        System.out.println("\nID del Pedido: " + idsPedido[j] +
                                                                                "\nNombre del cliente: " + nombreUsuario +
                                                                                "\nCorreo del cliente: " + email +
                                                                                "\nCelular del cliente: " + celularUsuario +
                                                                                "\nNombre del producto: " + nombreProducto +
                                                                                "\nCantidad: " + cantidadPedidos[j] +
                                                                                "\nDescuento aplicado: " + porcentajePromocion + "%" +
                                                                                "\nMetodo de pago: " + nombreMetodoPago +
                                                                                "\nTipo de cuenta: " + tipoMetodoPago +
                                                                                "\nNumero de cuenta a pagar: " + numeroCuenta +
                                                                                "\nTotal a pagar: $" + totalPedidos[j] +
                                                                                "\nFecha del pedido: " + fechaPedidos[j] +
                                                                                "\nEstado del pedido: " + estadoPedidos[j]);
                                                                    }
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay pedidos registrados.");
                                                            }
                                                            clientesregistrados = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] != 0) {
                                                                    pedidoRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!pedidoRegistrado) {
                                                                System.out.println("No hay pedidos registrados.");
                                                                break;
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("""
                                                                        ==============================
                                                                        |    SELECCIONE EL ESTADO    |
                                                                        ==============================
                                                                        |        1) Pendiente        |
                                                                        |        2) Procesado        |
                                                                        |        3) Enviado          |
                                                                        |        4) Entregado        |
                                                                        ==============================
                                                                        """);
                                                                opcionEstado = sc.nextInt();
                                                                sc.nextLine();
                                                                switch (opcionEstado) {
                                                                    case '1':
                                                                        estadoPedido = "pendiente";
                                                                        break;
                                                                    case '2':
                                                                        estadoPedido = "procesado";
                                                                        break;
                                                                    case '3':
                                                                        estadoPedido = "enviado";
                                                                        break;
                                                                    case '4':
                                                                        estadoPedido = "entregado";
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                        continue;
                                                                }
                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idsPedido[j] != 0 && estadoPedido.equalsIgnoreCase(estadoPedidos[j])) {
                                                                        pedidoRegistrado = true;
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idPedido == idProductos[k]) {
                                                                                nombreProducto = nombreProductos[j];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                            if (idsMetodosPedidos[j] == idMetodosPagos[k]) {
                                                                                nombreMetodoPago = nombreMetodosPagos[k];
                                                                                tipoMetodoPago = tipoMetodosPagos[k];
                                                                                numeroCuenta = numeroCuentas[k];
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                            if (emailsUsuarios[k] != null && emailsUsuarios[k].equalsIgnoreCase(emailsPedidos[j])) {
                                                                                nombreUsuario = nombresUsuarios[k];
                                                                                email = emailsUsuarios[k];
                                                                                celularUsuario = celularUsuarios[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idPromociones.length; k++) {
                                                                            if (idPromocionesPedidos[j] == idPromociones[k]) {
                                                                                porcentajePromocion = porcentajePromociones[k];
                                                                            }
                                                                        }
                                                                        System.out.println("\n===========================================");
                                                                        System.out.println("\nID del Pedido: " + idsPedido[j] +
                                                                                "\nNombre del cliente: " + nombreUsuario +
                                                                                "\nCorreo del cliente: " + email +
                                                                                "\nCelular del cliente: " + celularUsuario +
                                                                                "\nNombre del producto: " + nombreProducto +
                                                                                "\nCantidad: " + cantidadPedidos[j] +
                                                                                "\nDescuento aplicado: " + porcentajePromocion + "%" +
                                                                                "\nMetodo de pago: " + nombreMetodoPago +
                                                                                "\nTipo de cuenta: " + tipoMetodoPago +
                                                                                "\nNumero de cuenta a pagar: " + numeroCuenta +
                                                                                "\nTotal a pagar: $" + totalPedidos[j] +
                                                                                "\nFecha del pedido: " + fechaPedidos[j] +
                                                                                "\nEstado del pedido: " + estadoPedidos[j]);
                                                                        System.out.println("===========================================\n");
                                                                    }
                                                                }
                                                                if (!pedidoRegistrado) {
                                                                    System.out.println("No hay pedidos con estado: " + estadoPedido);
                                                                }
                                                                System.out.println("Desea buscar otro estado (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro estado (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] != 0) {
                                                                    clientesregistrados = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!clientesregistrados) {
                                                                System.out.println("No hay pedidos registrados.");
                                                                break;
                                                            }
                                                            clientesregistrados = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del pedido que desea actualizar");
                                                                idPedido = sc.nextInt();
                                                                sc.nextLine();

                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idPedido == idsPedido[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    ==================================
                                                                                    |       ACTUALIZAR PEDIDO        |
                                                                                    ==================================
                                                                                    |   1) Estado del pedido         |
                                                                                    |   2) Cantidad                  |
                                                                                    |   3) Actualizar otro pedido    |
                                                                                    |   0) Atras                     |
                                                                                    ==================================
                                                                                    """);
                                                                            actualizarCliente = sc.nextInt();
                                                                            sc.nextLine();

                                                                            switch (actualizarCliente) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El estado actual del pedido es: " + estadoPedidos[j] +
                                                                                                "\nIngrese el nuevo estado (pendiente/procesado/enviado/entregado):");
                                                                                        estadoPedido = sc.nextLine();
                                                                                        if (estadoPedido.isBlank()) {
                                                                                            System.out.println("El estado no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else if (!estadoPedido.equals("pendiente") && !estadoPedido.equals("procesado") && !estadoPedido.equals("enviado") && !estadoPedido.equals("entregado")) {
                                                                                            System.out.println("Estado invalido: Asegurese de escribir exactamente: pendiente, procesado, enviado o entregado" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            estadoPedidos[j] = estadoPedido;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La cantidad actual del pedido es: " + cantidadPedidos[j] +
                                                                                                "\nIngrese la nueva cantidad:");
                                                                                        cantidadPedido = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (cantidadPedido == 0) {
                                                                                            System.out.println("La cantidad no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < codigoProductos.length; k++) {
                                                                                                if (codigoProductos[k] == codigoProductos[j]) {
                                                                                                    stocksProductos[k] += cantidadPedidos[j];
                                                                                                    stockDisponible = stocksProductos[k];
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (cantidadPedido > stockDisponible) {
                                                                                                System.out.println("La cantidad ingresada es mayor al stock disponible " +
                                                                                                        "\nStock disponible del producto: " + stockDisponible +
                                                                                                        "\nDesea ingresarla de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            } else {
                                                                                                cantidadAnterior = cantidadPedidos[j];
                                                                                                diferenciaCantidades = cantidadPedido - cantidadAnterior;
                                                                                                cantidadPedidos[j] = cantidadPedido;
                                                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                                                    if (codigoProductos[k] == codigoProductos[j]) {
                                                                                                        stocksProductos[k] -= diferenciaCantidades;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                for (int k = 0; k < codigoProductos.length; k++) {
                                                                                                    if (codigoProductos[k] == codigoProductos[j]) {
                                                                                                        totalPedidos[j] = cantidadPedidos[j] * precioProductos[k];
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                System.out.println("Actualizacion exitosa");
                                                                                                seguir = "n";
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    for (int k = 0; k < idsPedido.length; k++) {
                                                                                        if (idsPedido[k] != 0) {
                                                                                            pedidoRegistrado = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!pedidoRegistrado) {
                                                                                        System.out.println("No hay pedidos registrados.");
                                                                                        break;
                                                                                    }
                                                                                    pedidoRegistrado = false;
                                                                                    seguir = "s";
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID del pedido que desea actualizar:");
                                                                                        idPedido = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idPedido == 0) {
                                                                                            System.out.println("El ID del pedido no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idsPedido.length; k++) {
                                                                                                if (idPedido == idsPedido[k]) {
                                                                                                    pedidoRegistrado = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!pedidoRegistrado) {
                                                                                                System.out.println("El pedido con ID " + idPedido + " no se encuentra registrado" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            pedidoRegistrado = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar pedido");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Señor admin, la opcion es invalida, vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarCliente != 0);
                                                                        clientesregistrados = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (idsPedido.length - 1)) {
                                                                            System.out.println("El pedido con ID: " + idPedido +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (!clientesregistrados) {
                                                                    System.out.println("Desea buscar otro pedido (s/n)");
                                                                    seguir = sc.nextLine();

                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea buscar otro pedido (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                clientesregistrados = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 6:
                                                            for (int j = 0; j < idsPedido.length; j++) {
                                                                if (idsPedido[j] != 0) {
                                                                    pedidoRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!pedidoRegistrado) {
                                                                System.out.println("No hay pedidos registrados.");
                                                                break;
                                                            }
                                                            pedidoRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del pedido que desea eliminar:");
                                                                idPedido = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idsPedido.length; j++) {
                                                                    if (idPedido == idsPedido[j]) {
                                                                        for (int k = 0; k < codigoProductos.length; k++) {
                                                                            if (codigoProductos[k] == codigoProductos[j]) {
                                                                                stocksProductos[k] += cantidadPedidos[j];
                                                                                break;
                                                                            }
                                                                        }
                                                                        idsPedido[j] = 0;
                                                                        codigoProductos[j] = 0;
                                                                        cantidadPedidos[j] = 0;
                                                                        totalPedidos[j] = 0;
                                                                        emailsPedidos[j] = null;
                                                                        fechaPedidos[j] = null;
                                                                        estadoPedidos[j] = null;
                                                                        System.out.println("Eliminacion Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idsPedido.length - 1)) {
                                                                            System.out.println("El pedido con ID " + idPedido +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otro pedido (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otro pedido (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Volviendo al menú principal...");
                                                            break;
                                                        default:
                                                            System.out.println("Opción inválida");
                                                    }
                                                } while (adminPedido != 0);
                                                break;
                                            case 4:
                                                do {
                                                    System.out.println("""
                                                            =====================================
                                                            |      GESTIÓN DE CATEGORÍAS        |
                                                            =====================================
                                                            |    1) Crear categoría             |
                                                            |    2) Buscar categoría            |
                                                            |    3) Ver todas las categorías    |
                                                            |    4) Actualizar categoría        |
                                                            |    5) Eliminar categoría          |
                                                            |    0) Volver al menú principal    |
                                                            =====================================
                                                            """);
                                                    adminCategoria = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminCategoria) {
                                                        case 1:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de categorias");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategorias[j] == 0) {
                                                                        idCategoria = j + 1;
                                                                        idCategorias[j] = idCategoria;
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Nombre de la categoria:");
                                                                            nombreCategoria = sc.nextLine();
                                                                            if (nombreCategoria.isBlank()) {
                                                                                System.out.println("El nombre no puede estar vacio" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idCategorias[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                for (int k = 0; k < nombreCategorias.length; k++) {
                                                                                    if (nombreCategoria.equalsIgnoreCase(nombreCategorias[k])) {
                                                                                        categoriaRegistrada = true;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (categoriaRegistrada) {
                                                                                    System.out.println("La categoria ya existe" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idCategorias[j] = 0;
                                                                                    }
                                                                                } else {
                                                                                    nombreCategorias[j] = nombreCategoria;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idCategorias[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Descripcion de la categoria:");
                                                                                descripcionCategoria = sc.nextLine();
                                                                                if (descripcionCategoria.isBlank()) {
                                                                                    System.out.println("La descripcion no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idCategorias[j] = 0;
                                                                                        nombreCategorias[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    descripcionCategorias[j] = descripcionCategoria;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (descripcionCategorias[j] != null) {
                                                                            System.out.println("\nCreacion Exitosa con ID: " + idCategorias[j]);
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategorias[j] == 0) {
                                                                        System.out.println("Desea crear una nueva categoria (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear una nueva categoria (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
                                                                    System.out.println("Se han registrado el máximo de categorias");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!categoriaRegistrada) {
                                                                System.out.println("No hay categorias registradas.");
                                                                break;
                                                            }
                                                            categoriaRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la categoria que desea buscar");
                                                                idCategoria = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategoria == idCategorias[j]) {
                                                                        System.out.println("\nID de la categoria: " + idCategorias[j] +
                                                                                "\nNombre: " + nombreCategorias[j] +
                                                                                "\nDescripcion: " + descripcionCategorias[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idCategorias.length - 1)) {
                                                                            System.out.println("La categoria con ID: " + idCategoria + " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otra categoria (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otra categoria (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    System.out.println("\nID de la categoria: " + idCategorias[j] +
                                                                            "\nNombre: " + nombreCategorias[j] +
                                                                            "\nDescripcion: " + descripcionCategorias[j] + "\n");
                                                                }
                                                            }
                                                            if (!categoriaRegistrada) {
                                                                System.out.println("No hay categorias registradas.");
                                                            }
                                                            categoriaRegistrada = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!categoriaRegistrada) {
                                                                System.out.println("No hay categorias registradas.");
                                                                break;
                                                            }
                                                            categoriaRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la categoria que desea actualizar");
                                                                idCategoria = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategoria == idCategorias[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    ======================================
                                                                                    |        ACTUALIZAR CATEGORIA        |
                                                                                    ======================================
                                                                                    |    1) Nombre                       |
                                                                                    |    2) Descripcion                  |
                                                                                    |    3) Actualizar otra categoria    |
                                                                                    |    0) Atras                        |
                                                                                    ======================================
                                                                                    """);
                                                                            actualizarCategoria = sc.nextInt();
                                                                            sc.nextLine();
                                                                            switch (actualizarCategoria) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El nombre actual es: " + nombreCategorias[j] +
                                                                                                "\nIngrese el nuevo nombre:");
                                                                                        nombreCategoria = sc.nextLine();
                                                                                        if (nombreCategoria.isBlank()) {
                                                                                            System.out.println("El nombre no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            nombreCategorias[j] = nombreCategoria;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La descripcion actual es: " + descripcionCategorias[j] +
                                                                                                "\nIngrese la nueva descripcion:");
                                                                                        descripcionCategoria = sc.nextLine();
                                                                                        if (descripcionCategoria.isBlank()) {
                                                                                            System.out.println("La descripcion no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            descripcionCategorias[j] = descripcionCategoria;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                                        if (idCategorias[k] != 0) {
                                                                                            categoriaRegistrada = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!categoriaRegistrada) {
                                                                                        System.out.println("No hay categorias registradas.");
                                                                                        break;
                                                                                    }
                                                                                    categoriaRegistrada = false;
                                                                                    seguir = "s";
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID de la categoria que desea actualizar:");
                                                                                        idCategoria = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idCategoria == 0) {
                                                                                            System.out.println("El ID de la categoria no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idCategorias.length; k++) {
                                                                                                if (idCategoria == idCategorias[k]) {
                                                                                                    categoriaRegistrada = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!categoriaRegistrada) {
                                                                                                System.out.println("La categoria con ID " + idCategoria + " no se encuentra registrada\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            categoriaRegistrada = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar categoria");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarCategoria != 0);
                                                                        clientesregistrados = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (idCategorias.length - 1)) {
                                                                            System.out.println("La categoria con ID: " + idCategoria + " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (!clientesregistrados) {
                                                                    System.out.println("Desea buscar otra categoria (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea buscar otra categoria (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                categoriaRegistrada = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idCategorias.length; j++) {
                                                                if (idCategorias[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!categoriaRegistrada) {
                                                                System.out.println("No hay categorias registradas.");
                                                                break;
                                                            }
                                                            categoriaRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la categoria que desea eliminar:");
                                                                idCategoria = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idCategorias.length; j++) {
                                                                    if (idCategoria == idCategorias[j]) {
                                                                        idCategorias[j] = 0;
                                                                        nombreCategorias[j] = null;
                                                                        descripcionCategorias[j] = null;
                                                                        System.out.println("Eliminacion Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idCategorias.length - 1)) {
                                                                            System.out.println("La categoria con ID " + idCategoria +
                                                                                    " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otra categoria (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otra categoria (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo del administrar categorias");
                                                            break;

                                                        default:
                                                            System.out.println("Opción inválida.");
                                                    }
                                                } while (adminCategoria != 0);
                                                break;
                                            case 5:
                                                do {
                                                    System.out.println("""
                                                            ==================================
                                                            |    ADMINISTRAR PROVEEDORES     |
                                                            ==================================
                                                            |    1) Crear nuevo proveedor    |
                                                            |    2) Buscar proveedor         |
                                                            |    3) Mostrar proveedores      |
                                                            |    4) Actualizar proveedor     |
                                                            |    5) Eliminar proveedor       |
                                                            |    0) Volver                   |
                                                            ==================================
                                                            """);
                                                    adminProveedor = sc.nextInt();
                                                    sc.nextLine();

                                                    switch (adminProveedor) {
                                                        case 1:
                                                            for (int j = 0; j < idProveedores.length; j++) {
                                                                if (idProveedores[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de proveedores");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < idProveedores.length; j++) {
                                                                    if (idProveedores[j] == 0) {
                                                                        idProveedor = j + 1;
                                                                        idProveedores[j] = idProveedor;
                                                                        seguir = "s";
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Nombre del proveedor:");
                                                                            nombreProveedor = sc.nextLine();
                                                                            if (nombreProveedor.isBlank()) {
                                                                                System.out.println("El nombre no puede estar vacio" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idProveedores[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                nombreProveedores[j] = nombreProveedor;
                                                                                seguir = "n";
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idProveedores[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Correo del proveedor:");
                                                                                emailProveedor = sc.nextLine();
                                                                                if (emailProveedor.isBlank()) {
                                                                                    System.out.println("El correo no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idProveedores[j] = 0;
                                                                                        nombreProveedores[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    emailProveedores[j] = emailProveedor;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (emailProveedores[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Telefono del proveedor:");
                                                                                telefonoProveedor = sc.nextLong();
                                                                                sc.nextLine();
                                                                                if (telefonoProveedor == 0) {
                                                                                    System.out.println("El telefono no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idProveedores[j] = 0;
                                                                                        nombreProveedores[j] = null;
                                                                                        emailProveedores[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    telefonoProveedores[j] = telefonoProveedor;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (telefonoProveedores[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Direccion del proveedor:");
                                                                                direccionProveedor = sc.nextLine();
                                                                                if (direccionProveedor.isBlank()) {
                                                                                    System.out.println("La direccion no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idProveedores[j] = 0;
                                                                                        telefonoProveedores[j] = 0;
                                                                                        nombreProveedores[j] = null;
                                                                                        emailProveedores[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    direccionProveedores[j] = direccionProveedor;
                                                                                    System.out.println("\nCreacion Exitosa con ID: " + idProveedores[j]);
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < idProveedores.length; j++) {
                                                                    if (idProveedores[j] == 0) {
                                                                        System.out.println("Desea crear un nuevo proveedor (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear un nuevo proveedor (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
                                                                    System.out.println("Se han registrado el máximo de proveedores");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idProveedores.length; j++) {
                                                                if (idProveedores[j] != 0) {
                                                                    categoriaRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!proveedorRegistrado) {
                                                                System.out.println("No hay proveedores registrados.");
                                                                break;
                                                            }
                                                            proveedorRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del proveedor que desea buscar:");
                                                                idProveedor = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idProveedores.length; j++) {
                                                                    if (idProveedor == idProveedores[j]) {
                                                                        System.out.println("\nID del proveedor: " + idProveedores[j] +
                                                                                "\nNombre: " + nombreProveedores[j] +
                                                                                "\nCorreo: " + emailProveedores[j] +
                                                                                "\nTelefono: " + telefonoProveedores[j] +
                                                                                "\nDireccion: " + direccionProveedores[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idProveedores.length - 1)) {
                                                                            System.out.println("El proveedor con ID " + idProveedor + " no se encuentra registrado\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otro proveedor (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro proveedor (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idProveedores.length; j++) {
                                                                if (idProveedores[j] != 0) {
                                                                    proveedorRegistrado = true;
                                                                    System.out.println("\nID del proveedor: " + idProveedores[j] +
                                                                            "\nNombre: " + nombreProveedores[j] +
                                                                            "\nCorreo: " + emailProveedores[j] +
                                                                            "\nTelefono: " + telefonoProveedores[j] +
                                                                            "\nDireccion" + direccionProveedores[j]);
                                                                }
                                                            }
                                                            if (!proveedorRegistrado) {
                                                                System.out.println("No hay proveedores registrados.");
                                                            }
                                                            proveedorRegistrado = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idProveedores.length; j++) {
                                                                if (idProveedores[j] != 0) {
                                                                    proveedorRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!proveedorRegistrado) {
                                                                System.out.println("No hay proveedores registrados.");
                                                                break;
                                                            }
                                                            proveedorRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del proveedor que desea actualizar:");
                                                                idProveedor = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idProveedores.length; j++) {
                                                                    if (idProveedor == idProveedores[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    ==================================
                                                                                    |       ACTUALIZAR PROVEEDOR     |
                                                                                    ==================================
                                                                                    |   1) Nombre del proveedor      |
                                                                                    |   2) Correo                    |
                                                                                    |   3) Telefono                  |
                                                                                    |   4) Direccion                 |
                                                                                    |   5) Actualizar otro proveedor |
                                                                                    |   0) Atras                     |
                                                                                    ==================================
                                                                                    """);
                                                                            actualizarProveedor = sc.nextInt();
                                                                            sc.nextLine();
                                                                            switch (actualizarProveedor) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El nombre actual del proveedor es: " + nombreProveedores[j] +
                                                                                                "\nIngrese el nuevo nombre:");
                                                                                        nombreProveedor = sc.nextLine();
                                                                                        if (nombreProveedor.isBlank()) {
                                                                                            System.out.println("El nombre no puede estar vacío" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            nombreProveedores[j] = nombreProveedor;
                                                                                            System.out.println("Actualización exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El correo actual del proveedor es: " + emailProveedores[j] +
                                                                                                "\nIngrese el nuevo correo:");
                                                                                        emailProveedor = sc.nextLine();
                                                                                        if (emailProveedor.isBlank()) {
                                                                                            System.out.println("El correo no puede estar vacío" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            emailProveedores[j] = emailProveedor;
                                                                                            System.out.println("Actualización exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El teléfono actual del proveedor es: " + telefonoProveedores[j] +
                                                                                                "\nIngrese el nuevo teléfono:");
                                                                                        telefonoProveedor = sc.nextLong();
                                                                                        sc.nextLine();
                                                                                        if (telefonoProveedor == 0) {
                                                                                            System.out.println("El teléfono no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            telefonoProveedores[j] = telefonoProveedor;
                                                                                            System.out.println("Actualización exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 4:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La dirección actual del proveedor es: " + direccionProveedores[j] +
                                                                                                "\nIngrese la nueva dirección:");
                                                                                        direccionProveedor = sc.nextLine();
                                                                                        if (direccionProveedor.isBlank()) {
                                                                                            System.out.println("La dirección no puede estar vacía" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            direccionProveedores[j] = direccionProveedor;
                                                                                            System.out.println("Actualización exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 5:
                                                                                    for (int k = 0; k < idProveedores.length; k++) {
                                                                                        if (idProveedores[k] != 0) {
                                                                                            proveedorRegistrado = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!proveedorRegistrado) {
                                                                                        System.out.println("No hay proveedores registrados.");
                                                                                        break;
                                                                                    }
                                                                                    proveedorRegistrado = false;
                                                                                    seguir = "s";
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID del proveedor que desea actualizar:");
                                                                                        idProveedor = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idProveedor == 0) {
                                                                                            System.out.println("El ID del proveedor no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idProveedores.length; k++) {
                                                                                                if (idProveedor == idProveedores[k]) {
                                                                                                    proveedorRegistrado = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!proveedorRegistrado) {
                                                                                                System.out.println("El proveedor con ID " + idProveedor + " no se encuentra registrado" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            proveedorRegistrado = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar proveedor");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarProveedor != 0);
                                                                        proveedorRegistrado = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (idProveedores.length - 1)) {
                                                                            System.out.println("El proveedor con ID: " + idProveedor + " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }

                                                                if (!proveedorRegistrado) {
                                                                    System.out.println("Desea buscar otro proveedor (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea buscar otro proveedor (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                proveedorRegistrado = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idProveedores.length; j++) {
                                                                if (idProveedores[j] != 0) {
                                                                    proveedorRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!proveedorRegistrado) {
                                                                System.out.println("No hay proveedores registrados.");
                                                                break;
                                                            }
                                                            proveedorRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del proveedor que desea eliminar:");
                                                                idProveedor = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idProveedores.length; j++) {
                                                                    if (idProveedor == idProveedores[j]) {
                                                                        idProveedores[j] = 0;
                                                                        nombreProveedores[j] = null;
                                                                        emailProveedores[j] = null;
                                                                        telefonoProveedores[j] = 0;
                                                                        direccionProveedores[j] = null;
                                                                        System.out.println("Eliminación Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idProveedores.length - 1)) {
                                                                            System.out.println("El proveedor con ID " + idProveedor +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otro proveedor (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción inválida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otro proveedor (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar proveedores");
                                                            break;
                                                        default:
                                                            System.out.println("Opción inválida");
                                                    }
                                                } while (adminProveedor != 0);
                                                break;
                                            case 6:
                                                do {
                                                    System.out.println("""
                                                            ==========================================
                                                            |        ADMINISTRAR DEVOLUCIONES        |
                                                            ==========================================
                                                            |    1) Registrar devolución             |
                                                            |    2) Buscar devolución por ID         |
                                                            |    3) Buscar devolución porestado      |
                                                            |    4) Ver todas las devoluciones       |
                                                            |    5) Actualizar devolución            |
                                                            |    6) Eliminar devolución              |
                                                            |    0) Volver al menú anterior          |
                                                            ==========================================
                                                            """);
                                                    adminDevolucion = sc.nextInt();
                                                    sc.nextLine();

                                                    switch (adminDevolucion) {
                                                        case 1:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] == 0) {
                                                                    idDevoluciones[j] = j + 1;
                                                                    while (!seguir.equals("n")) {
                                                                        System.out.println("Ingrese el ID del pedido a devolver:");
                                                                        idPedido = sc.nextInt();
                                                                        sc.nextLine();
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idPedido == idsPedido[k]) {
                                                                                pedidoRegistrado = true;
                                                                                idPedidoDevolucion[j] = idPedido;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!pedidoRegistrado) {
                                                                            System.out.println("El pedido con el " + idPedido + " no se encuentra registrado en el sistema" +
                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                            seguir = sc.nextLine();
                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                            }
                                                                            if (!seguir.equals("s")) {
                                                                                idDevoluciones[j] = 0;
                                                                                idPedidoDevolucion[j] = 0;
                                                                                break;
                                                                            }
                                                                        }
                                                                        pedidoRegistrado = false;
                                                                    }
                                                                    seguir = "s";
                                                                    if (idDevoluciones[j] != 0) {
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Ingrese el motivo de la devolución:");
                                                                            motivoDevolucion = sc.nextLine();
                                                                            if (motivoDevolucion.isBlank()) {
                                                                                System.out.println("El motivo no puede estar vacío. ¿Desea ingresarlo nuevamente? (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idDevoluciones[j] = 0;
                                                                                    idPedidoDevolucion[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                motivosDevoluciones[j] = motivoDevolucion;
                                                                                seguir = "n";
                                                                            }
                                                                        }
                                                                    }
                                                                    seguir = "s";
                                                                    if (idDevoluciones[j] != 0) {
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Ingrese el estado de la devolución (pendiente/procesada/completada):");
                                                                            estadoDevolucion = sc.nextLine();
                                                                            if (estadoDevolucion.isBlank() ||
                                                                                    (!estadoDevolucion.equals("pendiente") && !estadoDevolucion.equals("procesada") && !estadoDevolucion.equals("completada"))) {
                                                                                System.out.println("Estado inválido: Asegurese de ingresar pendiente, procesada o completada ");
                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("¿Desea intentarlo de nuevo? (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idDevoluciones[j] = 0;
                                                                                    idPedidoDevolucion[j] = 0;
                                                                                    motivosDevoluciones[j] = null;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                estadoDevoluciones[j] = estadoDevolucion;
                                                                                System.out.println("Devolución registrada con ID: " + idDevoluciones[j]);
                                                                                seguir = "n";
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    devolucionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!devolucionRegistrada) {
                                                                System.out.println("No hay devoluciones registradas.");
                                                                break;
                                                            }
                                                            devolucionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la devolución que desea buscar:");
                                                                idDevolucion = sc.nextInt();
                                                                sc.nextLine();
                                                                nombreUsuario = null;
                                                                email = null;
                                                                nombreProducto = null;
                                                                cantidadPedido = 0;
                                                                totalPedido = 0;
                                                                for (int j = 0; j < idDevoluciones.length; j++) {
                                                                    if (idDevolucion == idDevoluciones[j]) {
                                                                        devolucionRegistrada = true;
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idsPedido[k] == idPedidoDevolucion[j]) {
                                                                                cantidadPedido = cantidadPedidos[k];
                                                                                totalPedido = totalPedidos[k];
                                                                                nombreProducto = nombreProductos[k];
                                                                                email = emailsPedidos[k];
                                                                                for (int l = 0; l < emailsUsuarios.length; l++) {
                                                                                    if (emailsUsuarios[l] != null && emailsUsuarios[l].equalsIgnoreCase(email)) {
                                                                                        nombreUsuario = nombresUsuarios[l];
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                        System.out.println("\nID de la devolución: " + idDevoluciones[j] +
                                                                                "\nNombre del usuario: " + nombreUsuario +
                                                                                "\nCorreo: " + email +
                                                                                "\nProducto: " + nombreProducto +
                                                                                "\nCantidad: " + cantidadPedido +
                                                                                "\nTotal devolución: " + totalPedido +
                                                                                "\nMotivo: " + motivosDevoluciones[j] +
                                                                                "\nEstado: " + estadoDevoluciones[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idDevoluciones.length - 1)) {
                                                                            System.out.println("La devolución con ID " + idDevolucion +
                                                                                    " no se encuentra registrada en el sistema\n");
                                                                            nombreUsuario = null;
                                                                            email = null;
                                                                            nombreProducto = null;
                                                                            cantidadPedido = 0;
                                                                            totalPedido = 0;
                                                                        }
                                                                    }
                                                                }

                                                                System.out.println("¿Desea buscar otra devolución? (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción inválida, ingrese 's' o 'n'");
                                                                    System.out.println("¿Desea buscar otra devolución? (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    devolucionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!devolucionRegistrada) {
                                                                System.out.println("No hay devoluciones registradas.");
                                                                break;
                                                            }
                                                            devolucionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("""
                                                                        ==============================
                                                                        |    SELECCIONE EL ESTADO    |
                                                                        ==============================
                                                                        |   1) Pendiente             |
                                                                        |   2) Aprobada              |
                                                                        |   3) Rechazada             |
                                                                        ==============================
                                                                        """);
                                                                opcionEstado = sc.nextInt();
                                                                sc.nextLine();
                                                                switch (opcionEstado) {
                                                                    case 1:
                                                                        estadoDevolucion = "pendiente";
                                                                        break;
                                                                    case 2:
                                                                        estadoDevolucion = "aprobada";
                                                                        break;
                                                                    case 3:
                                                                        estadoDevolucion = "rechazada";
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opción inválida, vuelva a ingresarla");
                                                                        continue;
                                                                }
                                                                for (int j = 0; j < idDevoluciones.length; j++) {
                                                                    if (idDevoluciones[j] != 0 && estadoDevolucion.equalsIgnoreCase(estadoDevoluciones[j])) {
                                                                        devolucionRegistrada = true;
                                                                        for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                            if (emailsUsuarios[k] != null && emailsUsuarios[k].equalsIgnoreCase(emailsPedidos[j])) {
                                                                                nombreUsuario = nombresUsuarios[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        for (int k = 0; k < idsPedido.length; k++) {
                                                                            if (idsPedido[k] != 0 && idsPedido[k] == idDevoluciones[j]) {
                                                                                nombreProducto = nombreProductos[k];
                                                                                cantidadPedido = cantidadPedidos[k];
                                                                                totalPedido = totalPedidos[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        System.out.println("\nID de la devolución: " + idDevoluciones[j] +
                                                                                "\nNombre del usuario: " + nombreUsuario +
                                                                                "\nCorreo: " + emailsPedidos[j] +
                                                                                "\nProducto: " + nombreProducto +
                                                                                "\nCantidad: " + cantidadPedido +
                                                                                "\nTotal devolución: " + totalPedido +
                                                                                "\nMotivo: " + motivosDevoluciones[j] +
                                                                                "\nEstado: " + estadoDevoluciones[j] + "\n");
                                                                    }
                                                                }

                                                                if (!devolucionRegistrada) {
                                                                    System.out.println("No hay devoluciones con estado: " + estadoDevolucion);
                                                                }
                                                                devolucionRegistrada = false;
                                                                System.out.println("Desea buscar devoluciones con otro estado (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción inválida. Ingrese 's' o 'n'.");
                                                                    System.out.println("¿Desea buscar otro estado? (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    devolucionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!devolucionRegistrada) {
                                                                System.out.println("No hay devoluciones registradas.");
                                                                break;
                                                            }
                                                            devolucionRegistrada = false;
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    for (int k = 0; k < emailsUsuarios.length; k++) {
                                                                        if (emailsUsuarios[k] != null && emailsUsuarios[k].equalsIgnoreCase(emailsPedidos[j])) {
                                                                            nombreUsuario = nombresUsuarios[k];
                                                                            break;
                                                                        }
                                                                    }
                                                                    for (int k = 0; k < idsPedido.length; k++) {
                                                                        if (idsPedido[k] != 0 && idsPedido[k] == idDevoluciones[j]) {
                                                                            nombreProducto = nombreProductos[k];
                                                                            cantidadPedido = cantidadPedidos[k];
                                                                            totalPedido = totalPedidos[k];
                                                                            break;
                                                                        }
                                                                    }
                                                                    System.out.println("\nID de la devolución: " + idDevoluciones[j] +
                                                                            "\nNombre del usuario: " + nombreUsuario +
                                                                            "\nCorreo: " + emailsPedidos[j] +
                                                                            "\nProducto: " + nombreProducto +
                                                                            "\nCantidad: " + cantidadPedido +
                                                                            "\nTotal devolución: " + totalPedido +
                                                                            "\nMotivo: " + motivosDevoluciones[j] +
                                                                            "\nEstado: " + estadoDevoluciones[j] + "\n");
                                                                }
                                                            }
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    devolucionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!devolucionRegistrada) {
                                                                System.out.println("No hay devoluciones registradas.");
                                                                break;
                                                            }
                                                            devolucionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la devolución que desea actualizar:");
                                                                idDevolucion = sc.nextInt();
                                                                sc.nextLine();

                                                                for (int j = 0; j < idDevoluciones.length; j++) {
                                                                    if (idDevolucion == idDevoluciones[j]) {
                                                                        devolucionRegistrada = true;
                                                                        do {
                                                                            System.out.println("""
                                                                                    =======================================
                                                                                    |        ACTUALIZAR DEVOLUCIÓN        |
                                                                                    =======================================
                                                                                    |    1) Estado                        |
                                                                                    |    2) Motivo                        |
                                                                                    |    3) Actualizar otra devolución    |
                                                                                    |    0) Atrás                         |
                                                                                    =======================================
                                                                                    """);
                                                                            actualizarDevolucion = sc.nextInt();
                                                                            sc.nextLine();
                                                                            switch (actualizarDevolucion) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El estado actual es: " + estadoDevoluciones[j] +
                                                                                                "\nIngrese el nuevo estado (pendiente/aprobada/rechazada):");
                                                                                        estadoDevolucion = sc.nextLine();
                                                                                        if (estadoDevolucion.isBlank()) {
                                                                                            System.out.println("El estado no puede estar vacío" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else if (!estadoDevolucion.equals("pendiente") && !estadoDevolucion.equals("aprobada") && !estadoDevolucion.equals("rechazada")) {
                                                                                            System.out.println("Estado inválido: asegurese que ingrese: pendiente, aprobada o rechazada en minuscula" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            estadoDevoluciones[j] = estadoDevolucion;
                                                                                            System.out.println("Actualización exitosa.");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El motivo actual es: " + motivosDevoluciones[j] +
                                                                                                "\nIngrese el nuevo motivo:");
                                                                                        motivoDevolucion = sc.nextLine();
                                                                                        if (motivoDevolucion.isBlank()) {
                                                                                            System.out.println("El motivo no puede estar vacío" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            motivosDevoluciones[j] = motivoDevolucion;
                                                                                            System.out.println("Actualización exitosa.");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    for (int k = 0; k < idDevoluciones.length; k++) {
                                                                                        if (idDevoluciones[k] != 0) {
                                                                                            devolucionRegistrada = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!devolucionRegistrada) {
                                                                                        System.out.println("No hay devoluciones registradas.");
                                                                                        break;
                                                                                    }
                                                                                    devolucionRegistrada = false;
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID de la devolución que desea actualizar:");
                                                                                        idDevolucion = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idDevolucion == 0) {
                                                                                            System.out.println("El ID de la devolución no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idDevoluciones.length; k++) {
                                                                                                if (idDevolucion == idDevoluciones[k]) {
                                                                                                    devolucionRegistrada = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!devolucionRegistrada) {
                                                                                                System.out.println("La devolución con ID " + idDevolucion + " no se encuentra registrada" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea buscar de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            devolucionRegistrada = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar devolución");
                                                                                    seguir = "n";
                                                                                    break;

                                                                                default:
                                                                                    System.out.println("Opción inválida, Vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarDevolucion != 0 && devolucionRegistrada);
                                                                        break;
                                                                    } else {
                                                                        if (j == idDevoluciones.length - 1) {
                                                                            System.out.println("La devolución con ID " + idDevolucion + " no se encuentra registrada.\n");
                                                                            devolucionRegistrada = false;
                                                                        }
                                                                    }
                                                                }
                                                                if (!devolucionRegistrada) {
                                                                    System.out.println("¿Desea intentar actualizar otra devolución? (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("Opción inválida. Ingrese 's' o 'n'.");
                                                                        System.out.println("¿Desea intentarlo de nuevo? (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                devolucionRegistrada = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 6:
                                                            for (int j = 0; j < idDevoluciones.length; j++) {
                                                                if (idDevoluciones[j] != 0) {
                                                                    devolucionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!devolucionRegistrada) {
                                                                System.out.println("No hay devoluciones registradas.");
                                                                break;
                                                            }
                                                            devolucionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la devolución que desea eliminar:");
                                                                idDevolucion = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idDevoluciones.length; j++) {
                                                                    if (idDevolucion == idDevoluciones[j]) {
                                                                        idDevoluciones[j] = 0;
                                                                        idsPedido[j] = 0;
                                                                        emailsPedidos[j] = null;
                                                                        motivosDevoluciones[j] = null;
                                                                        estadoDevoluciones[j] = null;
                                                                        System.out.println("Eliminación exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idDevoluciones.length - 1)) {
                                                                            System.out.println("La devolución con ID " + idDevolucion + " no se encuentra registrada");
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otra devolución (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción inválida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                    System.out.println("Desea eliminar otra devolución (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar Devoluciones");
                                                            break;
                                                        default:
                                                            System.out.println("Opción inválida, ingresela de nuevo");
                                                    }
                                                } while (adminDevolucion != 0);
                                                break;
                                            case 7:
                                                do {
                                                    System.out.println("""
                                                            ==========================================
                                                            |       MÉTODOS DE PAGO CLIENTE          |
                                                            ==========================================
                                                            |    1) Crear Método de Pago             |
                                                            |    2) Buscar Método de Pago por ID     |
                                                            |    3) Ver todos los Métodos de Pago    |
                                                            |    4) Actualizar Método de Pago        |
                                                            |    5) Eliminar Método de Pago          |
                                                            |    0) Atras                            |
                                                            ==========================================
                                                            """);
                                                    adminMetodoPagos = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminMetodoPagos) {
                                                        case 1:
                                                            for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                if (idMetodosPagos[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de metodos de pago");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                    if (idMetodosPagos[j] == 0) {
                                                                        idMetodoPago = j + 1;
                                                                        idMetodosPagos[j] = idMetodoPago;
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Nombre del método de pago:");
                                                                            nombreMetodoPago = sc.nextLine();
                                                                            if (nombreMetodoPago.isBlank()) {
                                                                                System.out.println("El nombre no puede estar vacio" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idMetodosPagos[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                nombreMetodosPagos[j] = nombreMetodoPago;
                                                                                seguir = "n";
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idMetodosPagos[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Tipo de método de pago (ahorro/corriente):");
                                                                                tipoMetodoPago = sc.nextLine();
                                                                                if (tipoMetodoPago.isBlank()) {
                                                                                    System.out.println("El tipo no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idMetodosPagos[j] = 0;
                                                                                        nombreMetodosPagos[j] = null;
                                                                                    }
                                                                                } else if (!tipoMetodoPago.equals("ahorro") && !tipoMetodoPago.equals("corriente")) {
                                                                                    System.out.println("Tipo invalido: Asegurese de escribir debito o credito en miniscula" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idMetodosPagos[j] = 0;
                                                                                        nombreMetodosPagos[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    tipoMetodosPagos[j] = tipoMetodoPago;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (tipoMetodosPagos[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Número de cuenta:");
                                                                                numeroCuenta = sc.nextLong();
                                                                                if (numeroCuenta == 0) {
                                                                                    System.out.println("El número de cuenta no puede ser cero" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idMetodosPagos[j] = 0;
                                                                                        nombreMetodosPagos[j] = null;
                                                                                        tipoMetodosPagos[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    numeroCuentas[j] = numeroCuenta;
                                                                                    System.out.println("\nCreacion Exitosa con ID: " + idMetodosPagos[j]);
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                    if (idMetodosPagos[j] == 0) {
                                                                        System.out.println("Desea crear un nuevo método de pago (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear un nuevo método de pago (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
                                                                    System.out.println("Se han registrado el máximo de métodos de pago");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                if (idMetodosPagos[j] != 0) {
                                                                    metodoPagoRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!metodoPagoRegistrado) {
                                                                System.out.println("No hay métodos de pago registrados.");
                                                                break;
                                                            }
                                                            metodoPagoRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del método de pago que desea buscar:");
                                                                idMetodoPago = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                    if (idMetodoPago == idMetodosPagos[j]) {
                                                                        System.out.println("\nID del método de pago: " + idMetodosPagos[j] +
                                                                                "\nNombre: " + nombreMetodosPagos[j] +
                                                                                "\nTipo: " + tipoMetodosPagos[j] +
                                                                                "\nNúmero de cuenta: " + numeroCuentas[j] + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idMetodosPagos.length - 1)) {
                                                                            System.out.println("El método de pago con ID " + idMetodoPago +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otro método de pago (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro método de pago (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                if (idMetodosPagos[j] != 0) {
                                                                    metodoPagoRegistrado = true;
                                                                    System.out.println("\nID del método de pago: " + idMetodosPagos[j] +
                                                                            "\nNombre: " + nombreMetodosPagos[j] +
                                                                            "\nTipo: " + tipoMetodosPagos[j] +
                                                                            "\nNúmero de cuenta: " + numeroCuentas[j] + "\n");
                                                                }
                                                            }
                                                            if (!metodoPagoRegistrado) {
                                                                System.out.println("No hay métodos de pagos registrados.");
                                                            }
                                                            metodoPagoRegistrado = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                if (idMetodosPagos[j] != 0) {
                                                                    metodoPagoRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!metodoPagoRegistrado) {
                                                                System.out.println("No hay métodos de pago registrados.");
                                                                break;
                                                            }
                                                            metodoPagoRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del método de pago que desea actualizar:");
                                                                idMetodoPago = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                    if (idMetodoPago == idMetodosPagos[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    =======================================
                                                                                    |     ACTUALIZAR MÉTODO DE PAGO       |
                                                                                    =======================================
                                                                                    |    1) Nombre                        |
                                                                                    |    2) Tipo                          |
                                                                                    |    3) Número de cuenta              |
                                                                                    |    4) Actualizar otro método        |
                                                                                    |    0) Atras                         |
                                                                                    =======================================
                                                                                    """);
                                                                            actualizarMetodoPago = sc.nextInt();
                                                                            sc.nextLine();
                                                                            switch (actualizarMetodoPago) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El nombre actual es: " + nombreMetodosPagos[j] +
                                                                                                "\nIngrese el nuevo nombre:");
                                                                                        nombreMetodoPago = sc.nextLine();
                                                                                        if (nombreMetodoPago.isBlank()) {
                                                                                            System.out.println("El nombre no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            nombreMetodosPagos[j] = nombreMetodoPago;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El tipo actual es: " + tipoMetodosPagos[j] +
                                                                                                "\nIngrese el nuevo tipo (debito/credito):");
                                                                                        tipoMetodoPago = sc.nextLine();
                                                                                        if (tipoMetodoPago.isBlank()) {
                                                                                            System.out.println("El tipo no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else if (!tipoMetodoPago.equals("debito") && !tipoMetodoPago.equals("credito")) {
                                                                                            System.out.println("Tipo invalido: Asegurese de escribir debito o credito" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            tipoMetodosPagos[j] = tipoMetodoPago;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El número de cuenta actual es: " + numeroCuentas[j] +
                                                                                                "\nIngrese el nuevo número de cuenta:");
                                                                                        numeroCuenta = sc.nextLong();
                                                                                        if (numeroCuenta == 0) {
                                                                                            System.out.println("El número de cuenta no puede ser cero" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            numeroCuentas[j] = numeroCuenta;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 4:
                                                                                    for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                                        if (idMetodosPagos[k] != 0) {
                                                                                            metodoPagoRegistrado = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!metodoPagoRegistrado) {
                                                                                        System.out.println("No hay métodos de pago registrados.");
                                                                                        break;
                                                                                    }
                                                                                    metodoPagoRegistrado = false;
                                                                                    seguir = "s";
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID del método de pago que desea actualizar:");
                                                                                        idMetodoPago = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idMetodoPago == 0) {
                                                                                            System.out.println("El ID del método de pago no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idMetodosPagos.length; k++) {
                                                                                                if (idMetodoPago == idMetodosPagos[k]) {
                                                                                                    metodoPagoRegistrado = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!metodoPagoRegistrado) {
                                                                                                System.out.println("El método de pago con ID " + idMetodoPago + " no se encuentra registrado" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            metodoPagoRegistrado = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar métodos de pagos");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Opcion invalida, Vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarMetodoPago != 0);
                                                                        metodoPagoRegistrado = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (idMetodosPagos.length - 1)) {
                                                                            System.out.println("El método de pago con ID: " + idMetodoPago +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (!metodoPagoRegistrado) {
                                                                    System.out.println("Desea buscar otro método de pago (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea buscar otro método de pago (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                metodoPagoRegistrado = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                if (idMetodosPagos[j] != 0) {
                                                                    metodoPagoRegistrado = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!metodoPagoRegistrado) {
                                                                System.out.println("No hay métodos de pago registrados.");
                                                                break;
                                                            }
                                                            metodoPagoRegistrado = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID del método de pago que desea eliminar:");
                                                                idMetodoPago = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idMetodosPagos.length; j++) {
                                                                    if (idMetodoPago == idMetodosPagos[j]) {
                                                                        idMetodosPagos[j] = 0;
                                                                        numeroCuentas[j] = 0;
                                                                        nombreMetodosPagos[j] = null;
                                                                        tipoMetodosPagos[j] = null;
                                                                        System.out.println("Eliminacion Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idMetodosPagos.length - 1)) {
                                                                            System.out.println("El método de pago con ID " + idMetodoPago +
                                                                                    " no se encuentra registrado en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otro método de pago (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otro método de pago (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar métodos de pago");
                                                            break;
                                                        default:
                                                            System.out.println("Opción inválida");
                                                    }
                                                } while (adminMetodoPagos != 0);
                                                break;
                                            case 8:
                                                do {
                                                    System.out.println("""
                                                            =================================================
                                                            |      ADMINISTRAR PROMOCIONES/DESCUENTOS       |
                                                            =================================================
                                                            |    1) Crear Promocion/Descuento               |
                                                            |    2) Buscar Promocion por ID                 |
                                                            |    3) Ver todas las Promociones/Descuentos    |
                                                            |    4) Buscar Promociones por estado           |
                                                            |    5) Actualizar Promocion/Descuento          |
                                                            |    6) Eliminar Promocion/Descuento            |
                                                            |    0) Atras                                   |
                                                            =================================================
                                                            """);

                                                    adminPromocionesDescuentos = sc.nextInt();
                                                    sc.nextLine();
                                                    switch (adminPromocionesDescuentos) {
                                                        case 1:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] == 0) {
                                                                    seguir = "s";
                                                                    break;
                                                                } else {
                                                                    seguir = "n";
                                                                }
                                                            }
                                                            if (seguir.equals("n")) {
                                                                System.out.println("Se han registrado el maximo de promociones");
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromociones[j] == 0) {
                                                                        idPromocion = j + 1;
                                                                        idPromociones[j] = idPromocion;
                                                                        seguir = "s";
                                                                        while (!seguir.equals("n")) {
                                                                            System.out.println("Nombre de la promoción:");
                                                                            nombrePromocion = sc.nextLine();
                                                                            if (nombrePromocion.isBlank()) {
                                                                                System.out.println("El nombre no puede estar vacio" +
                                                                                        "\nDesea ingresarlo de nuevo (s/n)");
                                                                                seguir = sc.nextLine();
                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                    System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                }
                                                                                if (!seguir.equals("s")) {
                                                                                    idPromociones[j] = 0;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                nombrePromociones[j] = nombrePromocion;
                                                                                seguir = "n";
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (idPromociones[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Descripción de la promoción:");
                                                                                descripcionPromocion = sc.nextLine();
                                                                                if (descripcionPromocion.isBlank()) {
                                                                                    System.out.println("La descripción no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    descripcionPromociones[j] = descripcionPromocion;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (descripcionPromociones[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Porcentaje de descuento:");
                                                                                porcentajePromocion = sc.nextDouble();
                                                                                sc.nextLine();
                                                                                if (porcentajePromocion == 0) {
                                                                                    System.out.println("El porcentaje no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    porcentajePromociones[j] = porcentajePromocion;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (porcentajePromociones[j] != 0) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Fecha de inicio (DD/MM/AAAA):");
                                                                                fechaInicioPromocion = sc.nextLine();
                                                                                if (fechaInicioPromocion.isBlank()) {
                                                                                    System.out.println("La fecha de inicio no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        porcentajePromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    fechaInicioPromociones[j] = fechaInicioPromocion;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (fechaInicioPromociones[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Fecha de fin (DD/MM/AAAA):");
                                                                                fechaFinPromocion = sc.nextLine();
                                                                                if (fechaFinPromocion.isBlank()) {
                                                                                    System.out.println("La fecha de fin no puede estar vacia" +
                                                                                            "\nDesea ingresarla de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarla de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        porcentajePromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                        fechaInicioPromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    fechaFinPromociones[j] = fechaFinPromocion;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (fechaFinPromociones[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("Estado de la promoción (activa/inactiva):");
                                                                                estadoPromocion = sc.nextLine();
                                                                                if (estadoPromocion.isBlank()) {
                                                                                    System.out.println("El estado no puede estar vacio" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        porcentajePromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                        fechaInicioPromociones[j] = null;
                                                                                        fechaFinPromociones[j] = null;
                                                                                    }
                                                                                } else if (!estadoPromocion.equals("activa") && !estadoPromocion.equals("inactiva")) {
                                                                                    System.out.println("Estado invalido: Asegurese de escribir activa o inactiva" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;
                                                                                        porcentajePromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                        fechaInicioPromociones[j] = null;
                                                                                        fechaFinPromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    estadoPromociones[j] = estadoPromocion;
                                                                                    seguir = "n";
                                                                                }
                                                                            }
                                                                        }
                                                                        seguir = "s";
                                                                        if (estadoPromociones[j] != null) {
                                                                            while (!seguir.equals("n")) {
                                                                                System.out.println("ID de la categoría a la que aplica:");
                                                                                idCategoria = sc.nextInt();
                                                                                sc.nextLine();
                                                                                if (idCategoria == 0) {
                                                                                    System.out.println("El ID de categoría no puede ser 0" +
                                                                                            "\nDesea ingresarlo de nuevo (s/n)");
                                                                                    seguir = sc.nextLine();
                                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                        System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                        System.out.println("Desea ingresarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                    }
                                                                                    if (!seguir.equals("s")) {
                                                                                        idPromociones[j] = 0;

                                                                                        porcentajePromociones[j] = 0;
                                                                                        nombrePromociones[j] = null;
                                                                                        descripcionPromociones[j] = null;
                                                                                        fechaInicioPromociones[j] = null;
                                                                                        fechaFinPromociones[j] = null;
                                                                                        estadoPromociones[j] = null;
                                                                                    }
                                                                                } else {
                                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                                        if (idCategoria == idCategorias[k]) {
                                                                                            categoriaRegistrada = true;
                                                                                            categoriaPromociones[j] = idCategoria;
                                                                                            nombreCategoria = nombreCategorias[k];
                                                                                            seguir = "n";
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!categoriaRegistrada) {
                                                                                        System.out.println("La categoría con ID " + idCategoria + " no se encuentra registrada" +
                                                                                                "\nDesea intentarlo de nuevo (s/n)");
                                                                                        seguir = sc.nextLine();
                                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                            System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                            System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                        }
                                                                                        if (!seguir.equals("s")) {
                                                                                            idPromociones[j] = 0;
                                                                                            porcentajePromociones[j] = 0;
                                                                                            nombrePromociones[j] = null;
                                                                                            descripcionPromociones[j] = null;
                                                                                            fechaInicioPromociones[j] = null;
                                                                                            fechaFinPromociones[j] = null;
                                                                                            estadoPromociones[j] = null;
                                                                                        }
                                                                                    }
                                                                                    categoriaRegistrada = false;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (idCategorias[j] != 0) {
                                                                            System.out.println("\nCreacion Exitosa con ID: " + idPromociones[j]);
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromociones[j] == 0) {
                                                                        System.out.println("Desea crear una nueva promoción (s/n)");
                                                                        seguir = sc.nextLine();
                                                                        maximoUsuario = false;
                                                                        while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                            System.out.println("Opción invalida, vuelva a ingresarla");
                                                                            System.out.println("Desea crear una nueva promoción (s/n)");
                                                                            seguir = sc.nextLine();
                                                                        }
                                                                        break;
                                                                    }
                                                                }
                                                                if (maximoUsuario) {
                                                                    System.out.println("Se han registrado el máximo de promociones");
                                                                    seguir = "n";
                                                                }
                                                                maximoUsuario = true;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 2:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] != 0) {
                                                                    promocionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!promocionRegistrada) {
                                                                System.out.println("No hay promociones registradas.");
                                                                break;
                                                            }
                                                            promocionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la promoción que desea buscar:");
                                                                idPromocion = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromocion == idPromociones[j]) {
                                                                        for (int k = 0; k < idCategorias.length; k++) {
                                                                            if (categoriaPromociones[j] == idCategorias[k]) {
                                                                                nombreCategoria = nombreCategorias[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        System.out.println("\nID de la promoción: " + idPromociones[j] +
                                                                                "\nNombre: " + nombrePromociones[j] +
                                                                                "\nDescripción: " + descripcionPromociones[j] +
                                                                                "\nPorcentaje de descuento: " + porcentajePromociones[j] + "%" +
                                                                                "\nFecha de inicio: " + fechaInicioPromociones[j] +
                                                                                "\nFecha de fin: " + fechaFinPromociones[j] +
                                                                                "\nEstado: " + estadoPromociones[j] +
                                                                                "\nCategoría: " + nombreCategoria + "\n");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idPromociones.length - 1)) {
                                                                            System.out.println("La promoción con ID " + idPromocion +
                                                                                    " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea buscar otra promoción (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opción invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otra promoción (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 3:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] != 0) {
                                                                    promocionRegistrada = true;
                                                                    for (int k = 0; k < idCategorias.length; k++) {
                                                                        if (categoriaPromociones[j] == idCategorias[k]) {
                                                                            nombreCategoria = nombreCategorias[k];
                                                                            break;
                                                                        }
                                                                    }
                                                                    System.out.println("\nID de la promoción: " + idPromociones[j] +
                                                                            "\nNombre: " + nombrePromociones[j] +
                                                                            "\nDescripción: " + descripcionPromociones[j] +
                                                                            "\nPorcentaje de descuento: " + porcentajePromociones[j] + "%" +
                                                                            "\nFecha de inicio: " + fechaInicioPromociones[j] +
                                                                            "\nFecha de fin: " + fechaFinPromociones[j] +
                                                                            "\nEstado: " + estadoPromociones[j] +
                                                                            "\nCategoría: " + nombreCategoria + "\n");
                                                                }
                                                            }
                                                            if (!promocionRegistrada) {
                                                                System.out.println("No hay promociones registradas.");
                                                            }
                                                            promocionRegistrada = false;
                                                            break;
                                                        case 4:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] != 0) {
                                                                    promocionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!promocionRegistrada) {
                                                                System.out.println("No hay promociones registradas.");
                                                                break;
                                                            }
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("""
                                                                        ==============================
                                                                        |    SELECCIONE EL ESTADO    |
                                                                        ==============================
                                                                        |        1) Activa           |
                                                                        |        2) Inactiva         |
                                                                        ==============================
                                                                        """);
                                                                opcionEstado = sc.nextInt();
                                                                sc.nextLine();
                                                                switch (opcionEstado) {
                                                                    case 1:
                                                                        estadoPromocion = "activa";
                                                                        break;
                                                                    case 2:
                                                                        estadoPromocion = "inactiva";
                                                                        break;
                                                                    default:
                                                                        System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                        continue;
                                                                }
                                                                promocionRegistrada = false;
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromociones[j] != 0 && estadoPromocion.equalsIgnoreCase(estadoPromociones[j])) {
                                                                        promocionRegistrada = true;
                                                                        for (int k = 0; k < idCategorias.length; k++) {
                                                                            if (categoriaPromociones[j] == idCategorias[k]) {
                                                                                nombreCategoria = nombreCategorias[k];
                                                                                break;
                                                                            }
                                                                        }
                                                                        System.out.println("\n===========================================");
                                                                        System.out.println("ID de la promoción: " + idPromociones[j] +
                                                                                "\nNombre: " + nombrePromociones[j] +
                                                                                "\nDescripción: " + descripcionPromociones[j] +
                                                                                "\nPorcentaje: " + porcentajePromociones[j] + "%" +
                                                                                "\nFecha inicio: " + fechaInicioPromociones[j] +
                                                                                "\nFecha fin: " + fechaFinPromociones[j] +
                                                                                "\nEstado: " + estadoPromociones[j] +
                                                                                "\nCategoría: " + nombreCategoria);
                                                                        System.out.println("===========================================\n");
                                                                    }
                                                                }
                                                                if (!promocionRegistrada) {
                                                                    System.out.println("No hay promociones con estado: " + estadoPromocion);
                                                                }
                                                                System.out.println("Desea buscar otro estado (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, vuelva a ingresarla");
                                                                    System.out.println("Desea buscar otro estado (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 5:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] != 0) {
                                                                    promocionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!promocionRegistrada) {
                                                                System.out.println("No hay promociones registradas.");
                                                                break;
                                                            }
                                                            promocionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la promoción que desea actualizar:");
                                                                idPromocion = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromocion == idPromociones[j]) {
                                                                        do {
                                                                            System.out.println("""
                                                                                    =======================================
                                                                                    |       ACTUALIZAR PROMOCIÓN          |
                                                                                    =======================================
                                                                                    |    1) Nombre                        |
                                                                                    |    2) Descripción                   |
                                                                                    |    3) Porcentaje                    |
                                                                                    |    4) Fecha de inicio               |
                                                                                    |    5) Fecha de fin                  |
                                                                                    |    6) Estado                        |
                                                                                    |    7) Categoría                     |
                                                                                    |    8) Actualizar otra promoción     |
                                                                                    |    0) Atras                         |
                                                                                    =======================================
                                                                                    """);
                                                                            actualizarPromocion = sc.nextInt();
                                                                            sc.nextLine();
                                                                            switch (actualizarPromocion) {
                                                                                case 1:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El nombre actual es: " + nombrePromociones[j] +
                                                                                                "\nIngrese el nuevo nombre:");
                                                                                        nombrePromocion = sc.nextLine();
                                                                                        if (nombrePromocion.isBlank()) {
                                                                                            System.out.println("El nombre no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            nombrePromociones[j] = nombrePromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 2:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La descripción actual es: " + descripcionPromociones[j] +
                                                                                                "\nIngrese la nueva descripción:");
                                                                                        descripcionPromocion = sc.nextLine();
                                                                                        if (descripcionPromocion.isBlank()) {
                                                                                            System.out.println("La descripción no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            descripcionPromociones[j] = descripcionPromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 3:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El porcentaje actual es: " + porcentajePromociones[j] + "%" +
                                                                                                "\nIngrese el nuevo porcentaje:");
                                                                                        porcentajePromocion = sc.nextDouble();
                                                                                        sc.nextLine();
                                                                                        if (porcentajePromocion == 0) {
                                                                                            System.out.println("El porcentaje no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            porcentajePromociones[j] = porcentajePromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 4:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La fecha de inicio actual es: " + fechaInicioPromociones[j] +
                                                                                                "\nIngrese la nueva fecha de inicio (DD/MM/AAAA):");
                                                                                        fechaInicioPromocion = sc.nextLine();
                                                                                        if (fechaInicioPromocion.isBlank()) {
                                                                                            System.out.println("La fecha no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            fechaInicioPromociones[j] = fechaInicioPromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 5:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("La fecha de fin actual es: " + fechaFinPromociones[j] +
                                                                                                "\nIngrese la nueva fecha de fin (DD/MM/AAAA):");
                                                                                        fechaFinPromocion = sc.nextLine();
                                                                                        if (fechaFinPromocion.isBlank()) {
                                                                                            System.out.println("La fecha no puede estar vacia" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            fechaFinPromociones[j] = fechaFinPromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 6:
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("El estado actual es: " + estadoPromociones[j] +
                                                                                                "\nIngrese el nuevo estado (activa/inactiva):");
                                                                                        estadoPromocion = sc.nextLine();
                                                                                        if (estadoPromocion.isBlank()) {
                                                                                            System.out.println("El estado no puede estar vacio" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else if (!estadoPromocion.equals("activa") && !estadoPromocion.equals("inactiva")) {
                                                                                            System.out.println("Estado invalido: Asegurese de escribir activa o inactiva" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            estadoPromociones[j] = estadoPromocion;
                                                                                            System.out.println("Actualizacion exitosa");
                                                                                            seguir = "n";
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 7:
                                                                                    while (!seguir.equals("n")) {
                                                                                        for (int k = 0; k < idCategorias.length; k++) {
                                                                                            if (categoriaPromociones[j] == idCategorias[k]) {
                                                                                                nombreCategoria = nombreCategorias[k];
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        System.out.println("La categoría actual es: " + nombreCategoria + " con el id " + categoriaPromociones[j] +
                                                                                                "\nIngrese el nuevo ID de categoría:");
                                                                                        idCategoria = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idCategoria == 0) {
                                                                                            System.out.println("El ID de categoría no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idCategorias.length; k++) {
                                                                                                if (idCategoria == idCategorias[k]) {
                                                                                                    categoriaRegistrada = true;
                                                                                                    categoriaPromociones[j] = idCategoria;
                                                                                                    System.out.println("Actualizacion exitosa");
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!categoriaRegistrada) {
                                                                                                System.out.println("La categoría con ID " + idCategoria + " no se encuentra registrada" +
                                                                                                        "\nDesea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            categoriaRegistrada = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 8:
                                                                                    for (int k = 0; k < idPromociones.length; k++) {
                                                                                        if (idPromociones[k] != 0) {
                                                                                            promocionRegistrada = true;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!promocionRegistrada) {
                                                                                        System.out.println("No hay promociones registradas.");
                                                                                        break;
                                                                                    }
                                                                                    promocionRegistrada = false;
                                                                                    seguir = "s";
                                                                                    while (!seguir.equals("n")) {
                                                                                        System.out.println("Ingrese el ID de la promoción que desea actualizar:");
                                                                                        idPromocion = sc.nextInt();
                                                                                        sc.nextLine();
                                                                                        if (idPromocion == 0) {
                                                                                            System.out.println("El ID de la promoción no puede ser 0" +
                                                                                                    "\nDesea intentarlo de nuevo (s/n)");
                                                                                            seguir = sc.nextLine();
                                                                                            while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                            }
                                                                                        } else {
                                                                                            for (int k = 0; k < idPromociones.length; k++) {
                                                                                                if (idPromocion == idPromociones[k]) {
                                                                                                    promocionRegistrada = true;
                                                                                                    j = k;
                                                                                                    seguir = "n";
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (!promocionRegistrada) {
                                                                                                System.out.println("La promoción con ID " + idPromocion + " no se encuentra registrada" +
                                                                                                        "\nDesea buscar de nuevo (s/n)");
                                                                                                seguir = sc.nextLine();
                                                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                                                    System.out.println("Opcion invalida: Asegurese de ingresar 's' o 'n' en minuscula");
                                                                                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                                                                                    seguir = sc.nextLine();
                                                                                                }
                                                                                            }
                                                                                            promocionRegistrada = false;
                                                                                        }
                                                                                    }
                                                                                    seguir = "s";
                                                                                    break;
                                                                                case 0:
                                                                                    System.out.println("Saliendo del menú actualizar promoción");
                                                                                    seguir = "n";
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("Opcion invalida, Vuelva a ingresarla");
                                                                                    break;
                                                                            }
                                                                        } while (actualizarPromocion != 0);
                                                                        promocionRegistrada = true;
                                                                        break;
                                                                    } else {
                                                                        if (j == (idPromociones.length - 1)) {
                                                                            System.out.println("La promoción con ID: " + idPromocion +
                                                                                    " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                if (!promocionRegistrada) {
                                                                    System.out.println("Desea buscar otra promoción (s/n)");
                                                                    seguir = sc.nextLine();
                                                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                                                        System.out.println("Desea buscar otra promoción (s/n)");
                                                                        seguir = sc.nextLine();
                                                                    }
                                                                }
                                                                promocionRegistrada = false;
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 6:
                                                            for (int j = 0; j < idPromociones.length; j++) {
                                                                if (idPromociones[j] != 0) {
                                                                    promocionRegistrada = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (!promocionRegistrada) {
                                                                System.out.println("No hay promociones registradas.");
                                                                break;
                                                            }
                                                            promocionRegistrada = false;
                                                            while (!seguir.equals("n")) {
                                                                System.out.println("Ingrese el ID de la promoción que desea eliminar:");
                                                                idPromocion = sc.nextInt();
                                                                sc.nextLine();
                                                                for (int j = 0; j < idPromociones.length; j++) {
                                                                    if (idPromocion == idPromociones[j]) {
                                                                        idPromociones[j] = 0;
                                                                        porcentajePromociones[j] = 0;
                                                                        categoriaPromociones[j] = 0;
                                                                        nombrePromociones[j] = null;
                                                                        descripcionPromociones[j] = null;
                                                                        fechaInicioPromociones[j] = null;
                                                                        fechaFinPromociones[j] = null;
                                                                        estadoPromociones[j] = null;
                                                                        System.out.println("Eliminacion Exitosa");
                                                                        break;
                                                                    } else {
                                                                        if (j == (idPromociones.length - 1)) {
                                                                            System.out.println("La promoción con ID " + idPromocion +
                                                                                    " no se encuentra registrada en el sistema\n");
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                System.out.println("Desea eliminar otra promoción (s/n)");
                                                                seguir = sc.nextLine();
                                                                while (!seguir.equals("s") && !seguir.equals("n")) {
                                                                    System.out.println("Opcion invalida, ingresela nuevamente");
                                                                    System.out.println("Desea eliminar otra promoción (s/n)");
                                                                    seguir = sc.nextLine();
                                                                }
                                                            }
                                                            seguir = "s";
                                                            break;
                                                        case 0:
                                                            System.out.println("Saliendo de administrar promociones");
                                                            break;
                                                        default:
                                                            System.out.println("Opción inválida");
                                                    }
                                                } while (adminPromocionesDescuentos != 0);
                                                break;
                                            case 0:
                                                System.out.println("Sesión cerrada correctamente");
                                                break;
                                            default:
                                                System.out.println("Opcion invalida, favor ingresela nuevamente");
                                                break;
                                        }
                                    } while (admin != 0);
                                }
                                if (!verificarUsuario) {
                                    System.out.println("El usuario ingresado no tiene permisos de administrador");
                                }
                                verificarUsuario = false;
                                seguir = "n";
                                break;
                            } else {
                                if (i == (emailsUsuarios.length - 1)) {
                                    System.out.println("Email o contraseña incorrecto");
                                    System.out.println("Desea intentarlo de nuevo (s/n)");
                                    seguir = sc.nextLine();
                                    while (!seguir.equals("s") && !seguir.equals("n")) {
                                        System.out.println("La opción elegida es invalida, vuelva a ingresarla");
                                        System.out.println("Desea intentarlo de nuevo (s/n)");
                                        seguir = sc.nextLine();
                                    }
                                }
                            }
                        }
                    }
                    seguir = "s";
                    break;
                case 2:
                    System.out.println("Menu clientes: Proximamente");
                    break;
                case 0:
                    System.out.println("Muchas gracias por visitarnos, vuelva pronto");
                    break;
                default:
                    System.out.println("Señor usuario la opcion es invalida, vuelva a ingresarla");
                    break;
            }
        } while (tipoUsuario != 0);
    }
}