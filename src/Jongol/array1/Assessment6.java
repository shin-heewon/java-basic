package Jongol.array1;

import java.util.Scanner;

public class Assessment6 {
    public static void main(String[] args) {
        char[] arr = {'J', 'U', 'N', 'G', 'O', 'L'};
        Boolean boo = false;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==ch) {
                System.out.println(i);
                boo = true;
            }
        }
        if (!boo) System.out.println("none");
    }
}
