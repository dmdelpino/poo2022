
package a01092022;

import javax.swing.JOptionPane;

public class Cuadrado extends Figura2D{
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    
    
    public int getLado() {
        return lado;
    }
    
    
    
    @Override
    public int calcularArea(){
        int area = lado * lado;
        return area;
    };
    
    @Override
    public int calcularPerimetro(){
        int perimetro=lado+lado+lado+lado;
        return perimetro;
    };
    
    
    public int cambiarTamaño(){
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva base del triangulo: "));
        return lado;

    };

    @Override
    public String toString() {
        return "Cuadrado: " +"\n"
                + "Lado :" + lado +"\n"
                + super.toString();
                
    }
    
    
    
}
