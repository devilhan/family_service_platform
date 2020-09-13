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
 * 消防巡查
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyFireCheck implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 巡视日期
     */
    private LocalDateTime checkDate;

    /**
     * 巡视地点
     */
    private String checkPlace;

    /**
     * 巡视人
     */
    private String checkPerson;

    /**
     * 巡视情况
     */
    private String checkCondition;

    /**
     * 处理意见
     */
    private String handleAdvice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
