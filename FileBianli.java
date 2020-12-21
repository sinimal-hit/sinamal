import java.io.File;

public class FileBianli {
    public static void main(String[] args) {
        File file = new File("D:\\CloudMusic");
        if(file.exists()){
            String[] s = file.list();
            for (String temp:s) {
                System.out.println(temp);
            }
        }
        File[] s1 = file.listFiles();
        for (File i:s1) {
            if(i.isFile()){
                System.out.println("该文件是："+i.getAbsolutePath());
            }else {
                System.out.println("该目录是："+i.getName());
            }
        }
    }
}
