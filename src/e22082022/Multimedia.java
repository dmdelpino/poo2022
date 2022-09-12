/*
 Ejercicio Nro.5 - Herencia

Escribir una clase Multimedia para almacenar información de los objetos de tipo multimedia (películas, discos, mp3,mp4…). Esta clase contiene título, autor, formato, y duración como atributos. El formato puede ser uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cd Audio y dvd. El valor de todos los atributos se pasa por parámetro en el momento de crear el objeto. Esta clase tiene además, un método para devolver cada uno de los atributos y un método toString() que devuelve la información del objeto. Por último, un método equals() que recibe un objeto de tipo Multimedia y devuelve true en caso de que el título y el autor sean iguales y false en caso contrario.    

Tip    
Para el formato de los objetos Multimedia, se debe crear un tipo enumerado de nombre Formato con los valores indicados anteriormente. El resto, una clase como ya hemos hecho varias veces.

Escribe una clase Película que herede de la clase Multimedia anterior. La clase Película tiene, además de los atributos heredados, un actor principal y una actriz principal. Se permite que uno de los dos sea nulo, pero no los dos. La clase debe tener dos métodos para obtener los nuevos atributos y debe sobreescribir el método toString() para reflejar la nueva información.

Tip
La clase Película hereda de Multimedia. En el constructor se reciben los valores de los atributos de la superclase y los dos nuevos. Se debe controlar que los valores de los dos nuevos atributos (actor y actriz) no sean ambos nulos. 

Tip

Para el formato de los objetos Multimedia, se debe crear un tipo enumerado de nombre Formato con los valores indicados anteriormente. El resto, una clase como ya hemos hecho varias veces.


*/


package e22082022;

public class Multimedia {
    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int duracion;
    
    

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }
    
    
    
    
    public String toString(){
        return "Titulo: "+ titulo+"\n"
               +"Autor: "+autor+"\n"
               +"Formato: " +formato+"\n"
               +"Duracion: " +duracion;
    }
    
    public Boolean equals(Multimedia prueba){
        return prueba.titulo.equals(prueba.autor);
    }
    
    
}
