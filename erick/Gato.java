package erick;

public class Gato extends Animal {

    public Gato(String name) {
        super(name);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
