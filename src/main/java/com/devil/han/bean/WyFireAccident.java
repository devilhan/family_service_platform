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
 * 消防事故
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyFireAccident implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 事故日期
     */
    private LocalDateTime accidentDate;

    /**
     * 事故地点
     */
    private String accidentPlace;

    /**
     * 发生原因
     */
    private String occurReason;

    /**
     * 相关人员
     */
    private String relatedPerson;

    /**
     * 处理结果
     */
    private String handleResult;

    /**
     * 损失程度
     */
    private String loss;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
