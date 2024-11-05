package sesi7;

    class Nilai {
        private int quis;
        private int uts;
        private int uas;
    
        // Setter untuk nilai quis
        public void setQuis(int quis) {
            this.quis = quis;
        }
    
        // Setter untuk nilai uts
        public void setUTS(int uts) {
            this.uts = uts;
        }
    
        // Setter untuk nilai uas
        public void setUAS(int uas) {
            this.uas = uas;
        }
    
        // Getter untuk nilai quis
        public int getQuis() {
            return quis;
        }
    
        // Getter untuk nilai uts
        public int getUTS() {
            return uts;
        }
    
        // Getter untuk nilai uas
        public int getUAS() {
            return uas;
        }
    
        // Metode untuk menghitung Nilai Akhir (NA)
        public double hitungNA() {
            return (quis * 0.2) + (uts * 0.3) + (uas * 0.5);
        }
    
        // Metode untuk mendapatkan indeks
        public String getIndex() {
            double na = hitungNA();
            if (na >= 80) return "A";
            else if (na >= 70) return "B";
            else if (na >= 60) return "C";
            else return "D";
        }
    
        // Metode untuk mendapatkan keterangan
        public String getKeterangan() {
            return hitungNA() >= 60 ? "Baik" : "Tidak Lulus";
        }
    }

