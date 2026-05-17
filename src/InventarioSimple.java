import java.util.LinkedList;

public class InventarioSimple {
    
    LinkedList<Producto> lista = new LinkedList<Producto>();

    public void agregarProducto(String nombre, int cantidad, double precio){
        lista.add(new Producto(nombre, cantidad, precio));
    }

    public void mostrarProductos(){

        for (int i = 0; i < lista.size(); i++){
            lista.get(i).mostrarDetalles();
        }
    }

    public void mostrarSubMenu(){
        
    }
}


