package Jongol.array2;

import java.util.Scanner;

public class Assessment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (a==j+1) {arr[j] += a;}
            }
        }

        for (int i = 0; i < arr.length; i++) {
            //int a = arr[i]/i+1;
            if (arr[i]==0) {System.out.println(i+1+" : "+ arr[i]);}
            else System.out.println(i+1+" : "+ arr[i]/(i+1));
        }

    }
}
