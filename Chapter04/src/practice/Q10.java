package practice;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // 숫자 맞히기 게임.
        // 1~100까지 입력 시 컴퓨터의 랜덤한 값을 맞추기.
        // 시도횟수 출력하기

        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100 사이의 값을 입력하시오 > ");
            input = scanner.nextInt();

            if(input < answer) {
                System.out.println("더 큰 수를 입력해주세요.");
            }
            else if(input > answer) {
                System.out.println("더 작은 수를 입력해주세요.");
            }
            else {
                System.out.println("정답입니다!");
                System.out.printf("시도 횟수는 %d번 입니다." , count);
                break;
            }
        }
        while(true);
    }
}