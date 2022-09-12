
package d10082022;

public class AppFecha {
    public static void main(String[] args) {
        Fecha fecha1=new Fecha(02,12,1982);
    
        Fecha fecha2=new Fecha(32,12,1982);
        
        System.out.println("FECHA1: "+fecha1.toString());
        System.out.println("Fecha1 correcta?: "+fecha1.fechaCorrecta());
        
        System.out.println("FECHA2: "+fecha2.toString());
        System.out.println("Fecha2 correcta?: "+fecha2.fechaCorrecta());
        
    
    }
    
    
}
