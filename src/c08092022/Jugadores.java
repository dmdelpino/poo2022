/*
Ejercicio 3. Java Sets.

Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.

Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.

Pista:
for (String nombre : jugadores) {
System.out.println(nombre);
}

Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.

Crea un segundo conjunto jugadores2 con los jugadores «Piqué» y «Busquets».

Consulta si todos los elementos de jugadores2 existen en jugadores.

Realiza una unión de los conjuntos jugadores y jugadores2.

Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores que tiene el conjunto jugadores2 (debería ahora ser cero).
 */
package c08092022;

import java.util.HashSet;

/**
 *
 * @author Diego
 */
public class Jugadores {
    public static void main(String[] args) {
        
        HashSet<String> jugadores = new HashSet<>();

        
        jugadores.add("Marc-André ter Stegen");
        jugadores.add("Iñaki Peña");
        jugadores.add("Arnau Tenas");
        jugadores.add("Sergiño Dest");
        jugadores.add("Gerard Piqué");
        jugadores.add("Ronald Araújo");
        jugadores.add("Andreas Christensen");
        jugadores.add("Jordi Alba");
        jugadores.add("Jules Koundé");
        jugadores.add("Èric García");
        jugadores.add("Alejandro Baldé");
        jugadores.add("Sergio Busquets");
        jugadores.add("Pedri González");
        jugadores.add("Miralem Pjanić");
        jugadores.add("Franck Kessié");
        jugadores.add("Sergi Roberto");
        jugadores.add("Frenkie de Jong");
        jugadores.add("Pablo Martín Gavi");
        jugadores.add("Ousmane Dembélé");
        jugadores.add("Robert Lewandowski");
        jugadores.add("Ansu Fati");
        jugadores.add("Ferran Torres");
        jugadores.add("Memphis Depay");
        jugadores.add("Raphinha Dias");
        jugadores.add("Ez Abde");
        jugadores.add("Clément Lenglet");
        jugadores.add("Nico González");
        jugadores.add("Antoine Griezmann");
        jugadores.add("Francisco Trincão");
        jugadores.add("Álex Collado");
        
        
        System.out.println("Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.");
        for (String nombre : jugadores) {
            System.out.println(nombre);
        }
        System.out.println("---------------------------------------------------------------------\n");
        
        
        System.out.println("Consulta si en el conjunto existe el jugador «Neymar JR». Avisa si existe o no.");
        
        if (jugadores.contains("Neymar JR")) {
            System.out.println("Neymar está");
        }else{
            System.out.println("Neymar no está");
        }
        System.out.println("---------------------------------------------------------------------\n");
        
        
        HashSet<String> jugadores2 = new HashSet<>();
        jugadores2.add("Gerard Piqué");
        jugadores2.add("Sergio Busquets");
    
        
        System.out.println("Consulta si todos los elementos de jugadores2 existen en jugadores.");
        if (jugadores.containsAll(jugadores2)) {
            System.out.println("todos los de jugadores2 están");
        }else{
            System.out.println("no están los de jugadores2");
        }
        System.out.println("---------------------------------------------------------------------\n");
    
        jugadores.addAll(jugadores2);
        
        jugadores2.clear();
        
    }
    
    
    
}
