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
 * 物品出入
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyGoodsInout implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 出入时间
     */
    private LocalDateTime inoutDate;

    /**
     * 携带人
     */
    private String carryPerson;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 出入类型
     */
    private String inputType;

    /**
     * 居住地址
     */
    private String liveAddr;

    /**
     * 出入单元
     */
    private String inoutUnit;

    /**
     * 户主姓名
     */
    private String customerName;

    /**
     * 出入物品
     */
    private String inoutGoods;

    /**
     * 值班人
     */
    private String agent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
