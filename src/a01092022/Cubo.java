
package a01092022;


public class Cubo extends Figura3D{
    
    private Cuadrado cuad;

    public Cubo(Cuadrado cuad) {
        this.cuad = cuad;
    }
    
    
    public int calcularVolumen(){
        double volumen= Math.pow(cuad.getLado(),3);
        return (int)volumen;
        
    };

    @Override
    public String toString() {
        return "Cubo: " +"\n"
                + "Lado: " + cuad.getLado() +"\n"
                +super.toString();
    }
    
    
}
