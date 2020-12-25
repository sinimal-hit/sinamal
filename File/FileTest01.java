package File;

import java.io.File;
import java.io.IOException;

/*
File
    1、File类和四大家族没关系，所以File类不能完成文件的读写
    2、File对象代表文件和目录名称的抽象表示形式
    3、一个File对象可能对应的时目录，也可能是文件
    File只是一个路径名的抽象表示形式
    4、需要掌握File类中的常用方法
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\file");

        //判定该文件存在不存在
        System.out.println(f1.exists());//false  不存在该文件

        //如果D：\file 不存在，则以文件的形式创建出来
        /* if(!f1.exists()){
            //以文件形式创建
            f1.createNewFile();
        }
        */
        //如果D：\file 不存在，则以目录的形式创建出来
        if(!f1.exists()){
            //以目录的方式创建
            f1.mkdir();
        }


        //以多重目录创建
        File f2 = new File("D:\\a\\b\\c\\d\\hg");
        if(!f2.exists()){
            f2.mkdirs();
        }

        //获得文件的父路径
        File f3 = new File("D:\\IDEA\\文件及流\\src\\File\\FileTest01");
        String parentPath = f3.getParent();
        System.out.println(parentPath);
    }
}
