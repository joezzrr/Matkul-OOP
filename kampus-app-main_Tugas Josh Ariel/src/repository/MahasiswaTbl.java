package repository;

import model.Mahasiswa;

public class MahasiswaTbl {
    private Database db;
    public MahasiswaTbl(Database db) {
        this.db = db;
    }

    public void create(Mahasiswa mahasiswa, String id_prodi) {
        if (db.isProdiExist(id_prodi)) {
            mahasiswa.setIdProdi(id_prodi);
            db.tables.dataMahasiswa.add(mahasiswa);
            db.commit();
        } else {
            System.out.println("Prodi dengan ID " + id_prodi + " tidak ditemukan.");
        }
    }

    public void update(String nim, Mahasiswa mahasiswa, String id_prodi) {
        for(int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if(db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                db.tables.dataMahasiswa.set(i, mahasiswa);
                break;
            }
        }
        db.commit();
    }

    public Mahasiswa getMahasiswaByNim(String nim) {
        for(int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if(db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                return db.tables.dataMahasiswa.get(i);
            }
        }
        return null;
    }

    public void delete(String nim) {
        for(int i = 0; i < db.tables.dataMahasiswa.size(); i++) {
            if(db.tables.dataMahasiswa.get(i).getNim().equals(nim)) {
                db.tables.dataMahasiswa.remove(i);
                break;
            }
        }
        db.commit();
    }
}
