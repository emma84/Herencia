package model;

public class Auto extends Vehiculo{
    private int modelo;

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void doblarIzquierda(){
        System.out.println("Auto doblando a la izquierda.");
    }

    public void doblarDerecha(){
        System.out.println("Auto doblando a la derecha.");
    }
}
