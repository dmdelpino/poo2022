
package a22082022;

public class AppVehiculo {
    public static void main(String[] args) {
        
        Vehiculo prueba1=new Vehiculo("abc123", "modelo1", 1.4f);
        Taxi prueba2=new Taxi("def456","modelo2", 1.2f,43543543);
        Autobus prueba3=new Autobus("ghi789", "modelo3",1.6f,78);
        
        System.out.println(prueba1.toString());
        System.out.println(prueba2.toString());
        System.out.println(prueba3.toString());
        
        
        
    }
    
}
