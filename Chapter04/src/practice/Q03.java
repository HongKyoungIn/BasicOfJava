package practice;

public class Q03 {

    public static void main(String[] args) {
        // 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+10)의 결과를 계산하시오.
        int sum = 0;

        for(int i=1; i<=10; i++) {
            for(int j=1; j<=i; j++) {
                sum = sum + j;
            }
        }
        System.out.println("sum = " + sum);

        // 문제집 해설
        int sum2 = 0;
        int totalSum = 0;
        for(int i=1; i <=10; i++) {
            sum2 += i;
            totalSum += sum2;
        }
        System.out.println("totalSum = "+totalSum);

    }

}