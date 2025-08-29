package erick;

public class Pato extends Animal implements volar {

    public Pato(String name) {
        super(name);
    }

    @Override
    public void volar() {
        System.out.println("El pato está volando");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pato hace 'cuac cuac'");
    }



}
