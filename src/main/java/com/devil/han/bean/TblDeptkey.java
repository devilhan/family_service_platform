package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 部门key
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblDeptkey implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * Key编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * key名称
     */
    private String deptName;


}
