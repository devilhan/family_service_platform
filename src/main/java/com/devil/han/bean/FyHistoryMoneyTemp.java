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
 * 历史费用临时表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyHistoryMoneyTemp implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 房间id
     */
    private Integer cellId;

    /**
     * 房产名称
     */
    private String cellName;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 单价
     */
    private Double priceUnit;

    /**
     * 金额
     */
    private Double money;

    /**
     * 费用起期
     */
    private LocalDateTime moneyStartDate;

    /**
     * 费用止期
     */
    private LocalDateTime moneyStopDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人编码
     */
    private String operatePerson;


}
