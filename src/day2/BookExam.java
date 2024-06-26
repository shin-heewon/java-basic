package day2;

public class BookExam {
    public static void main(String[] args) {

        //Q1. 한 권의 책 ㅏ데이터를 저장하고 출력. Book 변수 참조하세요.
        Book book1 = new Book();

        book1.title = "자바프로그래밍";
        book1.price = 30000;
        book1.company = "한빛미디어";
        book1.author = "김자바";
        book1.totalpage = 1000;
        book1.isbn = "ISBN-111990011";
        book1.bookInfo();


        int price = book1.bookPrice();
        System.out.println("해당 도서의 원가는 " + price);
        book1.setBookPrice(33000);

        price = book1.bookPrice();
        System.out.println("해당 도서의 가격은 " + price);


        Book book2 = new Book();

        book2.title = "자바자바";
        book2.price = 5000;
        book2.company = "한빛미디어";
        book2.author = "김자바";
        book2.totalpage = 200;
        book2.isbn = "ISBN-111990011";




    }
}
