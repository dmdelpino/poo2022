package b05092022;

public class AppVehiculo {
    public static void main(String[] args) {
        
        Auto au1 = new Auto();
        System.out.println(au1.acelerar(100));
        System.out.println(au1.frenar(25));
        System.out.println(au1.acelerar(75));
        
        Moto mo1=new Moto();
        System.out.println(mo1.acelerar(100));
        System.out.println(mo1.frenar(25));
        System.out.println(mo1.acelerar(75));
    }
}
