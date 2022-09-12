
package a25082022;

import java.util.Scanner;

public class AppCartas {
    public static void main(String[] args) {
        
        Cartas list_cart[] = Cartas.values();
        
        int opcion;
        System.out.println("Seleccione carta: "+"\n");
        for (int i = 0; i < list_cart.length; i++) {
            System.out.println((i+1)+"-"+list_cart[i]);
                            
        }
        Scanner tecl = new Scanner(System.in);
        opcion = tecl.nextInt();
        
        
        System.out.println("la opción elegida es: "+ list_cart[opcion-1]);
            }
            
        
    }

