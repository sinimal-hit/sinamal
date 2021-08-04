package org.example.controller;

import org.example.model.DictionaryTag;
import org.example.service.DictionaryTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dict/tag")
public class DictionaryTagController {
    @Autowired
    private DictionaryTagService dictionaryTagService;

    //根据数据字典key查询数据字典标签项
    @GetMapping("/query")
    public Object query(String dictionaryKey){
        List<DictionaryTag> list = dictionaryTagService.query(dictionaryKey);
        return list;
    }
}
