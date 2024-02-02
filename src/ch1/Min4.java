package ch1;

import java.util.Scanner;

public class Min4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(min4(a, b, c, d));
    }

    static int min4 (int a, int b, int c, int d) {
        int min = a;
        if (min > a) min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;

        return min;
    }
}
