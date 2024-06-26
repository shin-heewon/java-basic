package day3;

public class VariableScopeExam {

    static int globalValue = 100; //클래스 변수, 해당 클래스의 모든 인스턴스에서 접근 가능하다.

    public static void main(String[] args) {

        System.out.println("GlobalValue : "+globalValue);

        VariableScopeExam instance = new VariableScopeExam(); //인스턴스를 생성한다.
        instance.accessInstanceVariable(); //인스턴스 메소드를 호출해서 인스턴스 메소드의 지역변수에 접근.


        modifyGlobalValue();//static 메소드이기 때문에 인스턴스를 생성하지 않고 직접 호출함


        //렉시컬 스코프 : 변수의 유효 범위가 코드의 작성 위치에 의해 결정된다.
        //익명블럭 : 이름이 없는 블럭
        {
            int anmos = 500;
            System.out.println("anmos = " + anmos);

        }


    }//main




    public void accessInstanceVariable(){
        int localVariable = 200;
        System.out.println("localBariable = "+ localVariable + globalValue);
    }


    public static void modifyGlobalValue(){
        globalValue = 300; // 전역변수 호출하여 값 변경
        System.out.println("globalValue : "+globalValue + globalValue);

    }




}
