package c22082022;

public class AppEmpleado {
    public static void main(String[] args) {
        Empleado prueba1=new Empleado("aaaaaaa",443432,44,true,23455);
        Programador prueba2=new Programador("bbbbbb", 434783647, 76,false,77444,120,"java");
        
        System.out.println(prueba1.toString());
        System.out.println(prueba2.toString());
    }
    
}
