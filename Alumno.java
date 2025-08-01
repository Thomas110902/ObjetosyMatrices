public class Alumno {
    String nombre;
    double altura;
    int edad;
    char genero;

    public Alumno(String nombre, double altura, int edad, char genero){
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
    }
    public void saludar(){
        System.out.println("Hola " + nombre);
    }
}
