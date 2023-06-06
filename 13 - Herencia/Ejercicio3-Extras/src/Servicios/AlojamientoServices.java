package Servicios;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.ExtraHotel;
import Entidad.Hotel;
import Entidad.HotelCincoEstrellas;
import Entidad.HotelCuatroEstrella;
import Entidad.Recidencia;

import java.util.ArrayList;

public class AlojamientoServices {

    public void verAlojamientos(ArrayList<Alojamiento> listaAlojamiento) {

        for (Alojamiento alojamiento : listaAlojamiento) {

            if (alojamiento instanceof HotelCincoEstrellas) {
                System.out.println("");
                System.out.println("_____ Hotel 5 Estrellas _____");
            } else {
                if (alojamiento instanceof HotelCuatroEstrella) {
                    System.out.println("");
                    System.out.println("_____ Hotel 4 Estrellas _____");
                } else {
                    if (alojamiento instanceof Hotel) {
                        System.out.println("");
                        System.out.println("_____ Hotel _____");
                    } else {
                        if (alojamiento instanceof Recidencia) {
                            System.out.println("");
                            System.out.println("_____ Recidencia _____");
                        } else {
                            if (alojamiento instanceof Camping) {
                                System.out.println("");
                                System.out.println("_____ Camping _____");
                            } else {
                                if (alojamiento instanceof ExtraHotel) {
                                    System.out.println("");
                                    System.out.println("_____ No Hoteles _____");
                                } else {
                                    if (alojamiento instanceof Alojamiento) {
                                        System.out.println("");
                                        System.out.println("_____ Alojamiento _____");
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(alojamiento.toString());
        }

    }

}
