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

                     int subOpcion = 0;
                     double primerNum = 0; 
                     double segundoNum = 0;
                    
                     do{

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
                         Calculadora calculadora = new Calculadora();

                         switch(subOpcion){
                        
                            case 1:{
                                System.out.println("\nIngrese el primer numero: ");
                                primerNum = scanner.nextDouble();
                                System.out.println("\nIngrese el segundo numero: ");
                                segundoNum = scanner.nextDouble();

                                System.out.println("La SUMA es igual a: ");
                                System.out.println(calculadora.suma(primerNum,segundoNum));
                                break;
                            }
                            case 2:{
                                System.out.println("\nIngrese el primer numero: ");
                                primerNum = scanner.nextDouble();
                                System.out.println("\nIngrese el segundo numero: ");
                                segundoNum = scanner.nextDouble();

                                System.out.println("La RESTA es igual a:");
                                System.out.println(calculadora.resta(primerNum,segundoNum));
                                break;
                            }
                            case 3:{
                                 System.out.println("\nIngrese el primer numero: ");
                                primerNum = scanner.nextDouble();
                                System.out.println("\nIngrese el segundo numero: ");
                                segundoNum = scanner.nextDouble();

                                System.out.println("La MULTIPLICACION es igual a:");
                                System.out.println(calculadora.multiplicacion(primerNum,segundoNum));
                                break;
                            }
                            case 4:{

                                System.out.println("\nIngrese el primer numero: ");
                                primerNum = scanner.nextDouble();
                                System.out.println("\nIngrese el segundo numero: ");
                                segundoNum = scanner.nextDouble();

                                System.out.println("La DIVISION es igual a:");
                                System.out.println(calculadora.division(primerNum,segundoNum));
                                break;
                            }
                            case 5:{
                                System.out.println("Saliendo...");
                                break;
                            }
                            default: {
                                System.out.println("Esa opcion no es valida.");
                                break;
                            }

                        }

                     }while(subOpcion != 5);
         
                     break;
                }
                case 2:{
                    System.out.println("\n[ Numero par o impar ]");
                    System.out.println("*----------------------------------*");
                    System.out.println("Ingrese un numero: ");
                    int numero = scanner.nextInt();

                    ParOImpar ParO_Impar = new ParOImpar(numero);

                    if (ParO_Impar.EsPar())
                        System.out.println("\nEl numero " + numero + " es par.");
                    else
                        System.out.println("\nEl numero " + numero + " NO es par.");

                    System.out.println("*----------------------------------*");
                    break;
                }
                case 3:{
                    System.out.println("\n[ Tabla de multiplicar ]");
                    System.out.println("*----------------------------------*");
                    System.out.println("Ingrese el numero cuyas tablas de multiplicacion quiere visualizar: ");
                    int numero = scanner.nextInt();

                    Multiplicacion tablas = new Multiplicacion(numero);
                    System.out.println("TABLAS DE MULTIPLICACION DEL NUMERO #" + numero+":" );
                    tablas.tablasHasta10();
                    System.out.println("*----------------------------------*");
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
