import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Tarea> tareas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void mostrarTareas() {
        if (tareas.size() > 0) {
            for (Tarea tarea : tareas) {
                tarea.consultarNombre();
                tarea.consultarDescripcion();
                tarea.comprobarCompletada();
            }
        } else {
            System.out.println("No hay tareas");
        }
    }

    public static void agregarTarea() {
        System.out.println("Escribe el nombre de la tarea: \n");
        String nombreTarea = sc.nextLine();
        System.out.println("Describe la tarea");
        String descripcion = sc.nextLine();
        Tarea tarea = new Tarea(nombreTarea, descripcion);
        tareas.add(tarea);
    }

    public static void marcarTareaCompletada() {
        if (tareas.size() > 0) {
            String nombreTareaACompletar = " ";
            System.out.println("Dime el nombre de la tarea para marcarla como 'completada'");
            nombreTareaACompletar = sc.nextLine();
            boolean salioCorrecto = false;
            for (Tarea tarea : tareas) {
                if (tarea.getNombre().equals(nombreTareaACompletar)) {
                    tarea.marcarCompletada();
                    salioCorrecto = tarea.isCompletada();
                }
            }
            if (salioCorrecto) {
                System.out.println("Hecho\n");
            } else {
                System.out.println("No se pudo marcar como completada la tarea");
            }
        } else {
            System.out.println("No hay tareas");
        }
    }

    public static void eliminarTarea() {
        if (tareas.size() > 0) {
            String nombreTareaBorrar = " ";
            System.out.println("Dime el nombre de la tarea para borrar");
            nombreTareaBorrar = sc.nextLine();
            int i = 0;
            int eliminar = -1;
            for (Tarea tarea : tareas) {
                if (tarea.getNombre().equals(nombreTareaBorrar)) {
                    eliminar = i;
                    break;
                }
                i++;
            }
            if (eliminar != -1) {
                tareas.remove(eliminar);
                System.out.println("La tarea se borro correctamente");
            }else {
                System.out.println("No se pudo borrar la tarea");
            }
        } else {
            System.out.println("No hay tareas");
        }
    }

    public static void main(String[] args) {
        int salir = 0;
        do {
            System.out.println("");
            System.out.println("GESTOR DE TAREAS");
            System.out.println("1.Mostrar todas las tareas");
            System.out.println("2.Aniadir una tarea");
            System.out.println("3.Marcar una tarea como completada");
            System.out.println("4.Eliminar una tarea");
            System.out.println("5.Salir\n");
            salir = sc.nextInt();
            sc.nextLine();
            switch (salir) {
                case 1:
                    mostrarTareas();
                    System.out.println("Esas son todas las tareas\n");
                    break;
                case 2:
                    agregarTarea();
                    System.out.println("Tarea hecha");
                    break;
                case 3:
                    marcarTareaCompletada();
                    break;
                case 4:
                    eliminarTarea();
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Marca un numero valido\n");
                    break;
            }
        } while (salir != 5);
    }
}