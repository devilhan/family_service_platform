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
 * 租赁合同
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentContract implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 合同编号
     */
    private String contractId;

    /**
     * 签订日期
     */
    private LocalDateTime signDate;

    /**
     * 生效日期
     */
    private LocalDateTime startDate;

    /**
     * 终止日期
     */
    private LocalDateTime stopDate;

    /**
     * 所属租户id
     */
    private Integer rentId;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 起租日期
     */
    private LocalDateTime startRentDate;

    /**
     * 停租日期
     */
    private LocalDateTime stopRentDate;

    /**
     * 合同租金金额
     */
    private Double contractRentMoney;

    /**
     * 收费面积
     */
    private Double receiveArea;

    /**
     * 合同状态
     */
    private String contractStatus;

    /**
     * 保证金
     */
    private Double ensureMoney;

    /**
     * 保证金说明
     */
    private String ensureMoneyDesc;

    /**
     * 合同附件
     */
    private String contractAttach;

    /**
     * 租期
     */
    private Integer rentDays;

    /**
     * 管理费
     */
    private Double adminMoney;

    /**
     * 是否收取租金
     */
    private String isRentMoney;

    /**
     * 缴纳方式
     */
    private Long payMethod;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 招商人员id
     */
    private String attractPersonId;

    /**
     * 招商人员姓名
     */
    private String attractPersonName;

    /**
     * 所属公司
     */
    private String company;


}
