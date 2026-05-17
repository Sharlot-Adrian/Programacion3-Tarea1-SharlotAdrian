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
                    Calculadora.mostrarSubmenu();
                    break;
                }
                case 2:{
                    ParOImpar.mostrarMenu();
                    break;
                }
                case 3:{
                    Multiplicacion.mostrarMenu();
                    break;
                }
                case 4:{
                    CuentaVocales.mostrarMenu();
                    break;
                }
                case 5:{
                    PromedioNotas.mostrarMenu();
                    break;
                }
                case 6:{ 
                    Estudiante.crearEstudiante();
                    break;
                }
                case 7:{
                    System.out.println("Cuenta bancaria");
                    break;
                }
                case 8:{
                    MenuVehiculos.MostrarSubMenu();
                    break;
                }
                case 9:{
                    CreadorMatrices.mostrarMenu();
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
