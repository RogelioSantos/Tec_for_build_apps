import clases_abstractas.Carro;
import clases_abstractas.Camion;

public class Main {
    public static void main(String[] args) {
        Camion camion1 = new Camion("Volvo", 6, "Azul", 3);
        camion1.encender();
        camion1.acelerar();

        Carro carro1 = new Carro("Toyota", 4, "Rojo") {

        };

        Pato pato1 = new Pato("blanco", 2);
        pato1.hacerRuido();
        pato1.volar();
    }

}
