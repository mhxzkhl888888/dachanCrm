package com.dachan.crm.demo.mybatis.mapper;
import com.dachan.crm.demo.mybatis.entity.City;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by dachen on 2019/4/9.
 */
@Mapper
public interface CityMapper {

    public City selectByPrimaryKey(Integer id);
    public int insert(City record);

    public int insertSelective(City record);

}
