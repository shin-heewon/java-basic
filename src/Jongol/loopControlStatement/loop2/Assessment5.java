package Jongol.loopControlStatement.loop2;

import java.util.Scanner;

public class Assessment5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int odd=0;
    int even=0;

    for (int i=0; i<10; i++){
      int input = sc.nextInt();
      if (input%2==0){
        even++;
      }else odd++;
    }
    System.out.println("even : "+even);
    System.out.println("odd : "+odd);
  }

}
