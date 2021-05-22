package compile;

import lombok.Getter;
import lombok.Setter;

// 表示编译运行的输入
@Getter
@Setter
public class Question {
    // 表示要编译运行的源代码
    // 用户在网页上编辑的这段代码
    private String code;
}
