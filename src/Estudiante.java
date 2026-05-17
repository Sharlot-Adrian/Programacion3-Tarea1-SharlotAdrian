import java.util.Scanner;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String matricula;
    private String carreraCursada;

    static Scanner scanner = new Scanner(System.in);

    public Estudiante(String nombre, String apellido, int edad, String matricula, String carreraCursada){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setMatricula(matricula);
        setCarreraCursada(carreraCursada);

    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getCarreraCursada(){
        return carreraCursada;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setCarreraCursada(String carreraCursada){
        this.carreraCursada = carreraCursada;
    }

    public static void crearEstudiante(){

        System.out.println("[ CLASE ESTUDIANTE ]");
        System.out.println("*----------------------------------*");
        System.out.println("Ingrese los datos de el estudiante que desea registrar...");
        System.out.println("*----------------------------------*");
        System.out.println("Digite un nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Digite un apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Digite una edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite una matricula: ");
        String matricula = scanner.nextLine();

        System.out.println("Digite la carrera cursada: ");
        String carreraCursada = scanner.nextLine();

        Estudiante est = new Estudiante(nombre, apellido, edad, matricula, carreraCursada);

        System.out.println("[Usted a registrado a:]");
        System.out.println("*----------------------------------*");
        System.out.println("\n"+est.getNombre() + " " + est.getApellido() + ", matricula: " + est.getMatricula());
        System.out.println(est.getNombre() +" " + "tiene " + est.getEdad() + " años y esta cursando la carrera: "+ est.getCarreraCursada());
        
        System.out.println("*----------------------------------*");


    }


}
