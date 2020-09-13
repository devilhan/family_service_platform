package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 植被信息
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyVegetationInformation implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 植被编号
     */
    @TableId(value = "vegetation_id", type = IdType.AUTO)
    private String vegetationId;

    /**
     * 植被名称
     */
    private String vegetationName;

    /**
     * 种类
     */
    private String vegetationType;

    /**
     * 树龄
     */
    private Integer vegetationAge;

    /**
     * 数量
     */
    private Integer vegetationNumber;

    /**
     * 单位
     */
    private String vegetationUnit;

    /**
     * 习性
     */
    private String vegetationHabit;

    /**
     * 特点
     */
    private String vegetationFeature;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
