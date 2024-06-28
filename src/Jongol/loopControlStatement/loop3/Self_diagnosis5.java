package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Self_diagnosis5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    for (int i=1; i<input+1; i++){
      for(int j=0; j<i-1; j++){
        System.out.print(" ");
      }
      for (int j=0; j<2*(input-i)+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
