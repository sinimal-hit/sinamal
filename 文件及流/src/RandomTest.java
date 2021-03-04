import java.io.File;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        File dir = new File("D:\\CloudMusic");
        File[] fileNames = dir.listFiles();
        if (fileNames == null) throw new AssertionError();
        System.out.println(fileNames[1]);
        String[] dirName = new String[fileNames.length];
        for (int i = 0; i < fileNames.length; i++) {
            dirName[i] =String.valueOf(fileNames[i]);
        }
        Random random = new Random();
        for (int i = 0; i < fileNames.length; i++) {
            int num = random.nextInt(3);
            dirName[i] = dirName[num];
            dirName[Integer.parseInt(dirName[i])] = String.valueOf(fileNames[i]);
        }

        //assert fileNames != null;
//        String[] filename = new String[fileNames.length];
//        int [] arr = new int[fileNames.length];
//        for (int i = 0; i < filename.length; i++) {
//            Random random = new Random();
//
//
//        }

    }
}
