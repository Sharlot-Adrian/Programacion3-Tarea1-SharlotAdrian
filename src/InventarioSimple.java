import java.util.LinkedList;
import java.util.Scanner;
public class InventarioSimple { //Para el case #10 - Inventario simple
    
    LinkedList<Producto> lista = new LinkedList<Producto>();
    Scanner scanner = new Scanner(System.in);


    public void mostrarSubMenu(){

        int subOpcion = 0;
        do{
            System.out.println("\n[ INVENTARIO SIMPLE ]");
            System.out.println("*----------------------------------*");
            System.out.println("| 1. Agregar Producto              |");
            System.out.println("| 2. Enlistar Productos            |");
            System.out.println("| 3. Salir                         |");
            System.out.println("*----------------------------------*");
            System.out.println("\nIngresa la opcion que deseas seleccionar: ");
            subOpcion = scanner.nextInt();
            scanner.nextLine();

            switch(subOpcion){

                case 1:{
                    System.out.println("\n[ AGREGAR PRODUCTO ]");
                    System.out.println("*----------------------------------*");
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese la cantidad de producto que posee en disponibilidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();

                    lista.add(new Producto(nombre,cantidad,precio));
                    System.out.println("*----------------------------------*");

                    System.out.println("Producto agregado!");
                    System.out.println("*----------------------------------*");

                    break;
                }
                case 2:{
                    for (int i = 0; i < lista.size(); i++){
                    lista.get(i).mostrarDetalles();
                    }
                    
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    System.out.println("Esa Opcion no es valida");
                    break;
                }

            }

        }while(subOpcion != 3);
    }
}


