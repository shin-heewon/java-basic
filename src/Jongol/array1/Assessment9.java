package Jongol.array1;

import java.util.Scanner;

public class Assessment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int num=1;
        int[] arr = new int[100];
        while (count<100){
            num = sc.nextInt();
            arr[count] = num;
            if (num==0){break;}
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            if(arr[i]%2!=0){
                arr[i]=arr[i]*2;
            }else arr[i]=arr[i]/2;
            System.out.print(arr[i]+" ");
        }



    }
}
