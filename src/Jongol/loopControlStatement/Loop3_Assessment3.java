package Jongol.loopControlStatement;

import java.util.Scanner;

public class Loop3_Assessment3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for (int i=1; i<input+1; i++){
      for (int j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i=1; i<input+1; i++){
      for (int j=0; j<input-i; j++){
        System.out.print("*");
      }
      System.out.println();
    }


  }
}
