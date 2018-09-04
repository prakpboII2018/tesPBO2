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
        /*
        dalam method ini kita mengembalikan value nomorPegawai
        */
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
        /*
        dalam metthod ini kita akan mengatur value nomorPegawai dengan parameter nomorPegawai
        */
    }

    public String getNama() {
        return nama;
        /*
        dalam method ini kita mengembalikan value nama
        */
    }

    public void setNama(String nama) {
        this.nama = nama;
        /*
        dalam method ini kita mengatur value nama dengan parameter nama
        */
    }

    public String getAlamat() {
        return alamat;
        /*
        dalam method ini kita mengembalikan value alamat
        */
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        /*
        dalam method ini kita mengatur value alamat dengan parameter alamat
        */
    }

    public String getTempatLahir() {
        return tempatLahir;
        /*
        dalam method ini kita mengembalikan value tempatLahir
        */
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
        /*
        dalam method ini kita mengatur value tempatLahir dengan parameter tempatLahir
        */
    }

    public int getTanggalLahir() {
        return tanggalLahir;
        /*
        dalam method ini kita mengembalikan value tanggalLahir
        */
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
        /*
        Dalam method ini kita mengatur(set)tanggal lahir dokter.
        jika tanggal lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. kemudian dicek
        kembali apakah tanggal lahir kurang dari sama dengan 31. jika true maka akan masuk kedalam if dan jika tidak
        masuk kedalam else dan melemparkan exeption

        jika tanggal lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public int getBulanLahir() {
        return bulanLahir;
        /*
        dalam method ini kita akan mengembalikan value bulanLahir
        */
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
       /*
        Dalam method ini kita mengatur(set)bulan lahir dokter.
        jika tanggal lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. kemudian dicek
        kembali apakah bulan lahir kurang dari sama dengan 12. jika true maka akan masuk kedalam if dan jika tidak
        masuk kedalam else dan melemparkan exeption

        jika bulan lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public int getTahunLahir() {
        return tahunLahir;
        /*
        dalam method ini kita mengembalikan value tahunLahir
        */
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun lahair yang anda masukkan tidak valid");
        }
        /*
        Dalam method ini kita mengatur(set)tahun lahir dokter.
        jika tahun lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. 
        jika tanggal lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }

    public void getTanggalKelahiranDokter() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
        /*
        dalam method ini kita membuat format tanggal kelahiran dokter agar lebih mudah
        */
    }

    public void printInfo() {
        System.out.println("\n");
        System.out.printf("%-20s", "");
        System.out.println("Biodata Dokter" + "\n");
        System.out.printf("%-25s", "Nomor Pegawai");
        System.out.println(": " + getNomorPegawai());
        System.out.printf("%-25s", "Nama");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + ", ");
        getTanggalKelahiranDokter();
        /*
        dalam method ini kita dimudahkan saat akan menampilkan karena hanya memanggil method ini saja
        */
    }
}
