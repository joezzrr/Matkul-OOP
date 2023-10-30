package repository;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.google.gson.Gson;

import model.DBTables;
import model.Prodi;

public class Database {
    private Gson gson;
    private String namaFileDataMahasiswa = "db_kampusapp";
    protected DBTables tables = new DBTables();
    public MahasiswaTbl mahasiswaTbl = new MahasiswaTbl(this);
    //
    public ProdiTable ProdiTable = new ProdiTable(this); 
    //
    public Database() {
        gson = new Gson();
        readDBFile();
    }
    protected void commit() {
        try (PrintWriter writer = new PrintWriter(new File(namaFileDataMahasiswa))) {
            writer.println(gson.toJson(tables));
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file: " + e.getMessage());
        }
    }
    private void readDBFile() {
        try (Scanner scanner = new Scanner(new File(namaFileDataMahasiswa))) {
            while (scanner.hasNextLine()) {
                String jsonString = scanner.nextLine();
                tables = gson.fromJson(jsonString, DBTables.class);
            }
        } catch (IOException e) {
            
        }
    }
    //
    public void createProdi(Prodi prodi) {
        if (isProdiExist(prodi.getId())) {
            Prodi prodiBaru = new Prodi(prodi.getId(), prodi.getNama());
            tables.dataProdi.add(prodi);
            commit();
        } else {
            System.out.println("Prodi dengan ID (" + prodi.getId() + ") sudah tersimpan.");
        }
    }

    public boolean isProdiExist(String id_prodi) {
        for (Prodi prodi : tables.dataProdi) {
            if (prodi.getId().equals(id_prodi)) {
                return true;
            }
        }
        return false;
    }

    public Prodi getProdiById(String id_prodi) {
        for (Prodi prodi : tables.dataProdi) {
            if (prodi.getId().equals(id_prodi)) {
                return prodi;
            }
        }
        return null;
    }
}
    //