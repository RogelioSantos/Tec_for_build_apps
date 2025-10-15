package clases.clases_e_interfaces.clases_abstractas;

    
    public class Pato extends Animal implements Volador {
        private String color;
    
        public Pato(int age, String color) {
            super(age);
            this.color = color;
        }
    
        @Override
        public void hacerRuido(){
            System.out.println("cuac cuac");
        }
    
        @Override
        public void volar(){
            System.out.println("El pato esta volando con " + cantidadAlas + " alas" );
        }
        
    }


