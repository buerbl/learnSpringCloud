package com.example.mapper;

import com.example.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2020/2/6 20:24
 */
@Mapper
public interface DeptMapper {
    List<Dept> list();
}



