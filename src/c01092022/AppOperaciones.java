package c01092022;

import javax.swing.JOptionPane;

public class AppOperaciones {
    public static void main(String[] args) {
        
        Suma prueba1=new Suma(15,6);
        
        JOptionPane.showMessageDialog(null, prueba1.suma());
        JOptionPane.showMessageDialog(null, prueba1.resta());
        
       
    }
}
