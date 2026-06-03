/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erlanha_Trans;

/**
 *
 * @author MyBook Hype AMD
 */
public class Executive extends Bus
        implements InterfaceFasilitas,
                   InterfaceDiskon,
                   InterfacePelayanan {

    private String fasilitas;

    public Executive(String namaPerusahaan,
                     String tujuan,
                     int hargaTiket) {

        super(namaPerusahaan,
              tujuan,
              hargaTiket);

        fasilitas = "AC, TV, WiFi, Toilet";
    }

    @Override
    public String getFasilitas() {
        return fasilitas;
    }

    @Override
    public double hitungDiskon() {
        return getHargaTiket() * 0.10;
    }

    @Override
    public String jenisPelayanan() {
        return "Executive";
    }

    @Override
    public String tampilkanInfo() {

        return super.tampilkanInfo()
                + "\nPelayanan : "
                + jenisPelayanan()
                + "\nFasilitas : "
                + getFasilitas()
                + "\nDiskon : Rp "
                + hitungDiskon();
    }
}