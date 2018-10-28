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
public class PBO3_10117082_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Dosen ds = new Dosen();
        ds.setNip("41227829930");
        System.out.println("NIP Dosen : "+ds.getNip());
        ds.siapaKamu();
        ds.setNama("Rizki Adam Kurniawan");
        ds.setUmur(27);
        ds.setMataKuliah("PBO");
        ds.mengajarApa();
        System.out.println("");
       
    Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        System.out.println("NIM Mahasiswa : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO");
        mhs.kelasApa();
        
    }
    
}
