import java.util.Scanner;

public class Macas{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Quantidade de macas compradas:  ");
     int macas = scanner.nextInt();
     
    scanner.close();
    
     if (macas >= 12){
        double total=macas *1;
        System.out.println(total);
         }
    else{
        double total2 = macas*1.3;
        System.out.println(total2);
    }
     }
     }
