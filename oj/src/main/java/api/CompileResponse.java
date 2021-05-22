package api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompileResponse {
    private int error;
    private String reason;
    private String stdout;
}
