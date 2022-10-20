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
public class Restoran {
    private String nama;
    private Meja[] arrayMeja;
    private Makanan makanan;

    public Restoran(String nama, int jumlah) {
        this.nama = nama;
        this.arrayMeja = new Meja[jumlah];
        this.initMeja();
    }

    private void initMeja() {
        for (int i = 0; i < arrayMeja.length; i++) {
            this.arrayMeja[i] = new Meja(String.valueOf(i + 1));
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setPembeli(Pembeli pembeli, int nomor) {
        this.arrayMeja[nomor - 1].setPembeli(pembeli);
    }

    public void setMakanan(Makanan makanan, int nomor) {
        this.arrayMeja[nomor - 1].setMakanan(makanan);
    }

    public Makanan getMakanan() {
        return makanan;
    }

    public Meja[] getArrayMeja() {
        return arrayMeja;
    }

    public String info() {
        String info = "";
        info += "============================== \n";
        info += "   Restoran " + nama + "\n";
        for (Meja meja : arrayMeja) {
            info += meja.info();
        }
        return info;
    }
}
