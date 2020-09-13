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
 * 车辆管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyCarManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车牌号
     */
    private String carLicnece;

    /**
     * 停车牌号
     */
    private String stopCarLicence;

    /**
     * 车主姓名
     */
    private String carOwnerName;

    /**
     * 车位
     */
    private String carport;

    /**
     * 入场时间
     */
    private LocalDateTime inDate;

    /**
     * 出场时间
     */
    private LocalDateTime outDate;

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
