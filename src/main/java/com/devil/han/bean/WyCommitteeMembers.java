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
 * 业委会成员
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyCommitteeMembers implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 成员代码
     */
    private String memberCode;

    /**
     * 成员姓名
     */
    private String memberName;

    /**
     * 职务
     */
    private String memberDuty;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    /**
     * 性别
     */
    private String gender;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 工作单位
     */
    private String workPlace;

    /**
     * 个人简介
     */
    private String selfIntroduce;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
