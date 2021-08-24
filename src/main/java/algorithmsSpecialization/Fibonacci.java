package algorithmsSpecialization;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int n;

        n = sc.nextInt();
        System.out.println("N = " + n);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if (n <= 2) return;
        for (int number : array) {
            try {
                sum = number + array[number + 1];
            } catch (Exception e) {
                System.out.println("Index 9 out of bounds for");
            }
        }
        long answer = sum;
        System.out.println(answer);
    }

}
