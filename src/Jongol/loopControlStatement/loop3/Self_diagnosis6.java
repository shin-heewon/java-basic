package Jongol.loopControlStatement.loop3;

import java.util.Scanner;

public class Self_diagnosis6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        char alp ='A';

        for (int i = 1; i < input+1; i++) {
            for (int j=0;j<input-i+1;j++) {
                System.out.print(alp);
                alp++;
            }

            System.out.println();
        }
    }
}
