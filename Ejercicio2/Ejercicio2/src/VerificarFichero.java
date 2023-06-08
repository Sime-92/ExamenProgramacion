import java.io.File;
import java.util.Scanner;

public class VerificarFichero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe la ruta y nombre del fichero: ");
        String ruta = scanner.nextLine();

        File file = new File(ruta);

        if (file.exists()) {
            System.out.println("El fichero existe.");

            // Contar el número de palabras en el fichero
            int contadorPalabras = contarPalabras(file);
            System.out.println("El fichero contiene " + contadorPalabras + " palabras.");
        } else {
            System.out.println("El fichero no existe!");
        }
    }

    private static int contarPalabras(File file) {
        int contador = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                scanner.next();
                contador++;
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return contador;
    }
}