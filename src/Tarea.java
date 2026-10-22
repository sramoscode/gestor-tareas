public class Tarea {
    private String nombre;
    private String descripcion;
    private boolean completada;

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public void consultarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public void consultarDescripcion() {
        System.out.println("Descripcion: " + descripcion);
    }

    public void comprobarCompletada() {
        System.out.println(isCompletada() ? "Esta completada" : "No esta completada");
    }

    public void marcarCompletada() {
        completada = true;
    }
}
