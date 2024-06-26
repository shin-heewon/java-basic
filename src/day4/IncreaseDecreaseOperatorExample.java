package day4;

public class IncreaseDecreaseOperatorExample {

    public static void main(String[] args) {

        // 수식 :  오퍼랜드(operand) 연산자 오퍼랜드2
        //                         이항연산자
        int x = 10;
        int y = 10;
        int z;


//        x = -x;
//        System.out.println(x);
//
//
//        byte b = 100;
//        //byte result = -b; //정수 타입(byte, short, int) 연산의 결과는 return 결과가 int 타입이다.
//
//        x = 100;
//        x = -x;


        ++x; // x = x+1과 동일

        System.out.printf("x : %d, y : %d ", x,y);

        --x;
        System.out.println(x);

        int a = 1;
        int b = 1;

        //여러개의 연산자가 포함된 연산식에서는 증감연산자의 위치에 따라 결과가 달라진다
        int result1 = ++a + 10; //12
        System.out.println(result1);

        int result2 = b++ +10; //11
        System.out.println(result2); //후치증감 연산자는 모든 계산이 끝난 후 실행
        System.out.println(b);//2


        x = 1;
        y = 1;
        z = ++x +y++;
        System.out.println(z);//3






    }

}
