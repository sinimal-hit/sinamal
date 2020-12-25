package File;

import java.io.File;

/*
File中的listFile方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFile（）
        //获取当前目录下的所有子文件
        File f = new File("D:\\qq\\py课件");
        File[] files  = f.listFiles();
        //foreach
        for(File file : files){
            System.out.println(file.getName());
        }
    }
}
