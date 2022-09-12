package d22082022;

public class Animal {
    protected int peso;
    protected String sonido;
    
    
    public Animal(){      
    }

    public Animal(int peso, String sonido) {
        this.peso = peso;
        this.sonido = sonido;
    }
    
    
    
    
    
    public void Comunicarse(){
        System.out.println("Sonido genérico");
    }
    
}
