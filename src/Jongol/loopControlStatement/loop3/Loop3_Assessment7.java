package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Loop3_Assessment7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    char a = 'A';
    int b = 0;

    for (int i=0; i<num; i++){
      for (int j=num; j>i; j--){
        System.out.print(a+" ");
        a++;
      }
      for (int j=1; j<i+1; j++){
        System.out.print(b+" ");
        b++;
      }
      System.out.println();
    }

  }

}
