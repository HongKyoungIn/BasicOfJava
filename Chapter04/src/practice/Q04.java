package practice;

public class Q04 {

    public static void main(String[] args) {
        // 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해 나갔을 때, 몇 까지 더해야 총 합이 100이상이 되는지
        // 구하시오.

        int sum = 0;
        int num = 0;

        while (sum < 100) {
            num++;

            if (num % 2 == 0) {
                sum = sum - num;
            } else {
                sum = sum + num;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("num = " + num);

        // 문제집 해설
        int sum2 = 0; 			// 총합을 저장할 변수
        int s = 1; 				// 값의 부호를 바꿔주는데 사용할 변수
        int num2 = 0;
        // true . 조건식의 값이 이므로 무한반복문이 된다
        for (int i = 1; true; i++, s = -s) { // s 1, -1, 1, -1... 매 반복마다 의 값은
            num2 = s * i; // i (s) . 와 부호 를 곱해서 더할 값을 구한다
            sum2 += num2;
            if (sum2 >= 100) // 100 . 총합이 보다 같거나 크면 반복문을 빠져 나간다
                break;
        }
        System.out.println("num2 =" + num2);
        System.out.println("sum2 =" + sum2);
    } // main
}