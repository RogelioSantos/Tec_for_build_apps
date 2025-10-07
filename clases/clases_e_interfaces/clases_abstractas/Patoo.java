package clases.clases_e_interfaces.clases_abstractas;

import clases.clases_e_interfaces.interfaces.Nadar;
import clases.clases_e_interfaces.interfaces.Volar;

public class Patoo extends Animales implements Nadar , Volar {

    public Patoo(String name){
        super(name);
    }

    @Override
    public void hacerRuido() {
        System.out.println(" cuac cuac");
        
    }

    @Override
    public void nadando() {
        System.out.println(" El pato está nadando");
        
    }

    @Override
    public void volando() {
        System.out.println(" El pato está volando ");
        
    }

    
    
}

