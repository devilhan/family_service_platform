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
 * 作废单子单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyInvalidSub implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 作废明细单号
     */
    @TableId(value = "invalid_detail_id", type = IdType.AUTO)
    private String invalidDetailId;

    /**
     * 所属作废单号
     */
    private String invalidId;

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
     * 减免金额
     */
    private Double derateMoney;

    /**
     * 费项id
     */
    private Integer moneyId;

    /**
     * 滞纳金减免金额
     */
    private Double delayDerateMoney;

    /**
     * 楼层系数
     */
    private Double mopFloor;

    /**
     * 费用倍数
     */
    private Integer moneyMult;


}
