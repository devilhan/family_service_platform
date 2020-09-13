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
 * 楼盘经费支出明细_审批子表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyEstateOutDetailSub implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属主单id
     */
    private Long belongOutProjectId;

    /**
     * 接受时间
     */
    private LocalDateTime receiveDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 审批人id
     */
    private String checkPersonId;

    /**
     * 审批人名称
     */
    private String checkPersonName;

    /**
     * 审批时间
     */
    private LocalDateTime checkDate;

    /**
     * 审批状态
     */
    private String checkStatus;


}
