package a05092022;

import javax.swing.JFrame;

public class AppFormulario {
    public static void main(String[] args) {
        Formulario form=new Formulario();
        form.setBounds(0, 0, 1000, 800);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
