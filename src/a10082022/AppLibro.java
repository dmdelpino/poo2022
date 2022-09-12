package a10082022;

public class AppLibro {
    public static void main(String[] args) {
        
        
        
        Libro lib1= new Libro(103847234, "El Señor de los Anillos", "JRR Tolkien", 235);
        Libro lib2=new Libro(3853853,"Rayuela", "Cortazar", 235);

        System.out.println(lib1.toString());
        System.out.println(lib2.toString());
        
        lib1.setPaginas(70);
        
        if (lib1.getPaginas()  > lib2.getPaginas()) {
            System.out.println("el libro "+ lib1.getTitulo()+" tiene mas paginas");
            
        }else{
            System.out.println("el libro" + lib2.getTitulo() + " tiene mas paginas");
        }   
        
        
    }
    
    
        
    
}
