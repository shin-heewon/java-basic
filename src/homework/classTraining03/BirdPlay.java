package homework.classTraining03;

class Duck implements Bird{

	String name;
	int legs;
	int length;

	@Override
	public void fly() {
		System.out.printf("오리(%s)는 날지 않습니다.\n", this.name);
	}

	@Override
	public void sing() {
		System.out.printf("오리(%s)가 소리내어 웁니다.\n", this.name);
	}

	@Override
	public String toString() {
		return "오리의 이름은 "+this.name+" 입니다.";
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}

class Sparrow implements Bird{

	String name;
	int legs;
	int length;

	@Override
	public void fly() {
		System.out.printf("참새(%s)가 날아다닙니다.\n", this.name);
	}

	@Override
	public void sing() {
		System.out.printf("참새(%s)가 소리내어 웁니다.\n", this.name);
	}

	@Override
	public String toString() {
		return "참새의 이름은 "+this.name+" 입니다.";
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}


public class BirdPlay {

	public static void main(String s[]){
		Duck duck = new Duck();
		duck.setName("꽥꽥이");
		duck.fly();
		duck.sing();
		System.out.println(duck.toString());

		Sparrow sparrow = new Sparrow();
		sparrow.setName("짹짹");
		sparrow.fly();
		sparrow.sing();
		System.out.println(sparrow.toString());


	}


}
