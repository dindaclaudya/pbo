package sesi6;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa dengan data yang berbeda
        Mahasiswa mhs1 = new Mahasiswa("Claudy", 80, 75, 90);
        Mahasiswa mhs2 = new Mahasiswa("Dian", 70, 85, 78);
        Mahasiswa mhs3 = new Mahasiswa("Andi", 60, 65, 70);

        // Menampilkan informasi masing-masing mahasiswa
        System.out.println("Informasi Mahasiswa 1:");
        mhs1.displayInfo();

        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.displayInfo();

        System.out.println("\nInformasi Mahasiswa 3:");
        mhs3.displayInfo();
    }
}
