import java.util.Scanner;
public class CuentaVocales { //Para el case #4 - Contador de vocales

    static Scanner scanner = new Scanner(System.in);

    private static int contarVocales(String palabra){

        palabra = palabra.toUpperCase();
        char [] letras = palabra.toCharArray();
        int contador = 0;

        for (int i= 0; i < letras.length; i++ ){
            
            if (letras[i] == 'A' || letras[i] == 'E' || letras[i] == 'I' || letras[i] == 'O' || letras[i] == 'U' ){

                contador++;
            }

        }

        return contador;

    }

    public static void mostrarMenu(){

        System.out.println("\n [CONTAR VOCALES]");
        System.out.println("*----------------------------------*");
        System.out.println("Ingrese la palabra cuyas vocales desea contar: ");
        String palabra = scanner.nextLine();
        System.out.println("*----------------------------------*");

        System.out.println("La palabra tiene "+contarVocales(palabra) + " vocales.");

    }

}
