import java.util.Scanner;
public class BayadNong{
   public static void main (String[] args){
   
      double bayad;
      double kambyo;
      final double fare = 9.50;
   
      Scanner input = new Scanner (System.in);
   
      System.out.print("Bayad: ");
      bayad = input.nextDouble();
   
      if(bayad >= 9.50){
      kambyo = bayad - fare;
      System.out.println("Kambyo nimo kay: " + kambyo);
      System.out.print("Salamat!");
      }
      
      else{
      System.out.print("Kulang man ni boss!");
      }
   
   }
}