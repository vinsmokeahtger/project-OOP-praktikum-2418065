public class Main {
    public static void main(String[] args) {

        // Membuat objek
        Bus bus1 = new Bus("Erlanha_Trans", "Surabaya - Jakarta", 250000);
        Bus bus2 = new Bus("Erlanha_Trans", "Madiun - Yogyakarta", 120000);

        // Menampilkan informasi
        System.out.println("=== Data Bus Erlanha Trans ===");
        bus1.tampilkanInfo();

        System.out.println("-----------------------------");

        bus2.tampilkanInfo();
    }
}

class Bus {
    String namaPerusahaan;
    String tujuan;
    int hargaTiket;

    // Constructor
    public Bus(String namaPerusahaan, String tujuan, int hargaTiket) {
        this.namaPerusahaan = namaPerusahaan;
        this.tujuan = tujuan;
        this.hargaTiket = hargaTiket;
    }

    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Perusahaan : " + namaPerusahaan);
        System.out.println("Tujuan     : " + tujuan);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
    }
}
