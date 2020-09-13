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
 * 作废单主单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyInvalidMain implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 作废单号
     */
    @TableId(value = "invalid_id", type = IdType.AUTO)
    private String invalidId;

    /**
     * 所属收款单号
     */
    private String receiveId;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 收费日期
     */
    private LocalDateTime receiveDate;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 费用金额
     */
    private Double money;

    /**
     * 实收金额
     */
    private Double realReceiveMoney;

    /**
     * 优惠金额
     */
    private Double discountMoney;

    /**
     * 收款方式
     */
    private String receiveMethod;

    /**
     * 是否业主
     */
    private String isCustomer;

    /**
     * 收费金额
     */
    private Double receiveMoney;

    /**
     * 费项id
     */
    private Long moneyId;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 本次欠缴
     */
    private Double currentDelayMoney;

    /**
     * 上次欠缴
     */
    private Double lastDelayMoney;

    /**
     * 作废类型
     */
    private String invalidType;

    /**
     * 收据号
     */
    private String receiptNumber;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 收款人
     */
    private String receivePerson;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 作废原因
     */
    private String invalidReason;

    /**
     * 作废时间
     */
    private LocalDateTime invalidDate;

    /**
     * 作废人
     */
    private String invalidPerson;


}
