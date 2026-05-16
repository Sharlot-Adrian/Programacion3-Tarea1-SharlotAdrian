public class ParOImpar {
    private int numero;

    public ParOImpar(int numero){
        this.numero = numero;
    }

    public boolean EsPar(){
        return (this.numero % 2 == 0? true : false);
    }
}
