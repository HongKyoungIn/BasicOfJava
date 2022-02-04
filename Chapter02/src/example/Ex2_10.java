package example;

class Ex2_10 { // 두 변수의 값 바꾸기

	public static void main(String[] args) {
		int x = 10;
		int y = 5;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		float f = 340000000000000000.0f;
		System.out.println(f);
	}
}