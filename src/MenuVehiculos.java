import java.util.Scanner;

public class MenuVehiculos {

    static Scanner scanner = new Scanner(System.in);

    static void MostrarSubMenu() { // SubMenu significa que un do-while esta involucrado

        int subOpcion = 0;
        do {
            System.out.println("\n[ HERENCIA VEHICULO ]");
            System.out.println("*-----------------------------------*");
            System.out.println("|                Menu               |");
            System.out.println("|-----------------------------------|");
            System.out.println("|1. Crear un vehiculo tipo carro    |");
            System.out.println("|2. Crear Vehiculo tipo motocicleta |");
            System.out.println("|3. Salir                           |");
            System.out.println("*----------------------------------*");
            System.out.println("\nDigite la opcion que desea seleccionar: ");

            subOpcion = scanner.nextInt();

            if (subOpcion != 3) {
                System.out.println("[CREACION DE UN VEHICULO]"); // Atributos: modelo, marca, year, color
                System.out.println("*----------------------------------*");
                System.out.println("Digite un modelo: ");
                String modelo = scanner.nextLine();

                System.out.println("Digite una marca: ");
                String marca = scanner.nextLine();

                System.out.println("Digite un year de fabricacion: ");
                int year = scanner.nextInt();

                scanner.nextLine();

                System.out.println("Digite un color: ");
                String color = scanner.nextLine();

                switch (subOpcion) {
                    case 1: { //Opcion para el carro, atributos: capacidadBaul y cantidadPuertas 
                        System.out.println("Digite la capacidad del baul: ");
                        String capacidadBaul = scanner.nextLine();

                        System.out.println("Digite la cantidad de puertas: ");
                        int cantPuertas = scanner.nextInt();

                        Vehiculo carro = new Carro(modelo, marca, year, color, capacidadBaul, cantPuertas);
                  
                        break;
                    }

                    case 2: { //Opciones para la motocicleta, cantidadNeumaticos y tipoMoto
                        break;
                    }

                    case 3: {
                        break;
                    }

                    default: {
                        System.out.println("Esa opcion no es valida.");
                        break;
                    }

                }
            }

        } while (subOpcion != 3);

    }
}
