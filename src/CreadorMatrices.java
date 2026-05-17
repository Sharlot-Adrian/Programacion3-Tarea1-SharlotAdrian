import java.util.Scanner;
public class CreadorMatrices {

    static int [][] matriz = new int [3][3];
    static Scanner scanner = new Scanner(System.in);

    private static void crearMatriz3x3(){

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                System.out.println ("Ingrese el valor en la posicion " + (i + 1) + ", " + (j + 1) + ": " );
                matriz[i][j] = scanner.nextInt();

            }
        }
    }

    private static void mostrarMatriz(){
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMenu(){
        System.out.println("[ MATRIZ 3X3 ]");
        System.out.println("*----------------------------------*");
        crearMatriz3x3();
        System.out.println("*----------------------------------*");
        System.out.println("\n[ Asi se ve su MATRIZ 3x3 ]");
        mostrarMatriz();
        System.out.println("*----------------------------------*");

    }
}
