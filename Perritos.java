public class Perritos {

    private String raza;
    private String nombre;
    private int edad;

    public Perritos(String raza, String nombre, int edad) {
        this.raza= raza;
        this.nombre= nombre;
        this.edad= edad;
    }

    public String toString () {
            return "Perritos{" +
            "raza=" + raza + "\"" + 
            "nombre=" + nombre + "\"" +
            "edad=" + edad + 
            "}";
    }
}
