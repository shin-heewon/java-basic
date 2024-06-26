package day2;

public class VDATest {
    public static void main(String[] args) {
        // Q1. 정수 int  한 개를 저장하기 위해서 변수를 선언, 변수명은  v
         int v; //변수 선언

            //정수형 변수 v에 20을 저장하기
            v = 20;

         //정수형 v에 값을 "v=10" 출력하기
        System.out.println("v = " + v);


        //Q2. 변수 a에 10 저장, a
            int a = 10; //변수 초기화
            int b = a;
            int c = b * 10;
            System.out.println("c = "+c);


        //Q3. 변수에 1부터 5까지의 수를 누적하여 출력
            //int sum = 1+2+3+4+5;
            int sum = 0;
            sum = sum +1;
            sum = sum +2;
            sum = sum +3;
            sum = sum +4; //6+4
            sum = sum +5; //10+5
            System.out.println("sum = " +sum);

            int result = 0;
            for(int i=0; i<6; i++){
                result = result + i;
            }
            System.out.println("result = " + result);

        //Q4.
            int x = 10;
            int y = 20;
        System.out.println("x = "+ x + " : " + "y = "+y);

        //교환(swap)
        int temp;
        temp = y;
        y = x;
        x = temp;
        System.out.println("x = "+ x + " : " + "y = "+y);




    }
}
