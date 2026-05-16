import java.util.Scanner;
public class PromedioNotas {

    Scanner scanner = new Scanner (System.in);


    private double obtenerPromedio (int cantidadNotasPublicadas){

        int sumatoria = 0;
        int nota = 0;
        double promedio = 0;
    
        for (int i = 0; i < cantidadNotasPublicadas; i++ ){

            System.out.printf("Ingrese su nota #%d: ", i + 1);
            nota = scanner.nextInt();
            sumatoria += nota;

        }

        promedio = sumatoria / cantidadNotasPublicadas;
        return promedio;

    }

    public void mostrarMenu(){

        int cantidadNotasPublicadas = 0;
        System.out.println("\n[ PROMEDIO DE NOTAS ]");
        System.out.println("*----------------------------------*");
        System.out.println("Ingrese el total de materias de las que ya tiene la nota: ");

        cantidadNotasPublicadas = scanner.nextInt();
        System.out.println("Sus promedio de notas es igual a: "+ obtenerPromedio(cantidadNotasPublicadas));
        System.out.println("*----------------------------------*");

    }

    
}
