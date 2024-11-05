package sesi7;

public class Siswa {
    private String nama;
    private int nilaiUjian;

    // Constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian);
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter for nilaiUjian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    // Setter for nilaiUjian
    public void setNilaiUjian(int nilaiUjian) {
        // Validate nilai (0-100)
        if (nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("Nilai harus antara 0 dan 100.");
        }
    }

    // Method to display student information
    public void tampilkanInfo() {
        System.out.println("Nama Siswa: " + nama);
        System.out.println("Nilai Ujian: " + nilaiUjian);
    }
}

// Main class to run the program
class SiswaTester {
    public static void main(String[] args) {
        // Create a Siswa object
        Siswa siswa1 = new Siswa("Andi", 85);
        siswa1.tampilkanInfo();

        // Use setter to change the name and exam score
        siswa1.setNama("Budi");
        siswa1.setNilaiUjian(95);

        // Display updated information
        System.out.println("\nSetelah Diubah:");
        siswa1.tampilkanInfo();

        // Test validation by entering an invalid score
        siswa1.setNilaiUjian(105); // Output: Nilai harus antara 0 dan 100.
    }
}