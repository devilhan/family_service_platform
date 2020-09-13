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
 * 公摊费用台账概要
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyShareStandingBook implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 公摊费用编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 台账名称
     */
    private String standingBookName;

    /**
     * 关联费用编码
     */
    private Integer associateCostCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 生成日期
     */
    private LocalDateTime createDate;

    /**
     * 生成人
     */
    private String createPerson;

    /**
     * 所属公司
     */
    private String company;


}
