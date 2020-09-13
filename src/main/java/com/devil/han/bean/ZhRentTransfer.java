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
 * 租户转兑
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ZhRentTransfer implements Serializable {

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
     * 转出租户id
     */
    private Integer transferOutId;

    /**
     * 转出租户名称
     */
    private String transferOutName;

    /**
     * 转入租户id
     */
    private Integer transferInId;

    /**
     * 转入租户名称
     */
    private String transferInName;

    /**
     * 更名费
     */
    private Double changeNameMoney;

    /**
     * 转兑说明
     */
    private String transferDesc;

    /**
     * 转兑时间
     */
    private LocalDateTime transferDate;

    /**
     * 操作人
     */
    private String operatePerson;

    /**
     * 操作时间
     */
    private LocalDateTime operateDate;


}
