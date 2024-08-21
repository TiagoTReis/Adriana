import java.util.Scanner;

public class OrdemCrescente{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Digite o primeiro valor:  ");
int primeiroValor = scanner.nextInt();

System.out.print("Digite o segundo valor:  ");
int segundoValor = scanner.nextInt();

scanner.close();

if (primeiroValor < segundoValor){
System.out.println("A ordem crescente e: "+ primeiroValor+" - " + segundoValor);
         }
else{
System.out.println("A ordem crescente e: "+ segundoValor+" - " + primeiroValor);
    }
     }
}