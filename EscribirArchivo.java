import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto para guardar en el archivo: ");
        String texto = scanner.nextLine();

        try {
            FileWriter escritor = new FileWriter("datos.txt");
            //FileWriter escritor = new FileWriter("datos.txt", true);
            escritor.write(texto);
            escritor.close();

            System.out.println("Archivo escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }

        scanner.close();
    }
}
