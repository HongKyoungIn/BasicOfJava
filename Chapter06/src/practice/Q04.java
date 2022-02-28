package practice;

public class Q04 { // 두 점(x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x, int y, int x1, int y1) {
        double x_distance = Math.abs(x - x1);
        double y_distance = Math.abs(y - y1);

        double dot_distacne = Math.sqrt((x_distance * x_distance) + (y_distance * y_distance));

        return dot_distacne;
    }

    /* 해설지 풀이
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
    }
    */

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}

