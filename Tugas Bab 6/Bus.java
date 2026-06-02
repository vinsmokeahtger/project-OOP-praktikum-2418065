/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
public abstract class Bus {
    private String namaPerusahaan;
    private String tujuan;
    private int hargaTiket;

    // Constructor
    public Bus(String namaPerusahaan, String tujuan, int hargaTiket) {
        this.namaPerusahaan = namaPerusahaan;
        this.tujuan = tujuan;
        this.hargaTiket = hargaTiket;
    }

    // Getter
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    // Setter
    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    // Method biasa
    public String tampilkanInfo() {
        return "Perusahaan : " + namaPerusahaan +
               "\nTujuan : " + tujuan +
               "\nHarga Tiket : Rp " + hargaTiket;
    }

    // Method Abstract
    public abstract String getFasilitas();
}