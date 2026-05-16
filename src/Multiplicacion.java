import java.util.Scanner;

public class Multiplicacion {
    
    //private int numero;
    Scanner scanner = new Scanner(System.in);

    /*public Multiplicacion( int numero ){
        this.numero = numero;
    }*/

    public void tablasHasta10(int numero){

        for (int i = 1; i <=10; i++){
            System.out.printf("\n%d * %d = %d", i, numero, i * numero);
        }
    }

    public void mostrarMenu(){

        
        System.out.println("\n[ TABLA DE MULTIPLICAR ]");
        System.out.println("*----------------------------------*");
        System.out.println("Ingrese el numero cuyas tablas de multiplicacion quiere visualizar: ");
        int numero = scanner.nextInt();
        System.out.println("*----------------------------------*");
   
        System.out.println("TABLA DE MULTIPLICACION DEL NUMERO #" + numero+":" );
        tablasHasta10(numero);
        System.out.println("\n\n*----------------------------------*");
                    
    }
}
