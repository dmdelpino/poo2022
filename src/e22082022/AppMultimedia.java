
package e22082022;

public class AppMultimedia {
    
    public static void main(String[] args) {
        
        Multimedia prueba1=new Multimedia("Nevermind", "Nirvana",Formato.CD_AUDIO,50);
        System.out.println(prueba1.toString());
        
        Pelicula prueba2=new Pelicula("sasas","Fight Club", "Fincher", Formato.DVD, 120);
        System.out.println(prueba2.toString());
        
    }
    
}
