/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan52_siapakamu;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan siapa anda, yaitu 
* terdapat manusia, dosen, dan mahasiswa sesuai dengan kententuan
 */
public class Manusia {
        protected String nama;
    protected int Umur;


    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public int getUmur() {
        return Umur;
    }
    
     public void siapaKamu(){
            System.out.println("Saya Manusia");
}
    
    
}
