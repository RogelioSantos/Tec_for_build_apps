package clases.clases_e_interfaces.clases_abstractas;

public abstract class Carro {
    protected String marca;
    protected int llantas;
    protected String color;


    public Carro(String marca, int llantas, String color) {
        this.marca = marca;
        this.llantas = llantas;
        this.color = color;
    }

    public void encender(){
        System.out.println("Encendiendo...");
    }

    public abstract void acelerar(); 
    
}