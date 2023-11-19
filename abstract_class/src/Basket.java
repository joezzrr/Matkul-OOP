public abstract class Basket {
    private String nama;
    protected int tahunJuara;
    protected int nomorPunggung;
    protected String namaKlub;

    public Basket(String nama, int tahunJuara, int nomorPunggung, String namaKlub) {
        this.nama = nama;
        this.nomorPunggung = nomorPunggung;
        this.tahunJuara = tahunJuara;
        this.namaKlub = namaKlub;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunJuara() {
        return tahunJuara;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public abstract void nama();
    public abstract void namaKlub();
    public abstract void nomorPunggung();
    public abstract void tahunJuara();
}
