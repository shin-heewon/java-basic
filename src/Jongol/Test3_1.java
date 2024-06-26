package Jongol;
import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum;
        int avg;

        int a;
        int b;
        int c;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        sum = a+b+c;
        avg = sum/3;
        System.out.println("sum : "+sum);
        System.out.println("avg : "+avg);



    }
}
