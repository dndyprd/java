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
public class PekanDiskon {
      public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        // Menerima input total belanja
        System.out.print("Masukkan total belanja : ");
        int belanja = scanner.nextInt();
        int diskon = 0;
        
        // Mengecheck total belanja untuk mengetahui diskon
        // Menggunakan per 100 karena integer
        if(belanja >= 100000){
            diskon = belanja * 10/100;
        } else if (belanja >= 150000){
            diskon = belanja * 15/100;
        } else if (belanja >= 200000){
            diskon = belanja * 20/100;
        } else if (belanja >= 250000){
            diskon = belanja * 25/100;
        } 

        // Menghitung total bayar
        int bayar = belanja - diskon;
        System.out.println("Total Diskon : Rp."+diskon);
        System.out.println("Total Bayar : Rp."+bayar);
      }
    
}
