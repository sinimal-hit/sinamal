package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.base.BaseEntity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 学生表
 */
@Getter
@Setter
@ToString
public class Student extends BaseEntity implements Serializable {

    private static final Long serialVersionUID = 1L;
    private Integer id;

    /**
     * 姓名
     */
    private String studentName;

    /**
     * 毕业年份，数据字典000001
     */
    private String studentGraduateYear;

    /**
     * 专业，数据字典000002
     */
    private String studentMajor;

    /**
     * 邮箱
     */
    private String studentEmail;

    /**
     * 宿舍id
     */
    private Integer dormId;

    /**
     * 创建时间
     */
    private Date createTime;




    /**
     * 自定义字段
     */
    private Integer buildingId;
    private String buildingName;
    private String dormNo;
    private List<Integer> ids;//分配学生宿舍时，标识多个学生id
}