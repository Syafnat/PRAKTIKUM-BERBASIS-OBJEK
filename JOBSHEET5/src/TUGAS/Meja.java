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
public class Meja {
    private String nomeja;
    private Pembeli pembeli;
    private Makanan makanan;

    public Meja(String nomeja) {
        this.nomeja = nomeja;
    }

    public void setNomorMeja(String nomeja) {
        this.nomeja = nomeja;
    }

    public String getNomorMeja() {
        return nomeja;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setMakanan(Makanan makanan) {
        this.makanan = makanan;
    }

    public Makanan getMakanan() {
        return makanan;
    }

    public String info() {
        String info = "";
        info += "============================== \n";
        info += "Meja Nomor " + nomeja + ": \n";
        if (this.pembeli != null) {
            info += pembeli.info() + "\n";
            info += makanan.info() + "\n";
        }
        return info;
    }
}
