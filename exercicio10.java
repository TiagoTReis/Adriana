import java.util.Scanner;

public class MediaAluno{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Digite a primeira nota:  ");
double primeiraNota = scanner.nextInt();

System.out.print("Digite a segunda nota:  ");
double segundaNota = scanner.nextInt();

double media = (primeiraNota+segundaNota)/2;
System.out.println("A media do aluno foi: "+ media);

scanner.close();

if (media >= 6){
System.out.println("O aluno esta aprovado");
         }
else{
System.out.println("O aluno esta reprovado");
    }
     }
     }