import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregamos algunos productos iniciales
        inventario.agregarProducto(new Producto(1, "Laptop", 5, 12500.45));
        inventario.agregarProducto(new Producto(2, "PC", 15, 5400.65));
        inventario.agregarProducto(new Producto(3, "Mouse", 23, 1405.15));

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    inventario.mostrarInventario();
                    break;
                case 2:
                    inventario.agregarProducto(scanner);
                    break;
                case 3:
                    inventario.modificarProducto(scanner);
                    break;
                case 4:
                    inventario.eliminarProducto(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}