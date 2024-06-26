package Jongol;

import java.util.Scanner;

public class Test3_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " > " + b + " --- "+ (a>b?1:0));
        System.out.println(a + " < " + b + " --- "+ (a<b?1:0));
        System.out.println(a + " >= " + b + " --- "+ (a>=b?1:0));
        System.out.println(a + " <= " + b + " --- "+ (a<=b?1:0));

    }
}
