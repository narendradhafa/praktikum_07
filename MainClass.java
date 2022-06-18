//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

public class MainClass {
    public static void main(String[] args) {

        // Pegawai Tetap
        System.out.println("============| PEGAWAI TETAP |============");

        Pegawai pegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        System.out.println(pegawaiTetap1.toString());

        Pegawai pegawaiTetap2 = new PegawaiTetap("Kaela", "350728490327424881231", 2500000);
        System.out.println(pegawaiTetap2.toString());

        Pegawai pegawaiTetap3 = new PegawaiTetap("Jaret", "350728490327424770120", 3000000);
        System.out.println(pegawaiTetap3.toString());

        Pegawai pegawaiTetap4 = new PegawaiTetap("Reine", "350728490327423679019", 1500000);
        System.out.println(pegawaiTetap4.toString());

        // Pegawai Harian
        System.out.println("\n============| PEGAWAI HARIAN |===========");

        Pegawai pegawaiHarian1 = new PegawaiHarian("Edo", "350728490327424892343", 8500, 40);
        System.out.println(pegawaiHarian1.toString());

        Pegawai pegawaiHarian2 = new PegawaiHarian("Kobo", "350728490326313781232", 7000, 65);
        System.out.println(pegawaiHarian2.toString());

        Pegawai pegawaiHarian3 = new PegawaiHarian("Agil", "350728490327424870121", 8000, 35);
        System.out.println(pegawaiHarian3.toString());

        Pegawai pegawaiHarian4 = new PegawaiHarian("Mika", "350728490327402670143", 9000, 50);
        System.out.println(pegawaiHarian4.toString());

        // Sales
        System.out.println("\n================| SALES |================");

        Pegawai sales1 = new Sales("Tika", "350728490327424892344", 50, 50000);
        System.out.println(sales1.toString());

        Pegawai sales2 = new Sales("Raska", "350728490327423781233", 75, 45000);
        System.out.println(sales2.toString());

        Pegawai sales3 = new Sales("Anya", "350728490327312690124", 60, 55000);
        System.out.println(sales3.toString());

        Pegawai sales4 = new Sales("Kanae", "350728490327424892344", 30, 70000);
        System.out.println(sales4.toString());
    }
}
