public class Player extends Basket {
    public Player(String nama, int tahunJuara, int nomorPunggung, String namaKlub) {
        super(nama, tahunJuara, nomorPunggung, namaKlub);
    }

    @Override
    public void nama() {
        System.out.println("Nama pemain ini adalah "+ getNama());
    }

    @Override
    public void namaKlub() {
        System.out.println(getNama() + " bermain di Club "+ getNamaKlub());
        
    }

    @Override
    public void nomorPunggung() {
        System.out.println("Nomor punggung " + getNama() + " adalah " + getNomorPunggung());
        
    }

    @Override
    public void tahunJuara() {
        System.out.println(getNama() + " juara pada tahun  "+ getTahunJuara() + " bersama "+ getNamaKlub());
    }
}
   


