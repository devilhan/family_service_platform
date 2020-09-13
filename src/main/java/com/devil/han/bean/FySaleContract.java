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
 * 销售合同
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FySaleContract implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 合同编号
     */
    @TableId(value = "sale_contract_id", type = IdType.AUTO)
    private String saleContractId;

    /**
     * 所属房间编号
     */
    private Integer cellId;

    /**
     * 合同金额
     */
    private Double contractMoney;

    /**
     * 合同日期
     */
    private LocalDateTime contractDate;

    /**
     * 付款方式
     */
    private String payMethod;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 固定电话
     */
    private String onlinePhone;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 合同附件
     */
    private String contractAttach;


}
