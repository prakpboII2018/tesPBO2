/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AntrianKlinik;

/**
 *
 * @author admin
 */
public class AntrianPasien {

    private Klinik klinik;
    private Pasien[] pasien;
    private int idx, idx2;

    public AntrianPasien() {
        this.klinik = new Klinik();
        this.pasien = new Pasien[2];
        this.idx = 0;
        this.idx2 = 0;
        /*
        dalam konstruktor ini saya membuat default jika konstruktor-nya dipanggil kelas lain
         */
    }

    public Klinik getKlinik() {
        return klinik;
        /*
        dalam method ini kita akan mengembalikan value klinik
         */
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
        /*
        dalam method ini kita akan mengatur value klinik dengan parameter Objek klinik
         */
    }

    public void addPasien(Pasien pasien) throws Exception {
        if (idx < this.pasien.length) {
            this.pasien[idx] = pasien;
            this.idx++;
        } else {
            throw new Exception("Error Pasien");
        }
        /*
        dalam method ini kita akan menginputkan data setiap pasien.
        jika idx < thiis.pasien.length true maka :
            value dari this.pasien[idx] akan di isi dengan value objek pasien.
            lalu idx ditambah 1.
        jika salah maka akan melemparkan exception
         */
    }

    public void addKlinik(Klinik klinik) {
        this.klinik = klinik;
        /*
        dalam method ini kita akan menginputkan data klinik
        */
    }

    public void printInfo() {
        klinik.printInfo();
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < idx; i++) {
            pasien[i].printInfo();
        }
        /*
        dalam method ini memudahkan kita untuk menampilkan hasil program
         */
    }
}
