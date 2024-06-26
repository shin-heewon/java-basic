package MornigTest;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Arrays;

public class HomeworkBasic {


  public static void main(String[] args) {

    HomeworkBasic hb = new HomeworkBasic();

    hb.method26();

  }//main end

  public void method1(){
    System.out.println("자바 소스파일의 확장자는 .java이고 컴파일된 파일의 확장자는 .class이다.");
  }

  public void method2(){
    System.out.println("파일이름 ==> Shpe.java");
    System.out.println("출력결과 ==> Shape");
  }


  public void method3(){
    int sum=0;
    sum = (sum>100)?100:0;
  }

  public void method4(){
    System.out.println("식별자 사용이 잘못된 경우 : 2, 3");
  }

  public void method5(){
    int height=0; //(1)
    double size = 0.25d;//(2)
    double total = height+size;//(3)
    char c = 'a';// (4)
    String name = "신희원";//(5)
  }

  public void method6(){

    //출력을 하려면 main 내에서 해야 출력이 된다.
    int k = 10;
    int j = 20;
    int result = k+j;
    System.out.println(result);
  }

  public void method7(){
    System.out.println("자바 클래스를 저장하는 소스 파일의 이름은 .class이다.");
  }

  public void method8(){
    System.out.println("명령창에서 이 프로그램을 컴파일하는 명령은 파일명.java이다.");
  }

  public void method9(){
    System.out.println("명령창에서 이 프로그램을 실행하는 명령은 파일명.class이다.");
  }

  public void method10(){
    System.out.println("순서대로 X, X, X, O");

  }

  public void method11(){
    System.out.println("자바 API java.util 패키지에서 입력기능을 제공하는 클래스 이름은 Scanner이다.");
  }

  public void method12(){
    System.out.println("자바에서 클래스의 부모 크ㄹ래스에서 상속을 요청할 때 사용되는 키워드는 extends이다.");
  }

  public void method13(){
    System.out.println("메소드 오버로딩");
  }

  public void method14(){
    System.out.println("calculate메소드 안에 들어갈 알맞은 반환 타입 : double");
  }

  public int method15_add(int a, int b){

    return a+b;
  }

  public int method15_add(int a, int b, int c){//오버로딩
    return a+b+c;
  }

  public void method16(){
    for (int i=1; i<10; i++){
      System.out.println(i+" ");
    }
  }

  public void method17(){

    int sum = 0;
    for (int i=1; i<=15; i++){
      sum +=i;
    }
    System.out.println("수행문 ===> sum+=i;");
    System.out.println("실행결과 ===> 120");
  }

  public void method18(){
    int n[][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
    for(int j=0; j<n.length; j++){
      System.out.println(n[j].length+ " ");
      }
    System.out.println("실행결과 ===> 1 3 1 4 2");
  }

  public void method19(){
//    int[] arr = {10, 11, 12, 13, 14, 15};
    int[] n = new int[6];
    for (int i=0; i<6; i++){
      n[i]=i+10;
      System.out.println(n[i]);
    }
  }


  public void method20(){

    char[][] ch2 = { {'A','B','C'}, {'D','E', 'F'}};
  }


  public void method21(){
    int x = 1;
    int y = 2;
    int z = 3;

    x+=1;
    y+=1;
    z-=2;

    System.out.printf("x=%d\ny=%d\nz=%d", x,y,z);
  }

  public void method22(){
    int num = 10;
    System.out.println(num>0?"양수":(num<0?"음수":"0"));
  }

  public void method23(){
    System.out.println("1 ==> x>10 && x <20");
    System.out.println("2 ==> ch!=' ' && ch!=9");
    System.out.println("3 ==> ch=='x' && ch=='X");
    System.out.println("4 ==> ch>='0' && ch<='9' ");
    System.out.println("5 ==> (ch>= 'a' && ch<='z') || (ch>='A' && ch<='Z')");
    System.out.println("6 ==> year%400==0 || (year%4==0 && year%100)");
    System.out.println("7 ==> powerOn==false");
    System.out.println("8 ==> str==yes");
  }

  public void method24(){
    int num = 0;
    int sum = 0;
    while (sum<2550){
      if(num%2 == 0){
        sum+=num;
      }
      num++;
    }
    System.out.println("sum = "+sum+", num = "+num);

  }

  public void method25(){
    Scanner sc = new Scanner(System.in);
    int height = sc.nextInt();

    for (int i = 0; i<height; i++){
      for(int j=0;j<i+1;j++ ){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void method26(){
    char[] abc = {'A', 'B', 'C','D'};

      System.out.println(Arrays.toString(abc));

  }


  public void method27(){

  }

}//end class


