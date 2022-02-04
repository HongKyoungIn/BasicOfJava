package practice;

public class Practice3_04 {
    public static void main(String[] args) {
        int numOfApples = 121;
        int sizeOfBucket = 11;
        int numOfBucket = (int) Math.ceil((double)numOfApples/sizeOfBucket);
        int numOfBucket2 = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0) ; //책에 나온 정답

        System.out.println("필요한 바구니의 수 = : " + numOfBucket);
        System.out.println("필요한 바구니의 수 = : " + numOfBucket2);
    }
}