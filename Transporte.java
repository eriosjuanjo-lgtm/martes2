package transporte;

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