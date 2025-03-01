// Definimos la clase Producto
public class Producto {
    // Atributos privados (solo accesibles dentro de la clase)
    private int id;
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor de la clase para inicializar los atributos
    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id; // Asigna el valor recibido al atributo id
        this.nombre = nombre; // Asigna el nombre
        this.cantidad = cantidad; // Asigna la cantidad de stock
        this.precio = precio; // Asigna el precio
    }

    // Métodos "get" para obtener los valores de los atributos
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getPrecio(){
        return precio;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    // Método para mostrar información del producto
    public void mostrarinformacion(){
        System.out.println("ID: " + id + " Nombre: " + nombre + " Cantidad: " + cantidad + " Precio: $" + precio);
    }


}
