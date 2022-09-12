
package c10082022;


public class AppCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta("juan",435345);
        Cuenta cuenta2=new Cuenta("pepe",4342432);
        
        
        int cant = 543435;
        
        System.out.println(cuenta1.retirar(cant));
    }
    
}
