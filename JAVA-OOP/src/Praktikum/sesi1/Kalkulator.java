package Praktikum.sesi1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nama dan NIM
        System.out.print(">_< Masukkan Nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.print(">_< Masukkan NIM Anda: ");
        String nim = scanner.nextLine();

        // Menampilkan pesan selamat datang
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║    SELAMAT DATANG, " + nama + "!       ║");
        System.out.println("║   SIAP UNTUK PERTARUNGAN ANGKA? ║");
        System.out.println("║ INI ADALAH MEDAN PERHITUNGAN ⚔️  ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.println("   ★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★☆★☆★☆★");
        System.out.println("        Pilih Tantanganmu  ");
        System.out.println("   ★☆★☆★☆★☆★☆★☆★☆★☆★☆★★☆★☆★☆★☆★");
        System.out.println("═══════════════════════════════════");
        System.out.println("  1. ➕ Penjumlahan Sang Juara    ");
        System.out.println("  2. ➖ Pengurangan Sang Legenda  ");
        System.out.println("  3. ✖ Perkalian Sang Pahlawan   ");
        System.out.println("  4. ➗ Pembagian Sang Bijaksana  ");
        System.out.println("═══════════════════════════════════");
        System.out.println(" Peringatan: Pilih dengan bijak! 💀");
        System.out.print(" Masukkan pilihanmu (1/2/3/4): ");
        
        // Membaca pilihan pengguna
        int pilihan = scanner.nextInt();
        
        // Meminta input angka untuk operasi
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Melakukan operasi sesuai pilihan
        double hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian: " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " + hasil);
                } else {
                    System.out.println("Kesalahan: Tidak bisa membagi dengan nol!");
                }
                break;
            default:
                System.out.println("Kesalahan: Pilihan tidak valid!");
        }

        // Ucapan terima kasih
        System.out.println("Terima kasih, " + nama + ", telah menggunakan kalkulator ini! :)");

        // Menutup scanner
        scanner.close();
    }
}