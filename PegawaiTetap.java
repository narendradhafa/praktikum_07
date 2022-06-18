//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class PegawaiTetap extends Pegawai {

    // attribute
    private double upah;

    // constructor
    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    // getter
    public double getUpah() {
        return upah;
    }

    // setter
    public void setUpah(double upah) {
        this.upah = upah;
    }

    // polymorphism print attribute
    @Override
    public String toString() {
        return super.toString() +
                "\nUpah            : " + getUpah() +
                "\nPendapatan      : Rp " + (int) gaji();
    }

    // rumus hitung gaji pegawai tetap
    @Override
    public double gaji() {
        return getUpah();
    }
}
