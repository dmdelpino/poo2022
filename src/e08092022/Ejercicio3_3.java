/*
3.- Ahora hay un mapa establecido de la siguiente manera:
Map<Integer,String> map = new HashMap<Integer, String>();
map.put (1, " ");
map.put (2, "Zhou Zhiruo");
map.put (3, "Wang Feng");
map.put (4, "Exterminador también");
Reclamación:
1. Recorre la colección e imprime el número de serie y el nombre correspondiente.
2. Inserte un mensaje codificado como 5 y llamado Li Xiaohong en el conjunto de mapas
3. Elimine la información numerada 1 en el mapa
4. Modifique la información del nombre numerada 2 en el mapa establecido en "Zhou Lin"
 */
package e08092022;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class Ejercicio3_3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put (1, " ");
        map.put (2, "Zhou Zhiruo");
        map.put (3, "Wang Feng");
        map.put (4, "Exterminador también");
    
    
        for (Integer integer : map.keySet()) {
            System.out.println(integer+"-"+map.get(integer));
        }
        
        map.put(5, "Li Xiaohong");
        
        map.remove(1);
        
        map.replace(2, "Zhou Lin");
        
    
    
    }
}
