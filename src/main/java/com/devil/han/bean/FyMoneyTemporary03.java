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
 * 费用临时表3
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyMoneyTemporary03 implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 费项编码
     */
    private Integer moneySettingCode;

    /**
     * 档案名称
     */
    private String recordName;

    /**
     * 档案备注
     */
    private String recordRemark;

    /**
     * 公表名称
     */
    private String publicBoxName;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 分摊户数
     */
    private Double shareNumber;

    /**
     * 上次读数
     */
    private Double lastReadNumber;

    /**
     * 本次读数
     */
    private Double currentReadNumber;

    /**
     * 本次用量
     */
    private Double currentUseNumber;

    /**
     * 应缴费用
     */
    private Double shouldPay;

    /**
     * 上次费用止期
     */
    private LocalDateTime lastPayStopDate;

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
     * 收费周期
     */
    private Integer receiveCycle;

    /**
     * 操作人编码
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


}
