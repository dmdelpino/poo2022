
package a01092022;

import javax.swing.JOptionPane;

public class Triangulo extends Figura2D{

    private int base, altura;
    

    
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    
    
    
    public int getBase() {
        return base;
    }

    
    
    @Override
    public int calcularArea(){
        double area = (base*altura)/2;
        return (int)area;
    };
    
    @Override
    public int calcularPerimetro(){
        double perimetro=3*base;
        return (int)perimetro;
    };
    
    public int cambiarTamaño(){
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva base del triangulo: "));
        return base;
        
    };

    @Override
    public String toString() {
        return "Triangulo: " +"\n"
                +"Base: " + base +"\n"
                +"Altura: " + altura+"\n"
                + super.toString();
                
    }
    
    
    
}
