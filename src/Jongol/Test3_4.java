package Jongol;

import java.util.Scanner;

public class Test3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

       int c = (a++) * (--b);

        System.out.println(a+" "+b+" "+c);

    }
}
