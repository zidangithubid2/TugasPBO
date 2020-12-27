/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_pbo;

/**
 *
 * @author Zidan
 */
public class tugas {
    private String warna;
    private int jumlah;
    
    public tugas (String warna, int jumlah){
        this.warna = warna;
        this.jumlah = jumlah;
        System.out.println("Inisialisasi Atribut");
    }
    
    void berjalan (){
        System.out.println("Sepeda berjalan");
    }
    
    void berhenti (){
        System.out.println("Sepeda berhenti");
    }
    
    void showData (){
        System.out.println("Warna: "+this.warna);
        System.out.println("Jumlah: "+this.jumlah);
    }
}
