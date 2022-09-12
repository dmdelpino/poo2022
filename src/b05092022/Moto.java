package b05092022;

public class Moto implements Vehiculo{
    int velocidad;
    
    public String frenar(int cuanto){
        velocidad-=cuanto;
        return "La moto frenó y va a una velocidad de "+velocidad+" km/hr";
    }
    
    public String acelerar(int cuanto){
        String cadena="";
        velocidad+=cuanto;
        if (velocidad>VEL_MAX) {
            cadena="Exceso de velocidad";
        }else{
            cadena="La moto ha acelerado y va a una velocidad de "+velocidad+" km/hr";
        }
        return cadena;
    };
    
}
