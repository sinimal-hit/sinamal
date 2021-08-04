package org.example.controller;

import org.example.model.Dorm;
import org.example.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dorm")
public class DormController {

    @Autowired
    private DormService dormService;

    //根据宿舍楼id查询寝室列表数据字典项
    @GetMapping("/queryAsDict")
    public Object queryAsDict(@RequestParam("dictionaryKey") String buildingId){
        List<Dorm> list = dormService.queryAsDict(buildingId);
        return list;
    }

    @GetMapping("/query")
    public Object query(Dorm dorm){
        List<Dorm> list = dormService.query(dorm);
        return list;
    }

    @PostMapping("/add")
    public Object add(@RequestBody Dorm dorm){
        int n = dormService.add(dorm);
        return null;
    }

    //修改时，根据id查询详情
    @GetMapping("/queryById")
    public Object queryById(Integer id){
        Dorm d = dormService.queryById(id);
        return d;
    }

    @PostMapping("/update")
    public Object update(@RequestBody Dorm dorm){
        int n = dormService.update(dorm);
        return null;
    }

    @GetMapping("/delete")
    public Object delete(@RequestParam List<Integer> ids){
        int n = dormService.delete(ids);
        return null;
    }
}
