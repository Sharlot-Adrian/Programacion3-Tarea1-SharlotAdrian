public class Calculadora {

    private double primerNumero;
    private double segundoNumero;

    public Calculadora(){

        this.primerNumero = 0;
        this.segundoNumero = 0;

    }

    public double suma(double primerNum, double segundoNum){
        return primerNum + segundoNum;
    }

    public double resta(){
        return this.primerNumero - this.segundoNumero;
    }

    public double multiplicacion(){
        return this.primerNumero * this.segundoNumero;
    }

    public double division(){

        if (this.segundoNumero == 0){
            System.out.println("La division entre 0 no es posible. Operacion invalida.");
            return 0;
        }
        return this.primerNumero/this.segundoNumero;
    }
    
}
