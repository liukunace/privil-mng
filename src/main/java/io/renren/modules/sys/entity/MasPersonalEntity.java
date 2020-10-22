package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: liukun
 * @create: 2020-08-04 22:45
 */

@Data
@TableName("personnel")
public class MasPersonalEntity implements Serializable {
    @TableId
    private Long id;

    private Long age;

    private String name;
    private String sex;
    private String number;
    private String type;
    private String type_work;
    private String identity;
    private String duty_department;
    private String duty_person;
    private String duty_phone;
    private String imei;
    private String project;


}
