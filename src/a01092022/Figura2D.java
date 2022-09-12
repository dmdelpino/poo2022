package a01092022;

public abstract class Figura2D extends Figura{
    
    @Override
    public void dibujar(){
        
    };
    
    public abstract int calcularArea();
    
    public abstract int calcularPerimetro();

    @Override
    public String toString() {
        return  "Area: " + calcularArea()+"\n"
                + "Perimetro: " + calcularPerimetro();
    }
    
    
    
}
