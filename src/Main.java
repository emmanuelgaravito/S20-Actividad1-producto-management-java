import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Producto> productos= new ArrayList<>();
    static Scanner leer = new Scanner(System.in);
    static String nombre, categoria, tamanno;
    static int cantidad;


    public static void main(String[] args) {
        init();
    }

    private static void init(){
        int opt = 0;
        do{
            System.err.println("Por favor seleccione una de las siguientes opciones.:");
            System.out.println("1. Registrar un producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Salir");
            opt = leer.nextInt();

            switch (opt){
                case 1:
                    capturarDatos();
                    break;
                case 2:
                    imprimirDatos();
                    break;
                case 3:
                    System.out.println("Programa finalizado...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, intenta nuevamente.");
                    break;
            }
        }while (opt != 3);
    }

    private static void capturarDatos() {
        System.out.println("Introduce el nombre del producto: ");
        nombre = leer.next();
        System.out.println("Introduce la categoria del producto: ");
        categorias();
        //categoria = leer.next();
        System.out.println("Introduce la cantidad: ");
        cantidad = leer.nextInt();
        System.out.println("Introduce el tamaño del producto: ");
        tamannos();
        //tamanno = leer.next();

        Producto producto = null;
        switch (categoria) {
            case "Comida":
                producto = new Comida(nombre, cantidad, tamanno);
                break;
            case "Electricos":
                producto = new Electricos(nombre, cantidad, tamanno);
                break;
            case "Ropa":
                producto = new Ropa(nombre, cantidad, tamanno);
                break;
        }

        if (producto != null) {
            productos.add(producto);
            System.out.println("Producto agregado exitosamente!");
        }

    }

    private static void categorias() {
        String[] categorias = new String[3];
        categorias[0] = "1.Comida";
        categorias[1] = "2.Electricos";
        categorias[2] = "3.Ropa";
        for (String categoria : categorias) {
            System.out.println(categoria);
        }
        int seleccion = leer.nextInt();

        // Validacion de entrada
        if (seleccion >= 1 && seleccion <= 3) {
            categoria = categorias[seleccion - 1].substring(2);
        } else {
            System.out.println("Selección inválida, usando 'Comida' por defecto");
            categoria = "Comida";
        }
    }

    private static void tamannos() {
        String[] tamannos = new String[3];
        tamannos[0] = "1.Pequeño";
        tamannos[1] = "2.Mediano";
        tamannos[2] = "3.Grande";
        for (String tamanno : tamannos) {
            System.out.println(tamanno);
        }
        int seleccion = leer.nextInt();

        // Validacion de entrada
        if (seleccion >= 1 && seleccion <= 3) {
            tamanno = tamannos[seleccion - 1].substring(2);
        } else {
            System.out.println("Selección inválida, usando 'Mediano' por defecto");
            tamanno = "Mediano";
        }

    }

    private static void imprimirDatos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        System.out.println("\n=== LISTA DE PRODUCTOS ===");
        for (Producto p : productos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Categoría: " + p.getCategoria());
            System.out.println("Cantidad: " + p.getCantidad());
            System.out.println("Tamaño: " + p.getTamanno());
            // Now you can call the method directly - polymorphism!
            System.out.println("Costo de envío: $" + p.costoDeEnvio());
            System.out.println("------------------------");
        }
    }


}
