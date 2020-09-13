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
 * 租金收取
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentReceive implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属合同编号
     */
    private Integer contractId;

    /**
     * 所属租户id
     */
    private Integer rentId;

    /**
     * 租户名称
     */
    private String rentName;

    /**
     * 租金开始日期
     */
    private LocalDateTime rentStartDate;

    /**
     * 租金截止日期
     */
    private LocalDateTime rentStopDate;

    /**
     * 租金金额
     */
    private Double rentMoney;

    /**
     * 说明
     */
    private String desc;

    /**
     * 收款人id
     */
    private String receiveId;

    /**
     * 收款人名称
     */
    private String receivePerson;

    /**
     * 收款时间
     */
    private LocalDateTime receiveDate;

    /**
     * 收取状态
     */
    private String receiveStatus;

    /**
     * 作废人id
     */
    private String invalidId;

    /**
     * 作废人名称
     */
    private String invalidPersonName;

    /**
     * 作废原因
     */
    private String invalidReason;

    /**
     * 作废时间
     */
    private LocalDateTime invalidDate;

    /**
     * 原收款方式
     */
    private String pastReceiveMethod;

    /**
     * 单据审核状态
     */
    private String receiptCheckStatus;

    /**
     * 单据审核人
     */
    private String receiptCheckPerson;

    /**
     * 单据审核时间
     */
    private LocalDateTime receiptCheckTime;

    /**
     * 单据审核意见
     */
    private String receiptCheckAdvice;


}
