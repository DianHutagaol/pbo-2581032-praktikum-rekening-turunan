public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo); // Memanggil constructor parent
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public void tarik(int jumlah) {
        // Bertipe void & meng-override tarik dengan aturan overdraft [2]
        if (jumlah > 0 && (saldo - jumlah) >= -batasOverdraft) {
            saldo -= jumlah;
        }
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo(); // Panggil super.cetakInfo() [2]
        System.out.println("    Giro, batas overdraft " + formatRupiah(batasOverdraft));
    }

    public void tesPesanErrorPrivate() {
        // System.out.println(nomor);
        /*
         * PESAN ERROR SAAT MENGAKSES FIELD PRIVATE PARENT (nomor):
         * error: nomor has private access in Rekening [2]
         */
    }
}
