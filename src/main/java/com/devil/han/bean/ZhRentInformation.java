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
 * 租户信息
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentInformation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 租户编码
     */
    private String rentCode;

    /**
     * 租户名称
     */
    private String rentName;

    /**
     * 法定代表
     */
    private String memberOfRight;

    /**
     * 租户类型
     */
    private Long rentType;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String homeNumber;

    /**
     * 手机
     */
    private String phoneNumber;

    /**
     * 地址
     */
    private String addr;

    /**
     * 证件类型
     */
    private Long certificateType;

    /**
     * 主营商品
     */
    private Long mainSale;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 照片地址
     */
    private String pictureUrl;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 登陆密码
     */
    private String pwd;

    /**
     * 租户附件
     */
    private String rentAttach;


}
