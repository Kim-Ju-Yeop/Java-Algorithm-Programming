package ch3.example;

class Id {
    private static int counter = 0; // 클래스 변수
    private int id; // 인스턴스 변수

    public Id(){id = ++counter;}

    public int getId(){return id;}

    public static int getCounter(){return counter;}
}

public class IdTester{
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 아이디 : " + a.getId()); // 1
        System.out.println("b의 아이디 : " + b.getId()); // 2

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter()); // 2
    }
}
