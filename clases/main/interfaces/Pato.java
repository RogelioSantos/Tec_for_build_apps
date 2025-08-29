public class Pato extends Animal implements Volador {
    private String color;

    public Pato(String color, int age) {
        super(age);
        this.color = color;
    }

    @Override
    public void hacerRuido() {
        System.out.println("El pato " + color + " hace cuac cuac");
    }

    @Override
    public void volar() {
        System.out.println("El pato " + color + " está volando con sus " + alas + " alas.");
    }


}
