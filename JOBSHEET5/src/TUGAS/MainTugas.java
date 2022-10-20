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
public class MainTugas {
    public static void main(String[] args) {
        Pembeli p = new Pembeli("Maulana", "Pasuruan");
        Makanan m = new Makanan("Sop Buntut", "1", "70000");
        Restoran r = new Restoran("Majisuka Gakuen", 7);
        r.setMakanan(m, 3);
        r.setPembeli(p, 3);
        Pembeli pp = new Pembeli("Yuuji", "Konoha");
        Makanan pesan = new Makanan("Babi guling", "1", "50000");
        r.setMakanan(pesan, 6);
        r.setPembeli(pp, 6);
        Pembeli pl = new Pembeli ("Yasutora", "Jepang");
        Makanan mm = new Makanan ("Ramen", "2", "70000");
        r.setMakanan(mm, 4);
        r.setPembeli(pl, 4);
        Pembeli kl = new Pembeli ("Haitani ran", "Jepang");
        Makanan mran = new Makanan ("miso soup", "2", "54000");
        r.setMakanan(mran, 7);
        r.setPembeli(kl, 7);
        Pembeli kf = new Pembeli ("Fitria Dara Febrinervani", "Tokyo");
        Makanan dar = new Makanan ("Yakiniku", "1", "53000");
        r.setMakanan(dar, 1);
        r.setPembeli(kf, 1);
        System.out.println(r.info());
    }
}
