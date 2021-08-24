package algorithmsSpecialization;

import java.util.Scanner;

public class GCD {
    public int gcd(int a, int b) {
        if (b == 0) {
            System.out.println("GCD is: " + a);
            return a;
        }
        int remainder = a % b;
        System.out.printf("GCD of (%d,%d). Reminder = %d \n", a, b, remainder);
        return gcd(b, remainder);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int[] array = new int[n];
        System.out.println("INPUTTING DATA...");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int a = array[0];
        int b = array[1];

        if (b <= 0) {
            System.out.println("B <= 0, B = " + b);
            System.exit(0);
        }

        gcd.gcd(a, b);
    }

}
