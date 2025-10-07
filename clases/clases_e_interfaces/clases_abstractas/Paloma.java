package clases_abstractas;
import interfaces.Volar;


public class Paloma extends Animales implements Volar {


    public Paloma(String name){
        super(name);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Grr grr");
        
    }

    @Override
    public void volando() {
        System.out.println(" Está volando");
        
    }
    
    
}

