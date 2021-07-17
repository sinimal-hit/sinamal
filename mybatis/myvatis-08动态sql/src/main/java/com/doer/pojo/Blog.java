package com.doer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private String  id;
    private String title;
    private String author;
    private Date createTime; //属性名和字段名不一致
    private int views;
}
