package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Loop3_Assessment8 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = 1;

    for (int i=0;i<num;i++){
      System.out.print(a+" ");
      a++;
    }
    System.out.println();

    for (int i=0; i<num; i++){
      for (int j=0;j<i+1; j++){
        System.out.print("  ");
      }
      for (int j=num-1; j>i; j--){
        System.out.print(a+" ");
        a++;
      }
      System.out.println();
    }


  }

}
