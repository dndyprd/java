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
public class BonusPegawai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        // Menanyakan golongan dari pegawai jika staff bernilau true, jika non-staff false
        System.out.print("Apakah pegawai adalah staff? (Y/n) : "); 
        boolean golongan = scanner.next().toLowerCase().equals("y");
        
        // Menanyakan total waktu pekerja
        System.out.print("Masukkan lama bekerja (tahun) : ");
        int waktu = scanner.nextInt();
        
        // Menanyakan umur pegawai
        System.out.print("Masukkan umur : ");
        int umur = scanner.nextInt();
        
        // Lakukan if else dengan golongan
        int bonus;
        if(golongan){
            // Jika golongan true / staff
            // Periksa waktu bekerja dan umur pegawai 
            if(waktu >= 5 && umur >= 50){
                bonus = 1000000;
            } else {
                // Jika staff waktu kerja kurang dari 5 tahun tapi umur diatass 50 tahun
                if (umur >= 50){
                    bonus = 500000;
                } else {
                    bonus = 300000;
                }
            }
        } else {
            // Jika golongan false / non-staff
            if(waktu >= 5 && umur >= 50){
                bonus = 400000;
            } else {
                bonus = 250000;
            }
        }
        System.out.println("\nBonus pegawai : Rp."+bonus);
    }
}
