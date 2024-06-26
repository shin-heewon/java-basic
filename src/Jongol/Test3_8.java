package Jongol;

import java.util.Scanner;

public class Test3_8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a>b?(a>c?1:0):0);
        System.out.println(a==b?(a==c?1:0):0);


    }
}
