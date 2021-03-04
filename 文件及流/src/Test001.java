import java.io.File;
import java.util.Random;

public class Test001 {
    public static void main(String arg[]) {
        File file = new File("D:\\CloudMusic");
        File[] filename = file.listFiles();
        File[] musicUrl = { file };

        shuffle(musicUrl);
        for (File music : musicUrl) {
            System.out.println(music);
        }
    }

    public static void shuffle(File[] musicUrl) {
        int key;
        File temp;
        Random rand = new Random();

        for (int i = 0; i < musicUrl.length; i++) {
            key = rand.nextInt(musicUrl.length - 1);
            temp = musicUrl[i];
            musicUrl[i] = musicUrl[key];
            musicUrl[key] = temp;
        }
    }
}
