package com.example.sercive.Impl;

import com.example.entity.Dept;
import com.example.mapper.DeptMapper;
import com.example.sercive.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/6 22:56
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}



