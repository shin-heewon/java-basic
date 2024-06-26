package javajungsuk_basic;

public class q4 {

  static int sum = 0;

  public static void main(String[] args) {
    /*4-1
  1. x>10 && x<20
  2. ch!=''&&ch!='\t'
  3. ch=='x' ||ch=='X'
  4. ch>='0'&&ch<='9'
  5. (ch>='A'&&ch<='Z') || (ch>='a' && ch <='z')
  6. year%400==0 || (year%4==0 && year%100!=0)
  7. powerOn==false
  8. str =="yes"

   */

    q4 q4 = new q4();


    System.out.println(q4.question4_4(sum));



  }//main en


  int question4_2(int sum){
    for(int i=1; i<=20; i++){
      if(i%2!=0 && i%3!=0){
        sum+=i;
      }
    }
    return sum;
  }//question4_2 end


  int question4_3(int sum){


    for(int i=1; i<=10; i++){
      for(int j=0; j<=i; j++) {
        sum += j;
      }
    }

    return sum;
  }//question4_3 end


  int question4_4(int sum){
    int i = 1;
    int num = 1;
    while(sum <=100){

      if(i %2 !=0){
        num= (-num);
        sum +=num;
      }else sum +=num;

      Math.abs(num++);
      i++;
    }

    return i;
  }

}

