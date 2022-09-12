package b01092022;

import javax.swing.JOptionPane;

public class AppPersona {
    
    public static void main(String[] args) {
        
        Diputado prueba1 = new Diputado(45, "Catamarca", "Federales", 125, "Abraham", "Gonzales", 50, true);
        
        JOptionPane.showMessageDialog(null, prueba1.toString());
        
    }
    
    
    
    
}
