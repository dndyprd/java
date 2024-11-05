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
public class BiayaTiket {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Masukkan hari : ");
        String hari = scanner.nextLine().toLowerCase();
        int harga = 0;
        
        // Mengecheck hari dengan switch case dan setting harga
        switch(hari){
            case "senin", "selasa", "rabu", "kamis" :
                harga = 75000;
            break;
            case "jumat", "sabtu", "minggu" :
                harga = 100000;
            break;
            default : System.out.println("Hari tidak tersedia");
        }
        
        System.out.print("Apakah hari libur? (Y/n) : "); 
        boolean libur = scanner.next().toLowerCase().equals("y");
        
        if(libur){
            harga = 125000;
        }
        
        System.out.println("Harga tiket Rp."+harga);
    }
}
