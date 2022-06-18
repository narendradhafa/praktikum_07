//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class Sales extends Pegawai {

    // attribute
    private int penjualan;
    private double komisi;

    // constructor
    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    // getter
    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    // setter
    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    // polymorphism print attribute
    @Override
    public String toString() {
        return super.toString() +
                "\nTotal Penjualan : " + getPenjualan() +
                "\nBesaran Komisi  : " + getKomisi() +
                "\nPendapatan      : Rp " + gaji();
    }

    // rumus hitung gaji sales

    @Override
    public double gaji() {
        return getPenjualan() * getKomisi();
    }
}
