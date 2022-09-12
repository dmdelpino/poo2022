/*
Dada una biblioteca donde los libros se ienifican por el codigo ISBN se pide: 
-cargar 10 elementos conformados por el ISBN (es alfanumerico) y el título del libro
-mostrar todas las claves y todos los titulos
-eliminar un libro y mostrar todos los valores y claves
-incorporar una clave y su titulo
-mostrar el listado de claves y valores, por separado
-verificar la existencia de una clave que este y una que no esté y mostrar los resultados
*/
package a07092022;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<>();
        
        mapa1.put("978-3-16-148410-0","Dune");
        mapa1.put("978-3-16-564564-0","Tale of Two Cities");
        mapa1.put("978-3-16-398432-0","Catch-22");
        mapa1.put("978-3-16-893574-0","Los Miserables");
        mapa1.put("978-3-16-329847-0","El Corán");
        mapa1.put("978-3-16-023942-0","Fight Club");
        mapa1.put("978-3-16-384292-0","El Hombre que Ríe");
        mapa1.put("978-3-16-423948-0","Orgullo y Prejuicio");
        mapa1.put("978-3-16-594383-0","Jane Eyre");
        mapa1.put("978-3-16-398539-0","Beyond the Aquila Rift");
        
        
        
        System.out.println(mapa1);
        mapa1.remove("978-3-16-398539-0");
        System.out.println(mapa1);
        mapa1.put("978-3-16-398472-0", "Tokio Blues");
        
        for (String string : mapa1.keySet()) {
            System.out.println(string);
        }
    }
}
