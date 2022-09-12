
package a11082022;


public class AppCuenta {
    public static void main(String[] args) {
        
        Cuenta cta1 = new Cuenta("aaaa","aa-123", 0, 2000);
        Cuenta cta2 = new Cuenta("bbbb","bb-123", 0, 4000);
        
        System.out.println("saldo cuenta1: "+cta1.getSaldo());
        System.out.println("saldo cuenta2: "+cta2.getSaldo());
        cta1.ingreso(cta2.getNro(), 1000);
        cta2.extraccion(cta2.getNro(), 1000);
        System.out.println("saldo cuenta2: "+cta2.getSaldo());
        System.out.println("saldo cuenta1: "+cta1.getSaldo());
    }
    
}
