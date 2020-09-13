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
 * 我的日程
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMyplan implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 主题
     */
    private String planTheme;

    /**
     * 地点
     */
    private String planAddr;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime stopDate;

    /**
     * 分类
     */
    private String planType;

    /**
     * 状态
     */
    private String planStatus;

    /**
     * 优先级
     */
    private String planPrior;

    /**
     * 备用字段
     */
    private String fieldBak;

    /**
     * 日程描述
     */
    private String planDesc;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件路径
     */
    private String attachUrl;

    /**
     * 所有者
     */
    private String owner;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 日程附件
     */
    private String planAttach;


}
