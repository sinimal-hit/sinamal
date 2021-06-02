package compile;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 编译运行的结果
@Setter
@Getter
@ToString
public class Answer {

    // 这里的字段就是最终要反馈给页面上的信息
    // 运行结果是否正确.
    // 0 表示编译运行 ok. 1 表示编译出错. 2 表示运行抛异常
    private int errno;
    // 如果出错了, 原因是什么.
    // errno 1 , reason 包含了编译错误的信息
    // errno 2 , reason 包含了异常的调用栈信息
    private String reason;
    // 程序的标准输出
    private String stdout;
    // 程序的标准错误
    private String stderr;
    //private String timeMemory;

}
