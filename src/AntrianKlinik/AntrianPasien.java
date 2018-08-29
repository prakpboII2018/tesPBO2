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
    private Pasien pasien;

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        if (tanggalAntrian > 0) {
            if (tanggalAntrian <= 31) {
                this.tanggalAntrian = tanggalAntrian;
            } else {
                throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
            }

        } else {
            throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
        }
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) throws Exception {
        if (bulanAntrian > 0) {
            if (bulanAntrian <= 12) {
                this.bulanAntrian = bulanAntrian;
            } else {
                throw new Exception("Bulan lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Bulan lahir yang anda masukkan tidak valid");
        }
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) throws Exception {
        if (tahunAntrian > 0) {
            this.tahunAntrian = tahunAntrian;
        } else {
            throw new Exception("Tahun lahir yang anda masukkan tidak valid");
        }
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    public void getTanggalMasuk(){
        Date date=new Date(getTahunAntrian(), getBulanAntrian(), getTanggalAntrian());
        SimpleDateFormat ft=new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(date));
    }

}
