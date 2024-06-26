package day2;

public class Car {//템플릿 클래스

    /*멤버변수*/
    private String model;
    private long distance;
    private int price;

    public String company;
    public char type;
    public boolean auto;
    public int year;
    public double gasmi;

    /*동작 메소드*/
    //단축키 : alt + ins

    public String getModel() {
        return model;
    }

    public long getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
