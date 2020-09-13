package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 打印参数
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblPrintParam implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 打印参数编号
     */
    @TableId(value = "print_id", type = IdType.AUTO)
    private String printId;

    /**
     * 打印参数名称
     */
    private String printName;

    /**
     * 打印参数值
     */
    private String printValue;

    /**
     * 打印参数描述
     */
    private String printDesc;


}
