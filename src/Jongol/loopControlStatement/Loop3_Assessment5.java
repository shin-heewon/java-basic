package Jongol.loopControlStatement;

import java.util.Scanner;

public class Loop3_Assessment5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();

    for (int i=0;i<input;i++){
      for(int j=input-1;j>i;j--){
        System.out.print("  ");
      }
      for (int j=0; j<2*i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
