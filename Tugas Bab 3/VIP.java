public class VIP extends Bus {
public VIP(String namaPerusahaan, String tujuan, int hargaTiket) {
super(namaPerusahaan, tujuan, hargaTiket);
}
@Override
public String tampilkanInfo() { return super.tampilkanInfo() +
"\nJenis Pelayanan : VIP" +
"\nFasilitas : AC, Snack, Reclining Seat";
}
}
