package a01092022;

public class Esfera extends Figura3D{
    
    private int radio;
    

    public Esfera(int radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public int calcularVolumen(){
        double volumen = (4/3)*Math.PI*Math.pow(radio, 3);
        return (int)volumen;
    };

    @Override
    public String toString() {
        return  "Esfera:  " +"\n"
                + "Radio: " + radio +"\n"
                +super.toString();
    }
    
    
    
}
