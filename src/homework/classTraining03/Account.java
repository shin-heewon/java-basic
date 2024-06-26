package homework.classTraining03;

public class Account {
    private String accNo;
    private int balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void save(int balance) {
        this.balance += balance;
        System.out.println(this.accNo+"계좌에 "+balance+"만원이 입금되었습니다.");
    }

    public void deposit(int balance) {
        this.balance -= balance;
        System.out.println(this.accNo+"계좌에 "+balance+"만원이 출금되었습니다.");
    }


}
