/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
public class Bus {
    private String namaPerusahaan;
    private String tujuan;
    private int hargaTiket;

    // Constructor
    public Bus(String namaPerusahaan, String tujuan, int hargaTiket) {
        this.namaPerusahaan = namaPerusahaan;
        this.tujuan = tujuan;
        this.hargaTiket = hargaTiket;
    }

    // Getter & Setter
    public String getNamaPerusahaan() { return namaPerusahaan; }
    public String getTujuan() { return tujuan; }
    public int getHargaTiket() { return hargaTiket; }

    public void setTujuan(String tujuan) { this.tujuan = tujuan; }
    public void setHargaTiket(int hargaTiket) { this.hargaTiket = hargaTiket; }

    // Method Overloading
    public String tampilkanInfo() {
        return "Perusahaan : " + namaPerusahaan +
               "\nTujuan : " + tujuan +
               "\nHarga Tiket : Rp " + hargaTiket;
    }

    // Overloading (dengan parameter diskon)
    public String tampilkanInfo(int diskon) {
        int hargaDiskon = hargaTiket - diskon;
        return "Perusahaan : " + namaPerusahaan +
               "\nTujuan : " + tujuan +
               "\nHarga Tiket Setelah Diskon : Rp " + hargaDiskon;
    }
}
