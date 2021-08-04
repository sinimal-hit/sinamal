package org.example.service;

import com.github.pagehelper.PageHelper;
import org.example.mapper.DormMapper;
import org.example.model.Dorm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormService {
    @Autowired
    private DormMapper dormMapper;

    public List<Dorm> queryAsDict(String buildingId) {
        return dormMapper.queryAsDict(buildingId);
    }

    public List<Dorm> query(Dorm dorm) {
        PageHelper.startPage(dorm);
        return dormMapper.query(dorm);
    }

    public int add(Dorm dorm) {
        return dormMapper.insertSelective(dorm);
    }

    public int update(Dorm dorm) {
        return dormMapper.updateByPrimaryKeySelective(dorm);
    }

    public Dorm queryById(Integer id) {
        return dormMapper.queryById(id);
    }

    public int delete(List<Integer> ids) {
        return dormMapper.deleteByIds(ids);
    }
}
