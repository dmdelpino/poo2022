package a01092022;

public abstract class Figura3D extends Figura{
    
    @Override
    public void dibujar(){
        
    };
    
    public abstract int calcularVolumen();

    @Override
    public String toString() {
        return "Volumen: "+calcularVolumen();
    }
    
    
    
}
