package practice;

public class Q03 {
    public static void main(String[] args) {
        Student03 s = new Student03();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
    }
}

class Student03 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        int total = this.kor + this.eng + this.math;
        return total;
    }

    double getAverage(){
        return getTotal() / 3.0;
    }
}
