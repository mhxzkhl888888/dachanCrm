package com.dachan.crm.demo.mybatis.service.impl;

import com.dachan.crm.demo.mybatis.entity.City;
import com.dachan.crm.demo.mybatis.mapper.CityMapper;
import com.dachan.crm.demo.mybatis.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);

    }

    @Override
    public int insert(City record) {
        return cityMapper.insert(record);

    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }
}
