import java.util.Scanner;

public class Tarea1 {
    
    public static void main (String [] args){

        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {

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

            System.out.println("\nOpcion que desea seleccionar: ");
            opcion = scanner.nextInt();
            
            switch(opcion){

                case 1:{

                     Calculadora calc = new Calculadora();
                     calc.mostrarSubmenu();
                     break;
                }
                case 2:{
                    ParOImpar determinandoPar = new ParOImpar();
                    determinandoPar.mostrarMenu();
                    break;
                }
                case 3:{
                    System.out.println("\n[ Tabla de multiplicar ]");
                    System.out.println("*----------------------------------*");
                    System.out.println("Ingrese el numero cuyas tablas de multiplicacion quiere visualizar: ");
                    int numero = scanner.nextInt();

                    Multiplicacion tablas = new Multiplicacion(numero);
                    System.out.println("TABLA DE MULTIPLICACION DEL NUMERO #" + numero+":" );
                    tablas.tablasHasta10();
                    System.out.println("\n\n*----------------------------------*");
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
        scanner.close();

    }
}
