package Jongol.array2;

import java.util.Scanner;

public class Assessment9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int num = 1;
    int arr[][] = new int[input][input];

    for (int i=0; i<input; i++){
      for(int j=0; j<i+1; j++){
        if (j==0 ||j==i) {arr[i][j]=1;
        }else {
          arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
        }
      }
    }

   /* for (int i=0; i<input; i++){
      for (int j=0; j<i+1; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("=======================");*/

    for (int i=0; i<arr.length; i++){
      for (int j=0; j<input-i; j++){
        System.out.print(arr[input-i-1][j] + " ");
      }
      System.out.println();
    }

  }
}
