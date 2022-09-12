package a01092022;

import javax.swing.JOptionPane;

public class AppFigura {
    public static void main(String[] args) {
        
        Cuadrado fig1 = new Cuadrado(8);
        Circulo fig2 = new Circulo(12);
        Triangulo fig3 = new Triangulo(5, 5);
        
        Esfera fig4 = new Esfera(4);
        Cubo fig5 = new Cubo(fig1);
        Piramide fig6 = new Piramide(fig3, 6);
        
        
        
        JOptionPane.showMessageDialog(null, fig1.toString());
        JOptionPane.showMessageDialog(null, fig2.toString());
        JOptionPane.showMessageDialog(null, fig3.toString());
        JOptionPane.showMessageDialog(null, fig4.toString());
        JOptionPane.showMessageDialog(null, fig5.toString());
        JOptionPane.showMessageDialog(null, fig6.toString());
    }
    
}
