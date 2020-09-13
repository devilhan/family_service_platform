package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 物业费分布
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyPropertyMoneyDist implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 房间编号
     */
    private Integer cellId;

    /**
     * 费项编号
     */
    private Integer moneyId;

    /**
     * 是否共有费用
     */
    private String isPublicMoney;

    /**
     * 当前读数
     */
    private Double currentReadNumber;

    /**
     * 上次计费单位
     */
    private Double lastChargeUnit;

    /**
     * 楼层系数
     */
    private Double floorFactor;

    /**
     * 使用量倍数
     */
    private Integer useNumberMult;


}
