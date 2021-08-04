package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 宿舍楼
 */
@Getter
@Setter
@ToString
public class Building extends DictionaryTag {
    
    private Integer id;

    /**
     * 名称
     */
    private String buildingName;

    /**
     * 描述
     */
    private String buildingDesc;

    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 自定义字段
     */
    private Integer dormCount;
}