/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemrograman;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class NilaiAkhir {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        // Menerima seluruh inputan nilai
        System.out.print("Masukkan nilai tugas 1 : ");
        double tugas1 = scanner.nextDouble();
        System.out.print("Masukkan nilai tugas 2 : ");
        double tugas2 = scanner.nextDouble();
        System.out.print("Masukkan nilai tugas 3 : ");
        double tugas3 = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double uas = scanner.nextDouble();
        
        // Melakukan perhitungan nilai sesuai kontrak
        double nilai = (((tugas1 + tugas2 + tugas3)/3) * 0.30) + (uts * 0.30) + (uas * 0.40);
        char indeks;
        
        // Melakukan pengechekan indeks nilai
        if(nilai >= 90){
            indeks = 'A';
        } else if (nilai >= 80) {
            indeks = 'B';
        } else if (nilai >= 75){
            indeks = 'C';
        } else if (nilai >= 65){
            indeks = 'D';
        } else {
            indeks = 'E';
        }
        
        System.out.println("Nilai akhir "+nilai+" dengan indeks "+indeks);
    } 
}
