package a07092022;

import java.util.HashMap;
import java.util.Map;

public class PruebaMap {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        
        mapa1.put("rojo","red");
        mapa1.put("azul","blue");
        mapa1.put("green", "verde");
        mapa1.put("white", "blanco");
        
        System.out.println("Listado de valores");
        for (String valor : mapa1.values()) {
            System.out.print(valor+"-");
        }
        System.out.println("");
        System.out.println("Listado de claves");
        for (String valor : mapa1.keySet()) {
            System.out.print(valor+"-");
        }
        System.out.println("");
        
        System.out.println("La traduccion de rojo es "+mapa1.get("rojo"));
        if (!mapa1.containsKey("negro")) {
            System.out.println("No existe esta clave");    
        }
        mapa1.remove("rojo");
        System.out.println(mapa1);
        mapa1.put("black", "negro");
        System.out.println(mapa1);
    }
}
