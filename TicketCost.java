import java.util.Scanner;

public class TicketCost {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Input day : ");
        String day = scanner.nextLine().toLowerCase();
        int price = 0;
         
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday" :
                price = 75000;
            break;
            case "Friday", "Saturday", "Sunday" :
                price = 100000;
            break;
            default : System.out.println("Day not found !");
        }
        
        System.out.print("Is it a holiday? (Y/n) : "); 
        boolean holiday = scanner.next().toLowerCase().equals("y");
        
        if(holiday){
            price = 125000;
        }
        
        System.out.println("Ticket price Rp."+price);
    }
}
