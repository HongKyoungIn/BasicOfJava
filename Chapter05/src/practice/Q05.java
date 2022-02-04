package practice;

public class Q05 { //1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어 내는 프로그램이다.

    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];

        //배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
        for(int i=0; i<ballArr.length; i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;

            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        //ballArr가 제대로 섞였는지 확인한다.
        for(int i=0; i<ballArr.length; i++) {
            System.out.print(ballArr[i]);
        }
        System.out.println();

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
        for(int i=0; i<ball3.length; i++) {
            ball3[i] = ballArr[i];
        }

		/*
		책에서 나온 풀이.
		System.arraycopy(ballArr,0, ball3,0,3);
		*/

        for(int i=0; i<ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}