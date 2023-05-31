package Servicios;

import Entidad.Baraja;
import Entidad.Carta;
import Enumeraciones.PaloCarta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class cartaServices {
    Scanner entrada = new Scanner(System.in);
    
    public void crearMazo(Baraja mazo) {
//      PaloCarta [] palos = PaloCarta.values();
        ArrayList<Carta> listaAux = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {

            if (i != 8 && i != 9) {
                for (int j = 0; i < 4; i++) {
                    listaAux.add(new Carta(i, PaloCarta.values()[j].name()));
                    /*
                    Palocarta --> Enum
                    values --> Devuelve un objeto de tipo PaloCarta
                    [] -- > posicion que quiero que me devuelva
                    name --> Para que me devuelva un String con el nombre
                     */
                }

            }

        }
        Collections.shuffle(listaAux);
        mazo.setMazo(listaAux);
    }

    public void barajar(ArrayList<Carta> lista) {
        Collections.shuffle(lista);
    }

    public Carta siguienteCarta(int posicion, ArrayList<Carta> lista) {
        if (posicion == lista.size()) {
            System.out.println("No hay mas cartas");
            return null;
        } else {
            return lista.get(0);
        }
    }

    public int cartasDisponibles(ArrayList<Carta> lista) {
        return lista.size();
    }

    public void darCartas(int cantCartas, ArrayList<Carta> lista, ArrayList<Carta> elim) {
        Carta cartaElim = new Carta();
        if (cantCartas <= cartasDisponibles(lista)) {
            for (int i = 0; i < cantCartas; i++) {
                cartaElim = siguienteCarta(i, lista);
                elim.add(cartaElim);
                lista.remove(0);
            }
        }
    }

    public void cartasMonton(ArrayList<Carta> elim) {
        if (elim.size() == 0) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (Carta aux : elim) {
                System.out.println("Palo " + aux.getPalo() + "Numero: " + aux.getNumeroCarta());
            }
        }
    }

    public void menuJuego(Baraja mazo) {
        Carta cs = new Carta();
        int opcion;
        do {
            System.out.println(" ______________ MENU _______________ ");
            System.out.println("| 1. Mezclar cartas                 |");
            System.out.println("| 2. Ver carta siguiente            |");
            System.out.println("| 3. Cantidad de cartas disponibles |");
            System.out.println("| 4. Sacar cartas                   |");
            System.out.println("| 5. Mostrar cartas que ya salieron |");
            System.out.println("| 6. Mostrar mazo                   |");
            System.out.println("| 7. Salir                          |");
            System.out.println("|___________________________________|");
            System.out.print("  Opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion) {
                case 1:
                    barajar(mazo.getMazo());
                    break;
                case 2:
                    cs = siguienteCarta(0, mazo.getMazo());
                    if(cs != null){
                        cs.toString();
                    }
                    break;
                case 3:
                    System.out.println("La cantidad de cartas disponibles son " + cartasDisponibles(mazo.getMazo()));
                    break;
                case 4:
                    System.out.println("Cantidad de cartas a dar: " );
                    int cant = entrada.nextInt();
                    darCartas(cant, mazo.getMazo(), mazo.getMazo());
                    break;
                case 5:
                    cartasMonton(mazo.getCartasElim());
                    break;
                case 6:
                    mazo.toString();
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion !=7);
    }
}
