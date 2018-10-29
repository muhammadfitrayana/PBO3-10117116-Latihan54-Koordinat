/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan54.koodinat;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menentukan Koordinat
 *  
 */
public class PBO310117116Latihan54Koodinat {

    /**
     * @param args the command line arguments
     */
    
    public static String namaWarna;
    
    public static void main(String[] args) {
    Koordinat koordinat = new Koordinat(10, 4);
    WarnaKoordinat warna = new WarnaKoordinat("Jingga", 10, 4);
    System.out.println("Warna Koordinat : " + warna.getNamaWarna());
    System.out.println("Koordinat Sumbu x : " + koordinat.x + ", " + "y : " + 
                        koordinat.y);
      
    }
    
}
