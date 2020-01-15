package com.dachan.crm.demo.mybatis.entity;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by dachan
 */
public class City implements Serializable {
    private Integer id;

    private Integer provinceId;

    private String cityName;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
    public String toString(){
        return "id="+id+"\nprovinceId="+getProvinceId()+"\ncityName="+getCityName()+"\ndescription="+getDescription();
    }
}
