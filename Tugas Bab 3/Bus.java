public class Bus {
    protected String namaPerusahaan; 
    protected String tujuan; 
    protected int hargaTiket;
    
    public Bus(String namaPerusahaan, String tujuan, int hargaTiket) {
this.namaPerusahaan = namaPerusahaan; this.tujuan = tujuan;
this.hargaTiket = hargaTiket;
}
public String tampilkanInfo() {
return "Perusahaan : " + namaPerusahaan + "\nTujuan : " + tujuan +
"\nHarga Tiket : Rp " + hargaTiket;
}
}
