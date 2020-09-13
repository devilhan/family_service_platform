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
 * 公摊费用台账用户明细
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyShareUserDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户明细id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属台账编号
     */
    private Double standingBookId;

    /**
     * 所属房间编码
     */
    private Integer cellId;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 表编号
     */
    private String boxId;

    /**
     * 分摊金额
     */
    private Double shareMoney;

    /**
     * 本次分摊量
     */
    private Double currentShareNumber;

    /**
     * 本次费用起期
     */
    private LocalDateTime currentPayStartDate;

    /**
     * 本次费用止期
     */
    private LocalDateTime currentPayStopDate;

    /**
     * 本次缴费限期
     */
    private LocalDateTime currentPayLimitDate;

    /**
     * 收费标识
     */
    private String receiveIdentify;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 费用标识
     */
    private String costIdentify;

    /**
     * 收费单号
     */
    private String receiveId;

    /**
     * 退款次数
     */
    private Integer refundNumber;

    /**
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 减免金额
     */
    private Double derateMoney;

    /**
     * 应收金额
     */
    private Double shouldPay;

    /**
     * 作废次数
     */
    private Integer invalidNumber;

    /**
     * 减免滞纳金
     */
    private Double derateDelayMoney;


}
