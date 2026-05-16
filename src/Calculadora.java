public class Calculadora {

    private double primerNumero;
    private double segundoNumero;

    public Calculadora(double primerNum, double segundoNum){

        this.primerNumero = primerNum;
        this.segundoNumero = segundoNum;

    }

    public double suma(){
        return this.primerNumero + this.segundoNumero;
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
