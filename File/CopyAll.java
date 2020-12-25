package File;

import java.io.File;

/*
拷贝目录
 */
public class CopyAll {
    public static void main(String[] args) {
       //拷贝源
        File srcFile = new File("D:\\qq\\阶段学习课件\\C语言课件V3\\初级");
       //拷贝目标
        File destFile = new File("C:\\");
        //调用方法拷贝
        copyDir(srcFile,destFile);
    }
    public static void copyDir(File srcFile,File destFile) {
    //获取源下的子目录
    }
}

