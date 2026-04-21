package com.example;

public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        this.combustible = combustible;
        this.capacidadCarga = capacidadCarga;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: carga negativa");
        } else {
            this.capacidadCarga = carga;
        }
    }

    public void viajar(int distancia) {
        combustible -= (distancia / 10);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------
package com.example;

public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String id, double combustible, double carga, boolean tieneRefrigeracion) {
        super(id, combustible, carga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            setCombustible(getCombustible() - (distancia / 10) * 2);
        } else {
            super.viajar(distancia);
        }
    }
}
---------------------------------------------------------------------------------------------------------------------------------------
package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String id, double combustible, double carga, int contenedores) {
        super(id, combustible, carga);
        this.cantidadContenedores = contenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("Buque " + getIdTransporte() + " listo para descarga.");
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Carga: " + getCapacidadCarga());
        System.out.println("Contenedores: " + cantidadContenedores);
    }
}
----------------------------------------------------------------------------------------------------------------------------
package com.example;

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
