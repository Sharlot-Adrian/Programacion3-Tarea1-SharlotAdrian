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

                     int subOpcion = 0;
                     double primerNum = 0; 
                     double segundoNum = 0;
                     double resultado = 0;

                     System.out.println("------------------------");
                     System.out.println("|   Calculadora basica   |");
                     System.out.println("|------------------------|");
                     System.out.println("|1. Suma                 |");
                     System.out.println("|2. Resta                |");
                     System.out.println("|3. Multiplicacion       |");
                     System.out.println("|4. Division             |");
                     System.out.println("|5. Salir                |");
                     System.out.println("--------------------------");
                     System.out.println("\nQue operacion va a realizar con la calculadora basica? ");

                     subOpcion = scanner.nextInt();

                     primerNum = scanner.nextInt();
                     segundoNum = scanner.nextInt();

                     Calculadora calculadora = new Calculadora(primerNum,segundoNum);

                     do{

                        subOpcion = scanner.nextInt();
                        switch(subOpcion){

                            case 1:{
                                System.out.println("La SUMA es igual a: ");
                                System.out.println(calculadora.suma());
                                break;
                            }
                            case 2:{
                                break;
                            }
                            case 3:{
                                break;
                            }
                            case 4:{
                                break;
                            }
                            case 5:{
                                break;
                            }
                            default: {
                                System.out.println("Esa opcion no es valida.");
                                break;
                            }

                        }

                     }while(opcion != 5);
         
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
        scanner.close();

    }
}
