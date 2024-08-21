import java.util.Scanner;

public class TotalDeVotos{
    
     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
     
     System.out.print("Total de votos brancos: ");
     int brancos = scanner.nextInt();
     
     System.out.print("Total de votos nulos: ");
     int nulos = scanner.nextInt();
     
     System.out.print("Total de votos validos: ");
     int validos = scanner.nextInt();
     
     scanner.close();
     
     int totalVotos = brancos+nulos+validos;
     
     System.out.println("O total de votos foram " + totalVotos + " eleitores");
     
     int porcentagemBranco = brancos*100/totalVotos;
     System.out.println("A porcentagem de votos brancos foram " + porcentagemBranco + " %");
    
     int porcentagemNulos = nulos*100/totalVotos;
     System.out.println("A porcentagem de votos nulos foram " + porcentagemNulos+" %");
     }
     }
