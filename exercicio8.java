import java.util.Scanner;

public class Positivo{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Digite uma valor:  ");
     int valor = scanner.nextInt();
     
    scanner.close();
    
     if (valor >= 0){
        System.out.println("E POSITIVO");
         }
    else{
        System.out.println("E NEGATIVO");
    }
     }
     }
