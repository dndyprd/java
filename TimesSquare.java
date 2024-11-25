import java.util.Scanner; 
 
public class TimesSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
         
        System.out.print("Input the number : ");
        int n = input.nextInt();
 
 
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= n; j++) {   
                System.out.print(i * j +"\t");
            }
             
            System.out.println();
        }  
    }
}

