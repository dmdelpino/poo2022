/*

 */
package a05092022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class Formulario extends JFrame implements ActionListener{
    
    private JLabel eti1;
    private JTextField campo1;
    private JButton boton;
    
    ///constructor del formulario
    public Formulario(){
        setLayout(null);
        eti1=new JLabel("Nombre: ");
        eti1.setBounds(100, 100, 100, 30);
        add(eti1);
        campo1=new JTextField();
        campo1.setBounds(250, 100, 200, 30);
        add(campo1);
        boton=new JButton("Aceptar");
        boton.setBounds(500, 250, 100, 50);
        add(boton);
        boton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==boton) {
            setTitle("Nombre");
        }
        
    }
}
