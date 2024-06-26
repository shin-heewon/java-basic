package day3;

public class StringExam {
    public static void main(String[] args) {


        //이스케이프 문자 : 문자열 내부에 역슬래시가 붙은 문자

        String name = "Java";
        String job = "Programming";

        String str = "나는 \" "+name+" \"를 배웁니다.";

        System.out.println(str);


        str = "번호\t이름\t직업";
        System.out.println(str);

        str = "나는\n"+"자바 프로그래머 입니다.";
        System.out.println("나는\n"+"자바 프로그래머 입니다. \n백엔드 개발자 과정 이수중입니다.");

        /*자바 13부터 테스트 블럭 제공*/
        String str2 = "" + "{\n" +
                            " \t\"id\" \"silver\",\n"+
                            "}";
        System.out.println(str2);

        String str3 = """
                        {   안녕하세요\
                            반갑습니다.
                            id : silver
                            pwd : 000
                        }
                        """;
        System.out.println(str3);

    }


}
