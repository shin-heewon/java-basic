package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Loop3_Assessment2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int num = input;

    while (true){
      if (num%input == 0){
        System.out.print(num+" ");
        if (num%10==0)break;
      }
      num++;
      if(num >100)break;
    }//while end
  }

}
