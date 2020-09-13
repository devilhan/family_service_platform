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
 * 客服收银组
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyServiceCashierGroup implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 客服组名称
     */
    private String name;

    /**
     * 包含楼宇编码
     */
    private String includeBuildingCode;

    /**
     * 包含楼宇名称
     */
    private String includeBuildingName;

    /**
     * 包含客服编码
     */
    private String includeServiceCode;

    /**
     * 包含客服名称
     */
    private String includeServiceName;

    /**
     * 组说明
     */
    private String desc;

    /**
     * 所属公司
     */
    private String company;

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


}
