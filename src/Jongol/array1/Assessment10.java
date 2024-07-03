package Jongol.array1;

import java.util.Arrays;
import java.util.Scanner;

public class Assessment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] scores = new int[num];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        Arrays.sort(scores);
        for (int i=num-1; i>=0; i--) {
            System.out.println(scores[i]);

        }
    }
}
