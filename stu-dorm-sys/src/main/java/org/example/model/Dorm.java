package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 寝室
 */
@Getter
@Setter
@ToString
public class Dorm extends DictionaryTag {
    
    private Integer id;

    /**
     * 房号
     */
    private String dormNo;

    /**
     * 描述
     */
    private String dormDesc;

    /**
     * 宿舍楼id
     */
    private Integer buildingId;

    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 自定义字段
     */
    private String buildingName;
}