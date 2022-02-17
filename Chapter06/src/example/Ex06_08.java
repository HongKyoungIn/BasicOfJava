package example;

class Data3 {
    int x;
}

public class Ex06_08 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy (Data3 c) {
        Data3 tmp = new Data3();

        tmp.x = c.x;

        return tmp;
    }
}