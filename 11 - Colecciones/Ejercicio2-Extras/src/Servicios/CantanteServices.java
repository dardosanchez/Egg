package Servicios;

import Entidad.CantanteFamoso;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteServices {
    
    Scanner entrada = new Scanner(System.in);
    
    public void agregarCantantes(HashSet<CantanteFamoso> lista) {
        char opcion;
        System.out.println("");
        System.out.println(".: Ingresar Cantante/s :.");
        entrada.nextLine();
        do {
            System.out.print("- Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("- Disco con mas ventas: ");
            String disco = entrada.nextLine();
            
            lista.add(new CantanteFamoso(nombre, disco));
            
            System.out.println("Desea ingresar otro cantante? (S/N)");
            System.out.print("Opcion: ");
            opcion = entrada.nextLine().charAt(0);
            opcion = Character.toUpperCase(opcion);
            
            
            System.out.println("");
        } while (opcion != 'N');
        
    }
    
    public void mostrarCantantes(HashSet<CantanteFamoso> lista) {
        System.out.println("");
        System.out.println("LISTA: ");
        for (CantanteFamoso aux : lista) {
    
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Disco con mas venta: " + aux.getDiscoConMasVentas());
            
        }
        
    }
    
    public void eliminarCantante(HashSet<CantanteFamoso> lista) {
        Iterator<CantanteFamoso> it = lista.iterator();
        entrada.nextLine();
        System.out.print("Nombre del cantante a eliminar? ");
        String nombre = entrada.nextLine();
        
        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
            }
        }
        
    }
    
    public void Menu(HashSet<CantanteFamoso> lista) {
        int opcion;
        do {
            System.out.println("===============================");
            System.out.println(".:         MENU       :.    ");
            System.out.println("1. Ingresar Cantante");
            System.out.println("2. Mostrar todos los Cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:                    
                    agregarCantantes(lista);break;
                case 2:                    
                    mostrarCantantes(lista);break;
                case 3:                    
                    eliminarCantante(lista);break;
            }
            
            
        } while (opcion != 4);        
    }
    
}
