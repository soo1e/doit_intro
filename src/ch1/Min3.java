package ch1;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(min3(a, b, c));
    }

    static int min3 (int a, int b, int c) {
        int min = a;
        if (min > a) min = a;
        if (min > b) min = b;
        if (min > c) min = c;

        return min;
    }
}
