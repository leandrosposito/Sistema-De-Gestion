import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Clase principal donde se ejecutará el programa
public class Main {
    public static void main(String[] args) {
        // Creamos el objeto inventario
        Inventario inventario = new Inventario();

        // Creamos dos productos con ID, nombre, cantidad y precio
        Producto producto1 = new Producto(1, "Laptop", 5, 12500.45);
        Producto producto2 = new Producto(2, "pc", 15, 5400.65);
        Producto producto3 = new Producto(3, "mouse", 23,  1405.15);

        // Agregamos los productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Crear el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int opcion = -1; // Inicializamos la variable opcion con un valor distinto de 0

        do{
            // Mostrar el menú
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada
            opcion = scanner.nextInt();

            // Acción según la opción seleccionada
            switch(opcion) {
                case 1:
                    // Ver inventario
                    verInventario(inventario);
                    break;
                case 2:
                    // Agregar producto
                    agregarProducto(inventario, scanner);
                    break;
                case 3:
                    // Modificar producto
                    modificarProducto(inventario, scanner);
                    break;
                case 4:
                    eliminarProducto(inventario, scanner);
                    break;
                case 0:
                    //salir del sistema
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }while(opcion != 0);
    }
    // Método para ver el inventario
    public static void verInventario(Inventario inventario){
        System.out.println("\n---inventario---\n");
        if(inventario.getProductos().isEmpty()){
            System.out.println("El inventario está vacío.");
        } else {
            for(Producto producto : inventario.getProductos()){
                System.out.println("ID: " + producto.getId() + " Nombre: " + producto.getNombre() + " Cantidad: " + producto.getCantidad() + " Precio: " + producto.getPrecio());
            }
        }
    }

    // Método para agregar un producto
    public static void agregarProducto(Inventario inventario, Scanner scanner){
        System.out.println("\n---Agregar un producto---\n");

        System.out.println("Ingrese el ID del producto: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        Producto nuevoProducto = new Producto(id, nombre, cantidad, precio);
        inventario.agregarProducto(nuevoProducto);
    }

    // Método para eliminar un producto
    public static void eliminarProducto(Inventario inventario, Scanner scanner){
        System.out.println("\n---Eliminar un producto---\n");

        System.out.println("Ingrese el ID del producto: ");
        int id = scanner.nextInt();

        inventario.eliminarProducto(id);

    }

    // Método para modificar un producto
    public static void modificarProducto(Inventario inventario, Scanner scanner){
        System.out.println("\n--- Modificar un producto ---\n");

        System.out.println("Ingrese el ID del producto a modificar: ");
        int id = scanner.nextInt();

        // Solicitar nuevos valores
        scanner.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        String nuevoNombre = scanner.nextLine();

        System.out.println("Ingrese la cantidad: ");
        int nuevaCantidad = scanner.nextInt();

        System.out.println("Ingrese el precio: ");
        double nuevoPrecio = scanner.nextDouble();

        inventario.modificarProducto(id, nuevoNombre, nuevaCantidad, nuevoPrecio); // Se verificó que este método exista en Inventario.java
    }
}
