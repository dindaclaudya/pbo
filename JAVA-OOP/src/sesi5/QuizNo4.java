package sesi5;

public class QuizNo4 {
    public static void main(String[] args) {
        int jumlahGenap = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                jumlahGenap++;
                System.out.println(i + " adalah bilangan genap.");
            }
        }

        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}


