/*

 */
package b05092022;

/**
 *
 * @author Diego
 */
public class Auto implements Vehiculo{
    private int velocidad=0;
    
    public String frenar(int cuanto){
        velocidad-=cuanto;
        return "El auto frenó y va a una velocidad de: "+velocidad+" km/hr";
    };
    
    public String acelerar(int cuanto){
        String cadena="";
        velocidad+=cuanto;
        if (velocidad>VEL_MAX) {
            cadena="Exceso de velocidad";
        }else{
            cadena="El auto ha acelerado y va a una velocidad de "+velocidad+" km/hr";
        }
        return cadena;
    };
    
}
