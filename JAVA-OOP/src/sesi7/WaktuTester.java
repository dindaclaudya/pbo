package sesi7;

public class WaktuTester {
    public static void main(String[] args) {
        Waktu w = new Waktu();
        
        System.out.println("1. w.setJam(10)");
        w.setJam(10);  // Mengatur jam ke 10
        
        System.out.println("2. w.setMenit(57)");
        w.setMenit(57);  // Mengatur menit ke 57
        
        System.out.println("3. w.tampilWaktu(); w.tambahJam(7)");
        w.tampilWaktu();  // Menampilkan waktu setelah pengaturan
        w.tambahJam(7);  // Menambah jam sebanyak 7
        
        System.out.println("4. w.tambahMenit(40)");
        w.tambahMenit(40);  // Menambah menit sebanyak 40
    }
}