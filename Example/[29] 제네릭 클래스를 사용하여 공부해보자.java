package ch3.example;

public class GenericClassTester {

    static class GenericClass<T>{
        private T xyz;

        public GenericClass(T xyz) {
            this.xyz = xyz;
        }
        T getXyz(){
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
