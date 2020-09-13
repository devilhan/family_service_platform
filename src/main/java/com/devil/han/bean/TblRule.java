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
 * 规章制度
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblRule implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动增长id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 适用范围
     */
    private String useRange;

    /**
     * 分类
     */
    private Long category;

    /**
     * 文号
     */
    private String articleNumber;

    /**
     * 制度等级
     */
    private String level;

    /**
     * 保密等级
     */
    private String secretLevel;

    /**
     * 主题词
     */
    private String titleWord;

    /**
     * 发文单位
     */
    private String publishCompany;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件路径
     */
    private String attachPath;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 审批时间
     */
    private LocalDateTime checkDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 允许查看的用户编码
     */
    private String allowUserCode;

    /**
     * 允许查看的用户名称
     */
    private String allowUserName;

    /**
     * 规章制度附件
     */
    private String ruleAttach;


}
