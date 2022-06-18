//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class PegawaiHarian extends Pegawai{

    // attribute
    private double upahPerJam;
    private int totalJam;

    // constructor
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    // getter
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    // setter
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    // polymorphism print attribute
    @Override
    public String toString() {
        return super.toString() +
                "\nUpah/jam        : Rp " + getUpahPerJam() +
                "\nTotal jam kerja : " + getTotalJam() +
                "\nPendapatan      : Rp " + (int) gaji();
    }

    // rumus hitung gaji pegawai harian
    @Override
    public double gaji() {
        if (getTotalJam() <= 40) {
            return getUpahPerJam() * getTotalJam();
        }
        else {
            return getUpahPerJam() * 40 + (getUpahPerJam() * (getTotalJam() - 40) * 1.5);
        }
    }
}
