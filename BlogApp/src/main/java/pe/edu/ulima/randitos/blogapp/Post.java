package pe.edu.ulima.randitos.blogapp;

public class Post {

    private String nombre;
    private String fecha;

    public Post() {
    }

    public Post(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
