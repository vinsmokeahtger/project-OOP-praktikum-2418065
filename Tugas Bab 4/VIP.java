public class VIP extends Bus {

    private String fasilitas;

    public VIP(String namaPerusahaan, String tujuan, int hargaTiket) {
        super(namaPerusahaan, tujuan, hargaTiket);
        this.fasilitas = "AC, Snack, Reclining Seat";
    }

    // Getter
    public String getFasilitas() {
        return fasilitas;
    }

    // Setter
    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nJenis Pelayanan : VIP" +
               "\nFasilitas : " + fasilitas;
    }
}
