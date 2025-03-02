// Importamos la librería para manejar listas
import java.util.ArrayList;
import java.util.List;

// Definimos la clase Inventario
public class Inventario {

    // Lista de productos que componen el inventario
    private List<Producto> productos;

    // Constructor que inicializa la lista vacía
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método para obtener la lista de productos
    public List<Producto> getProductos() {
        return productos;
    }

    // Método para agregar un producto a la lista de inventario
    public void agregarProducto(Producto producto){
        productos.add(producto); // Añade el producto a la lista
        System.out.println("Producto agregado " + producto.getNombre());
    }

    // Método para eliminar un producto por su ID
    public void eliminarProducto(int id){
        // Recorre la lista y elimina el producto que tenga el ID indicado
        productos.removeIf(producto -> producto.getId() == id);
        System.out.println("Producto con ID " + id + " eliminado.");
    }

    // Método para mostrar todos los productos en el inventario
    public void mostrarInventario(){
        System.out.println("Inventario actual:");
        // Recorre la lista e imprime la información de cada producto
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

    // Método para modificar un producto existente en el inventario
    public void modificarProducto(int id, String nuevoNombre,int nuevaCantidad, double nuevoPrecio){
        // Buscamos el producto por su ID
        for(Producto producto : productos){
            if(producto.getId() == id) {
                producto.setNombre(nuevoNombre);
                producto.setCantidad(nuevaCantidad);
                producto.setPrecio(nuevoPrecio);
                System.out.println("Producto con ID: " + id + " modificado.");
                return;
            }
        }
        // Si no encontramos el producto, mostramos un mensaje
        System.out.println("Producto con ID: " + id + " no encontrado.");
    }
}

