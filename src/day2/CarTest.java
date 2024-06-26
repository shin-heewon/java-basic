package day2;

public class CarTest {//실행클래스
    public static void main(String[] args) {
        Car car1 = new Car();

//        car1.model = "BMW528i"; -> private로 선언된 변수는 바로 호출 불가능
//        car1.distance = 100000;
//        car1.price = 90000000;
        car1.company = "BMW";
        car1.type = 'A';
        car1.auto = true;
        car1.year = 2010;
        car1.gasmi = 12.5f;


        car1.setModel("BMW-1000"); //set메소드를 통해 해당 객체 영역(heap)에 값을 넣어줌?
        String model = car1.getModel(); //get메소드를 이용해 호출 가능, 원하는 형태로 가공할 수 있음

        System.out.println("현재 모델은 " + model);

    }
}
