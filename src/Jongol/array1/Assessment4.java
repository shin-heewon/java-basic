package Jongol.array1;

import java.util.Scanner;

public class Assessment4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int num=0;
        int count=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            num = sc.nextInt();
            if (num == -1)break;
            arr[i] = num;
            count++;
        }
        if (count<3) {
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
        }else {
            for (int i = count - 3; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
