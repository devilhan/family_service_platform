package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 单位名录
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblCompanyRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司地址
     */
    private String companyAdd;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 公司级别
     */
    private String compantGrade;

    /**
     * 上级部门
     */
    private String parentCompany;

    /**
     * 负责人
     */
    private String leader;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 公司电话
     */
    private String companyPhone;

    /**
     * 传真号码
     */
    private String faxNumber;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 简单介绍
     */
    private String simpleDesc;

    /**
     * 备注
     */
    private String remark;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private LocalDateTime inputTime;


}
