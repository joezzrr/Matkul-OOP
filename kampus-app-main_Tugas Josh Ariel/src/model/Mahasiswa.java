package model;

public class Mahasiswa {
    private String nim;
    public String getNim() {
        return nim;
    }

    private String nama;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa(String nim, String nama, String id_prodi) {
        this.nim = nim;
        this.nama = nama;
        this.id_prodi = id_prodi;
    }

    private String id_prodi; 
    public String getIdProdi() {
        return id_prodi;
    }

    public void setIdProdi(String id_prodi) {
        this.id_prodi = id_prodi;
    }
}
