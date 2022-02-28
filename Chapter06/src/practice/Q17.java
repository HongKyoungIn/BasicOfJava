package practice;

public class Q17 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(original));
    }

    private static int[] shuffle(int[] original) {
        int tmp = 0;
        int num = 0;

        for(int i=0; i<original.length; i++) {
            num = (int) ((Math.random() * 10)-1);
            tmp = original[i];
            original[i] = original[num];
            original[num] = tmp;
        }

        return original;
    }
}

