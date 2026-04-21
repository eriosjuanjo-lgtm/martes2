package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CamionDeReparto camion = new CamionDeReparto("C1", 50, 1000, true);
        BuqueCarga buque = new BuqueCarga("B1", 80, 5000, 50);

        camion.setCombustible(-20);
        System.out.println("Combustible camion (debe ser 0): " + camion.getCombustible());

        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
        }

        System.out.println("Camion combustible: " + camion.getCombustible());
        System.out.println("Buque combustible: " + buque.getCombustible());

        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}