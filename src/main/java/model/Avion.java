package model;

public class Avion extends Vehiculo{
    private int cantidadMotores;
    private int maxAltitud;

    public int getCantidadMotores() {
        return cantidadMotores;
    }

    public void setCantidadMotores(int cantidadMotores) {
        this.cantidadMotores = cantidadMotores;
    }

    public int getMaxAltitud() {
        return maxAltitud;
    }

    public void setMaxAltitud(int maxAltitud) {
        this.maxAltitud = maxAltitud;
    }

    private void descender(){
        System.out.println("Metodo para mostrar que el avion desciende.");
    }

    private void ascender(){
        System.out.println("Metodo para mostrar que el avion asciende.");
    }
}
