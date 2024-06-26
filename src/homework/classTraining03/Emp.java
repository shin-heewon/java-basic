package homework.classTraining03;

public class Emp {
  private String id;
  private String name;
  private int baseSalary;
  private double bonus;
  private double salary;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public double getSalary(double bonus){
    salary = (double)baseSalary + baseSalary * bonus ;

    return salary;
  }

  public String toString(){
    return this.name+"사원의 기본급은 "+this.baseSalary+"입니다.";
  }

}
