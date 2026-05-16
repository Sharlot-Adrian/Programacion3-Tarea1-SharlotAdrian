public class Multiplicacion {
    
    private int numero;

    public Multiplicacion( int numero ){
        this.numero = numero;
    }

    public void tablasHasta10(){

        System.out.println("");

        for (int i = 1; i <=10; i++){
            System.out.printf("\n%d * %d = %d", i, this.numero, i * this.numero);
        }
    }
}
