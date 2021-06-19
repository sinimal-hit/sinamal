package com.doer.di;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;//学生卡
    private Set<String> game;
    private Properties info;
    private String wife;


}
