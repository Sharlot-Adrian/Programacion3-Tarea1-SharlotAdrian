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
            System.out.println("|1. Crear Vehiculo tipo carro       |");
            System.out.println("|2. Crear Vehiculo tipo motocicleta |");
            System.out.println("|3. Salir                           |");
            System.out.println("*-----------------------------------*");
            System.out.println("\nDigite la opcion que desea seleccionar: ");

            subOpcion = scanner.nextInt();
            scanner.nextLine();

            if (subOpcion != 3) {
                System.out.println("[CREACION DE UN VEHICULO]"); // Atributos del vehiculo : modelo, marca, year, color
                System.out.println("*----------------------------------*");
                System.out.println("Digite un modelo: ");
                String modelo = scanner.nextLine();

                System.out.println("Digite una marca: ");
                String marca = scanner.nextLine();

                System.out.println("Digite un año de fabricacion: ");
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
                        carro.mostrarCaracteristicas();
                        System.out.println("\n");
                        carro.acelerar();
                        break;
                    }

                    case 2: { //Opcion para la motocicleta, cantidadNeumaticos y tipoMoto

                        System.out.println("Ingrese la cantidad de neumaticos: ");
                        String cantNeumaticos = scanner.nextLine();

                        System.out.println("Ingrese el tipo de motocicleta: ");
                        String TipoMotocicleta = scanner.nextLine();

                        Vehiculo moto = new Motocicleta(modelo, marca, year, color, cantNeumaticos, TipoMotocicleta);
                        moto.mostrarCaracteristicas();
                        System.out.println("\n");
                        moto.acelerar();
                        break;
                    }

                    case 3: {
                        System.out.println("Saliendo...");
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
