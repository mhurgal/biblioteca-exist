import java.util.Scanner;
import org.xmldb.api.base.Collection;

public class Main {
    public static void main(String[] args) {

        Collection col = ConexionExistDB.conectar();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Buscar por autor");
            System.out.println("2. Añadir libro");
            System.out.println("3. Modificar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    Consultas.buscarPorAutor(col, autor);
                    break;

                case 2:
                    Consultas.añadirLibro(col);
                    break;

                case 3:
                    Consultas.modificarLibro(col);
                    break;

                case 4:
                    Consultas.eliminarLibro(col);
                    break;
            }

        } while (opcion != 0);
    }
}