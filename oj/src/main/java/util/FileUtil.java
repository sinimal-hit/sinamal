package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件工具类,主要进行读取文件内容并且输出到指定文件路径当中
 */
public class FileUtil {
    //从指定的文件当中一次把所有的内容读取出来
    public static String readFile(String filePath){
        //将文件读取的内容返回存储到一个字符串当中
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            while (true){
                try {
                    int ch = fis.read();
                    if(ch == -1){
                        break;
                    }
                    stringBuilder.append((char)ch);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }
    //把content中的内容一次写入filePath文件当中
    public static void writeFile(String filePath,String content){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filePath);
            fos.write(content.getBytes());
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
