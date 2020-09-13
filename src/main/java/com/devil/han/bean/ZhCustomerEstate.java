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
 * 业主房产对照表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhCustomerEstate implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 业主id
     */
    private Integer customerId;

    /**
     * 业主姓名
     */
    private String customerName;

    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 使用状态
     */
    private String useStatus;

    /**
     * 入住日期
     */
    private LocalDateTime liveDate;

    /**
     * 装修时间
     */
    private LocalDateTime decorateDate;

    /**
     * 认购证号
     */
    private String subscriptionCardNumber;

    /**
     * 房产证号
     */
    private String houseCode;

    /**
     * 是否缴纳维修金
     */
    private String isPayDecorateMoney;

    /**
     * 预缴维修金
     */
    private Double prePayDecorateMoney;

    /**
     * 备注
     */
    private String remark;

    /**
     * 排序号
     */
    private Integer orderid;


}
