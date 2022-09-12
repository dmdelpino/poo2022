package a24082022;



public class AppDiaSemana1 {
      
   
    public static void main(String[] args) {
        DiaSemana d = DiaSemana.MARTES;
        if (d == DiaSemana.DOMINGO || d.equals(DiaSemana.SABADO)) {
            System.out.println("fin de semana");
            
        }else{
            System.out.println("dia laboral");
        }
    
   
}
}
