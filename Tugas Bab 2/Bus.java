public class Bus {
    String namaPerusahaan;
    String tujuan;
    int hargaTiket;

    // Constructor
    public Bus(String namaPerusahaan, String tujuan, int hargaTiket) {
        this.namaPerusahaan = namaPerusahaan;
        this.tujuan = tujuan;
        this.hargaTiket = hargaTiket;
    }

    // Method menampilkan data
    public void tampilkanInfo() {
        System.out.println("Perusahaan : " + namaPerusahaan);
        System.out.println("Tujuan     : " + tujuan);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus("Erlanha_Trans", "Surabaya - Jakarta", 250000);
        bus1.tampilkanInfo();
    }
}
