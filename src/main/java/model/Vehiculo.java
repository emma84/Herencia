package model;

public class Vehiculo {
    private int maxFuel;
    private int cantidadPasajeros;
    private int velocidad;

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        System.out.println("Vehiculo acelerando.");
    }

    public void deshacelerar(){
        System.out.println("Vehiculo deshacelerando.");
    }
}
