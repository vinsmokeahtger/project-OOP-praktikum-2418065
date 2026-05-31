public class Executive extends Bus {
    public Executive(String namaPerusahaan, String tujuan, int hargaTiket) {
super(namaPerusahaan, tujuan, hargaTiket);
}
@Override
public String tampilkanInfo() { return super.tampilkanInfo() +
"\nJenis Pelayanan : Executive" + "\nFasilitas : AC, TV, WiFi, Toilet";
}
}
