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
public class OverloadingKonstruktor {
     public static void main (String []args){
        Buku bukuku = new Buku("Hazard","Panduan Pintar Sepak Bola",2015);
        Buku bukumu = new Buku("Alip BaTa","Panduan Pintar Guitar",2010);
        bukuku.infoBuku();
        bukumu.infoBuku();
    }
}
