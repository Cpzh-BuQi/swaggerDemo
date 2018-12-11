package com.luther.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Author: lvpeng
 * CreateTime: 2018/12/11 16:29
 * ProjectName: demo
 * PackageName: com.luther.demo.dto
 * TODO:
 */
@ApiModel(value = "测试对象", description = "传入的测试对象")
public class DemoDto implements Serializable {
    @ApiModelProperty(value = "姓名", name = "name", example = "Luther")
    private String name;

    @ApiModelProperty(value = "国籍", name = "country", example = "中国")
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
