import java.util.Scanner;
 
public class Discount {
      public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Input total purchase : ");
        int purchase = scanner.nextInt();
        int discount = 0;
         
        if(purchase >= 100000){
            discount = purchase * 10/100;
        } else if (purchase >= 150000){
            discount = purchase * 15/100;
        } else if (purchase >= 200000){
            discount = purchase * 20/100;
        } else if (purchase >= 250000){
            discount = purchase * 25/100;
        } 
 
        int pay = purchase - discount;
        System.out.println("Total Discount : Rp."+discount);
        System.out.println("Total Payment : Rp."+pay);
      }
    
}
