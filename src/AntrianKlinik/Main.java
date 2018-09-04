/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntrianKlinik;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        int jumlahAntrianPasien = 1;
        AntrianPasien[] antrian = new AntrianPasien[jumlahAntrianPasien];

        System.out.println("Jumlah pasien yang mengantri adalah " + jumlahAntrianPasien);

        //Dokter
        Dokter dokter = new Dokter();
        dokter.setNama("Kiwiliam");
        dokter.setNomorPegawai("1234354");
        dokter.setTempatLahir("Tajem");
        try {
            dokter.setTanggalLahir(12);
            dokter.setBulanLahir(5);
            dokter.setTahunLahir(1999);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        dokter.setAlamat("Maguwoharjo");
        
        //Deklarasi setiap index
        antrian[0] = new AntrianPasien();

        //Klinik 1
        Klinik klinik = new Klinik();
        klinik.setIdKlinik("1234521KL");
        klinik.setNama("Sanata Dharma");
        antrian[0].addKlinik(klinik);

        //Pasien 1
        Pasien pasien1 = new Pasien();
        pasien1.setNama("Gregorius Bryan Osaldi");
        pasien1.setAlamat("Jalan Paingan 6, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
        pasien1.setTempatLahir("Sukaraya");
        try {
            pasien1.setTanggalLahir(3);
            pasien1.setBulanLahir(05);
            pasien1.setTahunLahir(2000);
            pasien1.setNoRekamMedis("GREG");
            antrian[0].addPasien(pasien1);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Print Output
        dokter.printInfo();
        for (int i = 0; i < antrian.length; i++) {
            antrian[i].printInfo();
        }

    }
}
