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
    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String tampilkanInfo() {
        return "Perusahaan : " + namaPerusahaan +
               "\nTujuan : " + tujuan +
               "\nHarga Tiket : Rp " + hargaTiket;
    }
}
