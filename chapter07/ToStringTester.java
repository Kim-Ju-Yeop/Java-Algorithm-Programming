package ch7;

class A {

}

class B {
    int x;

    public B(int x){
        this.x = x;
    }

    public String toString(){
        return "B[" + x + "]";
    }
}

public class ToStringTester {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        B b1 = new B(18);
        B b2 = new B(55);

        System.out.println("a1 = " + a1.toString()); // Object 클래스 toString 매서드 호출
        System.out.println("a2 = " + a2); // a2 변수 입력 시 Object 클래스 toString 매서드 호출

        System.out.println("b1 = " + b1.toString()); // B 클래스 toString 매서드 호출
        System.out.println("b2 = " + b2); // b2 변수 입력 시 B 클래스 toString 매서드 호출
    }
}
