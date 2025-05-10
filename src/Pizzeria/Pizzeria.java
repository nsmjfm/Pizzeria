package Pizzeria; // Paquete al que pertenece la clase
import java.util.Scanner; // Importación de la utilidad Scanner para leer inputs
public class Pizzeria { // Inicio de la clase (Pizzeria)
    public static void main(String[] args) { // Inicio del programa
        Pizza pizzaPepperoni = new Pizza("Pepperoni", 12990); // Construcción de la pizza 1 (Pepperoni)
        Pizza pizzaVegetariana = new Pizza("Vegetariana", 10990); // Construcción de la pizza 2 (Vegetariana)
        Pizza pizzaNapolitana = new Pizza("Napolitana", 14990); // Construcción de la pizza 3 (Napolitana)
        Pizza pizzaJamonQueso = new Pizza("Jamón-Queso", 9990); // Construcción de la pizza 4 (Jamón-Queso)
        Scanner leer = new Scanner(System.in); // Creación del Scanner (Nombre:  leer)
        String errorInput = "**** La opción ingresada no es válida"; // Cadena de texto que contiene el mensaje a enviar cuando se ingresa un input inválido
        String ingresoOpcion = "**** Opción: "; // Cadena de texto que contiene el mensaje a presentar cuando se tiene que elegir una opción
        String volviendoMenu = "**** Volviendo al menú principal..."; // Cadena de texto que contiene el mensaje a enviar cuando se vuelve al menú principal
        String decoracion = "************************************************************"; // Cadena de texto que contiene la decoración del programa (estético)
        int confirmarSalida = 0; // Definición de la variable confirmarSalida a 0 para entrar al programa
        int menuPrincipal; // Definición de la variable menuPrincipal para recibir opción ingresada en el menú principal
        int agregadoPizza; // Definición de la variable agregadoPizza para recibir opción ingresada en el menú de agregado de pizzas
        int eliminadoPizza; // Definición de la variable eliminadoPizza para recibir opción ingresada en el menú de agregado de pizzas
        int opcionDescuento; // Definición de la variable opcionDescuento para recibir la opción ingresada en el menú de descuentos
        int opcionSalida; // Definición de la variable opcionSalida para recibir la opción ingresada en el menú de confirmación de salida
        int metodoPago; // Definición de la variable metodoPago para recibir la opción ingresada en el menú de pago
        int dia; // Definición de la variable día para recibir la opción ingresada en el menú de descuentos
        int edad; // Definición de la variable edad para recibir la opción ingresada en el menú de descuentos
        int descuento = 0; // Definición de la variable descuento a 0 para registrar descuento ya aplicado (0 = No hay - 1 = Ya hay)
        int totalPago; // Acumulador que almacenará el total pendiente a pagar
        int pedidoPepperoni = 0; // Inicio del contador de pizzas pepperoni en el pedido
        int pedidoVegetariana = 0; // Inicio del contador de pizzas vegetarianas en el pedido
        int pedidoNapolitana = 0; // Inicio del contador de pizzas napolitanas en el pedido
        int pedidoJamonQueso = 0; // Inicio del contador de pizzas jamón-queso en el pedido
        do{ // Inicio del proceso hacer-mientras que hará el bucle del programa
            try{ // Inicio del proceso intentar-atrapar que manejará los errores del menú principal
                System.out.println("\n" + decoracion); // Imprime la decoración del menú principal
                System.out.println("**** 1 -> Ver resumen del pedido"); // Imprime la opción 1
                System.out.println("**** 2 -> Ver menú de pizzas"); // Imprime la opción 2
                System.out.println("**** 3 -> Agregar pizza al pedido"); // Imprime la opción 3
                System.out.println("**** 4 -> Eliminar pizza del pedido"); // Imprime la opción 4
                System.out.println("**** 5 -> Proceder al pago"); // Imprime la opción 5
                System.out.println("**** 6 -> Descuentos"); // Imprime la opción 6
                System.out.println("**** 7 -> Salir"); // Imprime la opción 7
                System.out.println(decoracion); // Imprime la decoración del menú principal
                System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                menuPrincipal = leer.nextInt(); // Recibe la opción elegida del menú principal
                switch (menuPrincipal){ // Inicio del proceso de opciones del menú principal
                    case 1: // Inicio de la opción 1 (Resumen del pedido)
                        totalPago = 0; // Definición de totalPago a 0 para volver a hacer el cálculo correctamente
                        System.out.println("\n" + decoracion); // Imprime la decoración del menú de resumen
                        if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            System.out.println("Pepperoni: " + pedidoPepperoni); // Imprime el mensaje de pizzas en pedido
                            totalPago += pizzaPepperoni.calculoPrecio(pedidoPepperoni); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            System.out.println("Vegetariana: " + pedidoVegetariana); // Imprime el mensaje de pizzas en pedido
                            totalPago += pizzaVegetariana.calculoPrecio(pedidoVegetariana); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            System.out.println("Napolitana: " + pedidoNapolitana); // Imprime el mensaje de pizzas en pedido
                            totalPago += pizzaNapolitana.calculoPrecio(pedidoNapolitana); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            System.out.println("Jamón-Queso: " + pedidoJamonQueso); // Imprime el mensaje de pizzas en pedido
                            totalPago += pizzaJamonQueso.calculoPrecio(pedidoJamonQueso); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoPepperoni == 0 && pedidoVegetariana == 0 && pedidoNapolitana == 0 && pedidoJamonQueso == 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            System.out.println("**** No has agregado pizzas a tu pedido"); // Imprime el mensaje de aviso, no hay pizzas en el pedido
                            break; // Fin temprano, no hay pizzas por lo que no procede al cálculo
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(descuento == 1){ // Inicio del proceso si, calcula descuento si hay uno activo
                            totalPago = (int) (totalPago * 0.90); // Calculo del descuento (10% menos)
                        } // Fin del proceso si, calcula descuento si hay uno activo
                        System.out.println("**** El total a pagar es de $" + totalPago + " pesos"); // Imprime el mensaje del total a pagar
                        System.out.println(decoracion); // Imprime la decoración del menú de resumen
                        break; // Fin de la opción 1
                    case 2: // Inicio de la opción 2 (Ver menú de pizzas)
                        System.out.println("\n" + decoracion); // Imprime la decoración del menú de pizzas
                        pizzaPepperoni.mostrarInfo(); // Imprime la información de la pizza pepperoni
                        pizzaVegetariana.mostrarInfo(); // Imprime la información de la pizza vegetariana
                        pizzaNapolitana.mostrarInfo(); // Imprime la información de la pizza napolitana
                        pizzaJamonQueso.mostrarInfo(); // Imprime la información de la pizza jamón-queso
                        System.out.println(decoracion); // Imprime la decoración del menú de pizzas
                        break; // Fin de la opción 2
                    case 3: // Inicio de la opción 3 (Agregado de pizzas)
                        do{ // Inicio del proceso hacer-mientras para el menú de agregado de pizzas
                            try{ // Inicio del proceso intentar-atrapar para manejar errores en el menú de agregado de pizzas
                                System.out.println("\n" + decoracion); // Imprime la decoración del menú de agregado de pizzas
                                System.out.println("**** 1 -> Agregar pizza pepperoni"); // Imprime la opción 1
                                System.out.println("**** 2 -> Agregar pizza vegetariana"); // Imprime la opción 2
                                System.out.println("**** 3 -> Agregar pizza napolitana"); // Imprime la opción 3
                                System.out.println("**** 4 -> Agregar pizza jamón-queso"); // Imprime la opción 4
                                System.out.println("**** 5 -> Volver"); // Imprime la opción 5
                                System.out.println(decoracion); // Imprime la decoración del menú de agregado de pizzas
                                System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                                agregadoPizza = leer.nextInt(); // Recibe la opción elegida del menú de agregado de pizzas
                                switch (agregadoPizza){ // Inicio del proceso de opciones del menú de agregado de pizzas
                                    case 1: // Inicio de la opción 1 (Agregar pizza pepperoni)
                                        pedidoPepperoni += 1; // Suma 1 al contador de pizzas pepperoni en el pedido
                                        System.out.println("**** Pizza pepperoni agregada al pedido");
                                        break; // Fin de la opción 1
                                    case 2: // Inicio de la opción 2 (Agregar pizza vegetariana)
                                        pedidoVegetariana += 1; // Suma 1 al contador de pizzas vegetarianas en el pedido
                                        System.out.println("**** Pizza vegetariana agregada al pedido");
                                        break; // Fin de la opción 2
                                    case 3: // Inicio de la opción 3 (Agregar pizza napolitana)
                                        pedidoNapolitana += 1; // Suma 1 al contador de pizzas napolitanas en el pedido
                                        System.out.println("**** Pizza napolitana agregada al pedido");
                                        break; // Fin de la opción 3
                                    case 4: // Inicio de la opción 4 (Agregar pizza jamón-queso)
                                        pedidoJamonQueso += 1; // Suma 1 al contador de pizzas jamón-queso en el pedido
                                        System.out.println("**** Pizza jamón-queso agregada al pedido");
                                        break; // Fin de la opción 4
                                    case 5: // Inicio de la opción 5 (Volver)
                                        System.out.println(volviendoMenu); // Imprime el mensaje de confirmación de vuelta al menú principal
                                        break; // Fin de la opción 5
                                    default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-5))
                                        System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                                        leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                        break; // Fin de la opción default
                                } // Fin del proceso de opciones del menú de agregado de pizzas
                            } catch (Exception error) { // Proceso atrapar para manejar errores
                                System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                                leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                agregadoPizza = 0; // Definición de agregadoPizza a 0 para continuar en el bucle
                            } // Fin del proceso intentar-atrapar para manejar errores en el menú de agregado de pizzas
                        }while(agregadoPizza != 5); // Fin del proceso hacer-mientras para el menú de agregado de pizzas (Condición de término: Opción elegida debe ser 5 (Volver))
                        break; // Fin de la opción 3
                    case 4: // Inicio de la opción 4 (Eliminado de pizzas)
                        do{ // Inicio del proceso hacer-mientras para el menú de eliminado de pizzas
                            try{ // Inicio del proceso intentar-atrapar para manejar errores en el menú de eliminado de pizzas
                                System.out.println("\n" + decoracion); // Imprime la decoración del menú de eliminado de pizzas
                                System.out.println("**** 1 -> Eliminar pizza pepperoni"); // Imprime la opción 1
                                System.out.println("**** 2 -> Eliminar pizza vegetariana"); // Imprime la opción 2
                                System.out.println("**** 3 -> Eliminar pizza napolitana"); // Imprime la opción 3
                                System.out.println("**** 4 -> Eliminar pizza jamón-queso"); // Imprime la opción 4
                                System.out.println("**** 5 -> Volver"); // Imprime la opción 5
                                System.out.println(decoracion); // Imprime la decoración del menú de eliminado de pizzas
                                System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                                eliminadoPizza = leer.nextInt(); // Recibe la opción elegida del menú de eliminado de pizzas
                                switch (eliminadoPizza){ // Inicio del proceso de opciones del menú de eliminado de pizzas
                                    case 1: // Inicio de la opción 1 (Eliminar pizza pepperoni)
                                        if(!(pedidoPepperoni > 0)){ // Inicio del proceso si, verifica que hayan pizzas en el pedido
                                            System.out.println("**** No tienes pizzas pepperoni en tu pedido"); // Imprime el mensaje a enviar cuando no hay pizzas que eliminar
                                            break; // Fin temprano de la opción 1 porque no hay pizzas que eliminar
                                        } // Fin del proceso si, verifica que hayan pizzas en el pedido
                                        pedidoPepperoni -= 1; // Resta 1 al contador de pizzas pepperoni en el pedido
                                        System.out.println("**** Pizza pepperoni eliminada del pedido");
                                        break; // Fin de la opción 1
                                    case 2: // Inicio de la opción 2 (Eliminar pizza vegetariana)
                                        if(!(pedidoVegetariana > 0)){ // Inicio del proceso si, verifica que hayan pizzas en el pedido
                                            System.out.println("**** No tienes pizzas vegetarianas en tu pedido"); // Imprime el mensaje a enviar cuando no hay pizzas que eliminar
                                            break; // Fin temprano de la opción 2 porque no hay pizzas que eliminar
                                        } // Fin del proceso si, verifica que hayan pizzas en el pedido
                                        pedidoVegetariana -= 1; // Resta 1 al contador de pizzas vegetarianas en el pedido
                                        System.out.println("**** Pizza vegetariana eliminada del pedido");
                                        break; // Fin de la opción 2
                                    case 3: // Inicio de la opción 3 (Eliminar pizza napolitana)
                                        if(!(pedidoNapolitana > 0)){ // Inicio del proceso si, verifica que hayan pizzas en el pedido
                                            System.out.println("**** No tienes pizzas napolitanas en tu pedido"); // Imprime el mensaje a enviar cuando no hay pizzas que eliminar
                                            break; // Fin temprano de la opción 3 porque no hay pizzas que eliminar
                                        } // Fin del proceso si, verifica que hayan pizzas en el pedido
                                        pedidoNapolitana -= 1; // Resta 1 al contador de pizzas napolitanas en el pedido
                                        System.out.println("**** Pizza napolitana eliminada del pedido");
                                        break; // Fin de la opción 3
                                    case 4: // Inicio de la opción 4 (Eliminar pizza jamón-queso)
                                        if(!(pedidoJamonQueso > 0)){ // Inicio del proceso si, verifica que hayan pizzas en el pedido
                                            System.out.println("**** No tienes pizzas jamón-queso en tu pedido"); // Imprime el mensaje a enviar cuando no hay pizzas que eliminar
                                            break; // Fin temprano de la opción 4 porque no hay pizzas que eliminar
                                        } // Fin del proceso si, verifica que hayan pizzas en el pedido
                                        pedidoJamonQueso -= 1; // Resta 1 al contador de pizzas jamón-queso en el pedido
                                        System.out.println("**** Pizza jamón-queso eliminada del pedido");
                                        break; // Fin de la opción 4
                                    case 5: // Inicio de la opción 5 (Volver)
                                        System.out.println(volviendoMenu); // Imprime el mensaje de confirmación de vuelta al menú principal
                                        break; // Fin de la opción 5
                                    default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-5))
                                        System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                                        leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                        break; // Fin de la opción default
                                } // Fin del proceso de opciones del menú de eliminado de pizzas
                            } catch (Exception error) { // Proceso atrapar para manejar errores
                                System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                                leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                eliminadoPizza = 0; // Definición de eliminadoPizza a 0 para continuar en el bucle
                            } // Fin del proceso intentar-atrapar para manejar errores en el menú de eliminado de pizzas
                        }while(eliminadoPizza != 5); // Fin del proceso hacer-mientras para el menú de eliminado de pizzas (Condición de término: Opción elegida debe ser 5 (Volver))
                        break; // Fin de la opción 4
                    case 5: // Inicio de la opción 5 (Pago)
                        totalPago = 0; // Definición de totalPago a 0 para volver a hacer el cálculo correctamente
                        if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            totalPago += pizzaPepperoni.calculoPrecio(pedidoPepperoni); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            totalPago += pizzaVegetariana.calculoPrecio(pedidoVegetariana); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            totalPago += pizzaNapolitana.calculoPrecio(pedidoNapolitana); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                            totalPago += pizzaJamonQueso.calculoPrecio(pedidoJamonQueso); // Calcula el precio total de las pizzas y lo suma al acumulador
                        } // Fin del proceso si, verifica si hay pizzas en el pedido
                        if(descuento == 1){ // Inicio del proceso si, calcula descuento si hay uno activo
                            totalPago = (int) (totalPago * 0.90); // Calculo del descuento (10% menos)
                        } // Fin del proceso si, calcula descuento si hay uno activo
                        if(!(totalPago > 0)){ // Inicio del proceso si, verifica que haya deuda
                            System.out.println("**** No has agregado pizzas al pedido, volviendo al menú principal..."); // Imprime el mensaje a enviar cuando no hay deuda que pagar
                            break; // Fin temprano de la opción 5, no hay deuda
                        } // Fin del proceso si, verifica que haya deuda
                        do{ // Inicio del proceso hacer-mientras para el menú de pago
                            try{ // Inicio del proceso intentar-atrapar para manejar errores en el menú de pago
                                System.out.println("\n" + decoracion); // Imprime la decoración del menú de pago
                                System.out.println("**** El total a pagar es de $" + totalPago + " pesos, elige tu método de pago"); // Imprime el mensaje del total a pagar
                                System.out.println("**** 1 -> Efectivo"); // Imprime la opción 1
                                System.out.println("**** 2 -> Débito"); // Imprime la opción 1
                                System.out.println("**** 3 -> Crédito"); // Imprime la opción 1
                                System.out.println("**** 4 -> Volver"); // Imprime la opción 1
                                System.out.println(decoracion); // Imprime la decoración del menú de pago
                                System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                                metodoPago = leer.nextInt(); // Recibe la opción ingresada en el menú de pago
                                switch (metodoPago){ // Inicio del proceso de opciones del menú de pago
                                    case 1: // Inicio de la opción 1 (Efectivo)
                                        System.out.println("**** Has pagado tu pedido con efectivo"); // Imprime el mensaje de confirmación de pago
                                        metodoPago = 4; // Definición de metodoPago a 4 para salir al menú principal
                                        if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoPepperoni = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoVegetariana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoNapolitana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoJamonQueso = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        break; // Fin de la opción 1
                                    case 2: // Inicio de la opción 2 (Débito)
                                        System.out.println("**** Has pagado tu pedido con débito"); // Imprime el mensaje de confirmación de pago
                                        metodoPago = 4; // Definición de metodoPago a 4 para salir al menú principal
                                        if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoPepperoni = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoVegetariana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoNapolitana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoJamonQueso = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        break; // Fin de la opción 2
                                    case 3: // Inicio de la opción 3 (Crédito)
                                        System.out.println("**** Has pagado tu pedido con crédito"); // Imprime el mensaje de confirmación de pago
                                        metodoPago = 4; // Definición de metodoPago a 4 para salir al menú principal
                                        if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoPepperoni = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoVegetariana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoNapolitana = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica que hayan pizzas en pedido
                                            pedidoJamonQueso = 0; // Definición del contador a 0 para limpiar pedido
                                        } // Fin del proceso si, verifica que hayan pizzas en pedido
                                        break; // Fin de la opción 3
                                    case 4: // Inicio de la opción 4 (Volver)
                                        System.out.println(volviendoMenu); // Imprime el mensaje de confirmación de vuelta al menú principal
                                        break; // Fin de la opción 4
                                    default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-3))
                                        System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                                        leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                        break; // Fin de la opción default
                                } // Fin del proceso de opciones del menú de pago
                            } catch (Exception error) { // Proceso atrapar para manejar errores
                                System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                                leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                metodoPago = 0; // Definición de metodoPago a 0 para continuar en el bucle
                            } // Fin del proceso intentar-atrapar para manejar errores en el menú de pago
                        }while(metodoPago != 4); // Fin del proceso hacer-mientras para el menú de pago (Condición de término: Opción elegida debe ser 4 (Volver))
                        break; // Fin de la opción 5
                    case 6: // Inicio de la opción 6 (Descuentos)
                        do{ // Inicio del proceso hacer-mientras para el menú de descuentos
                            try{ // Inicio del proceso intentar-atrapar para manejar errores en el menú de descuentos
                                System.out.println("\n" + decoracion); // Imprime la decoración del menú de descuentos
                                System.out.println("**** 1 -> Descuento por día"); // Imprime la opción 1
                                System.out.println("**** 2 -> Descuento por edad"); // Imprime la opción 2
                                System.out.println("**** 3 -> Volver"); // Imprime la opción 3
                                System.out.println(decoracion); // Imprime la decoración del menú de descuentos
                                System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                                opcionDescuento = leer.nextInt(); // Recibe la opción elegida del menú de descuentos
                                switch (opcionDescuento){ // Inicio del proceso de opciones del menú de descuentos
                                    case 1: // Inicio de la opción 1 (Descuento por día)
                                        if(descuento == 1){ // Inicio del proceso si, verificación de descuento
                                            System.out.println("**** Ya tienes un descuento activo"); // Imprime el mensaje a enviar cuando ya hay un descuento activo
                                            break; // Fin temprano de la opción 1 porque ya hay descuento
                                        } // Fin del proceso si, verificación de descuento
                                        System.out.println("**** Lunes-Domingo (1-7)"); // Imprime mensaje de información de días
                                        System.out.print("**** Ingresa que día es hoy: "); // Imprime el mensaje de elección sin salto de línea
                                        dia = leer.nextInt(); // Recibe la opción ingresada en el menú de descuentos
                                        if(dia != 1){ // Inicio del proceso si, verifica si hay descuento en el día seleccionado
                                            System.out.println("**** El día de hoy no hay descuentos disponibles"); // Imprime el mensaje a enviar cuando la opción no es 1 (Lunes)
                                            break; // Fin temprano de la opción 1, no hay descuento el día seleccionado
                                        } // Fin del proceso si, verifica si hay descuento en el día seleccionado
                                        descuento = 1; // Definición de descuento a 1 para confirmar descuento aplicado
                                        System.out.println("**** Hoy es Lunes, se activó un descuento del 10%"); // Imprime el mensaje de confirmación de descuento
                                        break; // Fin de la opción 1
                                    case 2: // Inicio de la opción 2 (Descuento por edad)
                                        if(descuento == 1){ // Inicio del proceso si, verificación de descuento
                                            System.out.println("**** Ya tienes un descuento activo"); // Imprime el mensaje a enviar cuando ya hay un descuento activo
                                            break; // Fin temprano de la opción 2 porque ya hay descuento
                                        } // Fin del proceso si, verificación de descuento
                                        System.out.print("**** Ingresa tu edad: "); // Imprime el mensaje de elección sin salto de línea
                                        edad = leer.nextInt(); // Recibe la opción ingresada en el menú de descuentos
                                        if(edad > 30){ // Inicio del proceso si, verifica si hay descuento para la edad especificada
                                            System.out.println("**** No eres elegible para el descuento por edad"); // Imprime el mensaje a enviar cuando la opción no es > 30
                                            break; // Fin temprano de la opción 2, no hay descuento para la edad especificada
                                        } // Fin del proceso si, verifica si hay descuento para la edad especificada
                                        descuento = 1; // Definición de descuento a 1 para confirmar descuento aplicado
                                        System.out.println("**** Tienes menos de 30 años, se activó un descuento del 10%"); // Imprime el mensaje de confirmación de descuento
                                        break; // Fin de la opción 2
                                    case 3: // Inicio de la opción 3 (Volver)
                                        System.out.println(volviendoMenu); // Imprime el mensaje de confirmación de vuelta al menú principal
                                        break; // Fin de la opción 3
                                    default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-3))
                                        System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                                        leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                        break; // Fin de la opción default
                                } // Fin del proceso de opciones del menú de descuentos
                            } catch (Exception error) { // Proceso atrapar para manejar errores
                                System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                                leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                opcionDescuento = 0; // Definición de opcionDescuento a 0 para continuar en el bucle
                            } // Fin del proceso intentar-atrapar para manejar errores en el menú de descuentos
                        }while(opcionDescuento != 3); // Fin del proceso hacer mientras para el menú de descuentos (Condición de término: Opción elegida debe ser 3 (Volver))
                        break; // Fin de la opción 6
                    case 7: // Inicio de la opción 7 (Menú de salida)
                         do{ // Inicio del proceso hacer-mientras para el menú de confirmación de salida
                             try{ // Inicio del proceso intentar-atrapar para manejar errores en el menú de confirmación de salida
                                 System.out.println("\n" + decoracion); // Imprime la decoración del menú de confirmación de salida
                                 System.out.println("**** ¿Seguro?, confirma tu salida"); // Imprime el título del menú de confirmación de salida
                                 System.out.println("**** 1 -> Sí, salir"); // Imprime la opción 1
                                 System.out.println("**** 2 -> No, quedarse"); // Imprime la opción 2
                                 System.out.println(decoracion); // Imprime la decoración del menú de confirmación de salida
                                 System.out.print(ingresoOpcion); // Imprime el mensaje de elección sin salto de línea
                                 opcionSalida = leer.nextInt(); // Recibe la opción elegida en el menú de confirmación de salida
                                 switch (opcionSalida){ // Inicio del proceso de opciones del menú de confirmación de salida
                                     case 1: // Inicio de la opción 1 (Salir)
                                         totalPago = 0; // Definición de totalPago a 0 para volver a hacer el cálculo correctamente
                                         if(pedidoPepperoni > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                                             totalPago += pizzaPepperoni.calculoPrecio(pedidoPepperoni); // Calcula el precio total de las pizzas y lo suma al acumulador
                                         } // Fin del proceso si, verifica si hay pizzas en el pedido
                                         if(pedidoVegetariana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                                             totalPago += pizzaVegetariana.calculoPrecio(pedidoVegetariana); // Calcula el precio total de las pizzas y lo suma al acumulador
                                         } // Fin del proceso si, verifica si hay pizzas en el pedido
                                         if(pedidoNapolitana > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                                             totalPago += pizzaNapolitana.calculoPrecio(pedidoNapolitana); // Calcula el precio total de las pizzas y lo suma al acumulador
                                         } // Fin del proceso si, verifica si hay pizzas en el pedido
                                         if(pedidoJamonQueso > 0){ // Inicio del proceso si, verifica si hay pizzas en el pedido
                                             totalPago += pizzaJamonQueso.calculoPrecio(pedidoJamonQueso); // Calcula el precio total de las pizzas y lo suma al acumulador
                                         } // Fin del proceso si, verifica si hay pizzas en el pedido
                                         if(descuento == 1){ // Inicio del proceso si, calcula descuento si hay uno activo
                                             totalPago = (int) (totalPago * 0.90); // Calculo del descuento (10% menos)
                                         } // Fin del proceso si, calcula descuento si hay uno activo
                                         if(totalPago > 0){ // Inicio del proceso si, verifica si hay deuda
                                             System.out.println("**** No has pagado tu pedido, volviendo al menú principal..."); // Imprime el mensaje a enviar cuando hay deuda
                                             break; // Fin temprano de la opción 1, hay deuda
                                         } // Fin del proceso si, verifica si hay deuda
                                         System.out.println("**** Saliendo de la pizzeria..."); // Imprime el mensaje de confirmación de salida del programa
                                         confirmarSalida = 1; // Definición de confirmarSalida a 1 para salir del programa
                                         break; // Fin de la opción 1
                                     case 2: // Inicio de la opción 2 (Quedarse)
                                         System.out.println(volviendoMenu); // Imprime el mensaje de confirmación de vuelta al menú principal
                                         opcionSalida = 1; // Definición de opcionSalida a 1 para salir del bucle
                                         break; // Fin de la opción 2
                                     default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-2))
                                         System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                                         leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                         break; // Fin de la opción default
                                 } // Fin del proceso de opciones del menú de confirmación de salida
                             } catch (Exception error) { // Proceso atrapar para manejar errores
                                 System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                                 leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                                 opcionSalida = 0; // Definición de opcionSalida a 0 para seguir en el bucle
                             } // Fin del proceso intentar-atrapar para manejar errores en el menú de confirmación de salida
                         }while(opcionSalida != 1); // Fin del proceso hacer-mientras para el menú de confirmación de salida (Condición de término: Opción elegida debe ser 1 (Salir))
                        break; // Fin de la opción 7
                    default: // Inicio de la opción default (Cuando el input es un número válido pero no está en el rango disponible (1-7))
                        System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no está en el rango disponible
                        leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
                        break; // Fin de la opción default
                } // Fin del proceso de opciones del menú principal
            }catch(Exception error){ // Proceso atrapar para manejar errores
                System.out.println(errorInput); // Imprime el mensaje a enviar cuando el input no sea un número (int)
                leer.nextLine(); // Limpieza del Scanner para seguir programa correctamente
            } // Fin del proceso intentar-atrapar que manejará los errores del menú principal
        }while(confirmarSalida != 1); // Fin del proceso hacer-mientras que hará el bucle del programa (Condición de término: Opción elegida en el menú de confirmación de salida debe ser 1)
    } // Fin del programa
} // Fin de la clase (Pizzeria)