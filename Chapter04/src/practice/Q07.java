package practice;

public class Q07 {

    public static void main(String[] args) {
        //문자열이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 작성하시오.
        String str = "12345"; // sum = 15;
        int sum = 0;

        for(int i=0; i<str.length(); i++) {
            sum = sum + (str.charAt(i) - 48);
        }
        System.out.println("sum = " + sum);
    }
}