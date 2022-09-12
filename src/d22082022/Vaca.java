
package d22082022;

public class Vaca extends Animal{
    private int litrosLeche;

    public Vaca() {
        
    }

    public Vaca(int peso, String sonido,int litrosLeche) {
        super(peso, sonido);
        this.litrosLeche = litrosLeche;
    }
        
    
    @Override
    public void Comunicarse(){
        System.out.println("Cuando la vaca tiene leche hace "+ sonido);
    }
}
