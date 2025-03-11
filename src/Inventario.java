import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void agregarProducto(Scanner scanner) {
        System.out.println("\n--- Agregar un producto ---\n");

        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
        agregarProducto(nuevoProducto);
    }

    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
        System.out.println("Producto con ID " + id + " eliminado.");
    }

    public void eliminarProducto(Scanner scanner) {
        System.out.println("\n--- Eliminar un producto ---\n");
        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        eliminarProducto(id);
    }

    public void mostrarInventario() {
        System.out.println("\n--- Inventario ---\n");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : productos) {
                System.out.println("ID: " + producto.getId() +
                        " Nombre: " + producto.getNombre() +
                        " Cantidad: " + producto.getCantidad() +
                        " Precio: " + producto.getPrecio());
            }
        }
    }



    public void modificarProducto(Scanner scanner) {
        System.out.println("\n--- Modificar un producto ---\n");

        System.out.print("Ingrese el ID del producto a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nuevo nombre del producto: ");
        String nuevoNombre = scanner.nextLine();

        System.out.print("Ingrese la nueva cantidad: ");
        int nuevaCantidad = scanner.nextInt();

        System.out.print("Ingrese el nuevo precio: ");
        double nuevoPrecio = scanner.nextDouble();

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(nuevoNombre);
                producto.setCantidad(nuevaCantidad);
                producto.setPrecio(nuevoPrecio);
                System.out.println("Producto con ID " + id + " modificado.");
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }


}
