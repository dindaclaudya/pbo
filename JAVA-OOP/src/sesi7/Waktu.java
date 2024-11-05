package sesi7;

    public class Waktu {
        private int jam;
        private int menit;
    
        // Setter untuk jam
        public void setJam(int jam) {
            if (jam >= 0 && jam < 24) {
                this.jam = jam;
            } else {
                System.out.println("Jam harus antara 0 dan 23.");
            }
        }
    
        // Setter untuk menit
        public void setMenit(int menit) {
            if (menit >= 0 && menit < 60) {
                this.menit = menit;
            } else {
                System.out.println("Menit harus antara 0 dan 59.");
            }
        }
    
        // Metode untuk menampilkan waktu
        public void tampilWaktu() {
            System.out.println("Waktu: " + jam + ":" + (menit < 10 ? "0" + menit : menit));
        }
    
        // Metode untuk menambah jam
        public void tambahJam(int jam) {
            this.jam += jam;
            if (this.jam >= 24) {
                this.jam = this.jam % 24; // Menjaga agar jam tetap dalam 0-23
            }
        }
    
        // Metode untuk menambah menit
        public void tambahMenit(int menit) {
            this.menit += menit;
            if (this.menit >= 60) {
                this.jam += this.menit / 60;
                this.menit = this.menit % 60; // Menjaga agar menit tetap dalam 0-59
            }
            if (this.jam >= 24) {
                this.jam = this.jam % 24; // Menjaga agar jam tetap dalam 0-23
            }
        }
    }

