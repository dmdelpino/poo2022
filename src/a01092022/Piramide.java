package a01092022;

public class Piramide extends Figura3D{
    
    private Triangulo tri;
    private int altura;

    public Piramide(Triangulo tri, int altura) {
        this.tri = tri;
        this.altura = altura;
    }
    
    
    
    
    public int calcularVolumen(){
        double volumen=(tri.getBase()*altura)/3;
        return (int)volumen;
        
    };

    @Override
    public String toString() {
        return "Piramide: "+"\n" 
                +"Base: " + tri.getBase()+"\n"
                +"Altura: " + altura +"\n"
                +super.toString();
    }
    
    
}
