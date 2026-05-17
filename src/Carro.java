public class Carro extends Vehiculo {
    
    private String capacidadBaul;
    private int cantidadPuertas;

    public Carro(String modelo, String marca, int year, String color, String capacidadBaul, int cantidadPuertas){
        super(modelo, marca,year,color);

    }

    public String getCapacidadBaul(){
        return capacidadBaul;
    }

    public int getCantidadPuertas(){
        return cantidadPuertas;
    }

    public void setCapacidadBaul(String capacidadBaul){
        this.capacidadBaul = capacidadBaul;
    }

    public void setCantidadPuertas(int cantidadPuertas){
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void acelerar(){
        System.out.println("El carro esta en movimiento.  ");
    }


}
