package Jongol.loopControlStatement.loop2;

import java.util.Scanner;

public class Assessment6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input1 = sc.nextInt();
    int input2 = sc.nextInt();

    if(input1>input2){
      int num = input1;
      input1=input2;
      input2=num;
    }
    int sum =0;
    double avg =0;
    int count = 0;

    for (int i=input1; i<=input2; i++){
      if (i%3==0 || i%5==0){
        sum+=i;
        count++;
      }
    }
    System.out.println("sum : "+sum);
    System.out.printf("avg : %.1f", (double)sum/count);


  }

}
