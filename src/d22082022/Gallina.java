
package d22082022;

public class Gallina extends Animal{

    private int numeroHuevos;

    public Gallina() {
       
    }

    public Gallina(int peso, String sonido,int numeroHuevos) {
        super(peso, sonido);
        this.numeroHuevos = numeroHuevos;
    }
    
    
    
    
    
    @Override
    public void Comunicarse(){
        System.out.println("Cuando la gallina come maiz hace "+sonido);
    }
}
