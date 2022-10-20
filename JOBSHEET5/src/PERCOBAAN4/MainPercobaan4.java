package PERCOBAAN4;


import PERCOBAAN4.Penumpang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syafnat
 */
public class MainPercobaan4 {
 public static void main(String[] args) {
        Penumpang andi = new Penumpang("731234984", "Bagus Raharjo");
        Penumpang budi = new Penumpang("123456789", "Budianto");
        Gerbong gerbong = new Gerbong("C", 20);
        gerbong.setPenumpang(andi, 5);
        gerbong.setPenumpang(budi, 5);
        System.out.println(gerbong.info());
    }
}
