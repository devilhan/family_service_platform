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
 * 车位租赁
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyCarSpaceRent implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 合同编号
     */
    private String constractId;

    /**
     * 所属车位编号
     */
    private String carSpaceId;

    /**
     * 租期开始日
     */
    private LocalDateTime rentStartDate;

    /**
     * 租期结束日
     */
    private LocalDateTime rentStopDate;

    /**
     * 承租月数
     */
    private Double rentMonth;

    /**
     * 使用人id
     */
    private Integer userId;

    /**
     * 使用人名称
     */
    private String userName;

    /**
     * 车牌号码
     */
    private String carLicenceId;

    /**
     * 停车证号
     */
    private String stopCarLicence;

    /**
     * 月租金
     */
    private Double rentPerMonth;

    /**
     * 月服务费
     */
    private Double serviceMoneyPerMonth;

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
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 中介费
     */
    private Double agentMoney;

    /**
     * 是否收取租金
     */
    private String isRentMoney;

    /**
     * 合同附件
     */
    private String contractAttach;

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


}
