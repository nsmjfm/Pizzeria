package Pizzeria; // Paquete al que pertenece la clase
public class Pizza { // Inicio de la clase (Pizza)
    String nombre; // Nombre de la pizza
    int precio; // Precio de la pizza
    public Pizza(String nombre, int precio){ // Inicio del constructor de pizzas
        this.nombre = nombre; // Definición del nombre de la pizza
        this.precio = precio; // Definición del precio de la pizza
    } // Fin del constructor de pizzas
    public void mostrarInfo(){ // Inicio del proceso que muestra la información de la pizza
        System.out.println("**** " + nombre + " por un precio de $" + precio + " pesos"); // Imprime la información de la pizza
    } // Fin del proceso que muestra la información de la pizza
    public int calculoPrecio(int cantidad) { // Inicio del proceso que calcula el precio de las pizzas en el pedido
        return precio * cantidad; // Retorna el precio total de las pizzas en pedido (precio * cantidad)
    } // Fin del proceso que calcula el precio de las pizzas en el pedido
} // Fin de la clase (Pizza)