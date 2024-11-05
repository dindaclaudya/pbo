package sesi7;

public class ClassNilai {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setQuis(60);
        n.setUTS(80);
        n.setUAS(75);

        System.out.println("=== Informasi Nilai Siswa ===");
        System.out.println("Nilai Quis       : " + n.getQuis());
        System.out.println("Nilai UTS        : " + n.getUTS());
        System.out.println("Nilai UAS        : " + n.getUAS());
        System.out.println("-----------------------------");
        System.out.printf("Nilai Akhir (NA) : %.1f%n", n.hitungNA()); // Menampilkan nilai dengan satu desimal
        System.out.println("Indeks           : " + n.getIndex());
        System.out.println("Keterangan       : " + n.getKeterangan());
    }
}