//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class Pegawai {
    // attribute
    private String nama;
    private String noKTP;

    // constructor
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    // polymorphism print attribute
    public String toString() {
        return "\nNama            : " + getNama() +
               "\nNo. KTP         : " + getNoKTP();
    }

    // rumus hitung gaji
    public double gaji() {
        return 0;
    }
}
