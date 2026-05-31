/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
public class VIP extends Bus {

    private String fasilitas;

    public VIP(String namaPerusahaan, String tujuan, int hargaTiket) {
        super(namaPerusahaan, tujuan, hargaTiket);
        this.fasilitas = "AC, Snack, Reclining Seat";
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nJenis Pelayanan : VIP" +
               "\nFasilitas : " + fasilitas;
    }
}