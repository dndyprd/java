import java.util.Scanner;

public class PlantGrowth {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Input total day : ");
        int totalDay = input.nextInt();
        
        int plantGrow = 0; 
        for(int day = 0; day < totalDay; day++){
            // JIKA HARI GANJIL MAKA TAMBAH PANJANG TUMBUHAN
            if(day % 2 != 0){
                plantGrow += 5;
            } 
        }
        
        System.out.println("The length of the plant on day "+totalDay+" was "+plantGrow+" cm");
    }
}

