/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntrianKlinik;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class AntrianPasien {

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;
    private Pasien[] pasien;

    public void getTanggalMasuk() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(date));
    }

    public void getNomorAntrian(int jumlahPasien) {
        pasien = new Pasien[jumlahPasien];
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < pasien.length; i++) {
            pasien[i] = new Pasien();
            //Pasien 1
            pasien[i].setNama("Gregorius Bryan Osaldi");
        pasien[i].setAlamat("Jalan Paingan 6, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
        pasien[i].setTempatLahir("Sukaraya");
        try {
            pasien[i].setTanggalLahir(3);
            pasien[i].setBulanLahir(05);
            pasien[i].setTahunLahir(2000);
            pasien[i].setNoRekamMedis("GREG");
        } catch (Exception ex) {
            System.out.println(ex);;
        }
            System.out.printf("%-25s", "Nomor Rekam Medis Pasien");
            System.out.print(": ");
            pasien[i].getKodeNoRekamMedis();
            System.out.printf("%-25s", "Nama Pasien");
            System.out.println(": " + pasien[i].getNama());
            System.out.printf("%-25s", "Tempat, Tanggal Lahir");
            System.out.print(": " + pasien[i].getTempatLahir() + " , ");
            pasien[i].getTanggalKelahiran();
            System.out.printf("%-25s", "Alamat");
            System.out.println(": " + pasien[i].getAlamat());
            System.out.println("");
        }
    }
}
