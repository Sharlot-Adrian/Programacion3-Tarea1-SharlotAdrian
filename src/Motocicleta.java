public class Motocicleta extends Vehiculo{ //Clase hija de Vehiculo para cumplir con el case #8 - Herencia de Vehiculos
    
    private String cantidadNeumaticos;
    private String tipoMotocicleta;

    public Motocicleta(String modelo,String marca, int año, String color, String cantidadNeumaticos, String tipoMotocicleta){
        super(modelo,marca,año,color);
        setCantidadNeumaticos(cantidadNeumaticos);
        setTipoMotocicleta(tipoMotocicleta);
    }

    public String getCantidadNeumaticos(){
        return cantidadNeumaticos;
    }

    public String getTipoMotocicleta(){
        return tipoMotocicleta;
    }

    public void setCantidadNeumaticos(String cantidadNeumaticos){
        this.cantidadNeumaticos = cantidadNeumaticos;
    }

    public void setTipoMotocicleta (String tipoMotocicleta){
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public void acelerar(){
        System.out.println("La motocicleta esta movimiento.");
    }

     @Override
    public void mostrarCaracteristicas(){
        System.out.println("[CARACTERISTICAS DE LA MOTOCICLETA ]");
        System.out.println("*----------------------------------*");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Año:  " + getAño());
        System.out.println("Color: " + getColor());
        System.out.println("Tipo de motocicleta: " + getTipoMotocicleta());
        System.out.println("Cantidad de neumaticos: " + getCantidadNeumaticos());
        System.out.println("*----------------------------------*");

    }

    
}
