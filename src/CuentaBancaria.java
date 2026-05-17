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
            System.out.println("Usted ha depositado: " + monto + "pesos en su cuenta.");
            this.saldo += monto;
        } else
            System.out.println("La operacion no es valida. No puede agregar un monto negativo. ");

    }

    private void retirar(double monto) {

        if (monto > getSaldo())
            System.out.println(
                    "La operacion no es valida. No puede retirar un monto mayor al que se encuentra en su cuenta.");
        else
            this.saldo -= monto;

    }

    public void mostrarSubMenu() { // Es un subMenu al tener un do-while

        int subOpcion = 0;
        boolean cuentaExiste = false;
        do {

            System.out.println("[ CUENTA BANCARIA ]");
            System.out.println("*----------------------------------*");
            System.out.println("| 1. Depositar dinero              |");
            System.out.println("| 2. Retirar dinero                |");
            System.out.println("| 3. Salir                         |");
            System.out.println("*----------------------------------*");
            System.out.println("\nIngresa la opcion que deseas seleccionar: ");
            subOpcion = scanner.nextInt();

            if (subOpcion != 4) {
                /*
                 Atributos de una cuenta:
                 String titular, double saldo, String idCuenta
                 */

                if (cuentaExiste == false) { // Crear cuenta si no existe
                    System.out.println("Ingrese su nombre: ");
                    String nombreTitular = scanner.nextLine();

                    System.out.println("Ingrese un saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();

                    scanner.nextLine();

                    int idRandom = random.nextInt(100000, 100000);
                    System.out.println("El ID (seis digitos) de su cuenta es:  " + idRandom);

                    CuentaBancaria cuenta = new CuentaBancaria(nombreTitular, saldoInicial, idRandom);
                    cuentaExiste = true;
                }
                else
                    System.out.println("La cuenta ya existe.");

                switch (subOpcion) {
                    case 1: {

                        System.out.println("\n Digite el monto que desea depositar: ");
                        depositar(subOpcion);

                        System.out.println("El saldo actual de su cuenta es: " + getSaldo());
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        break;

                    }
             
                    default: {
                        System.out.println("Esta opcion no es valida.");
                        break;
                    }

                }

            }

        } while (subOpcion != 4);

    }
}
