/*

 */
package c05092022;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class AppPersona {
    public static void main(String[] args) {
        Persona per1=new Persona(1000,2000,"Juan","Perez");
        
        System.out.println(per1.getNombre());
        System.out.println(per1.calculoCapital());
        
        Persona per2 = new Persona();
        
        int ahorro = Integer.parseInt(JOptionPane.showInputDialog("Monto de ahorro: "));
        int fondo =  Integer.parseInt(JOptionPane.showInputDialog("Monto de fondo: "));
        String nombre = JOptionPane.showInputDialog("Nombre: ");
        String apellido = JOptionPane.showInputDialog("Apellido: ");
        
        per2.ahorro = ahorro;
        per2.fondoretiro = fondo;
        per2.nom=nombre;
        per2.ape=apellido;
        
        JOptionPane.showMessageDialog(null, per2.getNombre());
        JOptionPane.showMessageDialog(null, per2.calculoCapital());
    }
}
