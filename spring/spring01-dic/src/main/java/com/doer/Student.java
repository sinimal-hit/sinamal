package com.doer;

import com.doer.Address;
import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


@Data
public class Student {
    private String name;//

    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String,String> card;//学生卡
    private Set<String> game;

    public Student() {

    }

    public Student(String name, Address address, String[] books, List<String> hobbys, Map<String, String> card, Set<String> game) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.hobbys = hobbys;
        this.card = card;
        this.game = game;
    }
}
