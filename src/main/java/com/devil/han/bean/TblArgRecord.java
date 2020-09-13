package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 参数档案
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblArgRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 参数编码
     */
    @TableId(value = "arg_code", type = IdType.AUTO)
    private String argCode;

    /**
     * 参数名称
     */
    private String argName;

    /**
     * 参数值
     */
    private String argValue;

    /**
     * 说明
     */
    private String argDesc;

    /**
     * 排序号
     */
    private Integer argOrder;

    /**
     * 所属产品
     */
    private String belongProduct;


}
