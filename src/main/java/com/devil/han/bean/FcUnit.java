package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 单元信息表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FcUnit implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 楼宇编号
     */
    private String buildingCode;

    /**
     * 单元编码
     */
    private String unitCode;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 开始楼层
     */
    private Integer startFloor;

    /**
     * 结束楼层
     */
    private Integer stopFloor;

    /**
     * 开始房号
     */
    private Integer startCellId;

    /**
     * 结束房号
     */
    private Integer stopCellId;

    /**
     * 备注
     */
    private String remark;


}
