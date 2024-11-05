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
public class BiayaIklan {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        // Menerima inputan hari dan merubah text ke lower case
        System.out.print("Masukkan hari : ");
        String hari = scanner.nextLine().toLowerCase();
        int harga = 0, totalBiaya = 0;
        
        // Mengecheck hari dengan switch case dan setting harga
        switch(hari){
            case "senin", "selasa", "rabu", "kamis", "jumat" :
                harga = 30000;
            break;
            case "sabtu", "minggu" :
                harga = 40000;
            break;
            default : System.out.println("Hari tidak tersedia");
        }
        
        // Menanyakan jumlah baris
        System.out.print("Masukkan jumlah baris : ");
        int baris = scanner.nextInt();
        
        // Jika baris lebih dari 10 kurangi harga awal dengan 5000
        if(baris > 10){
            harga = harga - 5000; 
        }
        
        // Kalikan jumlah baris dengan harga dan tampilkan
        totalBiaya = baris * harga;
        System.out.println("\nTotal biaya Rp. "+totalBiaya);
    }
}
