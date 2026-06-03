/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
public class Executive extends Bus {

    private String fasilitas;

    public Executive(String namaPerusahaan, String tujuan, int hargaTiket) {
        super(namaPerusahaan, tujuan, hargaTiket);
        fasilitas = "AC, TV, WiFi, Toilet";
    }

    @Override
    public String getFasilitas() {
        return fasilitas;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nJenis Pelayanan : Executive" +
               "\nFasilitas : " + getFasilitas();
    }
}