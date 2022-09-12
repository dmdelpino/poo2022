
package a01092022;

import javax.swing.JOptionPane;

public class Circulo extends Figura2D{
    
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public int calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return (int) area;
    };
    
    @Override
    public int calcularPerimetro(){
        double perimetro= 2 * Math.PI*radio;
        return (int)perimetro;
    };
    
    public int cambiarTamaño(){
        radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva base del triangulo: "));
        return radio;
    };

    @Override
    public String toString() {
        return "Circulo: " +"\n"
                +"Radio: " + radio +"\n"
                + super.toString();
    }
    
    
    
}
