package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统图标
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblSysDiagrams implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 图标名称
     */
    private String diagramName;

    /**
     * 归属人
     */
    private Integer belongPerson;

    /**
     * 图标编号
     */
    private Integer diagramId;

    /**
     * 图标版本
     */
    private Integer diagramVersion;

    /**
     * 图标定义
     */
    private String diagramDefinition;


}
