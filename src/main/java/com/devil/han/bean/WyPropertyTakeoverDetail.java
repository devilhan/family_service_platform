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
 * 物业接管工程明细
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyPropertyTakeoverDetail implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 接管细节id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属接管id
     */
    private Integer takeoverId;

    /**
     * 工程项目名称
     */
    private String projectName;

    /**
     * 验收方
     */
    private String checked;

    /**
     * 验收日期
     */
    private LocalDateTime checkedDate;

    /**
     * 验收结果
     */
    private String checkedResult;

    /**
     * 整改完成日期
     */
    private LocalDateTime finishDate;

    /**
     * 整改完成情况
     */
    private String finishCondition;

    /**
     * 备注
     */
    private String remark;


}
