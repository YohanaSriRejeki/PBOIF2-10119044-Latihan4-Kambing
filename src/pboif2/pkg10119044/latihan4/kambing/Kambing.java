/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan4.kambing;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : PBOIF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini berfungsi untuk menampilkan jumlah kambing setelah ditambah
 */

public class Kambing {

    public void tambahKambing() {
        //Deklarasi variable lokal
        int jumlahKambing = 0;  
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
