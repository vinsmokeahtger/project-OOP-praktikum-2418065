public class Executive extends Bus {

    private String fasilitas;

    public Executive(String namaPerusahaan, String tujuan, int hargaTiket) {
        super(namaPerusahaan, tujuan, hargaTiket);
        this.fasilitas = "AC, TV, WiFi, Toilet";
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nJenis Pelayanan : Executive" +
               "\nFasilitas : " + fasilitas;
    }
}
