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
public class Klinik {

    private String idKlinik;
    private String nama;

    public String getIdKlinik() {
        return idKlinik;
        /*
        dalam method ini kita mengembalikan value idKlinik
         */
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
        /*
        dalam method ini kita mengatur value idKlinik dengan parameter idKlinik
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

    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("KLINIK " + getNama().toUpperCase() + "\n");
        System.out.printf("%-25s", "Nomor ID Klinik");
        System.out.print(": ");
        System.out.println(getIdKlinik());
        /*
        method ini memudahkan kita untuk menampilkan hasil output
        */
    }
}
