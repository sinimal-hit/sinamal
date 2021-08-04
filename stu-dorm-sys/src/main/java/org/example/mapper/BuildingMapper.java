package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;
import org.example.model.Building;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BuildingMapper extends BaseMapper<Building> {
    List<Building> queryAsDict();

    List<Building> query(Building building);
}