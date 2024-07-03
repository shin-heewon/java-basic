package Jongol.array2;

import java.util.Scanner;

public class Assessment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] school = new int[4][3];
        int sum = 0;

        for (int i = 0; i < school.length; i++) {
            System.out.print(i+1+"class? ");
            for (int j = 0; j < school[i].length; j++) {
                school[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < school.length; i++) {
            for (int j = 0; j < school[i].length; j++) {
                sum+=school[i][j];
            }
            System.out.println(i+1+"class : "+sum);
            sum=0;
        }

    }
}
