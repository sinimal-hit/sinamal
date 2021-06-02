package compile;

import javafx.concurrent.Worker;
import util.FileUtil;
import util.TimeMemoryUtil;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Task 表示整个代码程序的编译与运行 并将结果Answer返回
 */
public class Task {
    /**
     * WORK_DIR: 临时文件存放的目录
     * CLASS:预编译执行的类的名字
     * CODE:要编译执行的文件名,文件后缀是.java
     * STDOUT:程序标准输出放置的文件
     * STDERR:程序标准错误放置的文件
     * COMPILE_ERROR:程序编译阶段出错,详细信息放置的文件
     */
    private String WORK_DIR;
    private String CLASS = "Solution";
    private String CODE;
    private String STDOUT;
    private String STDERR;
    private String COMPILE_ERROR;
    public Task(){
        WORK_DIR = "./tmp/" + UUID.randomUUID().toString() + "/";
        CODE = WORK_DIR + CLASS + ".java";
        STDOUT = WORK_DIR + "stdout.txt";
        STDERR = WORK_DIR + "stderr.txt";
        COMPILE_ERROR = WORK_DIR + "compile_error.txt";
    }

    /**
     *
     * @param question : 用户提交的代码,
     * @return 如果代码通过测试用例,error返回 0,表示编译运行成功,
     *          error 1 表示编译错误, reason包含错误信息
     *          error 2 表示运行出错, reason包含错误信息
     */
    public Answer compileAndRun(Question question) throws IOException, InterruptedException {
        /**
         * 1. 先要准备好需要用到的临时文件
         *      要编译的源代码的文件
         *      编译出错要放进一个文件
         *      最终运行的标准输出标准错误也要分别放到文件中
         * 2. 构造编译指令(javac), 并进行执行. 预期得到的结果
         *      就是一个对应的 .class 文件, 以及编译出错的文件
         * 3. 构造运行指令(java), 并进行执行. 预期得到的结果
         *       就是这个代码的标准输出的文件和标准错误的文件
         * 4. 把最终结果构造成 Answer 对象, 并返回
         */
        //先要准备好需要用到的临时文件
        Answer answer = new Answer();
        File file = new File(WORK_DIR);
        if(!file.exists()){
            file.mkdirs();
        }

        /**
         * 编译阶段:
         *      需要将question的code 写入到指定的java文件当中,也就是CODE文件, 例如:"./tmp/Solution.java
         *      将CODE文件执行编译命令,将编译错误,以及编译的标准输出和标准错误分别放入不同的文件
         */

        //1.将用户的代码片段写入CODE文件当中,
        FileUtil.writeFile(CODE,question.getCode());
        //TimeMemoryUtil.start();//记录开始的时间和JVM编译运行前内存
        //2.设置编译的路径
        //javac -encoding utf-8 ./tmp/Solution.java -d ./tmp/ -d参数表示生成class文件的路径
        String compileCmd = String.format("javac -encoding utf-8 %s -d %s",CODE,WORK_DIR);
        System.out.println("编译命令" + compileCmd);

        //3.执行编译命令 此阶段无标准输出,只有标准错误,标准错误中就包含了错误信息
        CommandUtil.run(compileCmd,null,COMPILE_ERROR);

        //4.判断读取错误信息,如果没有错误信息,表示编译成功,进入运行阶段
        String compileError = FileUtil.readFile(COMPILE_ERROR);
        if(!compileError.equals("")){
            answer.setErrno(1);
            answer.setReason(compileError);//编译出错,将错误信息返回给用户
            return answer;
        }

        /**
         * 运行阶段,
         */
        // 通过 -classpath 选项来执行.class文件的路径
        String runCmd = String.format("java -classpath %s %s",WORK_DIR,CLASS);
        CommandUtil.run(runCmd,STDOUT,STDERR);

        String runError = FileUtil.readFile(STDERR);
        if(!runError.equals("")){
            answer.setErrno(2);
            answer.setReason(runError);
            return answer;
        }


        //编译阶段和运行阶段没有出错,返回结果
        answer.setErrno(0);
        String stdout = FileUtil.readFile(STDOUT);
        //String timeMemory = TimeMemoryUtil.end();
        answer.setStdout(stdout);
        //answer.setTimeMemory(timeMemory);
        return answer;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Task task = new Task();
        Question question = new Question();
        question.setCode("public class Solution {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"hello\");\n" +
                "    }\n" +
                "}");
        Answer answer = task.compileAndRun(question);
        System.out.println(answer);
    }
}
