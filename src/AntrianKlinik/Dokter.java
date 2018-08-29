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
 * @author DELL
 */
public class Dokter {

    private String nomorPegawai;
    private String nama, alamat, tempatLahir;
    private int tanggalLahir, bulanLahir, tahunLahir;

    public Dokter() {
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
            }

        } else {
            throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Bulan lahir yang anda masukkan tidak valid");
        }

    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun lahair yang anda masukkan tidak valid");
        }
    }

    public void getTanggalKelahiranDokter() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public void printInfo() {
        System.out.println("\n");
        System.out.printf("%-20s", "");
        System.out.println("Biodata Dokter" + "\n");
        System.out.printf("%-25s", "Nomor Pegawai");
        System.out.println(": " + getNomorPegawai());
        System.out.printf("%-25s", "Nama");
        System.out.println(": " + getNama());
        System.out.printf("%-25s","Alamat");
        System.out.println(": " + getAlamat());
        System.out.printf("%-25s" , "Tempat, Tanggal Lahir");
        System.out.print(": "+getTempatLahir()+", ");
        getTanggalKelahiranDokter();
    }
}