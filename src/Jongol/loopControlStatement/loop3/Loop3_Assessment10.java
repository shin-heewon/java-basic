package Jongol.loopControlStatement.loop3;
import java.util.Scanner;
public class Loop3_Assessment10 {



    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int a = 1;
      for (int i=0; i<num; i++){
        for (int j=0; j<num; j++){
          System.out.print(a+" ");
          a+=2;
          if (a>10)a=1;
        }
        System.out.println();
      }


    }
}
