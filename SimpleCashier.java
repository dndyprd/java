import java.util.Scanner;  

public class SimpleCashier { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Input total items purchase : ");
        int totalItem = input.nextInt();
        input.nextLine();
        
        int totalPrice = 0;
        for(int i = 0; i < totalItem; i++){
            System.out.print("\nInput item name : ");
            String itemName = input.nextLine();
            
            System.out.print("Input item price : Rp.");
            int price = input.nextInt();
            input.nextLine();
            
            totalPrice += price;
        }
        
        // MENAMPILKAN TOTAL HARGA
        System.out.println("-------------------------------------");
        System.out.println("Total price Rp."+totalPrice);
    }
}
