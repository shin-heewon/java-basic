package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Loop3_Assessment6 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int input =sc.nextInt();
    int num = 1;

    for (int i=0; i<input; i++){
      for (int j=input-1; j>i; j--){
        System.out.print("  ");
      }
      for (int j=0; j<i+1;j++ ){
        System.out.print(num+" ");
        num++;
      }
      num = 1;
      System.out.println();
    }


  }

}
