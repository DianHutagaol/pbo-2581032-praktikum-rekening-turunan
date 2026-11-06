public class Tabungan extends Rekening {
    private double bungaPersen;

    public Tabungan(String nomor, String pemilik, int saldo, double bungaPersen) {
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    public int tambahBunga() {
        int besarBunga = (int) (saldo * (bungaPersen / 100.0));
        setor(besarBunga);
        return besarBunga;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("    Tabungan, bunga " + bungaPersen + "% per bulan");
    }
}
