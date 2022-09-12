
package c25082022;

import javax.swing.JOptionPane;


public class AppEmpanadas {
    public static void main(String[] args) {
        Provincias[] prueba1=Provincias.values();
        
       
        
        String texto1 = JOptionPane.showInputDialog(null, "Vendidas en Salta");
        int cantSalta = Integer.parseInt(texto1);
    
        String texto2 = JOptionPane.showInputDialog(null, "Vendidas en Tucuman");
        int cantTucuman = Integer.parseInt(texto2);
    
        String texto3 = JOptionPane.showInputDialog(null, "Vendidas en Catamarca");
        int cantCatamarca = Integer.parseInt(texto3);
    
        String texto4 = JOptionPane.showInputDialog(null, "Vendidas en Jujuy");
        int cantJujuy = Integer.parseInt(texto4);
        
        int promo1;
        int promo2;
        if (cantSalta > cantTucuman) {
            promo1= cantSalta/2;
            promo2=cantTucuman/4;
        }else{
            promo1= cantSalta/4;
            promo2=cantTucuman/2;
        }
        
        int promo3;
        int promo4;
        if (cantCatamarca > cantJujuy) {
            promo3= cantCatamarca/2;
            promo4=cantJujuy/4;
        }else{
            promo3= cantCatamarca/4;
            promo4=cantJujuy/2;
        }
        
        JOptionPane.showMessageDialog(null, Provincias.SALTA+" tuvo "+promo1+" promociones");
        JOptionPane.showMessageDialog(null, Provincias.TUCUMAN+" tuvo "+promo2+" promociones");
        JOptionPane.showMessageDialog(null, Provincias.CATAMARCA+" tuvo "+promo3+" promociones");
        JOptionPane.showMessageDialog(null, Provincias.JUJUY+" tuvo "+promo4+" promociones");
        /*
        System.out.println(Provincias.SALTA+"tuvo "+promo1+" promociones");
        System.out.println(Provincias.TUCUMAN+"tuvo "+promo2+" promociones");
        System.out.println(Provincias.CATAMARCA+"tuvo "+promo3+" promociones");
        System.out.println(Provincias.JUJUY+"tuvo "+promo4+" promociones");
        */
}
    
}
