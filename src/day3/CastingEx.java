package day3;

import java.lang.reflect.Type;

public class CastingEx {
    public static void main(String[] args) {
//        byte byteValue = 10;
//        int intValue = byteValue;
//        System.out.println(byteValue + " "+ intValue);
//
//        char charValue = 'A';
//        int intValue1 = charValue; //65
//        char charValue2 = (char) intValue1; //강제 타입변환(큰->작) 캐스팅 : casting,,4바이트를 2바이트씩 잘라서 넣어줌
//
//        System.out.println(charValue2);
//
//        /*byte타입은 음수를 포함하기 때문에 크기가 같아도 char타입으로 자동 변환될 수 없음*/
//
//
//        int v1 = 10302997;
//        byte bv1 = (byte) v1;
//        System.out.println(bv1); //잘림,, 10진수를 2진수로 나누어서 4분의 1 값만큼에 해당하는 값을 다시 10진수로 표시하는 21만 겨우 출력
//
//
//        //강제 타입변환을 하는 이유는?
//        //원래 값을 유지하면서 타입만 바꾸고싶을 때 사용함 (예전에 메모리 절약이 필요한 경우에 주로 사요)
//
//        long longValue = 300L; //큰 값일 경우 항상 L, F등 표시해주기
//        int intValue2 = (int) longValue;
//        System.out.println(intValue2);
//
//
//        //연산식 자동 타입 변환
//        //자바는 실행속도의 향상을 위해 컴파일 단계에서 연산을 수행한다.
//        byte result = 10 + 20; //변수 아님, 리터럴!! 이런 간단한 식의 값인 30을 컴파일 단계에서 계산
//
//        //정수 리터럴이 아닌 변수가 오퍼랜드로 사용되면 실행 시 연산을 수행한다.
//        byte x = 10;
//        byte y = 20;
//        //byte result1 = x+y; //err,,피연산자(변수)
//        int result1 = x+y; // 혹은 int result1 = (int)x + (int)y;
//
//
//        //실수 : float(4byte), double(8byte) => 정수부와 실수부 방이 따로 있다고 생각할 것
//        double result4 = 1.2f + 3.6;//float + double타입
//
//        //intValue3에 10을 할당하고 이 값을 double값과 더해서 새로운 변수 result5에 출력
//        int intValue3 = 10;
//        double doubleValue3 = 5.5d;
//        double result5 = intValue3+doubleValue3; //10.0 +5.5 = 15.5
//        System.out.println(result5);
//
//        int result6 = intValue3 + (int)doubleValue3;
//        System.out.println(result6);
//
//        int a = 1;
//        int b = 2;
//        double result7 = (double) a /b; //(double)(a/b)는 err, (double)a/b로 해야됨
//        System.out.println(result7);
//
//
//        //자바에서 +연산자의 기능 두 가지
//        //1. 피연산자가 모두 숫자일 경우 덧셈연산 수행
//        //2. 피연산자 중 하나가 문자일 경우 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산 수행
//        int op1 = 3+7; //10
//        String op2 = "3"+7;//37
//        String op3 = "3"+"7";//37
//
//        int op4 = 1+2+3; //3+3=6
//        String op5 = 1+2+"3"; //1+2=>3 + 3 = "33"
//        String op6 = 1+"2"+3;//"123"
//        String op7 = "1"+2+3; //"1"+2 =>"12" + 3 => "123" 문자열 출력됨
//        String op8 = "1" +(2+3) ;//"15"
//
//        //String 타입변환
//        int op9 = Integer.parseInt("10");
//        System.out.println(op9+10); //20
//        double op10 = Double.parseDouble("3.14");
//        System.out.println(op10 + 5.5);
//
//        boolean op11 = Boolean.parseBoolean("true");
//        System.out.println(op11); //true
//
//
//        //기본 타입으로 바꾼 값을 다시 String 타입으로 변경
//        String str1 = String.valueOf(10);
//        String str2 = String.valueOf(op11);


        /*변수의 유효범위(Variable Scope)*/
        //해당 변수가 접근 가능한 범위를 의미
        //자바에서는 변수가 선언된 위치에 따라 범위가 결정된다.


        //1.블럭 내부의 변수
        int a = 10;
        if(a == 10){
            int b = 20;
            System.out.println("a = "+a+", b = "+b);
        }

        //2. 메소드 내부 변수 : 해당 메서드 내에서 선언된 변수는 메서드 내에서만 유효하다.
        int result = calculator(100, 200);
        System.out.println(result);

    }

    public static int calculator(int n1, int n2){
        int result = n1+n2;
        System.out.printf("%d + %d 의 결과는 %d\n", n1, n2, result);
        return result;
    }


}
