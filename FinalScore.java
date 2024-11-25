import java.util.Scanner;

public class FinalScore {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Input task 1 score : ");
        double task1 = scanner.nextDouble();
        System.out.print("Input task 2 score : ");
        double task2 = scanner.nextDouble();
        System.out.print("Input task 3 score : ");
        double taks3 = scanner.nextDouble();
        System.out.print("Input mid exam score : ");
        double midexam = scanner.nextDouble();
        System.out.print("Input final exam score: ");
        double finalexam = scanner.nextDouble();
         
        double score = (((task1 + task2 + task3)/3) * 0.30) + (midexam * 0.30) + (finalexam * 0.40);
        char indeks;
        
        // Melakukan pengechekan indeks nilai
        if(score >= 90){
            indeks = 'A';
        } else if (score >= 80) {
            indeks = 'B';
        } else if (score >= 75){
            indeks = 'C';
        } else if (score >= 65){
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        System.out.println("The score is "+score+" with index score is "+indeks);
    } 
}
