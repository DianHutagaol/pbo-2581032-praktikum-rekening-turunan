import java.util.Locale;

public class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    // Method setor bertipe void
    public void setor(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    // Method tarik bertipe void
    public void tarik(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        }
    }

    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " \t| " + formatRupiah(saldo));
    }

    protected static String formatRupiah(int nominal) {
        return String.format(new Locale("id", "ID"), "Rp%,d", nominal);
    }
}