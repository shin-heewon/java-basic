package Jongol.loopControlStatement.loop2;

import java.util.Scanner;

public class Assessment10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a<b){
      for (int i=1; i<10;i++){
        for (int j=a; j<=b; j++){
          System.out.print(j+" * "+i+" = "+((j*i)<10?" "+(j*i) : (j*i))+"   ");
        }
        System.out.println();
      }
    }else {

      for (int i=1; i<10;i++){
        for (int j=a; j>=b; j--){
          System.out.print(j+" * "+i+" = "+((j*i)<10?" "+(j*i) : (j*i))+"   ");
        }
        System.out.println();
      }
    }

  }

}
