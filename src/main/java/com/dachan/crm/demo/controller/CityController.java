package com.dachan.crm.demo.controller;

import com.dachan.crm.demo.mybatis.entity.City;
import com.dachan.crm.demo.mybatis.service.CityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")

public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(@Param("id") Integer id){
        City city = cityService.selectByPrimaryKey(id);
        return city.toString();
    }

    @RequestMapping(value="/add",method= RequestMethod.POST)
    public int addCity(City city){
        //System.out.println(city.toString());

        return cityService.insert(city);
    }


}
