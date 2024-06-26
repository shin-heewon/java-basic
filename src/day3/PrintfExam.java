package day3;

import javax.sound.midi.Soundbank;

public class PrintfExam {

    //printf : 포맷 지원, 줄바꿈 안 함. "\n" 혹은 "%n"
    //" %b" : boolean으로 출력
    //%d : 10진 정수 출력
    //%o : 8진 정수 출력
    //%x : 16진수
    //%f : 소수출력
    //%e : 지수
    //%c: 문자 하나 출력
    // %s : 문자열 출력

    public static void main(String[] args) {

        long l1 = 10;

        System.out.printf("result = [%5d]%n", l1);//스페이스바  5칸 공간 안에 오른쪽에서부터 출력
        System.out.printf("result = [%-5d]%n", l1);//스페이스바  5칸 공간 안에 오른쪽에서부터 출력
        System.out.printf("result = [%05d]%n", l1);//숫자 0 : 비어있는 공간을 알아보기 힘드므로 숫자 0을 집어넣어 출력


        long hx = 0xFFFF;
        System.out.printf("hx = %x%n", hx);
        System.out.printf("hx = %#xx%n", hx);//#: 0x 표시해줌
        System.out.printf("hx = %#X%n", hx); //대문자 X : 대문자

        //10진수를 2진수를 출력하는 지시자는 없다. Integer.toBinaryString(int i) 사용해줘야함.
        //해당 메소드는 정수를 2진수로 변환해서 문자열로 반환한다. (%s)
        int binaryNum = 0b10; //일 공 => 10진수 2를 의미함
        System.out.printf("binaryNum = %s%n", Integer.toBinaryString(binaryNum) );

        char c = 'A';
        System.out.printf("c = %c, %d  %n", c, (int)c);
    }



}
