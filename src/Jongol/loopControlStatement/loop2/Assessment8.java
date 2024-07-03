package Jongol.loopControlStatement.loop2;

import java.util.Scanner;

public class Assessment8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = 0;

    for (int i=1; i<=num1; i++){
      for (int j=1; j<=num2; j++){
        num3=i*j;
        System.out.print(num3+" ");
        //sum+=j;
      }
      num3=0;
      System.out.println();
    }
  }

}
