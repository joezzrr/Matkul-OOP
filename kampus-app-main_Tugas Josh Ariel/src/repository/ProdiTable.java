package repository;

import model.Prodi;

public class ProdiTable {
    private Database db;

    public ProdiTable(Database db) {
        this.db = db;
    }

    public void create(Prodi prodi) {
        db.createProdi(prodi);
    }

    public String getProdiNameById(String id_prodi) {
        for (Prodi prodi : db.tables.dataProdi) {
            if (prodi.getId().equals(id_prodi)) {
                return prodi.getNama();
            }
        }
        return "Prodi belum terdaftar";
    }
    
}
