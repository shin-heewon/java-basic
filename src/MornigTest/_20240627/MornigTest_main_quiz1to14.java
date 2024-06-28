package MornigTest._20240627;

import java.util.Scanner;

public class MornigTest_main_quiz1to14 {

  /*
  <참조타입>
  * 1. 4
  * 2. 3
  * 3. 2
  * 4. 2
  * 5. 3
  * 6. 3
  *   5
  <클래스>
  1. 3
  2. 4
  3. 4
  4. 3?
  5. 1
  6. 3
  7. 2
  8. 2?
  9. 2
  10. 4
  11. 3?
  12. 필드, 생성자, 메소드


  * */
    Scanner sc = new Scanner(System.in);


  public static void main(String[] args) {

    MornigTest_main_quiz1to14 mt = new MornigTest_main_quiz1to14();
    //mt.quiz9();

    /*quiz15 실행*/
    MorningTest_20240627_Quiz13 quiz13 = new MorningTest_20240627_Quiz13();
    Boolean result = quiz13.login("hong", "123");

    if (result) {
      System.out.println("로그인 되었습니다.");
      quiz13.logout("hong");
    } else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }



  }//end main

  public void quiz7(){
    int[] array = {1,5,3,8,2};
    int num= array[0];

    for(int i=0; i<array.length; i++){
      if(num<array[i]){
        num=array[i];
      }
    }
    System.out.println(num);
  }

  public void quiz8(){
    int[][] array = {
        {95, 86},
        {83, 92, 96},
        {78, 83, 93, 87, 88}
    };

    int sum = 0;
    int avg = 0;
    int length = 0;

    for(int i=0;i<array.length; i++){
      length += array[i].length;
      for(int j=0; j<array[i].length; j++){
        sum+= array[i][j];

      }
    }
    avg = sum/length;
    System.out.printf("합계 : %d, 평균 : %d", sum, avg);

  }

  public void quiz9() {

    System.out.print("학생수> ");
    int students = Integer.parseInt(sc.nextLine());
    int[] scores = new int[students];
    int sum = 0;
    double avg=0.0;
    int i=0;
    int max = 0;

    while (i<scores.length){
      System.out.print("scores["+i+"]> ");
      scores[i] = Integer.parseInt(sc.nextLine());
      sum+=scores[i];
      if(max<scores[i]){
        max = scores[i];
      }

      i++;
    }
    avg=(double) sum/ scores.length;
    System.out.printf("학생수 : %d, 최고점수 : %d, 평균점수 : %.1f", scores.length, max,avg );

  }





}//end class



