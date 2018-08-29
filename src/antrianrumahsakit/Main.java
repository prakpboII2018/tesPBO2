/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antrianrumahsakit;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Pasien pasien = new Pasien();
        Dokter dokter = new Dokter();
        //Set Pasien
        pasien.setNama("Gregorius Bryan Osaldi");
        pasien.setAlamat("Jalan Paingan 6, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
        pasien.setTempatLahir("Sukaraya");
        try {
            pasien.setTanggalLahir(3);
            pasien.setBulanLahir(05);
            pasien.setTahunLahir(2000);
        } catch (Exception ex) {
            System.out.println(ex);;
        }
        try {
            pasien.setNoRekamMedis("GREG");
        } catch (Exception ex) {
            System.out.println(ex);;
        }

        //Set Dokter
        dokter.setNama("KIWIL");
        dokter.setNomorPegawai("1213245664");
        dokter.setTempatLahir("Jogjakarta");
        try {
            dokter.setTanggalLahir(20);
            dokter.setBulanLahir(07);
            dokter.setTahunLahir(1980);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        dokter.setAlamat("Maguwoharjo");
        
        //Menampilkan Output
        pasien.printInfo();
        dokter.printInfo();

    }

}
