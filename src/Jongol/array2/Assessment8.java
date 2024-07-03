package Jongol.array2;

import java.util.Scanner;

public class Assessment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum=0;
        int avg=0;
        int totalAvg=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            System.out.print(sum/arr[i].length+" ");
            sum=0;
        }
        System.out.println();

        for (int i = 0; i < arr[i].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum+=arr[j][i];
            }
            System.out.print(sum/arr.length+" ");
            sum=0;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum/8);
    }
}
