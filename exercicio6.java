import java.util.Scanner;

public class Fahrenheit{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Digite uma temperatura em Fahrenheit: ");
     int Fahrenheit = scanner.nextInt();
     
    scanner.close();
    
     double Celsius = ((Fahrenheit-32)/1.8);

     System.out.println("O valor em Celsius e: "+ Celsius);
    
     }
     }
