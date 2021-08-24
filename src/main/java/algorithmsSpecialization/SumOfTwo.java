package algorithmsSpecialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] array = str.replace(" ", "").split("");
        List<Integer> numbers = new ArrayList<>();
        for (String item : array) {
            try {
                numbers.add(Integer.parseInt(item));
            } catch (Exception ignored) {
            }
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}