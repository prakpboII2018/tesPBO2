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

    public Pasien[] getPasien() {
        return pasien;
    }

    public void setPasien(Pasien[] pasien) {
        this.pasien = pasien;
    }
}
