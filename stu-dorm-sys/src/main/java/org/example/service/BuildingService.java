package org.example.service;

import com.github.pagehelper.PageHelper;
import org.example.mapper.BuildingMapper;
import org.example.model.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    public List<Building> queryAsDict() {
        return buildingMapper.queryAsDict();
    }

    public List<Building> query(Building building) {
        PageHelper.startPage(building);
        return buildingMapper.query(building);
    }

    public Building queryById(Integer id) {
        return buildingMapper.selectByPrimaryKey(id);
    }

    public int add(Building b) {
        return buildingMapper.insertSelective(b);
    }

    public int update(Building b) {
        return buildingMapper.updateByPrimaryKeySelective(b);
    }

    public int delete(List<Integer> ids) {
        return buildingMapper.deleteByIds(ids);
    }
}
