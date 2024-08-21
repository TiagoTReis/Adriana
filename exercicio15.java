import java.util.Scanner;

public class HorasTrabalhadas{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Quantas horas o funcionario trabalhou por mes:  ");
int horasTrabalhadas = scanner.nextInt();

System.out.print("Digite o salario por hora:  ");
double salario = scanner.nextInt();

if (horasTrabalhadas <= 160){
    double salarioMes = (horasTrabalhadas*salario);
System.out.println ("O salario do mes foi "+salarioMes +" reais");
}else{
    int total = (horasTrabalhadas-160);
    double acrescimo = (salario*1.5)*total;
    double salarioNovo = (160*salario)+acrescimo;
  System.out.println ("O salario do mes foi "+salarioNovo +" reais");
}
}
}
