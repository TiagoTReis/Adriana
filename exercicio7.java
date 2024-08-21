import java.util.Scanner;

public class Maior{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Digite uma valor:  ");
     int valor = scanner.nextInt();
     
    scanner.close();
    
     if (valor > 10){
        System.out.println("E MAIOR QUE 10!");
         }
    else{
        System.out.println("NAO E MAIOR QUE 10");
    }
     }
     }
