import java.util.Scanner;

public class MaiorValor{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Digite o primeiro valor:  ");
int primeiroValor = scanner.nextInt();

System.out.print("Digite o segundo valor:  ");
int segundoValor = scanner.nextInt();

scanner.close();

if (primeiroValor > segundoValor){
System.out.println("O maior valor e: "+ primeiroValor);
         }
else{
System.out.println("O maior valor e: "+ segundoValor);
    }
     }
     }
