public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;


    public Producto(String nombre, int cantidad, double precio){

    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }

    public double getPrecio(){
        return precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public void mostrarDetalles(){
        
        System.out.println("\n[PRODUCTO:  " + getNombre() + "]" );
        System.out.println("*----------------------------------*");
        System.out.println("CANTIDAD EN ALMACEN: " + getCantidad() );
        System.out.println("PRECIO: " + getPrecio() );
        System.out.println("*----------------------------------*");

    }
}
