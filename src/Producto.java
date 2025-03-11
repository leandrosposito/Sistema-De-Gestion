import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Clase que representa un producto en el inventario
public class Producto {
    // Atributos del producto
    private int id;            // Identificador único del producto
    private String nombre;     // Nombre del producto
    private int cantidad;      // Cantidad disponible en el inventario
    private double precio;     // Precio del producto

    // Constructor que inicializa un producto con los valores dados
    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;                // Asigna el ID recibido al atributo de la clase
        this.nombre = nombre;        // Asigna el nombre recibido al atributo de la clase
        this.cantidad = cantidad;    // Asigna la cantidad recibida al atributo de la clase
        this.precio = precio;        // Asigna el precio recibido al atributo de la clase
    }

    // Métodos "getter" para obtener los valores de los atributos

    public int getId() {
        return id;                   // Devuelve el ID del producto
    }

    public String getNombre() {
        return nombre;                // Devuelve el nombre del producto
    }

    public int getCantidad() {
        return cantidad;              // Devuelve la cantidad disponible del producto
    }

    public double getPrecio() {
        return precio;                // Devuelve el precio del producto
    }

    // Métodos "setter" para modificar los valores de los atributos

    public void setNombre(String nombre) {
        this.nombre = nombre;         // Modifica el nombre del producto
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;     // Modifica la cantidad disponible del producto
    }

    public void setPrecio(double precio) {
        this.precio = precio;         // Modifica el precio del producto
    }

    // Método toString() para representar el producto de manera legible
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
    }

}