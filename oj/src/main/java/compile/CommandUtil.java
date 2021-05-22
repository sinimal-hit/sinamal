package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * CommandUtil类来实现javac,java等命令
 *      通过Runtime类来创建一个进程,当心的进程运行起来之后,获取新进程的输出结果,将该进程的输出结果重定向,将输出结果重新
 *      输出到新的文件当中,
 */
public class CommandUtil {
    /**
     *  该方法用于创建进程并且执行命令
     * @param cmd 表示执行的命令,例如javac,等等
     * @param stdoutFile  standardOutFile 指定标准输出到那个文件当中
     * @param stderrFile  standardErrFile 指定标准错误输出到那个文件当中
     * @return 等待新的进程结束,并获取退出码
     */
    public static int run(String cmd, String stdoutFile, String stderrFile) throws IOException, InterruptedException {
        /**
         * 通过Runtime.getRuntime()方法获取了一个Runtime类的实例，
         * 我们进入Runtime的源码可以看见，这是一个静态方法可以获取一个单例的Runtime实例
         * 源码:
         *      private static Runtime currentRuntime = new Runtime();
         *      public static Runtime getRuntime() {
         *         return currentRuntime;
         *      }
         */
        Process process = Runtime.getRuntime().exec(cmd);

        //对新进程的输出结果进行重定向
        if(stdoutFile != null){
            //获取输入
            InputStream inputStream = process.getInputStream();

            //将获取的进程获取的输出,输出到stdoutFile文件当中
            FileOutputStream fos = new FileOutputStream(stdoutFile);
            while(true){
                int ch = inputStream.read();
                if(ch == -1) break;
                fos.write(ch);
            }
            fos.close();
            inputStream.close();

        }
        //对标准错误进行重定向


        if(stderrFile != null){
            InputStream inputStream = process.getErrorStream();

            FileOutputStream fos = new FileOutputStream(stderrFile);
            while (true){
                int ch = inputStream.read();
                if(ch == -1) break;
                fos.write(ch);
            }
            inputStream.close();
            fos.close();
        }
        int exitCode = process.waitFor();
        return exitCode;

    }

    public static void main(String[] args) {
        try {
            int result = CommandUtil.run("javac","./stdoutFile","./stderrFile");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}