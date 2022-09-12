package d22082022;

public class Cerdo extends Animal{
    
    private int kilosCarne;
    
    public Cerdo(){
        
    }

    public Cerdo(int peso, String sonido,int kilosCarne) {
        super(peso, sonido);
        this.kilosCarne = kilosCarne;
    }
    
    
    
    @Override
    public void Comunicarse(){
        System.out.println("Cuando el cerdo se revuelca en el barro hace "+sonido);        
    }
    
}
