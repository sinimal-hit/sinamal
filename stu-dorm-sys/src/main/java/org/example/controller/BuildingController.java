package org.example.controller;

import org.example.model.Building;
import org.example.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    //查询宿舍楼数据字典项
    @GetMapping("/queryAsDict")
    public Object queryAsDict(){
        List<Building> list = buildingService.queryAsDict();
        return list;
    }

    //查询宿舍楼列表（分页）
    @GetMapping("/query")
    public Object query(Building building){
        List<Building> list = buildingService.query(building);
        return list;
    }

    //查询宿舍楼详情（点击修改按钮弹出窗初始化接口）
    @GetMapping("/queryById")
    public Object queryById(Integer id){
        Building b = buildingService.queryById(id);
        return b;
    }

    @PostMapping("/add")
    public Object add(@RequestBody Building b){
        int n = buildingService.add(b);
        return null;
    }

    @PostMapping("/update")
    public Object update(@RequestBody Building b){
        int n = buildingService.update(b);
        return null;
    }

    @GetMapping("/delete")
    public Object delete(@RequestParam List<Integer> ids){
        int n = buildingService.delete(ids);
        return null;
    }
}
