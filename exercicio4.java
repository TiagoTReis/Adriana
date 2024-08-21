import java.util.Scanner;

public class ReajusteSalario{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Atual Salario: R$ ");
     int atualSalario = scanner.nextInt();
     
     System.out.print("Reajuste: ");
     int reajuste = scanner.nextInt();
    
     scanner.close();
    
     int novoSalario = (atualSalario/100*reajuste)+atualSalario;
     System.out.println("O novo salario sera: R$ "+ novoSalario);
    
     }
     }
