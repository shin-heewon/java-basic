package Jongol.array2;

import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {

        int[] scores = new int[100];
        int count = 0;
        int sum=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            count++;
            if (scores[i]==0)break;
        }

        for (int i = 100; i > 0; i-=10) {
            for (int j = 0; j < count; j++) {
                if (scores[j] / i == 1 && scores[j] % i < 10) {
                    sum++;
                }
            }
            if (sum != 0) {
                System.out.println(i + " : " + sum + " person");
            }
            sum=0;
        }
    }
}
