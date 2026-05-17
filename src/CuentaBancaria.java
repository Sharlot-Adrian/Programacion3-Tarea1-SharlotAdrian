import java.util.Scanner;
import java.util.Random;

public class CuentaBancaria {

    private double saldo;
    private String titular;
    private int idCuenta;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public CuentaBancaria(String titular, double saldo, int idCuenta) {
        setTitular(titular);
        setSaldo(saldo);
        setIdCuenta(idCuenta);

    }

    public CuentaBancaria() {

    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    private void depositar(double monto) {

        if (monto >= 0) {
            System.out.println("Usted ha depositado: " + monto + " pesos en su cuenta.");
            this.saldo += monto;
        } else
            System.out.println("La operacion no es valida. No puede agregar un monto negativo. ");

    }

    private void retirar(double monto) {

        if (monto > this.saldo)
            System.out.println("La operacion no es valida. No puede retirar un monto mayor al que se encuentra en su cuenta.");
        else {
            this.saldo -= monto;
            System.out.println("Usted ha retirado: " + monto + " pesos de su cuenta.");
        }

    }

    public void mostrarSubMenu() { // Es un subMenu al tener un do-while

        int subOpcion = 0;
        CuentaBancaria cuenta = null;
        do {

            System.out.println("\n[ CUENTA BANCARIA ]");
            System.out.println("*----------------------------------*");
            System.out.println("| 1. Crear cuenta                  |");
            System.out.println("| 2. Depositar dinero              |");
            System.out.println("| 3. Retirar dinero                |");
            System.out.println("| 4. Informacion de la cuenta      |");
            System.out.println("| 5. Salir                         |");
            System.out.println("*----------------------------------*");
            System.out.println("\nIngresa la opcion que deseas seleccionar: ");
            subOpcion = scanner.nextInt();
            scanner.nextLine();

            // Atributos de una cuenta: String titular, double saldo, String idCuenta

            switch (subOpcion) {

                case 1: {
                    System.out.println("\n [ CREAR CUENTA ]");
                    System.out.println("Ingrese su nombre completo: ");
                    String nombreTitular = scanner.nextLine();

                    System.out.println("Ingrese un saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();

                    scanner.nextLine();

                    int idRandom = random.nextInt(100000, 700001);
                    System.out.println("El ID (seis digitos) de su cuenta es:  " + idRandom);

                    cuenta = new CuentaBancaria(nombreTitular, saldoInicial, idRandom);
                    break;
                }

                case 2: {

                    if (cuenta == null) {
                        System.out.println("Tu cuenta no existe todavia. ");
                        break;
                    } else {
                        System.out.println("\n [ DEPOSITAR ]");
                        System.out.println("Digite el monto que desea depositar: ");
                        int montoDeposito = scanner.nextInt();
                        cuenta.depositar(montoDeposito);

                        System.out.println("El saldo actual de su cuenta es: " + cuenta.getSaldo());
                        break;
                    }
                }
                case 3: {
                    if (cuenta == null){
                       System.out.println("Tu cuenta no existe todavia. ");
                       break; 
                    }
                    else {
                        System.out.println("\n [RETIRAR] ");
                        System.out.println("Digite el monto que desea retirar: ");
                        int montoRetiro = scanner.nextInt();
                        cuenta.retirar(montoRetiro);

                        System.out.println("El saldo actual de su cuenta es: " + cuenta.getSaldo());

                        break;
                    }
                }
                case 4: {
                    if (cuenta == null){
                        System.out.println("Tu cuenta no existe todavia.");
                        break;
                    }
                    else {
                        System.out.println("\n [INFORMACION DE LA CUENTA]");
                        System.out.println("TITULAR: " + cuenta.getTitular());
                        System.out.println("ID. CUENTA: " + cuenta.getIdCuenta());
                        System.out.println("SALDO ACTUAL: " + cuenta.getSaldo());
                        break;
                    }

                }

                case 5:{
                    System.out.println("\nSaliendo...");
                    break;
                }

                default: {
                    System.out.println("Esta opcion no es valida.");
                    break;
                }

            }

        } while (subOpcion != 5);

    }
}
