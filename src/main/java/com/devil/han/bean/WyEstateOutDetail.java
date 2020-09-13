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
 * 楼盘经费支出明细
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyEstateOutDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 记账日期
     */
    private LocalDateTime chargeDate;

    /**
     * 所属楼盘id
     */
    private Integer estateId;

    /**
     * 支出主项目
     */
    private String outputMainProject;

    /**
     * 支出子项目
     */
    private Integer outputSubProject;

    /**
     * 支出金额
     */
    private Double outputMoney;

    /**
     * 年累计支出金额
     */
    private Double outputMoneyYear;

    /**
     * 主项累计支出金额
     */
    private Double outputMoneyMain;

    /**
     * 状态
     */
    private String status;

    /**
     * 说明
     */
    private String desc;

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
     * 下一步接收人id
     */
    private String nextReceivePersonId;

    /**
     * 下一步接收人姓名
     */
    private String nextReceivePersonName;

    /**
     * 送审时间
     */
    private LocalDateTime sendCheckDate;


}
