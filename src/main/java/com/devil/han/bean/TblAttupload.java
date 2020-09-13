package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 附件
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblAttupload implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 附件id
     */
    @TableId(value = "attID", type = IdType.AUTO)
    private Integer attID;

    /**
     * 附件名称
     */
    @TableField("attName")
    private String attName;

    /**
     * 附件新名称
     */
    @TableField("attNewName")
    private String attNewName;

    /**
     * 唯一key
     */
    @TableField("attKey")
    private String attKey;

    /**
     * 附件分类
     */
    @TableField("attClass")
    private String attClass;


}
