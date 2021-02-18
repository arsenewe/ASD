/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programbarang;

/**
 *
 * @author septianenggars
 */
public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;
    
    void tampilBarang(){
        System.out.println("Nama: " + namaBarang);
        System.out.println("Jenis: " + jenisBarang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
    }
    
    void tambahStok(int n){
        stok = stok + n;
    }
    
    void kurangiStok(int n){
        stok = stok - n;
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah * hargaSatuan;
    }
    
    public static void main(String[] args) {
        Barang gula = new Barang();
        
        gula.namaBarang = "Gula Tebu";
        gula.jenisBarang = "Sembako";
        gula.stok = 7;
        gula.hargaSatuan = 5000;
        
        gula.tampilBarang();
        gula.hitungHargaTotal(gula.stok);
        gula.tampilBarang();
        
        gula.tambahStok(4);
        gula.kurangiStok(2);
        gula.tampilBarang();
        
    }
}
