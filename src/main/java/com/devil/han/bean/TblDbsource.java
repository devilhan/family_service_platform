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
 * 数据库
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblDbsource implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String sourceName;

    /**
     * 中文解释
     */
    private String sourceDesc;

    /**
     * 类型
     */
    private String sourceType;

    /**
     * 分类
     */
    private String sourceClass;

    /**
     * 是否可以清空
     */
    private String idClear;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 所属产品
     */
    private String belongProduct;


}
