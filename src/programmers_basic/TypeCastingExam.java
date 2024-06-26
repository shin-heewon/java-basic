package programmers_basic;

public class TypeCastingExam {
    public static void main(String[] args) {
        int intValue = 200;
        //빈칸에 long타입 변수 longValue를 선언하고 변수를 intValue를 이용해 초기화해보세요.

        long longValue = intValue;

        System.out.println(longValue);

        long longValue2 = 20;
        //이 아래줄에 int형 변수 intValue를 선언하고 longValue에 들어있는 값을 담아보세요.

        int intValue2 = (int)longValue2;

        System.out.println(intValue2);
    }
}
