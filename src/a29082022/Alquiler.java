package a29082022;

import java.time.*;
import java.util.*;
import javax.swing.JOptionPane;
  

public class Alquiler {
    private String nombre_cliente;
    private int dni;
    private LocalDate fecha_inicial;
    private LocalDate fecha_final;
    private double posicion;
    private int dias_alquilado;
        
    public int diferenciaDias()
    {          
        String texto1 = JOptionPane.showInputDialog(null, "Año inicial: ");
        int txt1=Integer.parseInt(texto1);
        String texto2 = JOptionPane.showInputDialog(null, "Mes inicial: ");
        int txt2=Integer.parseInt(texto2);
        String texto3 = JOptionPane.showInputDialog(null, "Dia inicial: ");
        int txt3=Integer.parseInt(texto3);
        fecha_inicial = LocalDate.of(txt1,txt2,txt3);
        
        String texto4 = JOptionPane.showInputDialog(null, "Año final: ");
        int txt4=Integer.parseInt(texto4);
        String texto5 = JOptionPane.showInputDialog(null, "Mes final: ");
        int txt5=Integer.parseInt(texto5);
        String texto6 = JOptionPane.showInputDialog(null, "Dia final: ");
        int txt6=Integer.parseInt(texto6);
        fecha_final = LocalDate.of(txt4,txt5,txt6);
        
        
        
        Period diff = Period.between(fecha_inicial, fecha_final);        
        dias_alquilado=Math.abs(diff.getDays());
        return dias_alquilado;
    }

    
    
    
    
    
}
