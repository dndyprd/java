import java.util.Scanner;

public class loopEvenOdd {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
        int max = 1, type = 1;
        
         
        System.out.println("1. Loop Even Numbers");
        System.out.println("2. Loop Odd Numbers");
        System.out.print("Input your choose : ");
        int choose = scanner.nextInt();
        
        switch(choose){ 
            case 1 :
                System.out.println("\nEven Numbers");   
                type = 0;
                 
                System.out.print("Max numbers for looping : ");
                max = scanner.nextInt();
            break;
             
            case 2 :
                System.out.println("\nOdd Numbers");  
                type = 1;
                
                System.out.print("Max numbers for looping : ");
                max = scanner.nextInt();
            break; 
            default : System.out.println("Not Found !!"); 
        }  
         
        for(int i = 1; i <= max; i ++){ 
            if(i % 2 == type){
                System.out.print(i+" ");
            }
        }
    }
}
