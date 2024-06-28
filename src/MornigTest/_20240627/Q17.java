package MornigTest._20240627;

public class Q17 {

  public static void main(String[] args) {
    Printer printer = new Printer();

    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");

    //static으로 메소드를 변경하면 클래스이름.메소드()로 바로 접근 가능함
    //공유하는 메소드, 필드 등을 static으로 선언해놓으면 사용하기 편리함!
    Printer.println(10);
    Printer.println(true);
    Printer.println(5.7);
    Printer.println("홍길동");

  }



}
