import java.util.Scanner;

public class EmployeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
         
        System.out.print("Are employees staff? (Y/n) : "); 
        boolean type = scanner.next().toLowerCase().equals("y");
         
        System.out.print("Input length of service (years): ");
        int times = scanner.nextInt();
         
        System.out.print("Input age : ");
        int age = scanner.nextInt();
         
        int bonus;
        if(type){ 
            if(times >= 5 && age >= 50){
                bonus = 1000000;
            } else { 
                if (age >= 50){
                    bonus = 500000;
                } else {
                    bonus = 300000;
                }
            }
        } else { 
            if(times >= 5 && age >= 50){
                bonus = 400000;
            } else {
                bonus = 250000;
            }
        }
        System.out.println("\nBonus employe : Rp."+bonus);
    }
}
