package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Self_diagnosis1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int sum = 0;
    int count = 0;
    int num = 1;


      for (int i =1; i<input; i++){
        if (i%2!=0){
          sum+=i;
          count++;
          if (sum>=input)break;
        }
      }


    System.out.println(count+" "+sum);

  }

}
