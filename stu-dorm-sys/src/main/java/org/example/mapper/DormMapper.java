package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.base.BaseMapper;
import org.example.model.Dorm;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DormMapper extends BaseMapper<Dorm> {
    List<Dorm> queryAsDict(String buildingId);

    List<Dorm> query(Dorm dorm);

    Dorm queryById(Integer id);
}