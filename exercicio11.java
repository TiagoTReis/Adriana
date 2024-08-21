import java.util.Scanner;

public class Eleicao{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Digite o ano atual:  ");
int anoAtual = scanner.nextInt();

System.out.print("Digite o seu ano de nascimento:  ");
int anoNascimento = scanner.nextInt();

int diferenca = (anoAtual-anoNascimento);

scanner.close();

if (diferenca >= 18){
System.out.println("O eleitor esta apto a votar");
         }
else{
System.out.println("O eleitor nao esta apto a votar");
    }
     }
     }
