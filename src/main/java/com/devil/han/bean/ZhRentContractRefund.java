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
 * 租赁合同退款
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentContractRefund implements Serializable {

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
     * 退款日期
     */
    private LocalDateTime refundTime;

    /**
     * 退款金额
     */
    private Double refundMoney;

    /**
     * 退款状态
     */
    private String refundStatus;

    /**
     * 退款说明
     */
    private String refundDesc;

    /**
     * 操作人id
     */
    private String operateId;

    /**
     * 操作人名称
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;

    /**
     * 作废人id
     */
    private String invalidId;

    /**
     * 作废人名称
     */
    private String invalidPerson;

    /**
     * 作废原因
     */
    private LocalDateTime invalidReason;

    /**
     * 作废时间
     */
    private String invalidDate;


}
