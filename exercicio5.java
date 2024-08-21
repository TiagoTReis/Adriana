import java.util.Scanner;

public class LojaDeCarros{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Salario do funcionario: R$ ");
     int salario = scanner.nextInt();
     
     System.out.print("Quantidade de carros vendidas: ");
     int quantidade = scanner.nextInt();
     
    System.out.print("Valor total dos carros vendidos: ");
     int valorCarros = scanner.nextInt();   
    
    scanner.close();
    
     int comissaoPorCarro = (salario/100*5)*quantidade;
     int comissaoTotal = (valorCarros/100*5);
     int total = (salario+comissaoPorCarro+comissaoTotal);
     
     System.out.println("O salario do vendedor sera: R$ " + total);
    
     }
     }
