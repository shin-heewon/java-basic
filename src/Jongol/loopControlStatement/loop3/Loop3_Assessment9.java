package Jongol.loopControlStatement.loop3;
import java.util.Scanner;
public class Loop3_Assessment9 {


    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for (int i=1; i<=num; i++){
        for (int j=0; j<i; j++){
          System.out.print("# ");
        }
        System.out.println();
      }
      for (int i=1; i<=num-1; i++){
        for (int j=0; j<2*i; j++){
          System.out.print(" ");
        }
        for (int j=num-1; j>=i; j--){
          System.out.print("# ");
        }
        System.out.println();
      }


  }
}
