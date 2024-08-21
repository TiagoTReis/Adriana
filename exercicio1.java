import java.util.Scanner;

public class idadeEmDias{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Digite a idade em anos: ");
     int anos = scanner.nextInt();
     
     System.out.print("Digite a idade em meses: ");
     int meses = scanner.nextInt();
     
     System.out.print("Digite a idade em dias: ");
     int dias = scanner.nextInt();
     
     scanner.close();
     
     int diaDosAnos = anos*365;
     int diaDosMeses = meses*30;
     int totalIdade = diaDosAnos+diaDosMeses+dias;
     
     System.out.println("O total da idade e " + totalIdade);
     }
}
