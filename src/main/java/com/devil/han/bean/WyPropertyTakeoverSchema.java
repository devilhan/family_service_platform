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
 * 物业接管概要
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyPropertyTakeoverSchema implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 接管单号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 接管标题
     */
    private String takeoverTitle;

    /**
     * 所属楼盘
     */
    private Integer estateId;

    /**
     * 接管备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;


}
