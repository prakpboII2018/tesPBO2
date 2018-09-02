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
        AntrianPasien antrian = new AntrianPasien();
        int jumlahAntrianPasien = 1;
        Pasien[] pasien = new Pasien[jumlahAntrianPasien];
        Dokter dokter = new Dokter();

        System.out.println("Jumlah pasien yang mengantri adalah " + jumlahAntrianPasien);

        //Dokter
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

        //Pasien 1
        antrian.getPasien()[0].setNama("Gregorius Bryan Osaldi");
        antrian.getPasien()[0].setAlamat("Jalan Paingan 6, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
        antrian.getPasien()[0].setTempatLahir("Sukaraya");
        try {
            antrian.getPasien()[0].setTanggalLahir(3);
            antrian.getPasien()[0].setBulanLahir(05);
            antrian.getPasien()[0].setTahunLahir(2000);
            antrian.getPasien()[0].setNoRekamMedis("GREG");
        } catch (Exception ex) {
            System.out.println(ex);;
        }

        //Print Output
        dokter.printInfo();
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < jumlahAntrianPasien; i++) {
            pasien[i].printInfo();
        }
    }
}
