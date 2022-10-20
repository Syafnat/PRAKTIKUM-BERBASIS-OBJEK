/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author ELITEBOOK
 */
public class Makanan {
    private String jumlah, namaMkn, harga;
    
    public Makanan(String namaMkn, String jumlah,  String harga ){
        this.jumlah = jumlah;
        this.namaMkn = namaMkn;
        this.harga = harga;
    }
    
    public void setJumlah(String jumlah){
        this.jumlah = jumlah;
    }
    
    public String getJumlah(){
        return jumlah;
    }

    public void setNamaMakanan(String namaMkn){
        this.namaMkn = namaMkn;
    }
    
    public String getNamaMakanan(){
        return namaMkn;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public String info(){
        String info = "";
        info +="==== Makanan yang dipesan ====\n";
        info +="Nama Makanan : " + getNamaMakanan() + "\n";
        info +="Jumlah       : " + getJumlah() + "\n";
        info +="Harga        : " + getHarga() ;
        return info;
    }
}
