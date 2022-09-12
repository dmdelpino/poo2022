package e22082022;

public class Pelicula extends Multimedia{
    
    private String actor_principal;
    private String actriz_principal;

    public Pelicula(String actor_principal, String actriz_principal, String titulo, String autor,Formato formato ,int duracion) {
        super(titulo, autor,formato, duracion);
        this.actor_principal = actor_principal;
        this.actriz_principal = actriz_principal;
        
        
        
    }
   
    public Pelicula(String artista, String titulo, String autor, Formato formato, int duracion) {
        super(titulo, autor,formato, duracion);
        artista = actriz_principal;
        artista = actor_principal;
        }
        
                        
    }

    
    
    @Override
    public String toString(){
        return super.toString()+"\n"+"Actriz: "+actriz_principal+"\n"+"Actor: "+actor_principal;
                    
        
        
    }
        
    
}
