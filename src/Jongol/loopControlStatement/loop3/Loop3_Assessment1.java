package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Loop3_Assessment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int avg=0;
        int count=0;

        for (count=0; count<20;count++){
            int input = sc.nextInt();
            sum+=input;
            if (input==0)break;
        }
        System.out.println(sum+" "+sum/count);
    }
}
