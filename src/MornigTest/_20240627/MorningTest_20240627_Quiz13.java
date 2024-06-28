package MornigTest._20240627;

public class MorningTest_20240627_Quiz13 {

  String name;
  String id;
  String password;
  int age;
  Boolean result = false;

  /*quiz14*/
  public MorningTest_20240627_Quiz13(){}


  public MorningTest_20240627_Quiz13(String name, String id) {
    this.name = name;
    this.id = id;
  }

  /*quiz15*/
  public Boolean login(String id, String password){

    if(id.equals("hong") && password.equals("12345"))result = true;
    else result= false;

    return result;
  }

  public String logout(String id){
    return id+"님이로그아웃 되었습니다.";
  }



}


