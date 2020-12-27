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
public class Tugas_pbo {

    public static void main(String[] args) {
      String warna = "biru";
      int jumlah = 20;
      
      tugas Sepeda = new tugas(warna, jumlah);
      Sepeda.berjalan();
      Sepeda.berhenti();
      Sepeda.showData();
    }
    
}
