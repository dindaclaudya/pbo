package sesi7;

class Waktu {
    private int jam;
    private int menit;

    public Waktu() {
        this.jam = 0;
        this.menit = 0;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getTotalMenit() {
        return jam * 60 + menit;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public void tampilWaktu() {
        System.out.println("Waktu: " + jam + ":" + (menit < 10 ? "0" : "") + menit);
    }

    public void tambahJam(int j) {
        this.jam += j;
        if (jam >= 24) jam -= 24; // Reset jam jika lebih dari 24
    }

    public void tambahMenit(int m) {
        this.menit += m;
        if (this.menit >= 60) {
            this.jam += this.menit / 60;
            this.menit = this.menit % 60;
            if (jam >= 24) jam -= 24; // Reset jam jika lebih dari 24
        }
    }
}

// Kelas WaktuTester
public class ClassWaktuTester {
    public static void main(String[] args) {
        Waktu w = new Waktu();
        
        System.out.println("=== Langkah 1: Total Menit Awal ===");
        System.out.println("Total Menit: " + w.getTotalMenit());

        System.out.println("\n=== Langkah 2: Set Jam dan Menit ===");
        w.setJam(10);
        w.setMenit(57);
        System.out.println("Total Menit: " + w.getTotalMenit());

        System.out.println("\n=== Langkah 3: Tampilkan Waktu ===");
        w.tampilWaktu();

        System.out.println("\n=== Langkah 4: Tambah Jam ===");
        w.tambahJam(7);
        System.out.println("JAM: " + w.getJam() + " MENIT: " + w.getMenit());

        System.out.println("\n=== Langkah 5: Tambah Menit ===");
        w.tambahMenit(40);
        System.out.println("JAM: " + w.getJam() + " MENIT: " + w.getMenit());
    }
}