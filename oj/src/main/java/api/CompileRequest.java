package api;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompileRequest {
    private int id;
    private String code;
}
