import java.util.Scanner;

public class ParOImpar {

    static Scanner scanner = new Scanner(System.in);

    private static boolean EsPar(int numero) {
        return (numero % 2 == 0 ? true : false);
    }

    public static void mostrarMenu() {

        System.out.println("\n[ Numero par o impar ]");
        System.out.println("*----------------------------------*");
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (EsPar(numero))
            System.out.println("\nEl numero " + numero + " es par.");
        else
            System.out.println("\nEl numero " + numero + " NO es par.");

        System.out.println("*----------------------------------*");

    }
}
