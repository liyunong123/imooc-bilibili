package com.imooc.bilibili.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface DemoDao {
    public Long query(Long id);
}
