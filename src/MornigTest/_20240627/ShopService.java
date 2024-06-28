package MornigTest._20240627;

public class ShopService {
  private static ShopService singleton = new ShopService();//sttic으로 선언됐기 때문에 이 자리에 붙박이가 됨(강한 결합)

  private ShopService(){

    }

  static ShopService getInstance() {
    return singleton;
  }

}
