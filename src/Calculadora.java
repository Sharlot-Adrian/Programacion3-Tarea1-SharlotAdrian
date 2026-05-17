import java.util.Scanner;

public class Calculadora {

    Scanner scanner1 = new Scanner(System.in);

    public double suma(double primerNum, double segundoNum){
        return primerNum + segundoNum;
    }

    public double resta(double primerNum, double segundoNum){
        return primerNum - segundoNum;
    }

    public double multiplicacion(double primerNum, double segundoNum){
        return primerNum * segundoNum;
    }

    public double division(double primerNum, double segundoNum){

        if (segundoNum == 0){
            System.out.println("La division entre 0 no es posible. Operacion invalida.");
            return 0;
        }
        return primerNum/segundoNum;
    }

    public void mostrarSubmenu(){
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

        subOpcion = scanner1.nextInt();
        Calculadora calculadora = new Calculadora();

        if (subOpcion != 5){

             System.out.println("\n-[CALCULADORA BASICA]-");
             System.out.println("*----------------------------------*");
             System.out.println("Ingrese el primer numero: ");
             primerNum = scanner1.nextDouble();

             System.out.println("\nIngrese el segundo numero: ");
             segundoNum = scanner1.nextDouble();
             System.out.println("*----------------------------------*");
        }

        switch(subOpcion){
                        
             case 1:{
                 System.out.println("La SUMA es igual a: ");
                 System.out.println(calculadora.suma(primerNum,segundoNum));
                 System.out.println("*----------------------------------*");
                 break;
                }
             case 2:{
                               
                 System.out.println("La RESTA es igual a:");
                 System.out.println(calculadora.resta(primerNum,segundoNum));
                 System.out.println("*----------------------------------*");
                 break;
                }

             case 3:{
                                
                 System.out.println("La MULTIPLICACION es igual a:");
                 System.out.println(calculadora.multiplicacion(primerNum,segundoNum));
                 System.out.println("*----------------------------------*");
                 break;
                }

             case 4:{

                 System.out.println("La DIVISION es igual a:");
                 System.out.println(calculadora.division(primerNum,segundoNum));
                 System.out.println("*----------------------------------*");
                 break;
                }

             case 5:{

                 System.out.println("Saliendo...");
                 System.out.println("*----------------------------------*");
                 break;
                }

             default: {
                 System.out.println("Esa opcion no es valida.");
                 System.out.println("*----------------------------------*");
                 break;
                }

            }

        }while(subOpcion != 5);
    }
    
}
