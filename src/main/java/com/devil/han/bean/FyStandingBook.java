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
 * 费用台账概要
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyStandingBook implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 台账编号
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
    private LocalDateTime creationDate;

    /**
     * 生成人
     */
    private String creationPerson;

    /**
     * 关联台账账号
     */
    private String associateStandingBookId;

    /**
     * 所属公司
     */
    private Integer company;


}
