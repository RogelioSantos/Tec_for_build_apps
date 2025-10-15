package clases.clases_e_interfaces.clases_abstractas;
// import interfaces.Volar; // Removed or update this line if the package is incorrect
import clases.clases_e_interfaces.interfaces.Volar; // Use the correct package path for Volar


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

