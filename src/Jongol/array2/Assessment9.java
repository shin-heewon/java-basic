package Jongol.array2;

import java.util.Scanner;

public class Assessment9 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int num = 1;

    for (int i=0; i<input; i++){
      for (int j=0; j<input-i; j++){

      }

      for (int j=0; j<input-1; j++){
        System.out.print(num + " ");
      }
      System.out.println();
    }


  }
}
