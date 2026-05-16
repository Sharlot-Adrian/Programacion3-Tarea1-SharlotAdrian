import java.util.Scanner;

public class Tarea1 {
    
    public static void main (String [] args){

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------------------------------");
        System.out.println("|                 Menu                    |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. Calculadora basica                   |");
        System.out.println("| 2. Numero par o impar                   |");
        System.out.println("| 3. Tabla de multiplicar                 |");
        System.out.println("| 4. Contador de vocales                  |");
        System.out.println("| 5. Promedio de notas                    |");
        System.out.println("| 6. Clase estudiante                     |");
        System.out.println("| 7. Cuenta bancaria                      |");
        System.out.println("| 8. Herencia de Vehiculos                |");
        System.out.println("| 9. Matriz 3x3                           |");
        System.out.println("| 10. Sistema basico de inventario        |");
        System.out.println("| 11. salir                               |");
        System.out.println("|-----------------------------------------|");

        do {

            System.out.println("\nOpcion que desea seleccionar: ");
            opcion = scanner.nextInt();
            
            switch(opcion){

                case 1:{
                    System.out.println("Calculadora basica");
                    break;
                }
                case 2:{
                    System.out.println("Numero par o impar");
                    break;
                }
                case 3:{
                    System.out.println("Tabla de multiplicar");
                    break;
                }
                case 4:{
                    System.out.println("Contador de vocales");
                    break;
                }
                case 5:{
                    System.out.println("Promedio de notas");
                    break;
                }
                case 6:{
                    System.out.println("Clase estudiante");
                    break;
                }
                case 7:{
                    System.out.println("Cuenta bancaria");
                    break;
                }
                case 8:{
                    System.out.println("Herencia de vehiculos");
                    break;
                }
                case 9:{
                    System.out.println("Matriz 3x3");
                    break;
                }
                case 10:{
                    System.out.println("Sistema basico de inventario");
                    break;
                }
                case 11:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.out.println("Esa opción no es válida.");
                    break;
                }

            }

        }while (opcion != 11);

        System.out.println("Gracias por usar el sistema.");

    }
}
