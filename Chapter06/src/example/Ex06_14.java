package example;

public class Ex06_14 {
    static { // 클래스 초기화 블럭
        System.out.println("static {} ");
    }

    { // 인스턴스 초기화 블럭
        System.out.println("{}");
    }
    public Ex06_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
       System.out.println("Ex06_14 bt = new Ex06_14();");
       Ex06_14 bt = new Ex06_14();

       System.out.println("Ex06_14 bt2 = new Ex06_14();");
       Ex06_14 bt2 = new Ex06_14();
    }
}