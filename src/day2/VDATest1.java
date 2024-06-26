package day2;

public class VDATest1 {
    public static void main(String[] args) {
        int age;
        double value;
        int score = 90;

        //문자 타입은 하나의 문자 '' ==> 문자리터럴은 유니코드로 저장된다.
        //세계각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약 : 유니코드
        //자바는 유니코드를 저장할 수 있도록 char 타입을 제공한다. (utf-8)

        char var1 = 'A'; // 코드번호 65
        char var2 = 65;
        char var3 = '가'; //가는 코드 44032 =>유니코드, 즉 정수로도 입력하여 관리 가능!!
        char var4 = 44032;

        /*string 클래스는 디폴트가 null이기 때문에 공백을 넣어도 가능하지만*/
        String str = "";
        /*char 형태는 숫자형 변수라고 생각을 하고, 반드시 실제값을 할당해주어야 한다. 유니코드 :32 로 공백에 대한 값이 있다.*/
        char c = ' '; //  char c = '';는 error


        System.out.println(var1);
        System.out.println(var2); //char 형태의 정수인 65도 A로 출력된다!
        System.out.println(var3);
        System.out.println(var4);

        /*리터럴 : 코드에서 프로그래머가 직접 입력한 값*/
        int x = 0b1011; // 혹은 0B1011 => 1*2의 세제곱 + 0*2의 제곱 + 1*2 + 1*1 = 11
        System.out.println(x);

        //20의 2진수값을 int y에 저장
        int y = 0b10100; // = 20

        /*8진수 : 0으로 시작하고 0~7*/
        int o1 = 013; // 1*8 + 3*1 = 11
        int o2 = 0206; // 2*8의 제곱 + 6*1 = 134

        /*16진수 : 0x 혹은 0X로 시작하고 0~9, A(10),B(11),C,D,E,F(a,b,c,d,e,f)(16수로)*/
        int z = 0xB3; // 11*16 + 3*1 = 179
        int x1 = 0x2A0F; // 2*16의 세제곱 + 10*16제곱 + 0*16 + 15*1

        System.out.println(x1);

        byte v1 = -128;
        //byte v2 = (byte) 128; //다운캐스팅

        //int, long 주로 사용함
        //long타입은 수치가 큰 데이터를 다루는 프로그램에서 사용된다.
        long l1 = 10;
        long l2 = 20L;
        long l3 = 1000000000000000000L; //int타입의 허용범위를 초과하는 범위의 숫자에 대해서는 반드시 L을 뒤에 표기해줘야 한다.

        //실수타입 : float(소수점 7자리) -> 32bit, double(소수잠 15자리) -> 8bit
        double d1 = 0.25;
        double d2 = -3.14;

        double d3 = 5e2; //5.0 * 10의 제곱 = 500.0
        double d4 = 0.12E-2; // 0.12 * 10의 -2제곱 = 0.0012

        float f1 = 3.14f;
        float f2 = 3E6F;
        System.out.println(f2);


        /*
        double 타입은 float타입보다 약 2배 정도의 유효 자릿수를 가지기 때문에 정확한 데이터 저장이 가능하다.(2배라서 double)
        논리타입 : 참과 거짓을 의미. 리터럴은 true, false 두가지의 상태값을 저장할 필요가 있을 때 사용
        조건문과 제어문의 실행 흐름을 변경하는데 사용
        */
        boolean stop = true;
        stop = false;

        int x5 = 30;
        boolean result = (x5 == 20); //x5의 값이 20인가?
        result = (x5 != 20);
        result = (x5 > 20);
        result = (x5>0 && x5 <20); //false
        System.out.println(result);
        result = (x5<0 || x5>200);

    }
}
