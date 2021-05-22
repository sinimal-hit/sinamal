package util;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

public class HttpUtil {
    public static String readBody(HttpServletRequest req){
        int contentLength = req.getContentLength();
        byte[] bytes = new byte[contentLength];
        InputStream inputStream = null;
        try {
             inputStream = req.getInputStream();
             inputStream.read(bytes,0,contentLength);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new String(bytes);
    }
}
