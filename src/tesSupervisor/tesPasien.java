/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesSupervisor;

import AntrianKlinik.Pasien;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class tesPasien {
    public static void main(String[] args) {
        Pasien tes = new Pasien();
        try {
            tes.setTanggalLahir(100);
        } catch (Exception ex) {
            Logger.getLogger(tesPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
