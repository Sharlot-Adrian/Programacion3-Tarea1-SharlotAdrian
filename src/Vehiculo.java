public abstract class Vehiculo { //Clase abstracta y padre para cumplir con el case #8 - Herencia de Vehiculos

    private String modelo;
    private String marca;
    private int year;
    private String color;


    public Vehiculo(String modelo, String marca, int year, String color){
        setModelo(modelo);
        setMarca(marca);
        setYear(year);
        setColor(color);
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public int getYear(){
        return year;
    }

    public String getColor(){
        return color;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void acelerar(){

        System.out.println("El vehiculo esta en movimiento. ");
    }

    public void mostrarCaracteristicas(){
        System.out.println("[CARACTERISTICAS DEL VEHICULO ]");
        System.out.println("*----------------------------------*");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Year:  " + getYear());
        System.out.println("Color: " + getColor());
        System.out.println("*----------------------------------*");

    }

}
