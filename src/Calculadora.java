public class Calculadora {

    private double primerNumero;
    private double segundoNumero;

    public Calculadora(double primerNum, double segundoNum){

        this.primerNumero = primerNum;
        this.segundoNumero = segundoNum;

    }

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
    
}
