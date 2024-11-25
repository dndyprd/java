import java.util.Scanner;

public class pocketMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Money for this weeek is Rp.");
        int money = input.nextInt();
        input.nextLine();
        
        System.out.print("\nDo you want to shop again (Y/n)? ");
        char shopping = input.nextLine().toLowerCase().charAt(0);
            
        while(shopping == 'y'){
            System.out.print("Input item price Rp.");
            int price = input.nextInt(); 
            input.nextLine();
            
            if(price <= money){
                money =  money - price;
                System.out.println("The remaining money is Rp."+money);
                
                System.out.print("\Do you want to shop again (Y/n)? ");
                shopping = input.nextLine().toLowerCase().charAt(0);
            } else { 
                System.out.println("Money is not enough! The current money is Rp."+money);
            }
        }
        System.out.println("No shopping, money remains Rp."+money);
    }
}
