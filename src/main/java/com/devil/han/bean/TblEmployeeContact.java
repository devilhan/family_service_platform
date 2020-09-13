package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工通讯录
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblEmployeeContact implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 排序号
     */
    private Integer orderId;

    /**
     * 所属类别名称
     */
    private String categoryName;

    /**
     * 所属类别id
     */
    private String categoryId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 工号
     */
    private String workNum;

    /**
     * 部门
     */
    private String dept;

    /**
     * 角色
     */
    private String role;

    /**
     * 职位
     */
    private String position;

    /**
     * 性别
     */
    private String gender;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 办公电话
     */
    private String officePhone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 移动电话
     */
    private String movePhone;

    /**
     * 家庭电话
     */
    private String homePhone;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 微信号
     */
    private String wchat;

    /**
     * 内部即时通
     */
    private String innerMsn;

    /**
     * 地址
     */
    private String addr;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人id
     */
    private String createPersonId;

    /**
     * 创建人名称
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
