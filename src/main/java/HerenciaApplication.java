import model.Auto;

public class HerenciaApplication {

    public static void main(String[] args) {
        System.out.println("HerenciaExample is now running...");

        Auto auto  = new Auto();
        auto.doblarDerecha();
        auto.acelerar();
        auto.deshacelerar();
    }
}
