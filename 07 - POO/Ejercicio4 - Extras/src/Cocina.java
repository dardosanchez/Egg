
import java.util.ArrayList;
import java.util.Scanner;

public class Cocina {

    ArrayList<Receta> Recetas = new ArrayList<>();

    public void agregarReceta() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la receta:");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la cantidad de ingredientes:");
        int cantidadIngredientes = entrada.nextInt();
        entrada.nextLine(); // limpiar el buffer

        System.out.print("Ingrese las instrucciones:");
        String instrucciones = entrada.nextLine();

        System.out.print("Ingrese el tiempo de preparación en minutos:");
        int tiempoPreparacion = entrada.nextInt();
        entrada.nextLine(); // limpiar el buffer

        System.out.print("Ingrese la dificultad:");
        String dificultad = entrada.nextLine();

        Receta receta = new Receta(nombre, cantidadIngredientes, instrucciones, tiempoPreparacion, dificultad);
        Recetas.add(receta);

        System.out.println("Receta agregada correctamente.");
    }

    public void buscarElemento(String nombre) { 
        Receta recetaEncontrada = null;
        
        for (Receta receta : Recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La receta se encuentra en la lista!");
                break;
            }
        }
        
        if (recetaEncontrada != null) {
        System.out.println("Nombre: " + recetaEncontrada.getNombre());
        System.out.println("Cantidad de ingredientes: " + recetaEncontrada.getCantIngredientes());
        System.out.println("Instrucciones: " + recetaEncontrada.getInstrucciones());
        System.out.println("Tiempo de preparación: " + recetaEncontrada.getTiempoPreparacion());
        System.out.println("Dificultad: " + recetaEncontrada.getDificultad());
    } else {
        System.out.println("No se encontró la receta");
    }
        
    }

}
