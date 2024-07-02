package Jongol.array1;

import java.util.Scanner;

public class Assessment5 {
    public static void main(String[] args) {
        double[] a = new double[6];
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.out.printf("%.1f",sum/a.length);
    }
}
