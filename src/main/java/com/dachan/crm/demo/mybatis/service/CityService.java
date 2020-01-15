package com.dachan.crm.demo.mybatis.service;

import com.dachan.crm.demo.mybatis.entity.City;

public interface CityService {
    public City selectByPrimaryKey(Integer id);
    public int insert(City record);

    public int insertSelective(City record);
}
