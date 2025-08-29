package erick;

public abstract class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void hacerSonido();

    public void dormir(){
        System.out.println(this.name + " está durmiendo.");
    }
    
    public String getName(){
        return this.name;
    }

    
}
