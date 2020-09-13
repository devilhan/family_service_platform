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
 * 来访管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyVisitManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 来访时间
     */
    private LocalDateTime visitDate;

    /**
     * 离开时间
     */
    private LocalDateTime leaveDate;

    /**
     * 来访人
     */
    private String visitPerson;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 来访人住址
     */
    private String visitAddr;

    /**
     * 来访事由
     */
    private String visitReason;

    /**
     * 被访人
     */
    private String visitedPerson;

    /**
     * 所住地址
     */
    private String visitedReason;

    /**
     * 值班人
     */
    private String agent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
