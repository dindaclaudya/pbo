package sesi6;

public class Mahasiswa {
    private static int idCounter = 1; // Counter untuk ID unik
    private int idMahasiswa; // ID unik mahasiswa
    private String nama;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Konstruktor
    public Mahasiswa(String nama, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.idMahasiswa = idCounter++;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    // Method untuk menampilkan informasi Mahasiswa
    public void displayInfo() {
        System.out.println("ID Mahasiswa: " + idMahasiswa);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        System.out.printf("Nilai Akhir: %.2f\n", hitungNilaiAkhir());
        System.out.println("Status: " + (hitungNilaiAkhir() >= 60 ? "Lulus" : "Tidak Lulus"));
    }
}
