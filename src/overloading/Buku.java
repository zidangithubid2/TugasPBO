/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Zidan
 */
public class Buku {
    String pengarang;
    String judul;
    int tahunTerbit;
   
    //membuat konstruktor
    public Buku(String pengarang, String judul){
        this.judul = judul;
        this.pengarang = pengarang;
    }//akhir konstruktor
   
    //membuat OverLoading Konstruktor
    public Buku(String pengarang, String judul, int tahunTerbit){
        this.pengarang = pengarang;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
   
    //membuat method
    public void infoBuku(){
        System.out.println("Judul Buku "+judul);
        System.out.println("Pengarang "+pengarang);
        System.out.println("Tahun Terbit "+tahunTerbit+ "\n");
    }
}
