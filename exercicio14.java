import java.util.Scanner;

public class HorasXadrez{

public static void main(String []args){
        Scanner scanner = new Scanner (System.in);

System.out.print("Digite a hora do inicio do jogo:  ");
int inicioJogo = scanner.nextInt();

System.out.print("Digite a hora do fim do jogo:  ");
int fimJogo = scanner.nextInt();

scanner.close();

if (fimJogo > inicioJogo){
    int total = (fimJogo - inicioJogo);
System.out.println ("O jogo durou "+total +" horas");
} else{
    int primeiraParte = (24 - inicioJogo);

int total = (fimJogo + primeiraParte);
System.out.println ("O jogo durou "+total +" horas");
}
}
}
