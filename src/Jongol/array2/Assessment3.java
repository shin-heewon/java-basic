package Jongol.array2;

import java.util.Scanner;

public class Assessment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i-2]+arr[i-1];
            if (arr[i] >= 10){
                String a = Integer.toString(arr[i]);
                arr[i]=Character.getNumericValue(a.charAt(1));
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
