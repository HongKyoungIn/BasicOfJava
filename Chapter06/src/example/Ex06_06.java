package example;

class Data { int x; }

class Ex6_06 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        int y = 20;
        System.out.println("main() : x = " + d.x);
        System.out.println("main() : y = " + y);

        change(d.x);
        change(y);
        System.out.println("After change(d.x)");
        System.out.println("After change(y)");

        System.out.println("main() : x = " + d.x);
        System.out.println("main() : y = " + y);
    }

    static void change(int x) {  // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
