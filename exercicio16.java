public class BalancoTrimestre{
    
     
   private double janeiro = 15000;
   private double fevereiro = 23000;
   private double marco = 17000;
   
   public double media(){
        return(janeiro+fevereiro+marco)/3;
}
   
   public static void main(String[] args){  
       BalancoTrimestre balanco = new BalancoTrimestre();
       System.out.println(balanco.media());
   }

}
