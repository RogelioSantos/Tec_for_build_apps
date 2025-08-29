package erick;

public class Paloma extends Animal implements volar {

    public Paloma(String name) {
        super(name);
    }

    @Override
    public void volar() {
        System.out.println("la paloma está volando");
    }

    @Override
    public void hacerSonido() {
        System.out.println("La paloma hace 'coo coo'");
    }



}