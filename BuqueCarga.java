package buquecarga;


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