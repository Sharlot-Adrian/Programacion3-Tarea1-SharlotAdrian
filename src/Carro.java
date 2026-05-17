public class Carro extends Vehiculo {
    
    private String capacidadBaul;
    private int cantidadPuertas;

    public Carro(String modelo, String marca, int year, String color, String capacidadBaul, int cantidadPuertas){
        super(modelo, marca,year,color);
        setCapacidadBaul(capacidadBaul);
        setCantidadPuertas(cantidadPuertas);

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

    @Override
    public void mostrarCaracteristicas(){
        System.out.println("[CARACTERISTICAS DEL CARRO ]");
        System.out.println("*----------------------------------*");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Year:  " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("Capacidad de baul: " + getCapacidadBaul());
        System.out.println("Cantidad de puertas: " + getCantidadPuertas());
        System.out.println("*----------------------------------*");

    }


}
