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
 * 业主成员
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCustomerMembers implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属业主编码
     */
    private Integer belongCustomerId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 出生日期
     */
    private LocalDateTime birdate;

    /**
     * 性别
     */
    private String gender;

    /**
     * 与业主关系
     */
    private String ration;

    /**
     * 证件类型
     */
    private String certificateType;

    /**
     * 证件号码
     */
    private String certificateNumber;

    /**
     * 学历
     */
    private String education;

    /**
     * 备注
     */
    private String remark;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 照片
     */
    private String picture;


}
