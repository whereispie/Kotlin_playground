package algorithmsSpecialization;

import java.util.Scanner;

public class MaximumPairWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long preMax = 0;
        long max = 0;
        int length;

        length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        for (int currentNumber : array) {
            if (currentNumber > max) {
                preMax = max;
                max = currentNumber;
            } else if (currentNumber > preMax) {
                preMax = currentNumber;
            }
        }
        long answer = preMax * max;
        System.out.println(answer);
    }
}