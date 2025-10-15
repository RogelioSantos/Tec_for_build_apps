package clases.clases_e_interfaces.clases_abstractas;

public class Gato extends Animales{
    
    public Gato(String name){
        super(name);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Meow");   
    }
}

