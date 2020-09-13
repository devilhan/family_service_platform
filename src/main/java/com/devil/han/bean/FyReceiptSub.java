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
 * 收款单子单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyReceiptSub implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 收款明细单号
     */
    @TableId(value = "receipt_detail_id", type = IdType.AUTO)
    private Integer receiptDetailId;

    /**
     * 所属收款单号
     */
    private String receiptId;

    /**
     * 费项名称
     */
    private String moneySettingName;

    /**
     * 计费单价
     */
    private Double chargeUnit;

    /**
     * 上次读数
     */
    private Double lastReadNumber;

    /**
     * 本次读数
     */
    private Double currentReadNumber;

    /**
     * 实际用量
     */
    private Double realUsed;

    /**
     * 费用金额
     */
    private Double money;

    /**
     * 滞纳金
     */
    private Double delayMoney;

    /**
     * 滞纳金减免金额
     */
    private Double delayDerateMoney;

    /**
     * 本次应付
     */
    private Double currentShouldPay;

    /**
     * 超期天数
     */
    private Integer overDay;

    /**
     * 费用起期
     */
    private LocalDateTime moneyStartDate;

    /**
     * 费用止期
     */
    private LocalDateTime moneyStopDate;

    /**
     * 缴费限期
     */
    private LocalDateTime payLimitDay;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    /**
     * 记录人
     */
    private String inputPerson;

    /**
     * 所属台账id
     */
    private String standingBookId;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 费用减免金额
     */
    private Double derateMoney;

    /**
     * 费项id
     */
    private Integer moneyId;

    /**
     * 变更原因
     */
    private String updateReason;

    /**
     * 变更人id
     */
    private String updatePerson;

    /**
     * 变更时间
     */
    private LocalDateTime updateDate;

    /**
     * 费用倍数
     */
    private Integer moneyMult;


}
