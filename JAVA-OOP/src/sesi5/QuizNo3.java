package sesi5;

import java.util.Scanner;

public class QuizNo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = input.nextInt();
        } while (angka != 0);

        System.out.println("Program berhenti.");
    }
}


