public class BankTurunan {
    public static void main(String[] args) {
        Tabungan tabungan1 = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro giro1 = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        tabungan1.cetakInfo();
        giro1.cetakInfo();
        System.out.println();

        System.out.println("========== TRANSAKSI ==========");

        // 1. Tabungan tarik 1.500.000
        int s1 = tabungan1.getSaldo();
        tabungan1.tarik(1500000);
        System.out.println("Tabungan tarik 1.500.000 : " + (tabungan1.getSaldo() != s1 ? "Berhasil" : "Ditolak"));

        // 2. Giro tarik 500.000
        int s2 = giro1.getSaldo();
        giro1.tarik(500000);
        System.out.println("Giro tarik 500.000       : " + (giro1.getSaldo() != s2 ? "Berhasil" : "Ditolak"));

        // 3. Giro tarik 300.000
        int s3 = giro1.getSaldo();
        giro1.tarik(300000);
        System.out.println("Giro tarik 300.000       : " + (giro1.getSaldo() != s3 ? "Berhasil" : "Ditolak"));

        // 4. Giro setor 100.000
        int s4 = giro1.getSaldo();
        giro1.setor(100000);
        System.out.println("Giro setor 100.000       : " + (giro1.getSaldo() != s4 ? "Berhasil" : "Ditolak"));

        // 5. Tambah bunga tabungan
        int bunga = tabungan1.tambahBunga();
        System.out.println("Bunga tabungan           : " + Rekening.formatRupiah(bunga));
        System.out.println();

        System.out.println("========== REKENING AKHIR ==========");
        tabungan1.cetakInfo();
        giro1.cetakInfo();
    }
}
