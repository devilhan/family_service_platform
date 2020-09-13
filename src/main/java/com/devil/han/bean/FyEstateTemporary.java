package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 房产信息临时表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyEstateTemporary implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 所属公司
     */
    private String company;

    /**
     * 房产编码
     */
    private String estateCode;

    /**
     * 房产名称
     */
    private String estateName;

    /**
     * 楼宇编码
     */
    private String buildingCode;

    /**
     * 楼宇名称
     */
    private String buildingName;

    /**
     * 单元编码
     */
    private String unitCode;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 房间编码
     */
    private String cellCode;

    /**
     * 房间名称
     */
    private String cellName;

    /**
     * 建筑面积
     */
    private Double buildArea;

    /**
     * 楼层数
     */
    private Integer floorNumber;

    /**
     * 功能
     */
    private String function;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作人编码
     */
    private String operatePerson;


}
