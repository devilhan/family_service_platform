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
 * 收款单主单
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyReceiptMain implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 收款单号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

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
     * 应付合计
     */
    private Double shouldPayTotal;

    /**
     * 本次应收
     */
    private Double currentShouldReceive;

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
     * 本次实收
     */
    private Double currentRealReceive;

    /**
     * 临客费项id
     */
    private Long temporaryMoneyId;

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
     * 标题
     */
    private String title;

    /**
     * 收款类型
     */
    private String receiveType;

    /**
     * 收据号
     */
    private String receiptNumber;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 收款人
     */
    private String receivePerson;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 修改原因
     */
    private String updateReason;

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

    /**
     * 现金审核状态
     */
    private String moneyCheckStatus;

    /**
     * 现金审核人
     */
    private String moneyCheckPerson;

    /**
     * 现金审核时间
     */
    private LocalDateTime moneyCheckTime;

    /**
     * 现金审核意见
     */
    private String moneyCheckAdvice;


}
