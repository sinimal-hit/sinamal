import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30);
        }
        for (int i :arr
             ) {
            System.out.println(i);
        }
    }
}
