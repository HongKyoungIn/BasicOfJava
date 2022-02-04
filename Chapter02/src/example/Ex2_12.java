package example;

import java.util.*;

class Ex2_12 { // Scanner 예제

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("두자리 정수를 하나 입력해주세요 : ");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		//int num = scanner.nextInt();
		// 위 2줄을 한줄로 나타낼 수 있다.

		System.out.println("입력 내용 : " + input);
		System.out.printf("num = %d%n", num);
	}
}