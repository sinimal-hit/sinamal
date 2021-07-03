package com.doer.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Data
public class User {
    @Value("朵儿")
    private String name;
}
