package Jongol.array1;


import java.util.Arrays;
import java.util.Scanner;

public class Assessment7 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int num = 0;
        int index=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            num = sc.nextInt();
            if (num  == 999) {break;}
            arr[i] = num;
            index++;
        }

        Arrays.sort(arr, 0, index);

        System.out.println("max : " + arr[index-1]);
        System.out.println("min : " + arr[0]);
    }
}
