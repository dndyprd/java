import java.util.Scanner; 

public class AdsPayment {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Input day : ");
        String day = scanner.nextLine().toLowerCase();
        int price = 0, totalPrice = 0;
        
        // Mengecheck hari dengan switch case dan setting harga
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" :
                price = 30000;
            break;
            case "Saturday", "Sunday" :
                price = 40000;
            break;
            default : System.out.println("Day not found !");
        }
         
        System.out.print("Input total line ads : ");
        int lines = scanner.nextInt();
         
        if(lines > 10){
            price = price - 5000; 
        }
         
        totalPrice = lines * price;
        System.out.println("\nTotal price Rp. "+totalPrice);
    }
}
