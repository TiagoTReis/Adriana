import java.util.Scanner;

public class NotasAluno{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Nota P1:  ");
     double P1 = scanner.nextDouble();
     
     System.out.print("Nota E1:  ");
     double E1 = scanner.nextDouble();
     
     System.out.print("Nota E2:  ");
     double E2 = scanner.nextDouble();
     
    System.out.print("Nota API:  ");
     double API = scanner.nextDouble();
     
     System.out.print("Nota Sub:  ");
     double SUB = scanner.nextDouble();
     
    System.out.print("Nota X:  ");
     double X = scanner.nextDouble();
     
    scanner.close();
    
    double media = (P1*0.6+((E1+E2)/2)*0.4)*0.5+(Math.max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X+(SUB*0.2);
    
    if (media > 10){
             System.out.println(10);
        }else{
           System.out.println(media);
            
        }
    
}
     }
     
