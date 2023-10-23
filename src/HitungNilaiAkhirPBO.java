import java.util.Scanner;

public class HitungNilaiAkhirPBO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Nama  : ");
        String nama = input.nextLine();
        System.out.print("Input NIM   : ");
        String nim = input.nextLine();

        System.out.print("Input nilai Tugas besar anda : ");
        double nilai_tugas_besar = input.nextDouble();
        System.out.print("Input nilai Quiz anda : ");
        double nilai_quiz = input.nextDouble();
        System.out.print("Input nilai Tugas anda : ");
        double nilai_tugas = input.nextDouble();
        System.out.print("Input nilai UTS anda : ");
        double nilai_UTS = input.nextDouble();
        System.out.print("Input nilai UAS anda : ");
        double nilai_UAS = input.nextDouble();
        System.out.println("\n====================================================================");

        double total_nilai = (30 * nilai_tugas_besar / 100) + (10 * nilai_quiz /100) + (10 * nilai_tugas /100) + (25 * nilai_UTS /100) + (25 * nilai_UAS /100);

        System.out.println("Nilai Akhir Matakuliah Pemrograman Berorientasi Objek Anda Adalah :");
        System.out.println("====================================================================");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Total Nilai : " + total_nilai);

        input.close(); // Menutup scanner
    }
}
